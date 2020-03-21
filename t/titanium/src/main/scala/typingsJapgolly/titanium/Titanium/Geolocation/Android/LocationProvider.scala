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
			 * Represents a source of location information, such as GPS.
			 */
trait LocationProvider extends Proxy {
  /**
  				 * Don't send a location update unless the location has changed at least `minUpdateDistance`
  				 * meters since the previous update.
  				 */
  var minUpdateDistance: Double
  /**
  				 * Limits the frequency of location updates to no more than one per `minUpdateTime` seconds.
  				 */
  var minUpdateTime: Double
  /**
  				 * Type of location provider: [PROVIDER_GPS](Titanium.Geolocation.Android.PROVIDER_GPS),
  				 * [PROVIDER_NETWORK](Titanium.Geolocation.Android.PROVIDER_NETWORK), or
  				 * [PROVIDER_PASSIVE](Titanium.Geolocation.Android.PROVIDER_PASSIVE).
  				 */
  var name: String
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
  				 */
  def getMinUpdateDistance(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
  				 */
  def getMinUpdateTime(): Double
  /**
  				 * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
  				 */
  def getName(): String
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
  				 */
  def setMinUpdateDistance(minUpdateDistance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
  				 */
  def setMinUpdateTime(minUpdateTime: Double): Unit
  /**
  				 * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
  				 */
  def setName(name: String): Unit
}

object LocationProvider {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getMinUpdateDistance: CallbackTo[Double],
    getMinUpdateTime: CallbackTo[Double],
    getName: CallbackTo[String],
    minUpdateDistance: Double,
    minUpdateTime: Double,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setMinUpdateDistance: Double => Callback,
    setMinUpdateTime: Double => Callback,
    setName: String => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): LocationProvider = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], minUpdateDistance = minUpdateDistance.asInstanceOf[js.Any], minUpdateTime = minUpdateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getMinUpdateDistance")(getMinUpdateDistance.toJsFn)
    __obj.updateDynamic("getMinUpdateTime")(getMinUpdateTime.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setMinUpdateDistance")(js.Any.fromFunction1((t0: scala.Double) => setMinUpdateDistance(t0).runNow()))
    __obj.updateDynamic("setMinUpdateTime")(js.Any.fromFunction1((t0: scala.Double) => setMinUpdateTime(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationProvider]
  }
}

