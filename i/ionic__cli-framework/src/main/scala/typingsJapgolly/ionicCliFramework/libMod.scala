package typingsJapgolly.ionicCliFramework

import typingsJapgolly.ionicCliFramework.anon.Argv
import typingsJapgolly.ionicCliFramework.anon.CaseSensitive
import typingsJapgolly.ionicCliFramework.anon.IncludeSeparated
import typingsJapgolly.ionicCliFramework.anon.RequiredCommandMetadataCo
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandPathItem
import typingsJapgolly.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.HydratedParseArgsOptions
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.definitionsMod.Validator
import typingsJapgolly.ionicCliFramework.definitionsMod.Validators
import typingsJapgolly.ionicCliFramework.libColorsMod.Colors
import typingsJapgolly.ionicCliFramework.libCompletionMod.CompletionFormatterDeps
import typingsJapgolly.ionicCliFramework.libConfigMod.BaseConfigOptions
import typingsJapgolly.ionicCliFramework.libExecutorMod.BaseExecutorDeps
import typingsJapgolly.ionicCliFramework.libExecutorMod.ExecutorOperations
import typingsJapgolly.ionicCliFramework.libHelpMod.CommandHelpFormatterDeps
import typingsJapgolly.ionicCliFramework.libHelpMod.CommandHelpSchema
import typingsJapgolly.ionicCliFramework.libHelpMod.NamespaceHelpFormatterDeps
import typingsJapgolly.ionicCliFramework.libOptionsMod.FormatOptionNameOptions
import typingsJapgolly.ionicCliFramework.libOptionsMod.HydratedOptionSpec
import typingsJapgolly.ionicCliFramework.libOptionsMod.OptionPredicate
import typingsJapgolly.ionicCliFramework.libOptionsMod.UnparseArgsOptions
import typingsJapgolly.minimist.mod.Opts
import typingsJapgolly.minimist.mod.ParsedArgs
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@ionic/cli-framework/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "AbstractExecutor")
  @js.native
  open class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsJapgolly.ionicCliFramework.libExecutorMod.AbstractExecutor[C, N, M, I, O] {
    def this(options: EventEmitterOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "BaseCommand")
  @js.native
  open class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.BaseCommand[C, N, M, I, O] {
    def this(namespace: N) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseCommandMap")
  @js.native
  open class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.BaseCommandMap[C, N, M, I, O]
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "BaseConfig")
  @js.native
  open class BaseConfig[T /* <: js.Object */] protected ()
    extends typingsJapgolly.ionicCliFramework.libConfigMod.BaseConfig[T] {
    def this(p: String) = this()
    def this(p: String, hasSpacesPathPrefix: BaseConfigOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseExecutor")
  @js.native
  open class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libExecutorMod.BaseExecutor[C, N, M, I, O] {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
  }
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "BaseNamespace")
  @js.native
  open class BaseNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.BaseNamespace[C, N, M, I, O] {
    def this(parent: N) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseNamespaceMap")
  @js.native
  open class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.BaseNamespaceMap[C, N, M, I, O]
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "Command")
  @js.native
  open class Command protected ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.Command {
    def this(namespace: typingsJapgolly.ionicCliFramework.libCommandMod.Namespace) = this()
  }
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "CommandHelpFormatter")
  @js.native
  open class CommandHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libHelpMod.CommandHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandMap")
  @js.native
  open class CommandMap ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.CommandMap
  
  @JSImport("@ionic/cli-framework/lib", "CommandMapDefault")
  @js.native
  val CommandMapDefault: js.Symbol = js.native
  
  @JSImport("@ionic/cli-framework/lib", "CommandSchemaHelpFormatter")
  @js.native
  open class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libHelpMod.CommandSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandStringHelpFormatter")
  @js.native
  open class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libHelpMod.CommandStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "CompletionFormatter")
  @js.native
  open class CompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libCompletionMod.CompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "DEFAULT_COLORS")
  @js.native
  val DEFAULT_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework/lib", "EXECUTOR_OPS")
  @js.native
  val EXECUTOR_OPS: ExecutorOperations = js.native
  
  @JSImport("@ionic/cli-framework/lib", "Executor")
  @js.native
  open class Executor protected ()
    extends typingsJapgolly.ionicCliFramework.libExecutorMod.Executor {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[
            typingsJapgolly.ionicCliFramework.libCommandMod.Command, 
            typingsJapgolly.ionicCliFramework.libCommandMod.Namespace, 
            CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
            CommandMetadataInput, 
            CommandMetadataOption
          ]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "HELP_FLAGS")
  @js.native
  val HELP_FLAGS: js.Array[String] = js.native
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "HelpFormatter")
  @js.native
  open class HelpFormatter protected ()
    extends typingsJapgolly.ionicCliFramework.libHelpMod.HelpFormatter {
    def this(hasColors: typingsJapgolly.ionicCliFramework.anon.Colors) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NO_COLORS")
  @js.native
  val NO_COLORS: Colors = js.native
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "Namespace")
  @js.native
  open class Namespace ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.Namespace {
    def this(parent: typingsJapgolly.ionicCliFramework.libCommandMod.Namespace) = this()
  }
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib", "NamespaceHelpFormatter")
  @js.native
  open class NamespaceHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libHelpMod.NamespaceHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceMap")
  @js.native
  open class NamespaceMap ()
    extends typingsJapgolly.ionicCliFramework.libCommandMod.NamespaceMap
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceSchemaHelpFormatter")
  @js.native
  open class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libHelpMod.NamespaceSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceStringHelpFormatter")
  @js.native
  open class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libHelpMod.NamespaceStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework/lib", "OptionFilters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    inline def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    
    inline def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    inline def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
  }
  
  @JSImport("@ionic/cli-framework/lib", "ZshCompletionFormatter")
  @js.native
  open class ZshCompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsJapgolly.ionicCliFramework.libCompletionMod.ZshCompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  inline def combine(validators: Validator*): Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(validators.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Validator]
  
  inline def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(values.asInstanceOf[js.Any], hasCaseSensitive.asInstanceOf[js.Any])).asInstanceOf[Validator]
  
  inline def createCommandMetadataFromSchema(schema: CommandHelpSchema): RequiredCommandMetadataCo = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommandMetadataFromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[RequiredCommandMetadataCo]
  
  inline def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](hasNamespaceArgvEnvRest: (Argv[N, C, M, I, O]) & (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(hasNamespaceArgvEnvRest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  inline def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  inline def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  inline def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  inline def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any], hasShowAliasesShowValueSpecColors.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCommandPath")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]]]
  
  inline def getCompletionWords[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](ns: N, argv: js.Array[String]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompletionWords")(ns.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateCommandMetadataOption")(option.asInstanceOf[js.Any]).asInstanceOf[O]
  
  inline def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateOptionSpec")(opt.asInstanceOf[js.Any]).asInstanceOf[HydratedOptionSpec]
  
  inline def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandVisible")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionVisible")(opt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataOptionsToParseArgsOptions")(commandOptions.asInstanceOf[js.Any]).asInstanceOf[HydratedParseArgsOptions]
  
  inline def parseArgs(): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[ParsedArgs]
  inline def parseArgs(args: js.Array[String]): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[ParsedArgs]
  inline def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  inline def parseArgs(args: Unit, opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  
  inline def parseArgs_T_Intersection[T](): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: js.Array[String]): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: Unit, opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  
  inline def parseArgs_T_T[T /* <: ParsedArgs */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T]
  inline def parseArgs_T_T[T /* <: ParsedArgs */](args: js.Array[String]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def parseArgs_T_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def parseArgs_T_T[T /* <: ParsedArgs */](args: Unit, opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateArgv")(pargv.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[String], js.Array[String]]]
  
  inline def stripOptions(pargv: js.Array[String], hasIncludeSeparated: IncludeSeparated): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stripOptions")(pargv.asInstanceOf[js.Any], hasIncludeSeparated.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: Unit,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], validatorsToUse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/cli-framework/lib", "validators")
  @js.native
  val validators: Validators = js.native
}
