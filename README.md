# Template voor Java uitwerkingen in IVH5 #

Deze repository bevat een handige structuur voor het maken van je uitwerkingen van het Java prakticum. Door een eigen kopie van deze repository te maken en deze binnen je eigen account te bewaren kun je snel aan de slag.

>Je kunt dit template gebruiken om je prakticumuitwerkingen te uploaden naar een online Git repository. Je hebt daarvoor een account nodig op GitHub of Bitbucket, met daarop een repository die jouw voor- en achternaam heeft. Maak deze repository via de webbrowser aan binnen jouw account. Je zult deze repository straks gebruiken om je eigen files naar up te loaden.

## Opmerkingen ##
> Let bij het maken van je uitwerkingen van het prakticum op de netheid van je code. Er zijn richtlijnen voor het schrijven van nette code vastgelegd in zogenaamde 'code conventies'. Je vindt deze richtlijnen onder andere bij [Oracle](http://www.oracle.com/technetwork/java/codeconventions-150003.pdf). 
> Eclipse ondersteunt deze code conventies door een layout-tool aan te bieden. Klik rechts op een bronbestand en ga naar 'Source code > Format'. Je zult zelf wel toelichtingen op je code moeten schrijven. Doe dat in het Engels!

## Requirements ##
1. Git
2. Een online Git repository op bv. Bitbucket of GitHub.
3. Gradle

## Werkwijze ##
1. Open een command venster en navigeer naar de directory waar je je Java prakticum maakt. 
2. Maak een lokale kopie van deze repository via `git clone https://rschellius@bitbucket.org/rschellius/robin-schellius.git`.
2. Maak nu een kopie van deze directory en hernoem deze naar jouw voor -en achternaam.
3. Je moet deze nieuwe directory nu geschikt maken om naar je eigen repository te kunnen uploaden. Verwijder daarom uit deze nieuwe map de bestaande .git directory. Deze is verborgen (hidden), dus maak deze zichtbaar.
4. Ga in het command venster naar deze nieuwe map en type achtereenvolgens:

         git init
         git add --all .
         git commit -a -m "Initial commit"
         git remote add bitbucket url-naar-jouw-repository
         git remote -v
         git push bitbucket master

## Structuur ##

1. Er is een 'rootdirectory' die jouw naam heeft.
2. In de rootdirectory staat voor de uitwerkingen van iedere week een aparte map genaamd 'week-1' tot 'week-n'.
3. Er is een `.gitignore` en een `README.md` bestand. Het `.gitignore` bestand bevat alle bestandsnamen die niet in GIT opgenomen moeten worden. Het `README.md` bestand bevat de tekst die je nu leest. Beide zijn zgn. platte-tekst bestanden.
4. Iedere week bevat een map `src\main\java`. Hierin zet je je Java source code - de uitwerkingen van je prakticum. Let op: gebruik een zinvolle packagestructuur.
5. Iedere week bevat een `gradle.build` bestand. De code compileert (en test, als je testcases hebt) door `gradle build` vanaf de commandline aan te roepen.
6. Je creëert Eclipse projectbestanden door `gradle eclipse` aan te roepen. Vervolgens kun je je sources in Eclipse importeren als bestaande Eclipse projecten via 'Import > Existing projects'.
