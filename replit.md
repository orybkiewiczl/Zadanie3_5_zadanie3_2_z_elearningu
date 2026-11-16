# Imported Java/Maven project

## Run on Replit

This project is a Java console application. Its entry point is
`src/main/java/Main.java`, which prints a greeting and then exits.

- Run the configured `Start application` workflow to execute it.
- Expected console output: `Hello world JPWP2!`. The program then exits normally;
  it does not start a web server or show a browser preview.
- Build and test manually with `mvn test`.
- Run the entry point directly with `javac -d . src/main/java/Main.java && java -cp . Main`.

The Java toolchain, Maven, and Java editor tools are provided by the
`java-graalvm22.3` Replit module. No secrets or external services are required.
Keep `replit.nix` free of duplicate legacy Java packages, which can prevent
the environment from loading.
