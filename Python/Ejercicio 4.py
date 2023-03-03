#Crear un programa que le pida al usuario la base y altura de un triangulo y mostrarle su área...

base = input("Ingresa la base del triángulo: ")
altura = input("Ingresa la altura del triángulo")

base = float(base)
altura = float(altura)

area = base*altura/2

print("El área del triángulo es: ", area)
