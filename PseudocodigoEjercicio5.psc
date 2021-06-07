Algoritmo Ejercicio5
	mayor <- 0
	menor <- 0
	Repetir
		Escribir "que sexo pertenece escriba h=hombre y m=mujer"
		Leer sex
		Escribir "Edad que tiene: "
		Leer edad
		Si sex="h" | sex="H"  Entonces
			Si 0<edad & edad<18  Entonces
				menor <- menor +1
			FinSi
		SiNo
			Si sex="M" | sex="m" Entonces
				Si 18<=edad Entonces
					mayor <- mayor+1
				FinSi
			SiNo
				Escribir "No ingreso correctamente el sexo"
			FinSi
		FinSi
		Escribir "Deseas seguir ingresando valores ingresa 0 o 1"
		Leer seguir
	Hasta Que seguir = 0 
	Escribir "Mujeres mayores de edad son: ", mayor ," Hombres menores de edad son: ", menor
FinAlgoritmo
