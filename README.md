# Mon apprentissage de java
On navigue ici entre toutes les commandes de bases de Java pour le rendre moins obscure à mes yeux et pouvoir envisager des projets sympa plus tard après avori acquis les bases.

<details>
  <summary><b>CleanHello.java</b></summary>
  <h3>But de l'exercice :</h3>
    <br>
    <ul>
      <li>J'ai appris que la méthode qui englobe tout le programme doit porter le même nom que le fichier.</li>
      <li>Une appelera une fonction : méthode.</li>
      <li>Déclaration et appel de méthodes avec arguments.</li>
      <li>La méthode helloBeyonce ne prends pas de paramètres et affiche simplement "Bonjour !Beyonce". (concaténation de deux variables strings)</li>
      <li>La méthode sayHelloTo prends deux paramètres, une chaine de caractère (où on y renseigne son prénom, et un interger (où on renseigne l'heure qu'il est) qui nous retournera dans la console Bonjour ou bonsoir en fonction de l'heure qu'il est. Ces paramètres sont à donner directement dans le programme dans la méthode CleanHello à l'appel de la méthode sayHello ligne 4.</li>
  </ul>
</details>

<details>
  <summary><b>Guess a number.java</b></summary>
  <br>
  <h3>But de l'exercice :</h3>
  <br>
  Créer un petit jeu dans le quel il faut deviner un nombre dont les consignes permettent de le dévelloper pas à pas
  <br>
  <h4> Etape 1 :</h4>
    <br>
    Créer une méthode qui demande un nombre à l'utlisateur :  Ce sera `askUser` qui contiendra un scanner pour l'input     dans la console :
    <br>
  <h4> Etape 2 :</h4>
    <br>
    Création d'une méthode didIWin qui prend en paramètre le nombre saisi par l'utilisateur pour pouvoir le comparer       au nombre à deviner
    <br>
  <h4> Etape 3 : </h4>
    <br>
    DidIwin retourne true si l'utilisateur à trouver le bon nombre, false sinon.
    <br>
    Dans la fonction qui gère le jeu, si didIwin retourne true alors on stop le jeu, sinon on redemande à l'utilsateur     un nombre
    <br>
  <h4> Etape 4 : </h4>
    <br>
    Demander un nombre à faire deviner à un autre utilisateur (le jeu se joue à deux maintenant) et la redemander tant     que le nombre donné n'est pas compris entre 0 et 50.
    <br>
    La fonction didIWin prendra donc en paramètre le nombre à faire deviner renseigné par le joueur
    <br>
  <h4> Etape 5 : </h4>
    <br>
    Afficher la range comme 0 < ? < 50 avant de demander de faire un guess
    <br>
    Tant que l'utlisateur n'a pas trouvé le bon nombre, alors on affiche le nombre de tentatives
    <br>
  <h4> Etape 6 : </h4>
    <br>
    Si le nombre proposé par l'utilisateur est plus petit que le nombre à deviner, alors on change la range minimale,      pareil pour la range maximale.
    <br>
    note : A ce stade, la range est modifiée à chaque input de l'utilisateur.
    <br>
    <p>Amélioration possible : si la range est comprise entre 12 et 50 et que l'utilisateur propose 10 alors on alerte que cette proposition est out of range</p>
</details>
