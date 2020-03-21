package typingsJapgolly.titanium.Titanium.App.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An action the user selects in response to an interactive notification.
			 */
trait UserNotificationAction extends Proxy {
  /**
  				 * Selects how to activate the application.
  				 */
  var activationMode: Double
  /**
  				 * Set to true if the action requires the device to be unlocked. On the Apple Watch actions never require authentication.
  				 */
  var authenticationRequired: Boolean
  /**
  				 * Custom behavior the user notification supports.
  				 */
  var behavior: Double
  /**
  				 * Set to true if the action causes destructive behavior to the user's data or the application.
  				 */
  var destructive: Boolean
  /**
  				 * Identifier for this action. Used to identify the action the user pressed.
  				 */
  var identifier: String
  /**
  				 * Title of the button displayed in the notification.
  				 */
  var title: String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
  				 */
  def getActivationMode(): Double
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
  				 */
  def getBehavior(): Double
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
  				 */
  def setActivationMode(activationMode: Double): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
  				 */
  def setBehavior(behavior: Double): Unit
}

object UserNotificationAction {
  @scala.inline
  def apply(
    activationMode: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    authenticationRequired: Boolean,
    behavior: Double,
    bubbleParent: Boolean,
    destructive: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getActivationMode: CallbackTo[Double],
    getApiName: CallbackTo[String],
    getBehavior: CallbackTo[Double],
    getBubbleParent: CallbackTo[Boolean],
    identifier: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setActivationMode: Double => Callback,
    setBehavior: Double => Callback,
    setBubbleParent: Boolean => Callback,
    title: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): UserNotificationAction = {
    val __obj = js.Dynamic.literal(activationMode = activationMode.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], authenticationRequired = authenticationRequired.asInstanceOf[js.Any], behavior = behavior.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], destructive = destructive.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getActivationMode")(getActivationMode.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBehavior")(getBehavior.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setActivationMode")(js.Any.fromFunction1((t0: scala.Double) => setActivationMode(t0).runNow()))
    __obj.updateDynamic("setBehavior")(js.Any.fromFunction1((t0: scala.Double) => setBehavior(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationAction]
  }
}

