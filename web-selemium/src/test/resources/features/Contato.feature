#language:pt
@exemplo
Funcionalidade: Salvar dados formulário WPFC7

  Cenário: Deve salvar um registro no formulário WPCF7
    Dado que eu acesse o sistema
    Quando salvo uma entrada no formulário WPCF7
    Então verifico que o registro é apresentado na listagem

 # Cenário: Deve verificar mensagem de campo obrigatório no formulário WPCF7
  # Dado que eu acesse o sistema
   # Quando salvo uma entrada no formulário WPCF7 sem informar campos obrigatórios
    #Então verifico que o formulário apresenta alerta para o preenchimento dos campos