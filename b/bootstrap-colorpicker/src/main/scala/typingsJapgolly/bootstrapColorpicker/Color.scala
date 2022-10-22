package typingsJapgolly.bootstrapColorpicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bootstrapColorpicker.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var fallbackFormat: String
  
  var fallbackValue: String
  
  var hexNumberSignPrefix: Boolean
  
  var origFormat: String
  
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
  
  var value: A
}
object Color {
  
  inline def apply(
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
    toString_ : ColorFormat => String,
    value: A
  ): Color = {
    val __obj = js.Dynamic.literal(fallbackFormat = fallbackFormat.asInstanceOf[js.Any], fallbackValue = fallbackValue.asInstanceOf[js.Any], hexNumberSignPrefix = hexNumberSignPrefix.asInstanceOf[js.Any], origFormat = origFormat.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1((t0: Double) => setAlpha(t0).runNow()), setBrightness = js.Any.fromFunction1((t0: Double) => setBrightness(t0).runNow()), setColor = js.Any.fromFunction1((t0: String) => setColor(t0).runNow()), setHue = js.Any.fromFunction1((t0: Double) => setHue(t0).runNow()), setSaturation = js.Any.fromFunction1((t0: Double) => setSaturation(t0).runNow()), toHSL = toHSL.toJsFn, toHex = toHex.toJsFn, toRGB = toRGB.toJsFn, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setFallbackFormat(value: String): Self = StObject.set(x, "fallbackFormat", value.asInstanceOf[js.Any])
    
    inline def setFallbackValue(value: String): Self = StObject.set(x, "fallbackValue", value.asInstanceOf[js.Any])
    
    inline def setHexNumberSignPrefix(value: Boolean): Self = StObject.set(x, "hexNumberSignPrefix", value.asInstanceOf[js.Any])
    
    inline def setOrigFormat(value: String): Self = StObject.set(x, "origFormat", value.asInstanceOf[js.Any])
    
    inline def setSetAlpha(value: Double => Callback): Self = StObject.set(x, "setAlpha", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetBrightness(value: Double => Callback): Self = StObject.set(x, "setBrightness", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetColor(value: String => Callback): Self = StObject.set(x, "setColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHue(value: Double => Callback): Self = StObject.set(x, "setHue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSaturation(value: Double => Callback): Self = StObject.set(x, "setSaturation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setToHSL(value: CallbackTo[String]): Self = StObject.set(x, "toHSL", value.toJsFn)
    
    inline def setToHex(value: CallbackTo[String]): Self = StObject.set(x, "toHex", value.toJsFn)
    
    inline def setToRGB(value: CallbackTo[String]): Self = StObject.set(x, "toRGB", value.toJsFn)
    
    inline def setToString_(value: ColorFormat => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    
    inline def setValue(value: A): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
