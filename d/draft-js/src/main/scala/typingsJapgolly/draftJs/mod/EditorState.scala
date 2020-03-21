package typingsJapgolly.draftJs.mod

import typingsJapgolly.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorChangeType
import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.OrderedMap
import typingsJapgolly.immutable.Immutable.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "EditorState")
@js.native
class EditorState ()
  extends typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState {
  /* CompleteClass */
  override def getAllowUndo(): Boolean = js.native
  /* CompleteClass */
  override def getBlockTree(blockKey: String): List[_] = js.native
  /* CompleteClass */
  override def getCurrentContent(): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  /* CompleteClass */
  override def getCurrentInlineStyle(): DraftInlineStyle = js.native
  /* CompleteClass */
  override def getDecorator(): DraftDecoratorType = js.native
  /* CompleteClass */
  override def getDirectionMap(): OrderedMap[_, _] = js.native
  /**
    * While editing, the user may apply inline style commands with a collapsed
    * cursor, intending to type text that adopts the specified style. In this
    * case, we track the specified style as an "override" that takes precedence
    * over the inline style of the text adjacent to the cursor.
    *
    * If null, there is no override in place.
    */
  /* CompleteClass */
  override def getInlineStyleOverride(): DraftInlineStyle = js.native
  /* CompleteClass */
  override def getLastChangeType(): EditorChangeType = js.native
  /* CompleteClass */
  override def getNativelyRenderedContent(): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  /* CompleteClass */
  override def getRedoStack(): Stack[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState] = js.native
  /* CompleteClass */
  override def getSelection(): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.SelectionState = js.native
  /* CompleteClass */
  override def getUndoStack(): Stack[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState] = js.native
  /* CompleteClass */
  override def isInCompositionMode(): Boolean = js.native
  /* CompleteClass */
  override def isSelectionAtEndOfContent(): Boolean = js.native
  /* CompleteClass */
  override def isSelectionAtStartOfContent(): Boolean = js.native
  /* CompleteClass */
  override def mustForceSelection(): Boolean = js.native
  /* CompleteClass */
  override def toJS(): js.Object = js.native
}

/* static members */
@JSImport("draft-js", "EditorState")
@js.native
object EditorState extends js.Object {
  /**
    * Incorporate native DOM selection changes into the EditorState. This
    * method can be used when we simply want to accept whatever the DOM
    * has given us to represent selection, and we do not need to re-render
    * the editor.
    *
    * To forcibly move the DOM selection, see `EditorState.forceSelection`.
    */
  def acceptSelection(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    selection: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def create(config: js.Object): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def createEmpty(): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def createEmpty(decorator: DraftDecoratorType): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def createWithContent(contentState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def createWithContent(
    contentState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState,
    decorator: DraftDecoratorType
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  /**
    * At times, we need to force the DOM selection to be where we
    * need it to be. This can occur when the anchor or focus nodes
    * are non-text nodes, for instance. In this case, we want to trigger
    * a re-render of the editor, which in turn forces selection into
    * the correct place in the DOM. The `forceSelection` method
    * accomplishes this.
    *
    * This method should be used in cases where you need to explicitly
    * move the DOM selection from one place to another without a change
    * in ContentState.
    */
  def forceSelection(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    selection: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  /**
    * Force focus to the end of the editor. This is useful in scenarios
    * where we want to programmatically focus the input and it makes sense
    * to allow the user to continue working seamlessly.
    */
  def moveFocusToEnd(editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  /**
    * Move selection to the end of the editor without forcing focus.
    */
  def moveSelectionToEnd(editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  /**
    * Push the current ContentState onto the undo stack if it should be
    * considered a boundary state, and set the provided ContentState as the
    * new current content.
    */
  def push(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    contentState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState,
    changeType: EditorChangeType
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  /**
    * Make the top ContentState in the redo stack the new current content and
    * push the current content onto the undo stack.
    */
  def redo(editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def set(editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState, put: js.Object): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def setInlineStyleOverride(
    editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    inlineStyleOverride: DraftInlineStyle
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  /**
    * Make the top ContentState in the undo stack the new current content and
    * push the current content onto the redo stack.
    */
  def undo(editorState: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
}

