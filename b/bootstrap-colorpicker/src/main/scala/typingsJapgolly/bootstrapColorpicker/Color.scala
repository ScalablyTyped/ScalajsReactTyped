package typingsJapgolly.bootstrapColorpicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var fallbackFormat: String
  var fallbackValue: String
  var hexNumberSignPrefix: Boolean
  var origFormat: String
  var value: AnonA
  /**
    * Set the transparency with a value between 0 and 1.
    */
  def setAlpha(value: Double): Unit
  /**
    * Set the brightness with a value between 0 and 1.
    */
  def setBrightness(value: Double): Unit
  /**
    * Set a new color. The value is parsed and tries to do a quess on the format.
    */
  def setColor(value: String): Unit
  /**
    * Set the HUE with a value between 0 and 1.
    */
  def setHue(value: Double): Unit
  /**
    * Set the saturation with a value between 0 and 1.
    */
  def setSaturation(value: Double): Unit
  /**
    * Returns a hash with HSLA values.
    */
  def toHSL(): String
  /**
    * Returns a string with HEX format for the current color.
    */
  def toHex(): String
  /**
    * Returns a hash with red, green, blue and alpha.
    */
  def toRGB(): String
  /**
    * Returns current color as string in specified format.
    */
  def toString(format: ColorFormat): String
}

object Color {
  @scala.inline
  def apply(
    fallbackFormat: String,
    fallbackValue: String,
    hexNumberSignPrefix: Boolean,
    origFormat: String,
    setAlpha: Double => Callback,
    setBrightness: Double => Callback,
    setColor: String => Callback,
    setHue: Double => Callback,
    setSaturation: Double => Callback,
    toHSL: CallbackTo[String],
    toHex: CallbackTo[String],
    toRGB: CallbackTo[String],
    toString: ColorFormat => CallbackTo[String],
    value: AnonA
  ): Color = {
    val __obj = js.Dynamic.literal(fallbackFormat = fallbackFormat.asInstanceOf[js.Any], fallbackValue = fallbackValue.asInstanceOf[js.Any], hexNumberSignPrefix = hexNumberSignPrefix.asInstanceOf[js.Any], origFormat = origFormat.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("setAlpha")(js.Any.fromFunction1((t0: scala.Double) => setAlpha(t0).runNow()))
    __obj.updateDynamic("setBrightness")(js.Any.fromFunction1((t0: scala.Double) => setBrightness(t0).runNow()))
    __obj.updateDynamic("setColor")(js.Any.fromFunction1((t0: java.lang.String) => setColor(t0).runNow()))
    __obj.updateDynamic("setHue")(js.Any.fromFunction1((t0: scala.Double) => setHue(t0).runNow()))
    __obj.updateDynamic("setSaturation")(js.Any.fromFunction1((t0: scala.Double) => setSaturation(t0).runNow()))
    __obj.updateDynamic("toHSL")(toHSL.toJsFn)
    __obj.updateDynamic("toHex")(toHex.toJsFn)
    __obj.updateDynamic("toRGB")(toRGB.toJsFn)
    __obj.updateDynamic("toString")(js.Any.fromFunction1((t0: typingsJapgolly.bootstrapColorpicker.ColorFormat) => toString(t0).runNow()))
    __obj.asInstanceOf[Color]
  }
}

