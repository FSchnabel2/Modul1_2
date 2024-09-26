Hier werden alle Klassen dieses Programms analysiert.
# App
1. Es wird ein Medienbibliothek-Objekt erzeugt, ein VHS, ein Cartridge und ein Buch.
2. Alle werden zur Medienbibliothek hinzugefügt
3. Zum Schluss werden zuerst alle Medien der Medienbibliothek ausgegeben, dann alle VHS der Medienbibliothek ausgegeben.

# Buch
1. Die Klasse Buch erbt von Medium.
2. Sie hat ein Datenfeld isbn, einen Konstruktor mit super-Aufruf
3. Sie hat eine Getter- und eine Setter-Methode. 
4. Dann überschreibt sie noch die Methode anzeigen(). Diese gibt des isbn aus.

# Cartridge
1. Die Klasse Cartridge hat drei Datenfelder (vollstaendigesSet, entwicklerstudio, konsole), einen Konstruktor mit 6 Parameter und Mutterklassenaufruf.
2. Dann hat sie jeweils 3 Getter und Setter, eine isVollstaendigesSet die boolean zurückgibt.
3. Sie überschreibt ebenfalls die Methode anzeigen().

# Konsolentyp
1. Es ist eine Enumerationsklasse und hat daher nur eine Aufzählung.

# Medienbibliothek
1. Sie hat eine ArrayList von Medium als Datenfeld, die Ersatzbarkeit verwendet, und zwar so, dass Buch, VHS und Cartridge hineingespeichert werden können.
2. Sie hat einen leeren Konstruktor und die Methode medienHinzufügen, dann die Methode alleMedienAusgeben mittels for-each-Schleife. 
3. Ganz unten hat sie noch eine Methode die alle VHS als Liste zurückgibt.

# Medium
1. Sie hat drei Datenfelder titel, wert und standort. Diese vererbt sie an alle Unterklassen. Sie hat einen Konstruktor und jeweils 3 Getter und Setter.
2. Sie erstellt die ursprüngliche anzeigen-Methode.

# VHS
1. Die Klasse VHS hat die spezifischen Datenfelder spieldauer und qualität, einen Konstruktor, jeweils 2 Getter und Setter und überschreibt die anzeigen.