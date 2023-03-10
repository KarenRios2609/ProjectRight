nombre = input("Ingresa tu nombre: ")
apellido = input("Ingresa tu apellido: ")
edad = input("Ingresa tu edad")
edad = int(edad)

if(edad>17 and edad<70):
    ingresos = input("Ingresa tus ingresos mensuales: ")
    ingresos = float(ingresos)
    if(ingresos<10000):
      print("usted aún no es candidato para tramitar un crédito con nosotros")
      print("ADIOS")
    if(ingresos >=10000 and ingresos<25000):
      print("usted es candidato para nuestra segmentación clásica")
      print("ADIOS")
    if(ingresos>=25000 and ingresos<35000):
      print("usted es candidato para nuestra segmentacion oro")
      print("ADIOS")
    if(ingresos>=35000):
      print("usted es candidato para nuestra segmentacion platino")
      print("ADIOS")
else:
    print("No puede solicitar un credito bancario, debe tener entre 18 y 69 años")
    
