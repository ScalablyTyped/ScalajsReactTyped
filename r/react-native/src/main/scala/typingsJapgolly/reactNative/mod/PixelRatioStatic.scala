package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelRatioStatic extends js.Object {
  /*
    Returns the device pixel density. Some examples:
    PixelRatio.get() === 1
    mdpi Android devices (160 dpi)
    PixelRatio.get() === 1.5
    hdpi Android devices (240 dpi)
    PixelRatio.get() === 2
    iPhone 4, 4S
    iPhone 5, 5c, 5s
    iPhone 6
    xhdpi Android devices (320 dpi)
    PixelRatio.get() === 3
    iPhone 6 plus
    xxhdpi Android devices (480 dpi)
    PixelRatio.get() === 3.5
    Nexus 6
    */
  def get(): Double
  /*
    Returns the scaling factor for font sizes. This is the ratio that is
    used to calculate the absolute font size, so any elements that
    heavily depend on that should use this to do calculations.
    If a font scale is not set, this returns the device pixel ratio.
    Currently this is only implemented on Android and reflects the user
    preference set in Settings > Display > Font size,
    on iOS it will always return the default pixel ratio.
    */
  def getFontScale(): Double
  /**
    * Converts a layout size (dp) to pixel size (px).
    * Guaranteed to return an integer number.
    */
  def getPixelSizeForLayoutSize(layoutSize: Double): Double
  /**
    * Rounds a layout size (dp) to the nearest layout size that
    * corresponds to an integer number of pixels. For example,
    * on a device with a PixelRatio of 3,
    * PixelRatio.roundToNearestPixel(8.4) = 8.33,
    * which corresponds to exactly (8.33 * 3) = 25 pixels.
    */
  def roundToNearestPixel(layoutSize: Double): Double
  /**
    * No-op for iOS, but used on the web. Should not be documented. [sic]
    */
  def startDetecting(): Unit
}

object PixelRatioStatic {
  @scala.inline
  def apply(
    get: CallbackTo[Double],
    getFontScale: CallbackTo[Double],
    getPixelSizeForLayoutSize: Double => CallbackTo[Double],
    roundToNearestPixel: Double => CallbackTo[Double],
    startDetecting: Callback
  ): PixelRatioStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getFontScale")(getFontScale.toJsFn)
    __obj.updateDynamic("getPixelSizeForLayoutSize")(js.Any.fromFunction1((t0: scala.Double) => getPixelSizeForLayoutSize(t0).runNow()))
    __obj.updateDynamic("roundToNearestPixel")(js.Any.fromFunction1((t0: scala.Double) => roundToNearestPixel(t0).runNow()))
    __obj.updateDynamic("startDetecting")(startDetecting.toJsFn)
    __obj.asInstanceOf[PixelRatioStatic]
  }
}

