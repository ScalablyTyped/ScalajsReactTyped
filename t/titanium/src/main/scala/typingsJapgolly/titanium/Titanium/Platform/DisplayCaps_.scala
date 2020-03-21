package typingsJapgolly.titanium.Titanium.Platform

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Display Caps object returned by the <Titanium.Platform.displayCaps> property.
		 */
trait DisplayCaps_ extends Proxy {
  /**
  			 * Logical density of the display.
  			 */
  val density: String
  /**
  			 * Display density expressed as dots-per-inch.
  			 */
  val dpi: Double
  /**
  			 * Logical density of the display, as a scaling factor for the Density Independent Pixel (dip)
  			 * unit.
  			 */
  val logicalDensityFactor: Double
  /**
  			 * Absolute height of the display in relation to UI orientation. Measured in platform-specific
  			 * units; pixels on Android and density-independent pixels (dip) on iOS.
  			 */
  val platformHeight: Double
  /**
  			 * Absolute width of the display in relation to UI orientation. Measured in platform-specific
  			 * units; pixels on Android and density-independent pixels (dip) on iOS.
  			 */
  val platformWidth: Double
  /**
  			 * Physical pixels per inch of the display in the X dimension.
  			 */
  val xdpi: Double
  /**
  			 * Physical pixels per inch of the display in the Y dimension.
  			 */
  val ydpi: Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.density> property.
  			 */
  def getDensity(): String
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.dpi> property.
  			 */
  def getDpi(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.logicalDensityFactor> property.
  			 */
  def getLogicalDensityFactor(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformHeight> property.
  			 */
  def getPlatformHeight(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformWidth> property.
  			 */
  def getPlatformWidth(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.xdpi> property.
  			 */
  def getXdpi(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.ydpi> property.
  			 */
  def getYdpi(): Double
}

object DisplayCaps_ {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    density: String,
    dpi: Double,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getDensity: CallbackTo[String],
    getDpi: CallbackTo[Double],
    getLogicalDensityFactor: CallbackTo[Double],
    getPlatformHeight: CallbackTo[Double],
    getPlatformWidth: CallbackTo[Double],
    getXdpi: CallbackTo[Double],
    getYdpi: CallbackTo[Double],
    logicalDensityFactor: Double,
    platformHeight: Double,
    platformWidth: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    xdpi: Double,
    ydpi: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): DisplayCaps_ = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], logicalDensityFactor = logicalDensityFactor.asInstanceOf[js.Any], platformHeight = platformHeight.asInstanceOf[js.Any], platformWidth = platformWidth.asInstanceOf[js.Any], xdpi = xdpi.asInstanceOf[js.Any], ydpi = ydpi.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDensity")(getDensity.toJsFn)
    __obj.updateDynamic("getDpi")(getDpi.toJsFn)
    __obj.updateDynamic("getLogicalDensityFactor")(getLogicalDensityFactor.toJsFn)
    __obj.updateDynamic("getPlatformHeight")(getPlatformHeight.toJsFn)
    __obj.updateDynamic("getPlatformWidth")(getPlatformWidth.toJsFn)
    __obj.updateDynamic("getXdpi")(getXdpi.toJsFn)
    __obj.updateDynamic("getYdpi")(getYdpi.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayCaps_]
  }
}

