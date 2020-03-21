package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinner
  extends typingsJapgolly.extjs.Ext.form.field.ITrigger {
  /** [Config Option] (Boolean) */
  var keyNavEnabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var mouseWheelEnabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method is called when the spinner down button is clicked or when the down arrow key is pressed if keyNavEnabled  */
  var onSpinDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This method is called when the spinner up button is clicked or when the up arrow key is pressed if keyNavEnabled is */
  var onSpinUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets whether the spinner down button is enabled
  		* @param enabled Boolean true to enable the button, false to disable it.
  		*/
  var setSpinDownEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets whether the spinner up button is enabled
  		* @param enabled Boolean true to enable the button, false to disable it.
  		*/
  var setSpinUpEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Triggers the spinner to step down fires the spin and spindown events and calls the onSpinDown method  */
  var spinDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Ext.Element) */
  var spinDownEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var spinDownEnabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Triggers the spinner to step up fires the spin and spinup events and calls the onSpinUp method  */
  var spinUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Ext.Element) */
  var spinUpEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var spinUpEnabled: js.UndefOr[Boolean] = js.undefined
}

object ISpinner {
  @scala.inline
  def apply(
    ITrigger: typingsJapgolly.extjs.Ext.form.field.ITrigger = null,
    keyNavEnabled: js.UndefOr[Boolean] = js.undefined,
    mouseWheelEnabled: js.UndefOr[Boolean] = js.undefined,
    onSpinDown: js.UndefOr[Callback] = js.undefined,
    onSpinUp: js.UndefOr[Callback] = js.undefined,
    setSpinDownEnabled: /* enabled */ js.UndefOr[Boolean] => Callback = null,
    setSpinUpEnabled: /* enabled */ js.UndefOr[Boolean] => Callback = null,
    spinDown: js.UndefOr[Callback] = js.undefined,
    spinDownEl: IElement = null,
    spinDownEnabled: js.UndefOr[Boolean] = js.undefined,
    spinUp: js.UndefOr[Callback] = js.undefined,
    spinUpEl: IElement = null,
    spinUpEnabled: js.UndefOr[Boolean] = js.undefined
  ): ISpinner = {
    val __obj = js.Dynamic.literal()
    if (ITrigger != null) js.Dynamic.global.Object.assign(__obj, ITrigger)
    if (!js.isUndefined(keyNavEnabled)) __obj.updateDynamic("keyNavEnabled")(keyNavEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelEnabled)) __obj.updateDynamic("mouseWheelEnabled")(mouseWheelEnabled.asInstanceOf[js.Any])
    onSpinDown.foreach(p => __obj.updateDynamic("onSpinDown")(p.toJsFn))
    onSpinUp.foreach(p => __obj.updateDynamic("onSpinUp")(p.toJsFn))
    if (setSpinDownEnabled != null) __obj.updateDynamic("setSpinDownEnabled")(js.Any.fromFunction1((t0: /* enabled */ js.UndefOr[scala.Boolean]) => setSpinDownEnabled(t0).runNow()))
    if (setSpinUpEnabled != null) __obj.updateDynamic("setSpinUpEnabled")(js.Any.fromFunction1((t0: /* enabled */ js.UndefOr[scala.Boolean]) => setSpinUpEnabled(t0).runNow()))
    spinDown.foreach(p => __obj.updateDynamic("spinDown")(p.toJsFn))
    if (spinDownEl != null) __obj.updateDynamic("spinDownEl")(spinDownEl.asInstanceOf[js.Any])
    if (!js.isUndefined(spinDownEnabled)) __obj.updateDynamic("spinDownEnabled")(spinDownEnabled.asInstanceOf[js.Any])
    spinUp.foreach(p => __obj.updateDynamic("spinUp")(p.toJsFn))
    if (spinUpEl != null) __obj.updateDynamic("spinUpEl")(spinUpEl.asInstanceOf[js.Any])
    if (!js.isUndefined(spinUpEnabled)) __obj.updateDynamic("spinUpEnabled")(spinUpEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinner]
  }
}

