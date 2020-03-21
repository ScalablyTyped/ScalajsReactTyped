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
			 * A set of notification actions to associate with a notification.
			 */
trait UserNotificationCategory extends Proxy {
  /**
  				 * Array of notification actions to associate with the group.
  				 */
  var actionsForDefaultContext: js.Array[UserNotificationAction]
  /**
  				 * Array of notification actions to display for non-dialog-style notification.
  				 */
  var actionsForMinimalContext: js.Array[UserNotificationAction]
  /**
  				 * A format string for the summary description used when the system groups the category's notifications.
  				 */
  var categorySummaryFormat: String
  /**
  				 * The placeholder text to display when notification previews are disabled for the app.
  				 */
  var hiddenPreviewsBodyPlaceholder: String
  /**
  				 * Identifier for this category.
  				 */
  var identifier: String
  /**
  				 * The intents related to notifications of this category.
  				 */
  var intentIdentifiers: js.Array[String]
  /**
  				 * Options for how to handle notifications of this type.
  				 */
  var options: js.Array[Double]
}

object UserNotificationCategory {
  @scala.inline
  def apply(
    actionsForDefaultContext: js.Array[UserNotificationAction],
    actionsForMinimalContext: js.Array[UserNotificationAction],
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    categorySummaryFormat: String,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    hiddenPreviewsBodyPlaceholder: String,
    identifier: String,
    intentIdentifiers: js.Array[String],
    options: js.Array[Double],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): UserNotificationCategory = {
    val __obj = js.Dynamic.literal(actionsForDefaultContext = actionsForDefaultContext.asInstanceOf[js.Any], actionsForMinimalContext = actionsForMinimalContext.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], categorySummaryFormat = categorySummaryFormat.asInstanceOf[js.Any], hiddenPreviewsBodyPlaceholder = hiddenPreviewsBodyPlaceholder.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], intentIdentifiers = intentIdentifiers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationCategory]
  }
}

