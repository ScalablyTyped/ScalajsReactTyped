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
			 * Dynamic behavior to support connections between an anchor point and an item.
			 */
trait AnchorAttachmentBehavior extends Proxy {
  /**
  				 * Anchor point for the attachment behavior relative to the animator's coordinate system.
  				 */
  var anchor: Point
  /**
  				 * Amount of damping to apply to the attachment behavior.
  				 */
  var damping: Double
  /**
  				 * Distance, in points, between the two attachment points.
  				 */
  var distance: Double
  /**
  				 * Frequency of oscillation for the behavior.
  				 */
  var frequency: Double
  /**
  				 * Item to connect to use the attachment behavior.
  				 */
  var item: View
  /**
  				 * Offset from the center point of the item for the attachment.
  				 */
  var offset: Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 */
  def getAnchor(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 */
  def getDamping(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 */
  def getDistance(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 */
  def getFrequency(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 */
  def getItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 */
  def getOffset(): Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 */
  def setAnchor(anchor: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 */
  def setDamping(damping: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 */
  def setDistance(distance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 */
  def setFrequency(frequency: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 */
  def setItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 */
  def setOffset(offset: Point): Unit
}

object AnchorAttachmentBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    anchor: Point,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    damping: Double,
    distance: Double,
    fireEvent: (String, js.Any) => Callback,
    frequency: Double,
    getAnchor: CallbackTo[Point],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDamping: CallbackTo[Double],
    getDistance: CallbackTo[Double],
    getFrequency: CallbackTo[Double],
    getItem: CallbackTo[View],
    getOffset: CallbackTo[Point],
    item: View,
    offset: Point,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setAnchor: Point => Callback,
    setBubbleParent: Boolean => Callback,
    setDamping: Double => Callback,
    setDistance: Double => Callback,
    setFrequency: Double => Callback,
    setItem: js.Any => Callback,
    setOffset: Point => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AnchorAttachmentBehavior = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAnchor")(getAnchor.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDamping")(getDamping.toJsFn)
    __obj.updateDynamic("getDistance")(getDistance.toJsFn)
    __obj.updateDynamic("getFrequency")(getFrequency.toJsFn)
    __obj.updateDynamic("getItem")(getItem.toJsFn)
    __obj.updateDynamic("getOffset")(getOffset.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAnchor")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Point) => setAnchor(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDamping")(js.Any.fromFunction1((t0: scala.Double) => setDamping(t0).runNow()))
    __obj.updateDynamic("setDistance")(js.Any.fromFunction1((t0: scala.Double) => setDistance(t0).runNow()))
    __obj.updateDynamic("setFrequency")(js.Any.fromFunction1((t0: scala.Double) => setFrequency(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction1((t0: js.Any) => setItem(t0).runNow()))
    __obj.updateDynamic("setOffset")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Point) => setOffset(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorAttachmentBehavior]
  }
}

