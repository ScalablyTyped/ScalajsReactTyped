package typingsJapgolly.ionic.libHelpMod

import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/help", "NamespaceStringHelpFormatter")
@js.native
class NamespaceStringHelpFormatter protected ()
  extends typingsJapgolly.ionicCliFramework.helpMod.NamespaceStringHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  def this(hasVersionInProjectRest: NamespaceHelpFormatterDeps) = this()
  val inProject: Boolean = js.native
  val version: String = js.native
  def formatIonicHeader(): js.Promise[String] = js.native
}

