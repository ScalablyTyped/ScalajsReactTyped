package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a control which is associated with a spinnable value. */
trait XSpinValue
  extends StObject
     with XInterface {
  
  /** returns the currently set maximum value of the control */
  var Maximum: Double
  
  /** returns the currently set minimum value of the control */
  var Minimum: Double
  
  /** returns the current orientation of the control */
  var Orientation: Double
  
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  var SpinIncrement: Double
  
  /** returns the current value of the control. */
  var Value: Double
  
  /** registers an adjustment event listener. */
  def addAdjustmentListener(listener: XAdjustmentListener): Unit
  
  /** returns the currently set maximum value of the control */
  def getMaximum(): Double
  
  /** returns the currently set minimum value of the control */
  def getMinimum(): Double
  
  /** returns the current orientation of the control */
  def getOrientation(): Double
  
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  def getSpinIncrement(): Double
  
  /** returns the current value of the control. */
  def getValue(): Double
  
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(listener: XAdjustmentListener): Unit
  
  /** sets the maximum value which can be set on the control */
  def setMaximum(maxValue: Double): Unit
  
  /** sets the minimum value which can be set on the control */
  def setMinimum(minValue: Double): Unit
  
  /**
    * controls the orientation of the control
    * @param orientation one of the {@link ScrollBarOrientation} values specifying the orientation
    * @throws com::sun::star::lang::NoSupportException in case the given orientation is not supported
    */
  def setOrientation(orientation: Double): Unit
  
  /** sets the value by which the current value of the control should be incremented or decremented upon spinning. */
  def setSpinIncrement(spinIncrement: Double): Unit
  
  /** sets the current value of the control */
  def setValue(value: Double): Unit
  
  /**
    * sets the value and value range of the control
    * @see setValue
    * @see setMinimum
    * @see setMaximum
    */
  def setValues(minValue: Double, maxValue: Double, currentValue: Double): Unit
}
object XSpinValue {
  
  inline def apply(
    Maximum: Double,
    Minimum: Double,
    Orientation: Double,
    SpinIncrement: Double,
    Value: Double,
    acquire: Callback,
    addAdjustmentListener: XAdjustmentListener => Callback,
    getMaximum: CallbackTo[Double],
    getMinimum: CallbackTo[Double],
    getOrientation: CallbackTo[Double],
    getSpinIncrement: CallbackTo[Double],
    getValue: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeAdjustmentListener: XAdjustmentListener => Callback,
    setMaximum: Double => Callback,
    setMinimum: Double => Callback,
    setOrientation: Double => Callback,
    setSpinIncrement: Double => Callback,
    setValue: Double => Callback,
    setValues: (Double, Double, Double) => Callback
  ): XSpinValue = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], SpinIncrement = SpinIncrement.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAdjustmentListener = js.Any.fromFunction1((t0: XAdjustmentListener) => addAdjustmentListener(t0).runNow()), getMaximum = getMaximum.toJsFn, getMinimum = getMinimum.toJsFn, getOrientation = getOrientation.toJsFn, getSpinIncrement = getSpinIncrement.toJsFn, getValue = getValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAdjustmentListener = js.Any.fromFunction1((t0: XAdjustmentListener) => removeAdjustmentListener(t0).runNow()), setMaximum = js.Any.fromFunction1((t0: Double) => setMaximum(t0).runNow()), setMinimum = js.Any.fromFunction1((t0: Double) => setMinimum(t0).runNow()), setOrientation = js.Any.fromFunction1((t0: Double) => setOrientation(t0).runNow()), setSpinIncrement = js.Any.fromFunction1((t0: Double) => setSpinIncrement(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()), setValues = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setValues(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XSpinValue]
  }
  
  extension [Self <: XSpinValue](x: Self) {
    
    inline def setAddAdjustmentListener(value: XAdjustmentListener => Callback): Self = StObject.set(x, "addAdjustmentListener", js.Any.fromFunction1((t0: XAdjustmentListener) => value(t0).runNow()))
    
    inline def setGetMaximum(value: CallbackTo[Double]): Self = StObject.set(x, "getMaximum", value.toJsFn)
    
    inline def setGetMinimum(value: CallbackTo[Double]): Self = StObject.set(x, "getMinimum", value.toJsFn)
    
    inline def setGetOrientation(value: CallbackTo[Double]): Self = StObject.set(x, "getOrientation", value.toJsFn)
    
    inline def setGetSpinIncrement(value: CallbackTo[Double]): Self = StObject.set(x, "getSpinIncrement", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setRemoveAdjustmentListener(value: XAdjustmentListener => Callback): Self = StObject.set(x, "removeAdjustmentListener", js.Any.fromFunction1((t0: XAdjustmentListener) => value(t0).runNow()))
    
    inline def setSetMaximum(value: Double => Callback): Self = StObject.set(x, "setMaximum", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinimum(value: Double => Callback): Self = StObject.set(x, "setMinimum", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetOrientation(value: Double => Callback): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSpinIncrement(value: Double => Callback): Self = StObject.set(x, "setSpinIncrement", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetValues(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setValues", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSpinIncrement(value: Double): Self = StObject.set(x, "SpinIncrement", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
