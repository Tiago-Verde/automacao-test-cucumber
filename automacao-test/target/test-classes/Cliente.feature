#language:pt
@exemplo
Funcionalidade: Salvar dados formulario WPFC7

  Cen�rio: Deve salvar um registro no formul�rio WPCF7
    Dado que eu acesse o sistema
    Quando salvo uma entrada no formul�rio WPCF7
    Ent�o verifico que o registro � apresentado na listagem

  Cen�rio: Deve verificar mensagem de campo obrigat�rio no formul�rio WPCF7
    Dado que eu acesse o sistema
    Quando salvo uma entrada no formul�rio WPCF7 sem informar campos obrigat�rios
    Ent�o verifico que o formul�ri apresenta alerta para o preenchimento dos campos
