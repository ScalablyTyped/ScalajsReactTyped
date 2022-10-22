package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETime extends StObject {
  
  /**
    * Returns the GETimeControl object; this is the time slider.
    */
  def getControl(): GETimeControl
  
  /**
    * Whether or not historical imagery is enabled.
    */
  def getHistoricalImageryEnabled(): Boolean
  
  /**
    * Get the current plugin clock rate.
    */
  def getRate(): Double
  
  /**
    * Returns the current computer clock time as a KmlTimeStamp object.
    */
  def getSystemTime(): KmlTimeStamp
  
  /**
    * Get the current plugin time as a KmlTimeStamp or KmlTimeSpan.
    */
  def getTimePrimitive(): KmlTimePrimitive
  
  /**
    * Turn historical imagery on or off.
    * For more information, read the Time chapter of the Developer's Guide.
    */
  def setHistoricalImageryEnabled(historicalImageryEnabled: Boolean): Unit
  
  /**
    * Set the plugin's clock rate.
    * A value of 1 corresponds with real time; to pass one year in the plugin for every real second, set the rate to 31536000 (60 times 60 times 24 times 365).
    */
  def setRate(rate: Double): Unit
  
  /**
    * Sets the current plugin time.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit
}
object GETime {
  
  inline def apply(
    getControl: CallbackTo[GETimeControl],
    getHistoricalImageryEnabled: CallbackTo[Boolean],
    getRate: CallbackTo[Double],
    getSystemTime: CallbackTo[KmlTimeStamp],
    getTimePrimitive: CallbackTo[KmlTimePrimitive],
    setHistoricalImageryEnabled: Boolean => Callback,
    setRate: Double => Callback,
    setTimePrimitive: KmlTimePrimitive => Callback
  ): GETime = {
    val __obj = js.Dynamic.literal(getControl = getControl.toJsFn, getHistoricalImageryEnabled = getHistoricalImageryEnabled.toJsFn, getRate = getRate.toJsFn, getSystemTime = getSystemTime.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, setHistoricalImageryEnabled = js.Any.fromFunction1((t0: Boolean) => setHistoricalImageryEnabled(t0).runNow()), setRate = js.Any.fromFunction1((t0: Double) => setRate(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()))
    __obj.asInstanceOf[GETime]
  }
  
  extension [Self <: GETime](x: Self) {
    
    inline def setGetControl(value: CallbackTo[GETimeControl]): Self = StObject.set(x, "getControl", value.toJsFn)
    
    inline def setGetHistoricalImageryEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getHistoricalImageryEnabled", value.toJsFn)
    
    inline def setGetRate(value: CallbackTo[Double]): Self = StObject.set(x, "getRate", value.toJsFn)
    
    inline def setGetSystemTime(value: CallbackTo[KmlTimeStamp]): Self = StObject.set(x, "getSystemTime", value.toJsFn)
    
    inline def setGetTimePrimitive(value: CallbackTo[KmlTimePrimitive]): Self = StObject.set(x, "getTimePrimitive", value.toJsFn)
    
    inline def setSetHistoricalImageryEnabled(value: Boolean => Callback): Self = StObject.set(x, "setHistoricalImageryEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetRate(value: Double => Callback): Self = StObject.set(x, "setRate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTimePrimitive(value: KmlTimePrimitive => Callback): Self = StObject.set(x, "setTimePrimitive", js.Any.fromFunction1((t0: KmlTimePrimitive) => value(t0).runNow()))
  }
}
