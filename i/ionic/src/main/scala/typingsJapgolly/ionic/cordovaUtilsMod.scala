package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/utils", JSImport.Namespace)
@js.native
object cordovaUtilsMod extends js.Object {
  def filterArgumentsForCordova(metadata: CommandMetadata, options: CommandLineOptions): js.Array[String] = js.native
  def generateOptionsForCordovaBuild(metadata: CommandMetadata, inputs: CommandLineInputs, options: CommandLineOptions): CommandLineOptions = js.native
}

