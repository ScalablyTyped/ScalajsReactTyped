package typingsJapgolly.ionic.libHelpMod

import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/help", "CommandStringHelpFormatter")
@js.native
class CommandStringHelpFormatter protected ()
  extends typingsJapgolly.ionicCliFramework.helpMod.CommandStringHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  def this(options: CommandHelpFormatterDeps) = this()
}

