package typingsJapgolly.titanium.Titanium.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A toast notification.
		 */
trait Notification extends Proxy {
  /**
  			 * Determines how long the notification stays on screen.
  			 */
  var duration: Double
  /**
  			 * Determines the location at which the notification should appear on the screen.
  			 */
  var gravity: Double
  /**
  			 * Horizontal placement of the notification, *as a fraction of the screen width*.
  			 */
  var horizontalMargin: Double
  /**
  			 * Notification text to display.
  			 */
  var message: String
  /**
  			 * Vertical placement of the notifcation, *as a fraction of the screen height*.
  			 */
  var verticalMargin: Double
  /**
  			 * X offset from the default position, in pixels.
  			 */
  var xOffset: Double
  /**
  			 * Y offset from the default position, in pixels.
  			 */
  var yOffset: Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.duration> property.
  			 */
  def getDuration(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.gravity> property.
  			 */
  def getGravity(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.horizontalMargin> property.
  			 */
  def getHorizontalMargin(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.message> property.
  			 */
  def getMessage(): String
  /**
  			 * Gets the value of the <Titanium.UI.Notification.verticalMargin> property.
  			 */
  def getVerticalMargin(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.xOffset> property.
  			 */
  def getXOffset(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.yOffset> property.
  			 */
  def getYOffset(): Double
  /**
  			 * Sets the value of the <Titanium.UI.Notification.duration> property.
  			 */
  def setDuration(duration: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.gravity> property.
  			 */
  def setGravity(gravity: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.horizontalMargin> property.
  			 */
  def setHorizontalMargin(horizontalMargin: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.message> property.
  			 */
  def setMessage(message: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.verticalMargin> property.
  			 */
  def setVerticalMargin(verticalMargin: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.xOffset> property.
  			 */
  def setXOffset(xOffset: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.yOffset> property.
  			 */
  def setYOffset(yOffset: Double): Unit
  /**
  			 * Show the notification.
  			 */
  def show(): Unit
}

object Notification {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    duration: Double,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDuration: CallbackTo[Double],
    getGravity: CallbackTo[Double],
    getHorizontalMargin: CallbackTo[Double],
    getMessage: CallbackTo[String],
    getVerticalMargin: CallbackTo[Double],
    getXOffset: CallbackTo[Double],
    getYOffset: CallbackTo[Double],
    gravity: Double,
    horizontalMargin: Double,
    message: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setDuration: Double => Callback,
    setGravity: Double => Callback,
    setHorizontalMargin: Double => Callback,
    setMessage: String => Callback,
    setVerticalMargin: Double => Callback,
    setXOffset: Double => Callback,
    setYOffset: Double => Callback,
    show: Callback,
    verticalMargin: Double,
    xOffset: Double,
    yOffset: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Notification = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], horizontalMargin = horizontalMargin.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], verticalMargin = verticalMargin.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDuration")(getDuration.toJsFn)
    __obj.updateDynamic("getGravity")(getGravity.toJsFn)
    __obj.updateDynamic("getHorizontalMargin")(getHorizontalMargin.toJsFn)
    __obj.updateDynamic("getMessage")(getMessage.toJsFn)
    __obj.updateDynamic("getVerticalMargin")(getVerticalMargin.toJsFn)
    __obj.updateDynamic("getXOffset")(getXOffset.toJsFn)
    __obj.updateDynamic("getYOffset")(getYOffset.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDuration")(js.Any.fromFunction1((t0: scala.Double) => setDuration(t0).runNow()))
    __obj.updateDynamic("setGravity")(js.Any.fromFunction1((t0: scala.Double) => setGravity(t0).runNow()))
    __obj.updateDynamic("setHorizontalMargin")(js.Any.fromFunction1((t0: scala.Double) => setHorizontalMargin(t0).runNow()))
    __obj.updateDynamic("setMessage")(js.Any.fromFunction1((t0: java.lang.String) => setMessage(t0).runNow()))
    __obj.updateDynamic("setVerticalMargin")(js.Any.fromFunction1((t0: scala.Double) => setVerticalMargin(t0).runNow()))
    __obj.updateDynamic("setXOffset")(js.Any.fromFunction1((t0: scala.Double) => setXOffset(t0).runNow()))
    __obj.updateDynamic("setYOffset")(js.Any.fromFunction1((t0: scala.Double) => setYOffset(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

