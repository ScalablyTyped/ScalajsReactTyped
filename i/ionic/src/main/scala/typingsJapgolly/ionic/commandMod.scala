package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.IonicEnvironment
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.mod.BaseCommand
import typingsJapgolly.ionicCliFramework.mod.TaskChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/command", JSImport.Namespace)
@js.native
object commandMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.ICommand because var conflicts: namespace. Inlined 
  - typingsJapgolly.ionic.definitionsMod.ICommand because var conflicts: namespace. Inlined env, project, execute */ @js.native
  abstract class Command protected () extends BaseCommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(namespace: INamespace) = this()
    @JSName("env")
    val env_FCommand: IonicEnvironment = js.native
    @JSName("project")
    val project_FCommand: js.UndefOr[IProject] = js.native
    val taskChains: js.Array[TaskChain] = js.native
    def createTaskChain(): TaskChain = js.native
    def env(): IonicEnvironment = js.native
    def execute(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def getCleanInputsForTelemetry(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[js.Array[String]] = js.native
    def project(): js.UndefOr[IProject] = js.native
  }
  
}

