package typingsJapgolly.titanium.Titanium.Geolocation.Android

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A location rule to filter the results returned by location providers.
			 */
trait LocationRule extends Proxy {
  /**
  				 * Minimum accuracy required for a location update.
  				 */
  var accuracy: Double
  /**
  				 * Controls the freshness of location updates. Do not forward an update
  				 * unless it is newer than `maxAge` milliseconds.
  				 */
  var maxAge: Double
  /**
  				 * Controls the frequency of location updates.
  				 */
  var minAge: Double
  /**
  				 * If specified, this rule only applies to updates generated
  				 * by the specified provider. If `null`, this rule applies to all updates.
  				 */
  var name: String
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
  				 */
  def getAccuracy(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
  				 */
  def getMaxAge(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
  				 */
  def getMinAge(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
  				 */
  def getName(): String
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
  				 */
  def setAccuracy(accuracy: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
  				 */
  def setMaxAge(maxAge: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
  				 */
  def setMinAge(minAge: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
  				 */
  def setName(name: String): Unit
}

object LocationRule {
  @scala.inline
  def apply(
    accuracy: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getAccuracy: CallbackTo[Double],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getMaxAge: CallbackTo[Double],
    getMinAge: CallbackTo[Double],
    getName: CallbackTo[String],
    maxAge: Double,
    minAge: Double,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setAccuracy: Double => Callback,
    setBubbleParent: Boolean => Callback,
    setMaxAge: Double => Callback,
    setMinAge: Double => Callback,
    setName: String => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): LocationRule = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], minAge = minAge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAccuracy")(getAccuracy.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getMaxAge")(getMaxAge.toJsFn)
    __obj.updateDynamic("getMinAge")(getMinAge.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAccuracy")(js.Any.fromFunction1((t0: scala.Double) => setAccuracy(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setMaxAge")(js.Any.fromFunction1((t0: scala.Double) => setMaxAge(t0).runNow()))
    __obj.updateDynamic("setMinAge")(js.Any.fromFunction1((t0: scala.Double) => setMinAge(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRule]
  }
}

