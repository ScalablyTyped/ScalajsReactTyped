package typingsJapgolly.extjs.Ext.picker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonth extends IComponent {
  /** [Method] Modify the year display by passing an offset
  		* @param offset Number The offset to move by.
  		*/
  var adjustYear: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (String) */
  var cancelText: js.UndefOr[String] = js.undefined
  /** [Method] Gets the selected value
  		* @returns Number[] The selected value
  		*/
  var getValue: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Checks whether the picker has a selection
  		* @returns Boolean Returns true if both a month and year have been selected
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (String) */
  var okText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[String] = js.undefined
  /** [Method] Set the value for the picker
  		* @param value Date/Number[] The value to set. It can be a Date object, where the month/year will be extracted, or it can be an array, with the month as the first index and the year as the second.
  		* @returns Ext.picker.Month this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Date/Number[]) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IMonth {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    adjustYear: /* offset */ js.UndefOr[Double] => Callback = null,
    cancelText: String = null,
    getValue: js.UndefOr[CallbackTo[Array]] = js.undefined,
    hasSelection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    okText: String = null,
    selectedCls: String = null,
    setValue: /* value */ js.UndefOr[js.Any] => CallbackTo[IMonth] = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IMonth = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (adjustYear != null) __obj.updateDynamic("adjustYear")(js.Any.fromFunction1((t0: /* offset */ js.UndefOr[scala.Double]) => adjustYear(t0).runNow()))
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    hasSelection.foreach(p => __obj.updateDynamic("hasSelection")(p.toJsFn))
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonth]
  }
}

