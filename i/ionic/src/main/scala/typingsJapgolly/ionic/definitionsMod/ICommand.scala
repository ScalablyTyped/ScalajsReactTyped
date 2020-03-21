package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand
  extends typingsJapgolly.ionicCliFramework.definitionsMod.ICommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  val env: IonicEnvironment = js.native
  val project: js.UndefOr[IProject] = js.native
  def execute(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
}

