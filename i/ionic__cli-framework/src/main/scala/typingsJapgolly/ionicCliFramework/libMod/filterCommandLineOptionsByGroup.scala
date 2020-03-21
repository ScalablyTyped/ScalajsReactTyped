package typingsJapgolly.ionicCliFramework.libMod

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "filterCommandLineOptionsByGroup")
@js.native
object filterCommandLineOptionsByGroup extends js.Object {
  def apply[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = js.native
  def apply[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = js.native
}

