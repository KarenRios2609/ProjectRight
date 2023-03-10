radio = input("Ingresa rl radio del circulo: ")
radio= float(radio)

if(radio<=0):
 print("ERROR, ADIOS")

r2= radio * radio 
area =  3.1416 * r2
if(radio>0):
 print("El área del circulo es: ",area)
 print("ADIOS")
