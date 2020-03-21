package typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection owner.
  */
trait ISelectionOwner extends js.Object {
  /**
    * The uuid of this selection owner.
    */
  var uuid: String
  /**
    * Returns the primary position of the cursor, never `null`.
    */
  def getCursorPosition(): IPosition
  /**
    * Returns the primary selection, never `null`.
    */
  def getSelection(): IRange
  /**
    * Gets the selections for all the cursors, never `null` or empty.
    */
  def getSelections(): js.Array[IRange]
  /**
    * Set the primary position of the cursor.
    *
    * @param position - The new primary position.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setCursorPosition(position: IPosition): Unit
  /**
    * Set the primary selection.
    *
    * @param selection - The desired selection range.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setSelection(selection: IRange): Unit
  /**
    * Sets the selections for all the cursors.
    *
    * @param selections - The new selections.
    *
    * #### Notes
    * Cursors will be removed or added, as necessary.
    * Passing an empty array resets a cursor position to the start of a
    * document.
    */
  def setSelections(selections: js.Array[IRange]): Unit
}

object ISelectionOwner {
  @scala.inline
  def apply(
    getCursorPosition: CallbackTo[IPosition],
    getSelection: CallbackTo[IRange],
    getSelections: CallbackTo[js.Array[IRange]],
    setCursorPosition: IPosition => Callback,
    setSelection: IRange => Callback,
    setSelections: js.Array[IRange] => Callback,
    uuid: String
  ): ISelectionOwner = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("getCursorPosition")(getCursorPosition.toJsFn)
    __obj.updateDynamic("getSelection")(getSelection.toJsFn)
    __obj.updateDynamic("getSelections")(getSelections.toJsFn)
    __obj.updateDynamic("setCursorPosition")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IPosition) => setCursorPosition(t0).runNow()))
    __obj.updateDynamic("setSelection")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IRange) => setSelection(t0).runNow()))
    __obj.updateDynamic("setSelections")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IRange]) => setSelections(t0).runNow()))
    __obj.asInstanceOf[ISelectionOwner]
  }
}

