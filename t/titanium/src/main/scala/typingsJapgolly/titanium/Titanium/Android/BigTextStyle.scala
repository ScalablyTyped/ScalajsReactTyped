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
		 * Helper object for generating large-format notifications that include a lot of text.
		 */
trait BigTextStyle extends Proxy {
  /**
  			 * Overrides <Titanium.Android.Notification.contentTitle> in the big form of the notification. This defaults to the value passed to <Titanium.Android.Notification.contentTitle>.
  			 */
  var bigContentTitle: String
  /**
  			 * Sets the longer text to be displayed in the big form of the notification in place of the content text.
  			 */
  var bigText: String
  /**
  			 * Set the first line of text after the detail section in the big form of the notification.
  			 */
  var summaryText: String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def getBigContentTitle(): String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def getBigText(): String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def getSummaryText(): String
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def setBigContentTitle(bigContentTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def setBigText(bigText: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def setSummaryText(summaryText: String): Unit
}

object BigTextStyle {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bigContentTitle: String,
    bigText: String,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBigContentTitle: CallbackTo[String],
    getBigText: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getSummaryText: CallbackTo[String],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBigContentTitle: String => Callback,
    setBigText: String => Callback,
    setBubbleParent: Boolean => Callback,
    setSummaryText: String => Callback,
    summaryText: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BigTextStyle = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bigContentTitle = bigContentTitle.asInstanceOf[js.Any], bigText = bigText.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], summaryText = summaryText.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBigContentTitle")(getBigContentTitle.toJsFn)
    __obj.updateDynamic("getBigText")(getBigText.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getSummaryText")(getSummaryText.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBigContentTitle")(js.Any.fromFunction1((t0: java.lang.String) => setBigContentTitle(t0).runNow()))
    __obj.updateDynamic("setBigText")(js.Any.fromFunction1((t0: java.lang.String) => setBigText(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setSummaryText")(js.Any.fromFunction1((t0: java.lang.String) => setSummaryText(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigTextStyle]
  }
}

