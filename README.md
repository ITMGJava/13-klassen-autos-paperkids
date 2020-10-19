# Klassen - Auto

- Schrijf een klasse Auto met de volgende attributen:
    - snelheid = 0
    - merk = "Toyota"
    - kilometerstand = 23000
    
- Implementeer in de klasse Auto de methodes ```void start()```, ```void stop()``` en ```void geefGas()```.  Deze methodes drukken respectievelijk de volgende teksten af: ```de Toyota start```, ```de Toyota stopt```, ```de Toyota rijdt```.

- Implementeer in de klasse Auto een methode ```int getKilometerStand()``` met als output de kilometerstand.
- Instantieer een Auto object met een variabele genaamd ```auto1``` en  kilometerstand op 23000. Roep daarna de methodes 1 voor 1 aan:

voorbeeld output:
```bash
de Toyota start
de Toyota rijdt
de Toyota stopt
de kilometerstand van de Toyota is: 23000 kilometer
```
- Implementeer in de klasse Auto een methode ``` void setKilometerStand(int stand)``` die de kilometerstand van een auto aanpast.

- Instantieer een tweede auto object met een variabele genaamd ```auto2``` en zet daarna de kilometerstand van deze auto op 50.000

- Roep daarna de methodes 1 voor 1 aan voor ```auto2``` net als bij ```auto1```.

voorbeeld output:
```bash
de Toyota start
de Toyota rijdt
de Toyota stopt
de kilometerstand van de Toyota is: 50000 kilometer
```
- Implementeer in de klasse Auto een methode ``` void setMerk(String merk)``` die het merk van een auto aanpast.

- Instantieer een derde Auto object met variabele ```auto3``` en zet het merk op Volvo en de kilometerstand op 10.000
- Voeg aan de methode ```void geefGas()``` code toe die de snelheid *en* de kilometerstand verhoogt met 20 
- Pas de methode ```void geefGas()``` aan zodat ook nog de snelheid van de auto wordt afgedrukt
- Roep de methodes ```void start()```, ```void stop()``` aan en roep de methode ```void geefGas()``` meerdere keren aan
- Vraag de kilometerstand van de Volvo op.

voorbeeld output:
```bash
de Volvo start
de Volvo rijdt met 20 kilometer/uur
de Volvo rijdt met 40 kilometer/uur
de Volvo rijdt met 60 kilometer/uur
de Volvo stopt
de kilometerstand van de Volvo is: 10060 kilometer
```