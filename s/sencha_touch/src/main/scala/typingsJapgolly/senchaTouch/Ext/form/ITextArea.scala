package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea
  extends typingsJapgolly.senchaTouch.Ext.field.IText {
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: typingsJapgolly.senchaTouch.Ext.field.IText = null,
    getMaxRows: js.UndefOr[CallbackTo[Double]] = js.undefined,
    maxRows: Int | Double = null,
    setMaxRows: /* maxRows */ js.UndefOr[Double] => Callback = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    getMaxRows.foreach(p => __obj.updateDynamic("getMaxRows")(p.toJsFn))
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (setMaxRows != null) __obj.updateDynamic("setMaxRows")(js.Any.fromFunction1((t0: /* maxRows */ js.UndefOr[scala.Double]) => setMaxRows(t0).runNow()))
    __obj.asInstanceOf[ITextArea]
  }
}

