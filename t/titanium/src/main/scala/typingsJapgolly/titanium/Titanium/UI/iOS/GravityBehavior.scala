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
			 * Gravitational force to apply to an item.
			 */
trait GravityBehavior extends Proxy {
  /**
  				 * Specifies the angle of the gravity vector in radians.
  				 */
  var angle: Double
  /**
  				 * Specifies the direction of the gravity vector as an x, y pair.
  				 */
  var gravityDirection: Point
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Specifies the magnitude of the gravity vector.
  				 */
  var magnitude: Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def getAngle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def getGravityDirection(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def getMagnitude(): Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def setAngle(angle: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def setGravityDirection(gravityDirection: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: Double): Unit
}

object GravityBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addItem: js.Any => Callback,
    angle: Double,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getAngle: CallbackTo[Double],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getGravityDirection: CallbackTo[Point],
    getItems: CallbackTo[js.Array[View]],
    getMagnitude: CallbackTo[Double],
    gravityDirection: Point,
    items: js.Array[View],
    magnitude: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    removeItem: js.Any => Callback,
    setAngle: Double => Callback,
    setBubbleParent: Boolean => Callback,
    setGravityDirection: Point => Callback,
    setMagnitude: Double => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): GravityBehavior = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], gravityDirection = gravityDirection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addItem")(js.Any.fromFunction1((t0: js.Any) => addItem(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAngle")(getAngle.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getGravityDirection")(getGravityDirection.toJsFn)
    __obj.updateDynamic("getItems")(getItems.toJsFn)
    __obj.updateDynamic("getMagnitude")(getMagnitude.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: js.Any) => removeItem(t0).runNow()))
    __obj.updateDynamic("setAngle")(js.Any.fromFunction1((t0: scala.Double) => setAngle(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setGravityDirection")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Point) => setGravityDirection(t0).runNow()))
    __obj.updateDynamic("setMagnitude")(js.Any.fromFunction1((t0: scala.Double) => setMagnitude(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityBehavior]
  }
}

