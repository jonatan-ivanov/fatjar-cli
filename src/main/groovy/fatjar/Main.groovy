package fatjar

/**
 * @author Jonatan Ivanov
 */
class Main {
    static void main(String[] args) {
        CliBuilder cli = new CliBuilder(usage: "java -jar fatjar-cli.jar <options>", width: 250)
        cli.with {
            _ longOpt: 'url', args: 1, required: true, argName: 'url', 'The url to invoke'
        }

        OptionAccessor options = cli.parse(args)
        if (options == null) System.exit(1)

        println options.url.toURL().text
    }
}
