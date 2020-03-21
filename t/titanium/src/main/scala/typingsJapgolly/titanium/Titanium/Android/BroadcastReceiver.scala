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
		 * Monitor and handle Android system broadcasts.
		 */
trait BroadcastReceiver extends Proxy {
  /**
  			 * URL of the JavaScript file to handle the broadcast.
  			 */
  var url: String
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def getOnReceived(): js.Function1[/* param0 */ js.Any, _]
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def getUrl(): String
  /**
  			 * The function called when a broadcast is received.
  			 */
  def onReceived(param0: js.Any): js.Any
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def setOnReceived(onReceived: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def setUrl(url: String): Unit
}

object BroadcastReceiver {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getOnReceived: CallbackTo[js.Function1[/* param0 */ js.Any, js.Any]],
    getUrl: CallbackTo[String],
    onReceived: js.Any => CallbackTo[js.Any],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setOnReceived: js.Function1[/* param0 */ js.Any, js.Any] => Callback,
    setUrl: String => Callback,
    url: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BroadcastReceiver = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getOnReceived")(getOnReceived.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("onReceived")(js.Any.fromFunction1((t0: js.Any) => onReceived(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setOnReceived")(js.Any.fromFunction1((t0: js.Function1[/* param0 */ js.Any, js.Any]) => setOnReceived(t0).runNow()))
    __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: java.lang.String) => setUrl(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastReceiver]
  }
}

