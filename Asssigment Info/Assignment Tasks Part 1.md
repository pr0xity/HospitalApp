>This document will be in Norwegian



####Oppgave 1: Maven og Git
Det første du må gjøre er å opprette et tomt Maven prosjekt. Gi prosjektet en fornuftig groupId og
artefactId. Prosjektet skal følge JDK v11 eller høyere. Når du svarer på kodeoppgavene under skal
enhetstester legges i katalogen “test/java”, mens resten av koden hører hjemme i katalogen
“main/java”. Det skal være mulig å bygge prosjektet og kjøre tester med Maven uten feil.

* Legg så prosjektet under versjonskontroll:
    * Først legger du prosjektet under lokal versjonskontroll (lokalt repository)
    * Senere oppretter du et nytt sentralt repo (tomt prosjekt) med samme navn på GitLab/GitHub
(for Ålesund: lag remote repo fra GitHub Classroom når dette blir publisert)
    * Til slutt kobler du lokalt repo mot sentralt repo (NB! Dere trenger ikke å gjøre dette før
senere i prosjektet)
      
For hver av oppgavene under skal du gjøre minst én innsjekk (commit) i lokal versjonskontroll, før du
til slutt laster opp alle endringene til sentralt repo (push).
Vi er nå klare for å skrive litt kode :-)



####Oppgave 2: Implementasjon av personell-klassene
I denne oppgaven skal du programmere klassene for personer knyttet til sykehuset. Klassetreet skal
altså bestå av klassene Person, Employee, Doctor, GeneralPractitioner, Surgeon, Nurse og Patient.
Klassene «Person» og «Doctor» defineres som abstract da det ikke gir mening å opprette objekter av
disse klassene.

Det er kun klassene «GeneralPractitioner» og «Surgeon» som kan sette pasient diagnose. Sykepleiere
eller øvrige ansatte skal altså ikke kunne sette diagnose på en pasient.
Interface-klassen «Diagnosable» har metoden setDiagnose som skal implementeres av «Patient»-
klassen siden det er en pasient som kan få diagnose.

Når du har løst oppgave 2 sjekker du inn de relevante filene i lokal versjonskontroll. Commitmeldingen skal på en kort og konsis måte beskrive endringene du har gjort til nå i prosjektet (gjelder
for alle commits). Merk: hvis du sjekker inn på slutten av en oppgave, men senere trenger å gjøre
endringer i koden og sjekke inn på nytt, så er det selvfølgelig greit. Kravet er at du skal sjekke inn
minst en gang per kodeoppgave.


####Oppgave 3: Implementasjon av avdelingene for et sykehus
Et sykehus har et navn og en liste med Avdelinger (Du kan bruke HashMap, ArrayList… til å lage et
register). Implementer klassene Hospital og Department. En ansatt eller pasient hører til en avdeling.

Når du har løst oppgaven sjekker du inn endringene i lokal versjonskontroll.


####Oppgave 4: Implementasjon av remove-metoden i Department
I oppgave 4 skal du implementere en metode kalt remove i klassen Department som fjerner et objekt
av typen Patient eller Employee.

Dersom objektet som sendes inn ikke finnes i registrene (pasienter eller ansatte), skal det kastes et
unntak. Lag en exception-klasse kalt RemoveException som blir kastet av metoden remove. Unntaket
skal være av typen “checked”. Klassen som kaller remove-metoden skal fange opp dette og vise
feilmeldingen.

Når du har implementert remove-metoden skal du skrive enhetstester som både verifiserer at
metoden fungerer som forventet (positiv testing) og at uønsket input og uforutsigbar oppførsel
håndteres på en god måte (negativ testing).

Til slutt sjekker du inn endringene i lokal versjonskontroll.


####Oppgave 5: Implementer klienten HospitalClient
Du skal nå lage en enkel klient-klasse for å teste applikasjonen. Implementer disse funksjonene:
* Lag klienten HospitalClient som bruker HospitalTestData.fillRegisterWithTestData(hospital) til å
fylle registrene med data (metoden fillRegisterWithTestData er gjengitt under).
* Kall remove metoden på Department for å fjerne en ansatt
* Kall remove metoden på Department for å fjerne en pasient som ikke finnes i listen. Bruk trycatch exception blokk for å håndtere situasjonen.

Når du har løst oppgave 5 sjekker du inn endringene i lokal versjonskontroll.
Til slutt pusher du alle lokale endringer til det sentrale repositoriet.