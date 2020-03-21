package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea extends IText {
  /** [Config Option] (Number) */
  var cols: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enterIsSpecial: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  @JSName("getValue")
  var getValue_ITextArea: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var preventScrollbars: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var rows: js.UndefOr[Double] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object
  		* @returns Object The modified initial value
  		*/
  @JSName("transformOriginalValue")
  var transformOriginalValue_ITextArea: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: IText = null,
    cols: Int | Double = null,
    enterIsSpecial: js.UndefOr[Boolean] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    preventScrollbars: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    transformOriginalValue: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (!js.isUndefined(enterIsSpecial)) __obj.updateDynamic("enterIsSpecial")(enterIsSpecial.asInstanceOf[js.Any])
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (!js.isUndefined(preventScrollbars)) __obj.updateDynamic("preventScrollbars")(preventScrollbars.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => transformOriginalValue(t0).runNow()))
    __obj.asInstanceOf[ITextArea]
  }
}

