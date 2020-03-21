package typingsJapgolly.ionic

import typingsJapgolly.ionic.commandMod.Command
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/repair", JSImport.Namespace)
@js.native
object repairMod extends js.Object {
  @js.native
  class RepairCommand () extends Command {
    def cordovaRepair(cordova: RequiredProjectIntegratio, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

