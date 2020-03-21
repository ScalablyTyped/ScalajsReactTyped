package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinner
  extends typingsJapgolly.senchaTouch.Ext.field.INumber {
  /** [Config Option] (Boolean) */
  var accelerateOnTapHold: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var cycle: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var defaultValue: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of accelerateOnTapHold
  		* @returns Boolean
  		*/
  var getAccelerateOnTapHold: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ISpinner: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of cycle
  		* @returns Boolean
  		*/
  var getCycle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of defaultValue
  		* @returns Number
  		*/
  var getDefaultValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of groupButtons
  		* @returns Boolean
  		*/
  var getGroupButtons: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var groupButtons: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var increment: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var incrementValue: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of accelerateOnTapHold
  		* @param accelerateOnTapHold Boolean The new value.
  		*/
  var setAccelerateOnTapHold: js.UndefOr[js.Function1[/* accelerateOnTapHold */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ISpinner: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of cycle
  		* @param cycle Boolean The new value.
  		*/
  var setCycle: js.UndefOr[js.Function1[/* cycle */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of defaultValue
  		* @param defaultValue Number The new value.
  		*/
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of groupButtons
  		* @param groupButtons Boolean The new value.
  		*/
  var setGroupButtons: js.UndefOr[js.Function1[/* groupButtons */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Updates the component configuration
  		* @param newComponent Object
  		*/
  var updateComponent: js.UndefOr[js.Function1[/* newComponent */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ISpinner {
  @scala.inline
  def apply(
    INumber: typingsJapgolly.senchaTouch.Ext.field.INumber = null,
    accelerateOnTapHold: js.UndefOr[Boolean] = js.undefined,
    cycle: js.UndefOr[Boolean] = js.undefined,
    defaultValue: Int | Double = null,
    getAccelerateOnTapHold: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getCycle: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDefaultValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getGroupButtons: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    groupButtons: js.UndefOr[Boolean] = js.undefined,
    increment: String = null,
    incrementValue: String = null,
    setAccelerateOnTapHold: /* accelerateOnTapHold */ js.UndefOr[Boolean] => Callback = null,
    setCls: /* cls */ js.UndefOr[String] => Callback = null,
    setCycle: /* cycle */ js.UndefOr[Boolean] => Callback = null,
    setDefaultValue: /* defaultValue */ js.UndefOr[Double] => Callback = null,
    setGroupButtons: /* groupButtons */ js.UndefOr[Boolean] => Callback = null,
    updateComponent: /* newComponent */ js.UndefOr[js.Any] => Callback = null
  ): ISpinner = {
    val __obj = js.Dynamic.literal()
    if (INumber != null) js.Dynamic.global.Object.assign(__obj, INumber)
    if (!js.isUndefined(accelerateOnTapHold)) __obj.updateDynamic("accelerateOnTapHold")(accelerateOnTapHold.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    getAccelerateOnTapHold.foreach(p => __obj.updateDynamic("getAccelerateOnTapHold")(p.toJsFn))
    getCls.foreach(p => __obj.updateDynamic("getCls")(p.toJsFn))
    getCycle.foreach(p => __obj.updateDynamic("getCycle")(p.toJsFn))
    getDefaultValue.foreach(p => __obj.updateDynamic("getDefaultValue")(p.toJsFn))
    getGroupButtons.foreach(p => __obj.updateDynamic("getGroupButtons")(p.toJsFn))
    if (!js.isUndefined(groupButtons)) __obj.updateDynamic("groupButtons")(groupButtons.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (incrementValue != null) __obj.updateDynamic("incrementValue")(incrementValue.asInstanceOf[js.Any])
    if (setAccelerateOnTapHold != null) __obj.updateDynamic("setAccelerateOnTapHold")(js.Any.fromFunction1((t0: /* accelerateOnTapHold */ js.UndefOr[scala.Boolean]) => setAccelerateOnTapHold(t0).runNow()))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setCls(t0).runNow()))
    if (setCycle != null) __obj.updateDynamic("setCycle")(js.Any.fromFunction1((t0: /* cycle */ js.UndefOr[scala.Boolean]) => setCycle(t0).runNow()))
    if (setDefaultValue != null) __obj.updateDynamic("setDefaultValue")(js.Any.fromFunction1((t0: /* defaultValue */ js.UndefOr[scala.Double]) => setDefaultValue(t0).runNow()))
    if (setGroupButtons != null) __obj.updateDynamic("setGroupButtons")(js.Any.fromFunction1((t0: /* groupButtons */ js.UndefOr[scala.Boolean]) => setGroupButtons(t0).runNow()))
    if (updateComponent != null) __obj.updateDynamic("updateComponent")(js.Any.fromFunction1((t0: /* newComponent */ js.UndefOr[js.Any]) => updateComponent(t0).runNow()))
    __obj.asInstanceOf[ISpinner]
  }
}

