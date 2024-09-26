Hier werden alle Klassen dieses Programms analysiert.

# Modul 1

## App
1. Es wird ein Medienbibliothek-Objekt erzeugt, ein VHS, ein Cartridge und ein Buch.
2. Alle werden zur Medienbibliothek hinzugefügt
3. Zum Schluss werden zuerst alle Medien der Medienbibliothek ausgegeben, dann alle VHS der Medienbibliothek ausgegeben.

## Buch
1. Die Klasse Buch erbt von Medium.
2. Sie hat ein Datenfeld isbn, einen Konstruktor mit super-Aufruf
3. Sie hat eine Getter- und eine Setter-Methode. 
4. Dann überschreibt sie noch die Methode anzeigen(). Diese gibt des isbn aus.

## Cartridge
1. Die Klasse Cartridge hat drei Datenfelder (vollstaendigesSet, entwicklerstudio, konsole), einen Konstruktor mit 6 Parameter und Mutterklassenaufruf.
2. Dann hat sie jeweils 3 Getter und Setter, eine isVollstaendigesSet die boolean zurückgibt.
3. Sie überschreibt ebenfalls die Methode anzeigen().

## Konsolentyp
1. Es ist eine Enumerationsklasse und hat daher nur eine Aufzählung.

## Medienbibliothek
1. Sie hat eine ArrayList von Medium als Datenfeld, die Ersatzbarkeit verwendet, und zwar so, dass Buch, VHS und Cartridge hineingespeichert werden können.
2. Sie hat einen leeren Konstruktor und die Methode medienHinzufügen, dann die Methode alleMedienAusgeben mittels for-each-Schleife. 
3. Ganz unten hat sie noch eine Methode die alle VHS als Liste zurückgibt.

## Medium
1. Sie hat drei Datenfelder titel, wert und standort. Diese vererbt sie an alle Unterklassen. Sie hat einen Konstruktor und jeweils 3 Getter und Setter.
2. Sie erstellt die ursprüngliche anzeigen-Methode.

## VHS
1. Die Klasse VHS hat die spezifischen Datenfelder spieldauer und qualität, einen Konstruktor, jeweils 2 Getter und Setter und überschreibt die anzeigen.

# Modul 2
## Video 1
1. Die zentralen Konzepte sind Vererbung, Subtyping, Ersetzbarkeit und polymorphe Variablen.
2. Zu Beginn wird das Klassendiagramm erläutert. Es gibt die 3 Klassen Datenbank, DVD und CD. In der Datenbank können mehrere DVDs und mehrere CDs gespeichert werden.
3. Die Klasse Datenbank hat als Datenfelder zwei ArrayLists von CD und DVD. (Parametrisierte Anwendung von generischen Datentypen)
4. Anhand einer for-each-Schleife in auflisten() werden alle Inhalte beider ArrayLists ausgegeben.
5. Die Kritik an diesem Modell ist, dass im Großen und Ganzen die gesamten Klassen CD und DVD den gleichen Inhalt haben.
Video bei 8:20 angehalten.