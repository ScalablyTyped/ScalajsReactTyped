package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadioGroup extends ICheckboxGroup {
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  @JSName("checkChange")
  var checkChange_IRadioGroup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of the radio group
  		* @param value Object The map from names to values to be set.
  		* @returns Ext.form.CheckboxGroup this
  		*/
  @JSName("setValue")
  var setValue_IRadioGroup: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], ICheckboxGroup]] = js.undefined
}

object IRadioGroup {
  @scala.inline
  def apply(
    ICheckboxGroup: ICheckboxGroup = null,
    checkChange: js.UndefOr[Callback] = js.undefined,
    setValue: /* value */ js.UndefOr[js.Any] => CallbackTo[ICheckboxGroup] = null
  ): IRadioGroup = {
    val __obj = js.Dynamic.literal()
    if (ICheckboxGroup != null) js.Dynamic.global.Object.assign(__obj, ICheckboxGroup)
    checkChange.foreach(p => __obj.updateDynamic("checkChange")(p.toJsFn))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    __obj.asInstanceOf[IRadioGroup]
  }
}

