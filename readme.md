##### Cette classe respecte-t-elle SRP? Pourquoi?

Non. On a deux responsabilités dans le même module. En effet la classe Employe gère l'affichage et le calcul.

##### Que se passe-t-il si la méthode de calcul du salaire change? 

On doit recompiler tous les programmes qui utilisent ce module même s'il n'utilse pas la méthode calcul salaire

##### Que se passe-t-il si l’aﬃchage est remplacé par le stockage dans un ﬁchier CSV?

Si l'affichage est changé par le stockage dans un fichier CSV, cela règle un autre problème (le 5ème principe: DIP)


##### Proposition de solution

Créer deux classes
chacune aura une seule responsabilité.
Conclusion: Quand on utilise une autre bibliothèque technique, il y'a violation du DIP
Et si on a plusieurs responsabilité, il y'a violation du SRP


