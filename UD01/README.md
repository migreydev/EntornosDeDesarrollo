
# Lenguajes de programacion



[portada]:https://ecdisis.com/wp-content/uploads/2021/01/02-Lenguaje-de-programacio%CC%81n-1024x591.jpeg

![fotoPortada][portada]

![GitHub stars](https://img.shields.io/github/stars/migreydev/EntornosDeDesarrollo)
![GitHub contributors](https://img.shields.io/github/contributors/migreydev/EntornosDeDesarrollo)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/migreydev/EntornosDeDesarrollo)
![Modulo](https://img.shields.io/badge/Entorno%20Desarrollo-1%20B-yellowgreen)
![Modulo1](https://img.shields.io/badge/Lenguajes%20de%20Programacion-UD01-critical)

Integrantes: 
- María Cristina Sánchez Acosta
- Miguel Ángel Reyes Méndez
- Salvador Martín
- Rafael García

### Integrantes

<a href = "https://github.com/migreydev/EntornosDeDesarrollo/tree/main/UD01/graphs/contributors">
   <img src = "https://contrib.rocks/image?repo=migreydev/EntornosDeDesarrollo"/>
 </a>


Curso:

- 1ºDesarrollo de aplicacion web B

Profesor:
- José Manuel Sevillano 
[Perfil GitHub](https://github.com/jms3du)

**En este trabajo definiremos distintos lenguajes de programación y veremos un ejemplo de cada categoria.**


## Índice
1. Nivel de abstracción:
	* [Bajo nivel](#bajonivel)
	* [Medio nivel](#medionivel)
	* [Alto nivel](#altonivel)
	
2. Forma de ejecución:
	* [Compilados](#compilados)
	* [Interpretados](#interpretados)
	* [Virtuales](#virtuales)
3. Paradigma:
	* [Imperativos](#imperativos)
	* [Declarativos](#declarativos)
	* [Procedimentales](#procedimentales)
	* [Orientados a objeto](#orientados)
	* [Funcionales](#funcionales)
	* [Logicos](#logicos)
***

## **Nivel de Abstacción**
En programación existen distintos tipos de lenguaje. Según los especialistas los dividen por niveles, es decir, de menos a mayor complejidad. Así, por ello, encontramos lenguajes de bajo, medio y alto nivel.

### ***¿Qué es un lenguaje de bajo nivel?***

Son lenguajes totalmente dependientes de la máquina, es decir, que el programa que se realiza con este tipo de lenguajes no se puede migrar a otras máquinas. El uso del término bajo en su nombre no quiere decir que este lenguaje sea menos potente o importante a otro de diferente nivel, simplemente se refiere a la reducida abstracción.

**Características**

    •	Código sencillo
    •	Muy adaptable
    •	Con instrucciones directas
    •	Fácil conversación
    •	Gran velocidad

**Ejemplos de lenguajes de programacion de nivel bajo**
- Lenguaje ensamblador, lenguaje maquina.

### ***¿Qué es un lenguaje de medio nivel?***

Estos lenguajes se encuentran en un punto medio entre los dos anteriores. Se beneficia de las ventajas de ambos y elimina o reduce los inconvenientes que cada uno tendría por separado.

**Ejemplos de lenguajes de programacion de medio bajo**
- Lenguaje C.

### ***¿Qué es un lenguaje de alto nivel?***

El lenguaje de alto nivel es aquel que se aproxima más al lenguaje natural humano que al lenguaje binario de las computadoras, el que se conoce como lenguaje de bajo nivel.

Su función principal radica en que a partir de su desarrollo, existe la posibilidad de que se pueda utilizar el mismo programa en distintas máquinas, es decir que es independiente de un hardware determinado. 

Además de utilizar palabras del lenguaje humano es **más práctico y fácil de manipular** para el programador.

![image|20](https://user-images.githubusercontent.com/49988347/204129692-c5d8a2a6-8e47-40dc-9b82-c7d9d57ad917.png)


**Ejemplos de lenguajes de programacion de nivel alto**
- Lenguaje C++, Java, Fortran, PHP, Python.

```
public class Mi_Clase_1
{
    public static void main(String args[])
    {
        for(int i = 0; i <= 12; i++)
        {
            System.out.print("12 * "+ i + " = " + 12 * i + "\n");
        }
    }
}
```

![Screencast-from-30-11-22-10_18_01](https://user-images.githubusercontent.com/49988347/204758212-7e75307d-fac2-49a6-b210-941161eaeada.gif)



**Forma de ejecución (Compilados, Interpretados, Virtuales):**
 
Especifica el comportamiento de los elementos de dicho lenguaje por lo que aplicándolo se puede derivar el comportamiento de un programa escrito en términos del lenguaje en cuestión.

Cada lenguaje tiene su propio modelo de ejecución, y estas determinan la manera en la que serán ejecutadas.

**_Existen 3 tipos:_**


**Compilados:**

    Un lenguaje compilado es un lenguaje de programación cuyas implementaciones son normalmente compiladores 
    (traductores que generan código de máquina a partir del código fuente) y no intérpretes (ejecutores paso 
    a paso del código fuente, donde no se lleva a cabo una traducción en la preejecución).  Eje.: C, Delphi y Python.


**Interpretados:**

    Los lenguajes de programación interpretados son aquellos que convierten su lenguaje al de la máquina a medida 
    que ejecutan el código. Ejemplo de lenguajes interpretados: JavaScript, Lua y Ruby.


**Virtuales:**

    Este código puede ser a su vez interpretado por una máquina virtual instalada en cualquier equipo. 
    Tienen una ejecución lenta pero su versatilidad de poder ejecutarse en cualquier entorno los hace muy apreciados.

**_Ejemplo en C:_**

![Screencast from 28-11-22 08 58 20](https://user-images.githubusercontent.com/115449960/204224638-269b1381-3a70-4540-bf89-c7a20d558593.gif)

## Paradigmas

Un paradigma de programación es un ***marco conceptual***, un conjunto de ideas que describe una forma de entender la construcción de programa.

Existen varios tipos de paradigmas entre ellos tenemos:

### Paradigmas imperativos

Los programas consisten en una **sucesion de instrucciones o conjunto de sentencias**, como si el programador diera ordenes concretas. En resumen se describe como debe realizarse el programa pero no la finalidad.
  - Los lenguajes de programación que utilizan el paradigma imperativo son: _Java, Pascal, ALGOL_
  
### Paradigmas declarativos

Utiliza el **principio de razonamiento lógico** para responder a las preguntas o cuestiones consultadas. En resumen describe que se debe calcular pero no te explica el como.
  - Este paradigma se divide en dos lenguajes: Programación Lógica: _Prolog_; Programacion funcional: _Lisp, Scala_
  
### Paradigmas procedimentales

Se refiere a un **conjunto de instrucciones o sentencias**. Por lo general pequeños programas con pocos calculos y una salida esperada. En resumen, indica un model de organizavion de programas.
  - Los lenguajes de programación que utilizan esre paradigma son: _C++, Basic_
  
### Paradigmas Orientados a Objetos

Es un modelo de programación informática que **organiza el diseño de software en torno a datos u objetos**, en lugar de funciones y lógica. Un objeto se puede definir como un campo de datos que tiene atributos y comportamiento únicos.
  - En este caso algunos de los lenguajes de programación orientados a objetos son: Python, PHP y Ruby
  
### Paradigmas funcionales

Entendemos por programación funcional un **lenguaje de programación declarativo donde el programador especifica lo que quiere hacer**, en lugar de lidiar con el estado de los objetos. Es decir, las funciones estarían en un primer lugar y nos centraremos en expresiones que pueden ser asignadas a cualquier variable.
  - Actualmente contamos con una gran cantidad de lenguajes en donde podemos hacer uso de la programación funcional, por ejemplo :
Java, PHP, Ruby, Python, Elixir, Kotling, Haskell, Erlang
### Paradigmas  logicos 
Este paradigma de programación está diseñado para que la computadora tome su propia decisión basándose en la lógica, con el fin de organizar de forma coherente todas esas instrucciones para poder alcanzar el objetivo fijado 
 - Entre los lenguajes de programación lógica podemos destacar Prolog, Lisp o Erlang


### Ejemplos de codigo:

- Paradigmas Imperativos: Pascal

![Online Pascal Compiler - online editor - Google Chrome 2022-11-29 17-29-45](https://user-images.githubusercontent.com/84182326/204587834-2136147f-9615-4901-93f2-f23f7b78d917.gif)

- Paradigma Orientado a Objetos :Ruby

![Online ruby Compiler - online  - Google Chrome 2022-11-29 17-29-45](https://github.com/Smartin0312/foto/blob/43bd298390e95391a7c991487612efc6054baf0c/GDB%20online%20Debugger%20_%20Compiler%20-%20Code,%20Compile,%20Run,%20Debug%20online%20C,%20C++%20-%20Google%20Chrome%202022-12-02%2009-05-37_Trim.gif)



