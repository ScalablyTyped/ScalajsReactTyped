package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Point
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.View
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Continuous or instantaneous force to apply to an item.
			 */
trait PushBehavior extends Proxy {
  /**
  				 * State of the push behavior's force.
  				 */
  var active: Boolean
  /**
  				 * Specifies the angle of the force vector in radians.
  				 */
  var angle: Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Specifies the magnitude of the force vector.
  				 */
  var magnitude: Double
  /**
  				 * Specifies the direction of the force vector as an x, y pair.
  				 */
  var pushDirection: Point
  /**
  				 * Specifies the push mode.
  				 */
  var pushMode: Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def getActive(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def getAngle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def getMagnitude(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def getPushDirection(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def getPushMode(): Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def setActive(active: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def setAngle(angle: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def setPushDirection(pushDirection: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def setPushMode(pushMode: Double): Unit
}

object PushBehavior {
  @scala.inline
  def apply(
    active: Boolean,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addItem: js.Any => Callback,
    angle: Double,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getActive: CallbackTo[Boolean],
    getAngle: CallbackTo[Double],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getItems: CallbackTo[js.Array[View]],
    getMagnitude: CallbackTo[Double],
    getPushDirection: CallbackTo[Point],
    getPushMode: CallbackTo[Double],
    items: js.Array[View],
    magnitude: Double,
    pushDirection: Point,
    pushMode: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    removeItem: js.Any => Callback,
    setActive: Boolean => Callback,
    setAngle: Double => Callback,
    setBubbleParent: Boolean => Callback,
    setMagnitude: Double => Callback,
    setPushDirection: Point => Callback,
    setPushMode: Double => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PushBehavior = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], pushDirection = pushDirection.asInstanceOf[js.Any], pushMode = pushMode.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addItem")(js.Any.fromFunction1((t0: js.Any) => addItem(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getActive")(getActive.toJsFn)
    __obj.updateDynamic("getAngle")(getAngle.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getItems")(getItems.toJsFn)
    __obj.updateDynamic("getMagnitude")(getMagnitude.toJsFn)
    __obj.updateDynamic("getPushDirection")(getPushDirection.toJsFn)
    __obj.updateDynamic("getPushMode")(getPushMode.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: js.Any) => removeItem(t0).runNow()))
    __obj.updateDynamic("setActive")(js.Any.fromFunction1((t0: scala.Boolean) => setActive(t0).runNow()))
    __obj.updateDynamic("setAngle")(js.Any.fromFunction1((t0: scala.Double) => setAngle(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setMagnitude")(js.Any.fromFunction1((t0: scala.Double) => setMagnitude(t0).runNow()))
    __obj.updateDynamic("setPushDirection")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Point) => setPushDirection(t0).runNow()))
    __obj.updateDynamic("setPushMode")(js.Any.fromFunction1((t0: scala.Double) => setPushMode(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushBehavior]
  }
}

