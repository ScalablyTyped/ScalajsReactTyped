package typingsJapgolly.ionic

import typingsJapgolly.ionic.baseMod.CapacitorCommand
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/capacitor/add", JSImport.Namespace)
@js.native
object addMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class AddCommand () extends CapacitorCommand {
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

