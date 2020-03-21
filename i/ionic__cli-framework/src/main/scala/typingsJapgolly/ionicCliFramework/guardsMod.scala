package typingsJapgolly.ionicCliFramework

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/guards", JSImport.Namespace)
@js.native
object guardsMod extends js.Object {
  def isCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is C */ Boolean = js.native
  def isHydratedCommandMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.HydratedCommandMetadata<C, N, M, I, O> */ Boolean = js.native
  def isLinkFootnote(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.LinkFootnote */ Boolean = js.native
  def isNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is N */ Boolean = js.native
  def isPackageJson(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.PackageJson */ Boolean = js.native
}

