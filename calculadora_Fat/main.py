from fastapi import FastAPI
from controller.operacao import router  
app = FastAPI()

app.include_router(router)


