package typingsJapgolly.ionicCliFramework.helpMod

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.Footnote
import typingsJapgolly.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "CommandSchemaHelpFormatter")
@js.native
class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends CommandHelpFormatter[C, N, M, I, O] {
  def formatCommand(cmd: (HydratedCommandMetadata[C, N, M, I, O]) | M): js.Promise[CommandHelpSchema] = js.native
  def formatFootnote(footnote: Footnote): CommandHelpSchemaFootnote = js.native
  def formatInput(input: I): js.Promise[CommandHelpSchemaInput] = js.native
  def formatInputs(inputs: js.Array[I]): js.Promise[js.Array[CommandHelpSchemaInput]] = js.native
  def formatOption(option: O): js.Promise[CommandHelpSchemaOption] = js.native
  def formatOptions(options: js.Array[O]): js.Promise[js.Array[CommandHelpSchemaOption]] = js.native
  def serialize(): js.Promise[CommandHelpSchema] = js.native
}

