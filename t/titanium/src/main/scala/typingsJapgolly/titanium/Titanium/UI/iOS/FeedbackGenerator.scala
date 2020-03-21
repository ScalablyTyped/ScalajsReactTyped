package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The feedback generator API is introduced in iOS 10 to handle the haptic feedback when using an iPhone 7 or
			 * later devices.
			 */
trait FeedbackGenerator extends Proxy {
  /**
  				 * The style of the feedback generator you want to create. This property is only required when using <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
  				 */
  var style: js.UndefOr[Double] = js.undefined
  /**
  				 * The type of feedback generator you want to create.
  				 */
  var `type`: Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 */
  def getStyle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def getType(): Double
  /**
  				 * Used to trigger a haptic feedback after an impact occurred.
  				 */
  def impactOccurred(): Unit
  /**
  				 * Used to trigger a haptic feedback after a notification has been received.
  				 */
  def notificationOccurred(notificationType: Double): Unit
  /**
  				 * Used to prepare the haptic sensor for the upcoming interaction with it.
  				 */
  def prepare(): Unit
  /**
  				 * Used to trigger a haptic feedback after a selection has been made.
  				 */
  def selectionChanged(): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 */
  def setStyle(style: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def setType(`type`: Double): Unit
}

object FeedbackGenerator {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getStyle: CallbackTo[Double],
    getType: CallbackTo[Double],
    impactOccurred: Callback,
    notificationOccurred: Double => Callback,
    prepare: Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    selectionChanged: Callback,
    setBubbleParent: Boolean => Callback,
    setStyle: Double => Callback,
    setType: Double => Callback,
    `type`: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null,
    style: Int | Double = null
  ): FeedbackGenerator = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getStyle")(getStyle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("impactOccurred")(impactOccurred.toJsFn)
    __obj.updateDynamic("notificationOccurred")(js.Any.fromFunction1((t0: scala.Double) => notificationOccurred(t0).runNow()))
    __obj.updateDynamic("prepare")(prepare.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("selectionChanged")(selectionChanged.toJsFn)
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setStyle")(js.Any.fromFunction1((t0: scala.Double) => setStyle(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: scala.Double) => setType(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackGenerator]
  }
}

