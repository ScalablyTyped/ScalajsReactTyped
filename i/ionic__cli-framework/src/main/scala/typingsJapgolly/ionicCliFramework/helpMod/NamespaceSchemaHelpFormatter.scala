package typingsJapgolly.ionicCliFramework.helpMod

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "NamespaceSchemaHelpFormatter")
@js.native
class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends NamespaceHelpFormatter[C, N, M, I, O] {
  def formatCommand(cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[CommandHelpSchema] = js.native
  def formatCommandGroup(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[CommandHelpSchema]] = js.native
  def serialize(): js.Promise[NamespaceHelpSchema] = js.native
}

