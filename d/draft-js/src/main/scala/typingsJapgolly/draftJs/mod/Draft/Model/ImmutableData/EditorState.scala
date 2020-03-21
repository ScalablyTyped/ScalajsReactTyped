package typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.OrderedMap
import typingsJapgolly.immutable.Immutable.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait EditorState extends js.Object {
  def getAllowUndo(): Boolean
  def getBlockTree(blockKey: String): List[_]
  def getCurrentContent(): ContentState
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  def getCurrentInlineStyle(): DraftInlineStyle
  def getDecorator(): DraftDecoratorType
  def getDirectionMap(): OrderedMap[_, _]
  /**
    * While editing, the user may apply inline style commands with a collapsed
    * cursor, intending to type text that adopts the specified style. In this
    * case, we track the specified style as an "override" that takes precedence
    * over the inline style of the text adjacent to the cursor.
    *
    * If null, there is no override in place.
    */
  def getInlineStyleOverride(): DraftInlineStyle
  def getLastChangeType(): EditorChangeType
  def getNativelyRenderedContent(): ContentState
  def getRedoStack(): Stack[ContentState]
  def getSelection(): SelectionState
  def getUndoStack(): Stack[ContentState]
  def isInCompositionMode(): Boolean
  def isSelectionAtEndOfContent(): Boolean
  def isSelectionAtStartOfContent(): Boolean
  def mustForceSelection(): Boolean
  def toJS(): js.Object
}

object EditorState {
  @scala.inline
  def apply(
    getAllowUndo: CallbackTo[Boolean],
    getBlockTree: String => CallbackTo[List[js.Any]],
    getCurrentContent: CallbackTo[ContentState],
    getCurrentInlineStyle: CallbackTo[DraftInlineStyle],
    getDecorator: CallbackTo[DraftDecoratorType],
    getDirectionMap: CallbackTo[OrderedMap[js.Any, js.Any]],
    getInlineStyleOverride: CallbackTo[DraftInlineStyle],
    getLastChangeType: CallbackTo[EditorChangeType],
    getNativelyRenderedContent: CallbackTo[ContentState],
    getRedoStack: CallbackTo[Stack[ContentState]],
    getSelection: CallbackTo[SelectionState],
    getUndoStack: CallbackTo[Stack[ContentState]],
    isInCompositionMode: CallbackTo[Boolean],
    isSelectionAtEndOfContent: CallbackTo[Boolean],
    isSelectionAtStartOfContent: CallbackTo[Boolean],
    mustForceSelection: CallbackTo[Boolean],
    toJS: CallbackTo[js.Object]
  ): EditorState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllowUndo")(getAllowUndo.toJsFn)
    __obj.updateDynamic("getBlockTree")(js.Any.fromFunction1((t0: java.lang.String) => getBlockTree(t0).runNow()))
    __obj.updateDynamic("getCurrentContent")(getCurrentContent.toJsFn)
    __obj.updateDynamic("getCurrentInlineStyle")(getCurrentInlineStyle.toJsFn)
    __obj.updateDynamic("getDecorator")(getDecorator.toJsFn)
    __obj.updateDynamic("getDirectionMap")(getDirectionMap.toJsFn)
    __obj.updateDynamic("getInlineStyleOverride")(getInlineStyleOverride.toJsFn)
    __obj.updateDynamic("getLastChangeType")(getLastChangeType.toJsFn)
    __obj.updateDynamic("getNativelyRenderedContent")(getNativelyRenderedContent.toJsFn)
    __obj.updateDynamic("getRedoStack")(getRedoStack.toJsFn)
    __obj.updateDynamic("getSelection")(getSelection.toJsFn)
    __obj.updateDynamic("getUndoStack")(getUndoStack.toJsFn)
    __obj.updateDynamic("isInCompositionMode")(isInCompositionMode.toJsFn)
    __obj.updateDynamic("isSelectionAtEndOfContent")(isSelectionAtEndOfContent.toJsFn)
    __obj.updateDynamic("isSelectionAtStartOfContent")(isSelectionAtStartOfContent.toJsFn)
    __obj.updateDynamic("mustForceSelection")(mustForceSelection.toJsFn)
    __obj.updateDynamic("toJS")(toJS.toJsFn)
    __obj.asInstanceOf[EditorState]
  }
}

