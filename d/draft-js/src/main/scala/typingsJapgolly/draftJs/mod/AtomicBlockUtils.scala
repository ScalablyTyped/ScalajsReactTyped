package typingsJapgolly.draftJs.mod

import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typingsJapgolly.draftJs.mod.Draft.Model.Modifier.AtomicBlockUtils

/* static members */
@JSImport("draft-js", "AtomicBlockUtils")
@js.native
object AtomicBlockUtils extends js.Object {
  def insertAtomicBlock(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
}

