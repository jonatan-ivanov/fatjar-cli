#! /usr/bin/env groovy

CliBuilder cli = new CliBuilder(usage: "${this.class.simpleName}.groovy <message>", width: 250)
cli.with {
    h longOpt: 'help', 'Show usage information'
}

OptionAccessor options = cli.parse(args)
if (options == null || options.h || options.arguments().size() != 1) {
    cli.usage()
    System.exit(1)
}

println "echo: ${options.arguments().first()}"
