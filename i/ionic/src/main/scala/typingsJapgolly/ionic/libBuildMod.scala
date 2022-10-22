package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.PartialCommandMetadata
import typingsJapgolly.ionic.definitionsMod.BaseBuildOptions
import typingsJapgolly.ionic.definitionsMod.BuildOptions
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.NpmClient
import typingsJapgolly.ionic.definitionsMod.Runner
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueOther
import typingsJapgolly.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBuildMod {
  
  @JSImport("ionic/lib/build", "BUILD_SCRIPT")
  @js.native
  val BUILD_SCRIPT: /* "ionic:build" */ String = js.native
  
  /* note: abstract class */ @JSImport("ionic/lib/build", "BuildCLI")
  @js.native
  open class BuildCLI[T /* <: js.Object */] protected () extends StObject {
    def this(e: BuildRunnerDeps) = this()
    
    /* private */ var _resolvedProgram: Any = js.native
    
    def build(options: T): js.Promise[Unit] = js.native
    
    /**
      * Build the arguments for starting this Build CLI. Called by `this.run()`.
      */
    /* protected */ def buildArgs(options: T): js.Promise[js.Array[String]] = js.native
    
    /**
      * Build the environment variables for this Build CLI. Called by `this.run()`.
      */
    /* protected */ def buildEnvVars(options: T): js.Promise[ProcessEnv] = js.native
    
    /* protected */ val e: BuildRunnerDeps = js.native
    
    /**
      * If true, the Build CLI will not prompt to be installed.
      */
    val global: Boolean = js.native
    
    /**
      * The pretty name of this Build CLI.
      */
    val name: String = js.native
    
    /**
      * The npm package of this Build CLI.
      */
    val pkg: String = js.native
    
    /**
      * The bin program to use for this Build CLI.
      */
    val program: String = js.native
    
    /* protected */ def promptToInstall(): js.Promise[Boolean] = js.native
    
    /* protected */ def resolveProgram(): js.Promise[String] = js.native
    
    def resolveScript(): js.Promise[js.UndefOr[String]] = js.native
    
    def resolvedProgram: String = js.native
    
    /* protected */ def run(options: T): js.Promise[Unit] = js.native
    
    /* protected */ def runWrapper(options: T): js.Promise[Unit] = js.native
    
    /**
      * If specified, `package.json` is inspected for this script to use instead
      * of `program`.
      */
    val script: js.UndefOr[String] = js.native
  }
  
  /* note: abstract class */ @JSImport("ionic/lib/build", "BuildRunner")
  @js.native
  open class BuildRunner[T /* <: BuildOptions[Any] */] ()
    extends StObject
       with Runner[T, Unit] {
    
    def afterBuild(options: T): js.Promise[Unit] = js.native
    
    def beforeBuild(options: T): js.Promise[Unit] = js.native
    
    def buildProject(options: T): js.Promise[Unit] = js.native
    
    def createBaseOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): BaseBuildOptions = js.native
    
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): T = js.native
    
    def determineEngineFromCommandLine(options: CommandLineOptions): String = js.native
    
    /* protected */ val e: BuildRunnerDeps = js.native
    
    def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
    
    def getPkgManagerBuildCLI(): PkgManagerBuildCLI = js.native
    
    /* CompleteClass */
    override def run(options: T): js.Promise[Unit] = js.native
  }
  
  @JSImport("ionic/lib/build", "COMMON_BUILD_COMMAND_OPTIONS")
  @js.native
  val COMMON_BUILD_COMMAND_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  @JSImport("ionic/lib/build", "NpmBuildCLI")
  @js.native
  open class NpmBuildCLI () extends PkgManagerBuildCLI
  
  @JSImport("ionic/lib/build", "YarnBuildCLI")
  @js.native
  open class YarnBuildCLI () extends PkgManagerBuildCLI
  
  trait BuildRunnerDeps extends StObject {
    
    val config: IConfig
    
    val log: ILogger
    
    val project: IProject
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox]
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm]
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther]
    @JSName("prompt")
    val prompt_Original: PromptModule
    
    val shell: IShell
  }
  object BuildRunnerDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: IProject, prompt: PromptModule, shell: IShell): BuildRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildRunnerDeps]
    }
    
    extension [Self <: BuildRunnerDeps](x: Self) {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: PromptModule): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PkgManagerBuildCLI extends BuildCLI[BaseBuildOptions] {
    
    @JSName("program")
    val program_PkgManagerBuildCLI: NpmClient = js.native
    
    @JSName("script")
    val script_PkgManagerBuildCLI: /* "ionic:build" */ String = js.native
  }
}
