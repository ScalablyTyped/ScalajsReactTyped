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
			 * Dynamic behavior defining an item's movement to a specific point.
			 */
trait SnapBehavior extends Proxy {
  /**
  				 * Specifies the amount of oscillation during the conclusion of the snap.
  				 */
  var damping: Double
  /**
  				 * Item to add to this behavior.
  				 */
  var item: View
  /**
  				 * Specifies the point to snap to.
  				 */
  var snapPoint: Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def getDamping(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def getItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def getSnapPoint(): Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def setDamping(damping: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def setItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def setSnapPoint(snapPoint: Point): Unit
}

object SnapBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    damping: Double,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDamping: CallbackTo[Double],
    getItem: CallbackTo[View],
    getSnapPoint: CallbackTo[Point],
    item: View,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setDamping: Double => Callback,
    setItem: js.Any => Callback,
    setSnapPoint: Point => Callback,
    snapPoint: Point,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SnapBehavior = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], snapPoint = snapPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDamping")(getDamping.toJsFn)
    __obj.updateDynamic("getItem")(getItem.toJsFn)
    __obj.updateDynamic("getSnapPoint")(getSnapPoint.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDamping")(js.Any.fromFunction1((t0: scala.Double) => setDamping(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction1((t0: js.Any) => setItem(t0).runNow()))
    __obj.updateDynamic("setSnapPoint")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Point) => setSnapPoint(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapBehavior]
  }
}

