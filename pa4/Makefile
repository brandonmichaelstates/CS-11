# A simple Makefile for the Roots program
Roots: Roots.class
	echo Main-class: Roots > Manifest
	jar cvfm Roots Manifest Roots.class
	rm Manifest
	chmod u+x Roots

Roots.class: Roots.java
	javac -Xlint Roots.java

clean:
	rm -f Roots.class Roots

submit: Makefile Roots.java
	submit cmps011-pt.w14 pa4 Makefile Roots.java
check: Makefile Roots.java
	cd /afs/cats.ucsc.edu/class/cmps011-pt.w14/pa4
	ls Makefile Roots.java
