# Guia de Estudos

Aplicativo Android publicado em produção na Google Play para reunir links e sugestões de estudo em áreas como tecnologia, idiomas, administração, empreendedorismo e IA.

Este repositório publica o código-fonte do app como open source, incluindo os textos, imagens e links usados na versão atual. Isso também inclui referências ao site pessoal e ao e-mail de contato presentes no aplicativo.

## Stack e requisitos

- Android Studio atualizado ou Gradle via linha de comando
- JDK 17
- Android SDK Platform 36
- Android Build Tools 36.0.0

Observação: o projeto usa `compileSdk = 36` e hoje não deve ser executado com JDK 25. Para desenvolvimento local, prefira o JDK 17 configurado no Android Studio ou via `JAVA_HOME`.

## Como abrir no Android Studio

1. Clone este repositório.
2. Abra a pasta raiz no Android Studio.
3. Aguarde a sincronização do Gradle.
4. Confirme que o projeto está usando JDK 17.
5. Execute a variante `debug` em um emulador ou dispositivo físico.

## Build pela linha de comando

Windows:

```powershell
.\gradlew.bat assembleDebug
```

Linux/macOS:

```bash
./gradlew assembleDebug
```

Teste unitário:

```powershell
.\gradlew.bat testDebugUnitTest
```

## Estrutura de branches

- `main`: branch estável e base das releases públicas
- `develop`: branch de integração para desenvolvimento contínuo

Fluxo recomendado:

1. Criar branches curtas a partir de `develop`
2. Abrir PR para `develop`
3. Promover de `develop` para `main` quando houver release

## CI

O repositório inclui um workflow em GitHub Actions para validar `assembleDebug` com JDK 17 em pushes e pull requests para `main` e `develop`.

## Publicação e segurança

- O repositório não inclui chaves de assinatura, arquivos locais de IDE, `local.properties` ou artefatos de build.
- Se você publicar uma fork na Play Store, configure sua própria assinatura e revise os links/branding conforme a sua necessidade.

## Licença

Distribuído sob a licença Apache-2.0. Veja [`LICENSE`](LICENSE).
