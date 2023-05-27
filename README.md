# ArDoCo CLI
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ArDoCo_CLI&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ArDoCo_CLI)
[![Latest Release](https://img.shields.io/github/release/ArDoCo/CLI.svg)](https://github.com/ArDoCo/CLI/releases/latest)


This project provides a CLI for ArDoCo.
ArDoCo supports recovering trace links and identifying inconsistencies between PCM Models and Textual Software Architecture Documentation.
The usage is described below.


ArDoCo is actively developed by researchers of
the _[Modelling for Continuous Software Engineering (MCSE) group](https://mcse.kastel.kit.edu)_
of _[KASTEL - Institute of Information Security and Dependability](https://kastel.kit.edu)_ at
the [KIT](https://www.kit.edu).

## Usage

```
usage: java -jar ardoco-cli.jar
-h,--help                        show this message
-c,--conf <arg>                  path to the additional config file (overwriting default properties)
-ma,--model-architecture <arg>   path to the architecture model
-mt,--archtype <arg>			 type of the architecture model (PCM or UML)
-n,--name <arg>                  name of the project/run
-t,--text <arg>                  path to the input text file of the software architecture documentation
-o,--out <arg>                   path to the output directory
```

The models can be provided as PCM (repository) or UML.
Additionally, you can provide a (java) code model created using the [CodeModelExtractors](https://github.com/ArDoCo/CodeModelExtractors).
Text should be a plain text file.

## Acknowledgements

This work was supported by funding from the topic Engineering Secure Systems of the Helmholtz Association (HGF) and by
KASTEL Security Research Labs (46.23.01).
