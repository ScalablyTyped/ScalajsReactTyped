package typingsJapgolly.ionic

import typingsJapgolly.ionic.commandMod.Command
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/init", JSImport.Namespace)
@js.native
object initMod extends js.Object {
  @js.native
  class InitCommand () extends Command {
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
  
}

