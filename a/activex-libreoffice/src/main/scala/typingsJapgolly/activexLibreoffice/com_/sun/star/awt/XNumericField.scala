package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and formatting of a numeric field. */
trait XNumericField
  extends StObject
     with XInterface {
  
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Double
  
  /** returns the currently set last value which is set on END key. */
  var Last: Double
  
  /** returns the currently set maximum value that can be entered by the user. */
  var Max: Double
  
  /** returns the currently set minimum value that can be entered by the user. */
  var Min: Double
  
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double
  
  /** returns the value which is currently displayed in the numeric field. */
  var Value: Double
  
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Double
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Double
  
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(): Double
  
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(): Double
  
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double
  
  /** returns the value which is currently displayed in the numeric field. */
  def getValue(): Double
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double): Unit
  
  /** sets the last value to be set on END key. */
  def setLast(Value: Double): Unit
  
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double): Unit
  
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double): Unit
  
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  
  /** sets the value which is displayed in the numeric field. */
  def setValue(Value: Double): Unit
}
object XNumericField {
  
  inline def apply(
    DecimalDigits: Double,
    First: Double,
    Last: Double,
    Max: Double,
    Min: Double,
    SpinSize: Double,
    Value: Double,
    acquire: Callback,
    getDecimalDigits: CallbackTo[Double],
    getFirst: CallbackTo[Double],
    getLast: CallbackTo[Double],
    getMax: CallbackTo[Double],
    getMin: CallbackTo[Double],
    getSpinSize: CallbackTo[Double],
    getValue: CallbackTo[Double],
    isStrictFormat: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setDecimalDigits: Double => Callback,
    setFirst: Double => Callback,
    setLast: Double => Callback,
    setMax: Double => Callback,
    setMin: Double => Callback,
    setSpinSize: Double => Callback,
    setStrictFormat: Boolean => Callback,
    setValue: Double => Callback
  ): XNumericField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], SpinSize = SpinSize.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDecimalDigits = getDecimalDigits.toJsFn, getFirst = getFirst.toJsFn, getLast = getLast.toJsFn, getMax = getMax.toJsFn, getMin = getMin.toJsFn, getSpinSize = getSpinSize.toJsFn, getValue = getValue.toJsFn, isStrictFormat = isStrictFormat.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDecimalDigits = js.Any.fromFunction1((t0: Double) => setDecimalDigits(t0).runNow()), setFirst = js.Any.fromFunction1((t0: Double) => setFirst(t0).runNow()), setLast = js.Any.fromFunction1((t0: Double) => setLast(t0).runNow()), setMax = js.Any.fromFunction1((t0: Double) => setMax(t0).runNow()), setMin = js.Any.fromFunction1((t0: Double) => setMin(t0).runNow()), setSpinSize = js.Any.fromFunction1((t0: Double) => setSpinSize(t0).runNow()), setStrictFormat = js.Any.fromFunction1((t0: Boolean) => setStrictFormat(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()))
    __obj.asInstanceOf[XNumericField]
  }
  
  extension [Self <: XNumericField](x: Self) {
    
    inline def setDecimalDigits(value: Double): Self = StObject.set(x, "DecimalDigits", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Double): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setGetDecimalDigits(value: CallbackTo[Double]): Self = StObject.set(x, "getDecimalDigits", value.toJsFn)
    
    inline def setGetFirst(value: CallbackTo[Double]): Self = StObject.set(x, "getFirst", value.toJsFn)
    
    inline def setGetLast(value: CallbackTo[Double]): Self = StObject.set(x, "getLast", value.toJsFn)
    
    inline def setGetMax(value: CallbackTo[Double]): Self = StObject.set(x, "getMax", value.toJsFn)
    
    inline def setGetMin(value: CallbackTo[Double]): Self = StObject.set(x, "getMin", value.toJsFn)
    
    inline def setGetSpinSize(value: CallbackTo[Double]): Self = StObject.set(x, "getSpinSize", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setIsStrictFormat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStrictFormat", value.toJsFn)
    
    inline def setLast(value: Double): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setSetDecimalDigits(value: Double => Callback): Self = StObject.set(x, "setDecimalDigits", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFirst(value: Double => Callback): Self = StObject.set(x, "setFirst", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLast(value: Double => Callback): Self = StObject.set(x, "setLast", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMax(value: Double => Callback): Self = StObject.set(x, "setMax", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMin(value: Double => Callback): Self = StObject.set(x, "setMin", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSpinSize(value: Double => Callback): Self = StObject.set(x, "setSpinSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStrictFormat(value: Boolean => Callback): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSpinSize(value: Double): Self = StObject.set(x, "SpinSize", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
