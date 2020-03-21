package typingsJapgolly.titanium.Titanium.Android

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android `PendingIntent`.
		 */
trait PendingIntent extends Proxy {
  /**
  			 * Flags used for creating the Pending Intent.
  			 */
  var flags: Double
  /**
  			 * The intent data to pass to the [Activity](Titanium.Android.Activity) launched by this `PendingIntent`.
  			 */
  var intent: Intent
  /**
  			 * If this property is true, flag <Titanium.Android.FLAG_UPDATE_CURRENT> will be
  			 * appended to `flags` automatically. Default value is true.
  			 */
  var updateCurrentIntent: Boolean
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 */
  def getFlags(): Double
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 */
  def getIntent(): Intent
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 */
  def getUpdateCurrentIntent(): Boolean
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 */
  def setFlags(flags: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 */
  def setIntent(intent: Intent): Unit
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 */
  def setUpdateCurrentIntent(updateCurrentIntent: Boolean): Unit
}

object PendingIntent {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    flags: Double,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getFlags: CallbackTo[Double],
    getIntent: CallbackTo[Intent],
    getUpdateCurrentIntent: CallbackTo[Boolean],
    intent: Intent,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setFlags: Double => Callback,
    setIntent: Intent => Callback,
    setUpdateCurrentIntent: Boolean => Callback,
    updateCurrentIntent: Boolean,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PendingIntent = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], updateCurrentIntent = updateCurrentIntent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getFlags")(getFlags.toJsFn)
    __obj.updateDynamic("getIntent")(getIntent.toJsFn)
    __obj.updateDynamic("getUpdateCurrentIntent")(getUpdateCurrentIntent.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setFlags")(js.Any.fromFunction1((t0: scala.Double) => setFlags(t0).runNow()))
    __obj.updateDynamic("setIntent")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Android.Intent) => setIntent(t0).runNow()))
    __obj.updateDynamic("setUpdateCurrentIntent")(js.Any.fromFunction1((t0: scala.Boolean) => setUpdateCurrentIntent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingIntent]
  }
}

