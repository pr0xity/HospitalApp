>This document will be in Norwegian.


 
# Vurderingskriterier

Når vi vurderer arbeidskravet “Mappe - Del 1” vektlegger vi følgende momenter:

* Maven:
  * Er prosjektet et Maven-prosjekt med fornuftige prosjekt-verdier og gyldig
katalogstruktur?
  * Kan vi kjøre Maven-kommandoer for å bygge, installere og teste uten at det feiler?
* Versjonskontroll med git:
    * Er prosjektet underlagt versjonskontroll med lokalt repo?
    * Er det lokale repoet koblet mot et sentralt repo?
    * Finnes det minst én commit per kodeoppgave?
    * Beskriver commit-meldingene endringene på en kort og konsis måte?
    * Har alle endringer blitt lastet opp til sentralt repo?    
* Er personell-klassene implementert iht oppgavebeskrivelsen?
* Er klassene Hospital og Departments implementert iht oppgavebeskrivelsen?
* Fungerer remove-metoden i Hospital som forventet?
* Enhetstesting:
    * Har enhetstestene beskrivende navn som dokumenterer hva testen gjør?
    * Følger de mønstret Arrange-Act-Assert?
    * Tas det hensyn til både positive og negative tilfeller?
* Er klassen HospitalClient implementert iht oppgavebeskrivelsen?
* Kodekvalitet:
    * Er koden godt dokumentert med JavaDoc og kommentarer der det er fornuftig?
    * Er koden robust (verifiseres parametere før de brukes mm)?
    * Har variabler, metoder og klasser gode beskrivende navn?