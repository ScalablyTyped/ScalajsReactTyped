package typingsJapgolly.ionic

import typingsJapgolly.ionic.coreMod.DeployConfCommand
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/deploy/add", JSImport.Namespace)
@js.native
object deployAddMod extends js.Object {
  @js.native
  class AddCommand () extends DeployConfCommand {
    /* protected */ def buildCordovaDeployOptions(options: CommandLineOptions): js.Array[String] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

