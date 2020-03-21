package typingsJapgolly.ionic.libHelpMod

import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.colorsMod.Colors
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceLocateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceHelpFormatterDeps
  extends typingsJapgolly.ionicCliFramework.helpMod.NamespaceHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  val inProject: Boolean
  val version: String
}

object NamespaceHelpFormatterDeps {
  @scala.inline
  def apply(
    inProject: Boolean,
    location: NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption],
    namespace: INamespace,
    version: String,
    colors: Colors = null
  ): NamespaceHelpFormatterDeps = {
    val __obj = js.Dynamic.literal(inProject = inProject.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceHelpFormatterDeps]
  }
}

