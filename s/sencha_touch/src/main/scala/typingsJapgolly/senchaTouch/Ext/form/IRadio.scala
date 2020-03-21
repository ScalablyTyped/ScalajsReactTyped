package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadio
  extends typingsJapgolly.senchaTouch.Ext.field.ICheckbox {
  /** [Method] Returns the selected value if this radio is part of a group other radio fields with the same name in the same FormP
  		* @returns String
  		*/
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Set the matched radio field s status that has the same value as the given string to checked
  		* @param value String The value of the radio field to check.
  		* @returns Ext.field.Radio The field that is checked.
  		*/
  var setGroupValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Object
  		* @returns Ext.field.Radio this
  		*/
  @JSName("setValue")
  var setValue_IRadio: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
}

object IRadio {
  @scala.inline
  def apply(
    ICheckbox: typingsJapgolly.senchaTouch.Ext.field.ICheckbox = null,
    getGroupValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    setGroupValue: /* value */ js.UndefOr[String] => CallbackTo[IRadio] = null,
    setValue: /* value */ js.UndefOr[js.Any] => CallbackTo[IRadio] = null
  ): IRadio = {
    val __obj = js.Dynamic.literal()
    if (ICheckbox != null) js.Dynamic.global.Object.assign(__obj, ICheckbox)
    getGroupValue.foreach(p => __obj.updateDynamic("getGroupValue")(p.toJsFn))
    if (setGroupValue != null) __obj.updateDynamic("setGroupValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => setGroupValue(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    __obj.asInstanceOf[IRadio]
  }
}

