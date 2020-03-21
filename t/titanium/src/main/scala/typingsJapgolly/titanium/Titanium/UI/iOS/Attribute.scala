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
			 * An abstract datatype for specifying an attributed string attribute.
			 */
trait Attribute extends Proxy {
  /**
  				 * Attribute range.
  				 */
  var range: js.Array[Double]
  /**
  				 * Attribute to apply to the text.
  				 */
  var `type`: Double
  /**
  				 * Attribute value.
  				 */
  var value: Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def getRange(): js.Array[Double]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def getType(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def getValue(): Double
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def setRange(range: js.Array[Double]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def setType(`type`: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def setValue(value: Double): Unit
}

object Attribute {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getRange: CallbackTo[js.Array[Double]],
    getType: CallbackTo[Double],
    getValue: CallbackTo[Double],
    range: js.Array[Double],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setRange: js.Array[Double] => Callback,
    setType: Double => Callback,
    setValue: Double => Callback,
    `type`: Double,
    value: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getRange")(getRange.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setRange")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => setRange(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: scala.Double) => setType(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: scala.Double) => setValue(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

