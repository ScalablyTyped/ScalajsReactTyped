package typingsJapgolly.ionic

import typingsJapgolly.ionic.commandMod.Command
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/generate", JSImport.Namespace)
@js.native
object generateMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class GenerateCommand () extends Command {
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

