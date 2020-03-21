package typingsJapgolly.agGrid.iCellEditorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditor extends js.Object {
  /** If doing full line edit, then gets called when focus should be put into the editor */
  var focusIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** If doing full line edit, then gets called when focus is leaving the editor */
  var focusOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Gets called once after editing is complete. If your return true, then the new value will not be used. The
    *  editing will have no impact on the record. Use this if you do not want a new value from your gui, i.e. you
    *  want to cancel the editing. */
  var isCancelAfterEnd: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** Gets called once after initialised. If you return true, the editor will not be used and the grid will continue
    *  editing. Use this to make a decision on editing inside the init() function, eg maybe you want to only start
    *  editing if the user hits a numeric key, but not a letter, if the editor is for numbers.
    * */
  var isCancelBeforeStart: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** Gets called once after initialised. If you return true, the editor will appear in a popup, so is not constrained
    *  to the boundaries of the cell. This is great if you want to, for example, provide you own custom dropdown list
    *  for selection. Default is false (ie if you don't provide the method). */
  var isPopup: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** Return the final value - called by the grid once after editing is complete */
  def getValue(): js.Any
}

object ICellEditor {
  @scala.inline
  def apply(
    getValue: CallbackTo[js.Any],
    focusIn: js.UndefOr[Callback] = js.undefined,
    focusOut: js.UndefOr[Callback] = js.undefined,
    isCancelAfterEnd: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isCancelBeforeStart: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isPopup: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): ICellEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    focusIn.foreach(p => __obj.updateDynamic("focusIn")(p.toJsFn))
    focusOut.foreach(p => __obj.updateDynamic("focusOut")(p.toJsFn))
    isCancelAfterEnd.foreach(p => __obj.updateDynamic("isCancelAfterEnd")(p.toJsFn))
    isCancelBeforeStart.foreach(p => __obj.updateDynamic("isCancelBeforeStart")(p.toJsFn))
    isPopup.foreach(p => __obj.updateDynamic("isPopup")(p.toJsFn))
    __obj.asInstanceOf[ICellEditor]
  }
}

