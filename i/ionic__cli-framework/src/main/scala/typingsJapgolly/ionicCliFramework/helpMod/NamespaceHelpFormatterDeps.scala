package typingsJapgolly.ionicCliFramework.helpMod

import typingsJapgolly.ionicCliFramework.colorsMod.Colors
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceLocateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val location: NamespaceLocateResult[C, N, M, I, O]
  val namespace: N
}

object NamespaceHelpFormatterDeps {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](location: NamespaceLocateResult[C, N, M, I, O], namespace: N, colors: Colors = null): NamespaceHelpFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceHelpFormatterDeps[C, N, M, I, O]]
  }
}

