package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and formatting of a metric field. */
trait XMetricField
  extends StObject
     with XInterface {
  
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double
  
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double
  
  /** returns the corrected value which is displayed in the metric field. */
  def getCorrectedValue(FieldUnit: Double): Double
  
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(FieldUnit: Double): Double
  
  /** returns the currently set last value which is set on END key. */
  def getLast(FieldUnit: Double): Double
  
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(FieldUnit: Double): Double
  
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(FieldUnit: Double): Double
  
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double
  
  /** returns the value which is currently displayed in the metric field. */
  def getValue(FieldUnit: Double): Double
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double, FieldUnit: Double): Unit
  
  /** sets the last value to be set on END key. */
  def setLast(Value: Double, FieldUnit: Double): Unit
  
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double, FieldUnit: Double): Unit
  
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double, FieldUnit: Double): Unit
  
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  
  /** sets the user value which is displayed in the metric field. */
  def setUserValue(Value: Double, FieldUnit: Double): Unit
  
  /** sets the value which is displayed in the metric field. */
  def setValue(Value: Double, FieldUnit: Double): Unit
}
object XMetricField {
  
  inline def apply(
    DecimalDigits: Double,
    SpinSize: Double,
    acquire: Callback,
    getCorrectedValue: Double => Double,
    getDecimalDigits: CallbackTo[Double],
    getFirst: Double => Double,
    getLast: Double => Double,
    getMax: Double => Double,
    getMin: Double => Double,
    getSpinSize: CallbackTo[Double],
    getValue: Double => Double,
    isStrictFormat: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setDecimalDigits: Double => Callback,
    setFirst: (Double, Double) => Callback,
    setLast: (Double, Double) => Callback,
    setMax: (Double, Double) => Callback,
    setMin: (Double, Double) => Callback,
    setSpinSize: Double => Callback,
    setStrictFormat: Boolean => Callback,
    setUserValue: (Double, Double) => Callback,
    setValue: (Double, Double) => Callback
  ): XMetricField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits.asInstanceOf[js.Any], SpinSize = SpinSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCorrectedValue = js.Any.fromFunction1(getCorrectedValue), getDecimalDigits = getDecimalDigits.toJsFn, getFirst = js.Any.fromFunction1(getFirst), getLast = js.Any.fromFunction1(getLast), getMax = js.Any.fromFunction1(getMax), getMin = js.Any.fromFunction1(getMin), getSpinSize = getSpinSize.toJsFn, getValue = js.Any.fromFunction1(getValue), isStrictFormat = isStrictFormat.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDecimalDigits = js.Any.fromFunction1((t0: Double) => setDecimalDigits(t0).runNow()), setFirst = js.Any.fromFunction2((t0: Double, t1: Double) => (setFirst(t0, t1)).runNow()), setLast = js.Any.fromFunction2((t0: Double, t1: Double) => (setLast(t0, t1)).runNow()), setMax = js.Any.fromFunction2((t0: Double, t1: Double) => (setMax(t0, t1)).runNow()), setMin = js.Any.fromFunction2((t0: Double, t1: Double) => (setMin(t0, t1)).runNow()), setSpinSize = js.Any.fromFunction1((t0: Double) => setSpinSize(t0).runNow()), setStrictFormat = js.Any.fromFunction1((t0: Boolean) => setStrictFormat(t0).runNow()), setUserValue = js.Any.fromFunction2((t0: Double, t1: Double) => (setUserValue(t0, t1)).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: Double) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XMetricField]
  }
  
  extension [Self <: XMetricField](x: Self) {
    
    inline def setDecimalDigits(value: Double): Self = StObject.set(x, "DecimalDigits", value.asInstanceOf[js.Any])
    
    inline def setGetCorrectedValue(value: Double => Double): Self = StObject.set(x, "getCorrectedValue", js.Any.fromFunction1(value))
    
    inline def setGetDecimalDigits(value: CallbackTo[Double]): Self = StObject.set(x, "getDecimalDigits", value.toJsFn)
    
    inline def setGetFirst(value: Double => Double): Self = StObject.set(x, "getFirst", js.Any.fromFunction1(value))
    
    inline def setGetLast(value: Double => Double): Self = StObject.set(x, "getLast", js.Any.fromFunction1(value))
    
    inline def setGetMax(value: Double => Double): Self = StObject.set(x, "getMax", js.Any.fromFunction1(value))
    
    inline def setGetMin(value: Double => Double): Self = StObject.set(x, "getMin", js.Any.fromFunction1(value))
    
    inline def setGetSpinSize(value: CallbackTo[Double]): Self = StObject.set(x, "getSpinSize", value.toJsFn)
    
    inline def setGetValue(value: Double => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setIsStrictFormat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStrictFormat", value.toJsFn)
    
    inline def setSetDecimalDigits(value: Double => Callback): Self = StObject.set(x, "setDecimalDigits", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFirst(value: (Double, Double) => Callback): Self = StObject.set(x, "setFirst", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetLast(value: (Double, Double) => Callback): Self = StObject.set(x, "setLast", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetMax(value: (Double, Double) => Callback): Self = StObject.set(x, "setMax", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetMin(value: (Double, Double) => Callback): Self = StObject.set(x, "setMin", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetSpinSize(value: Double => Callback): Self = StObject.set(x, "setSpinSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStrictFormat(value: Boolean => Callback): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetUserValue(value: (Double, Double) => Callback): Self = StObject.set(x, "setUserValue", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: (Double, Double) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSpinSize(value: Double): Self = StObject.set(x, "SpinSize", value.asInstanceOf[js.Any])
  }
}
