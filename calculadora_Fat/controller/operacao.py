from fastapi import APIRouter
from model.service.calculadora import Calculadora  # <-- troque para absoluto

router = APIRouter(tags=["Calculadora"])

@router.get("/somar/{valor_1}/{valor_2}")
async def somar(valor_1: int, valor_2: int):
    calc = Calculadora()
    resultado = calc.somar(valor_1, valor_2)
    return {"resultado": resultado}

@router.get("/subtrair/{valor_1}/{valor_2}")
async def subtrair(valor_1: int, valor_2: int):
    calc = Calculadora()
    resultado = calc.subtrair(valor_1, valor_2)
    return {"resultado": resultado}

@router.get("/multiplicar/{valor_1}/{valor_2}")
async def multiplicar (valor_1 :int,valor_2 :int ):
   calc = Calculadora()
   resultado = calc.multiplicar(valor_1, valor_2)
   return {"resultado" : resultado}

@router.get("/dividir/{valor_1}/{valor_2}")
async def dividir(valor_1: int, valor_2: int):
    calc = Calculadora()
    resultado = calc.dividir(valor_1, valor_2)
    return {"resultado": resultado}