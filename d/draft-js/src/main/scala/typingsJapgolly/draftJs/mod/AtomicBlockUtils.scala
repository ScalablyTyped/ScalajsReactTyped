package typingsJapgolly.draftJs.mod

import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
open class AtomicBlockUtils ()
  extends StObject
     with typingsJapgolly.draftJs.mod.Draft.Model.Modifier.AtomicBlockUtils
object AtomicBlockUtils {
  
  @JSImport("draft-js", "AtomicBlockUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def insertAtomicBlock(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAtomicBlock")(editorState.asInstanceOf[js.Any], entityKey.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /* static member */
  inline def moveAtomicBlock(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("moveAtomicBlock")(editorState.asInstanceOf[js.Any], atomicBlock.asInstanceOf[js.Any], targetRange.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  inline def moveAtomicBlock(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("moveAtomicBlock")(editorState.asInstanceOf[js.Any], atomicBlock.asInstanceOf[js.Any], targetRange.asInstanceOf[js.Any], insertionMode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState]
}
