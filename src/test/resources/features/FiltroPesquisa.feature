#language:pt
Funcionalidade: Filtro por pesquisa

  Contexto: Filtro Merkets

    Dado que eu acesso a tela home do sistema da Klever
    Quando click no menu
    E seleciono “Markets”


  Esquema do Cenario: : Filtro por Pesquisa
    Entao posso buscar pelo campo <Pesquisa>

    Exemplos:
      | Pesquisa |
      | BNB/KLV  |
      | KLV/BTC  |
      | DVK/KLV  |

  Esquema do Cenario: Filtro por Favorito
    Entao posso selecionar o filtro por <Favorito>

    Exemplos:
      | Favorito    |
      | BNB         |
      | BTC         |
      | DVK         |