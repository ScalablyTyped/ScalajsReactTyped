package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a progress bar. */
trait XProgressBar
  extends StObject
     with XInterface {
  
  /** returns the current progress value of the progress bar. */
  var Value: Double
  
  /** returns the current progress value of the progress bar. */
  def getValue(): Double
  
  /** sets the background color (RGB) of the control. */
  def setBackgroundColor(Color: Color): Unit
  
  /** sets the foreground color (RGB) of the control. */
  def setForegroundColor(Color: Color): Unit
  
  /**
    * sets the minimum and the maximum progress value of the progress bar.
    *
    * If the minimum value is greater than the maximum value, the method exchanges the values automatically.
    */
  def setRange(Min: Double, Max: Double): Unit
  
  /** sets the progress value of the progress bar. */
  def setValue(Value: Double): Unit
}
object XProgressBar {
  
  inline def apply(
    Value: Double,
    acquire: Callback,
    getValue: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setBackgroundColor: Color => Callback,
    setForegroundColor: Color => Callback,
    setRange: (Double, Double) => Callback,
    setValue: Double => Callback
  ): XProgressBar = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, getValue = getValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setBackgroundColor = js.Any.fromFunction1((t0: Color) => setBackgroundColor(t0).runNow()), setForegroundColor = js.Any.fromFunction1((t0: Color) => setForegroundColor(t0).runNow()), setRange = js.Any.fromFunction2((t0: Double, t1: Double) => (setRange(t0, t1)).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()))
    __obj.asInstanceOf[XProgressBar]
  }
  
  extension [Self <: XProgressBar](x: Self) {
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetBackgroundColor(value: Color => Callback): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetForegroundColor(value: Color => Callback): Self = StObject.set(x, "setForegroundColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetRange(value: (Double, Double) => Callback): Self = StObject.set(x, "setRange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
