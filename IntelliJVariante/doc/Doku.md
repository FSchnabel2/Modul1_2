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
5. Die Kritik an diesem Modell ist, dass im Großen und Ganzen die gesamten Klassen CD und DVD den gleichen Inhalt haben, aber auch die Datenbank-Klasse (for-Schleifen).
6. Subklassen erben alle Datenfelder und Methoden, fügen aber auch eigene hinzu.
7. Konstruktoren müssen sich um ihre Datenfelder kümmern. Wenn sie vererbt würden, kann auch ein Teil davon mit "super", welcher immer an erster Stelle sein muss, an den Mutterklassenkonstruktor übergeben werden.
8. Vererbung hilft bei der Wartung und Behebung von Fehlern, Vermeidung von Code-Duplikaten, Wiederverwendung und Erweiterbarkeit.
9. Statt 2 separaten ArrayListe für CD und DVD kann in der Klasse Datenbank eine ArrayList für Medium verwendet werden und darin beide Unterklassen-Objekte gespeichert, weil beide auch **ein Medium** sind (Subtyping). 
10. Ein CD-Objekt kann daher (als ein Objekt einer Subklasse) verwendet werden, wo Objekte eines Supertyps erwartet werden (Ersatzbarkeit). Daher sind Objektvariablen, wie z. B. CD auch **polymorph**. 
11. Subtypen können an einen Supertyp zugewiesen werden, umgedreht funktioniert es aber nicht. Man kann aber auch **casten** mittels z. b. "Auto c = (Auto) new Fahrzeug v".
12. Alle Klassen erben von **"Object"**. Daher sind alle Sammlungen polymorph in dem Sinn.

## Video 2
1. Es geht um Methoden-Polymorphie, statische/dynamische Typen, Methodenüberschreibungen, dynamische Methodensuche und protected-Zugriff.
2. Vererbung ist eine Einbahnstraße. Superklasse weiß nichts über die Attribute der Unterklasse, umgekehrt schon.
3. Jede Variable hat einen statischen (deklariert) und einen dynamischen (verwiesen) Typ.
4. **"Überschreiben"** ist die Lösung, um das Problem von "ausgeben" zu beheben.
5. Der Compiler sucht die richtige/gewünschte Methode in den Klassen mit den dynamischen Typen von unten nach oben.
6. Nicht nur der Mutterklassenkonstruktor kann mit **"super"** aufgerufen werden, sondern jede überschriebene Methode, auch "ausgeben" oder "toString".
7. Der Zugriffsmodifikator **"protected"** lässt von außen keinen Zugriff zu, jedoch aus der Subklasse schon.

## Video 3
1. Es geht um die konstitutiven Teilkonzepte des Methodenpolymorphismus.
2. Diese sind Vererbung, Überschreiben von Methoden (@Override), Ersetzbarkeit und dynamische Bindung.
3. Bei einem Aufruf (m.anzeigen()) wird nicht automatisch die anzeigen-Methode von Medium (m) aufgerufen, sondern der Klassenbaum wird von unten nach oben abgegrast und die erste die gefunden wird, wird aufgerufen.

## Video 4
1. Es geht um die Vorgangsweise zum Aufbau einer polymorphen Codebasis.
2. Man muss zuerst Vererbung einsetzen und dann eine Schnittstelle bereitstellen in den oberen Klassen. 
3. Als Nächstes muss man Methoden mit subtypenabhängiger Funktionalität überschreiben. 
4. Danach sollte man Entkopplung bzw. Ersetzbarkeit bei der Verwendung der polymorphen Klassenhierarchie verwenden.
5. Jetzt sollte man eine dynamische Bindung nutzen (eigentlicher polymorpher Methodenaufruf).
6. Wenn ich die Methodenfunktionalität der Mutterklasse zusätzlich benötige, kann ich diese einfach mit "super.methodenname();" aufrufen.
