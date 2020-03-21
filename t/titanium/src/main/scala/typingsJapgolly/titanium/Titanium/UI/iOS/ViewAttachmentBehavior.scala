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
			 * Dynamic behavior to support connections between two items.
			 */
trait ViewAttachmentBehavior extends Proxy {
  /**
  				 * Item to use as the anchor in this behavior.
  				 */
  var anchorItem: View
  /**
  				 * Offset from the center point of the anchor item for the attachment.
  				 */
  var anchorOffset: Point
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
  var itemOffset: Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
  				 */
  def getAnchorItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
  				 */
  def getAnchorOffset(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
  				 */
  def getDamping(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
  				 */
  def getDistance(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
  				 */
  def getFrequency(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
  				 */
  def getItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
  				 */
  def getItemOffset(): Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
  				 */
  def setAnchorItem(anchorItem: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
  				 */
  def setAnchorOffset(anchorOffset: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
  				 */
  def setDamping(damping: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
  				 */
  def setDistance(distance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
  				 */
  def setFrequency(frequency: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
  				 */
  def setItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
  				 */
  def setItemOffset(itemOffset: Point): Unit
}

object ViewAttachmentBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    anchorItem: View,
    anchorOffset: Point,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    damping: Double,
    distance: Double,
    fireEvent: (String, js.Any) => Callback,
    frequency: Double,
    getAnchorItem: CallbackTo[View],
    getAnchorOffset: CallbackTo[Point],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDamping: CallbackTo[Double],
    getDistance: CallbackTo[Double],
    getFrequency: CallbackTo[Double],
    getItem: CallbackTo[View],
    getItemOffset: CallbackTo[Point],
    item: View,
    itemOffset: Point,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setAnchorItem: js.Any => Callback,
    setAnchorOffset: Point => Callback,
    setBubbleParent: Boolean => Callback,
    setDamping: Double => Callback,
    setDistance: Double => Callback,
    setFrequency: Double => Callback,
    setItem: js.Any => Callback,
    setItemOffset: Point => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ViewAttachmentBehavior = {
    val __obj = js.Dynamic.literal(anchorItem = anchorItem.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemOffset = itemOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAnchorItem")(getAnchorItem.toJsFn)
    __obj.updateDynamic("getAnchorOffset")(getAnchorOffset.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDamping")(getDamping.toJsFn)
    __obj.updateDynamic("getDistance")(getDistance.toJsFn)
    __obj.updateDynamic("getFrequency")(getFrequency.toJsFn)
    __obj.updateDynamic("getItem")(getItem.toJsFn)
    __obj.updateDynamic("getItemOffset")(getItemOffset.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAnchorItem")(js.Any.fromFunction1((t0: js.Any) => setAnchorItem(t0).runNow()))
    __obj.updateDynamic("setAnchorOffset")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Point) => setAnchorOffset(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDamping")(js.Any.fromFunction1((t0: scala.Double) => setDamping(t0).runNow()))
    __obj.updateDynamic("setDistance")(js.Any.fromFunction1((t0: scala.Double) => setDistance(t0).runNow()))
    __obj.updateDynamic("setFrequency")(js.Any.fromFunction1((t0: scala.Double) => setFrequency(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction1((t0: js.Any) => setItem(t0).runNow()))
    __obj.updateDynamic("setItemOffset")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Point) => setItemOffset(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewAttachmentBehavior]
  }
}

