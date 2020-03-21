package typingsJapgolly.ionic.configBaseMod

import typingsJapgolly.ionic.commandMod.Command
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/config/base", "BaseConfigCommand")
@js.native
abstract class BaseConfigCommand () extends Command {
  def generateContext(inputs: CommandLineInputs, options: CommandLineOptions): ConfigContext = js.native
  def interpretValue(): js.Any = js.native
  def interpretValue(v: String): js.Any = js.native
  def interpretValue(v: String, expectJson: Boolean): js.Any = js.native
  def jsonStringify(v: js.Any): String = js.native
}

