package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.GenerateOptions
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.IonicContext
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/generate", JSImport.Namespace)
@js.native
object libGenerateMod extends js.Object {
  @js.native
  abstract class GenerateRunner[T /* <: GenerateOptions */] () extends Runner[T, Unit] {
    val e: GenerateRunnerDeps = js.native
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): GenerateOptions = js.native
    def ensureCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
    /* CompleteClass */
    override def run(options: T): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait GenerateRunnerDeps extends js.Object {
    val config: IConfig = js.native
    val ctx: IonicContext = js.native
    val log: ILogger = js.native
    val project: IProject = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    val shell: IShell = js.native
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
  }
  
}

