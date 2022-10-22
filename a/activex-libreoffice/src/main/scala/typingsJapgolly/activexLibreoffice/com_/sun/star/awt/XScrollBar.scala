package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a scroll bar and makes it possible to register adjustment event listeners. */
trait XScrollBar
  extends StObject
     with XInterface {
  
  /** returns the currently set increment for a block move. */
  var BlockIncrement: Double
  
  /** returns the currently set increment for a single line move. */
  var LineIncrement: Double
  
  /** returns the currently set maximum scroll value of the scroll bar. */
  var Maximum: Double
  
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  var Orientation: Double
  
  /** returns the current scroll value of the scroll bar. */
  var Value: Double
  
  /** returns the currently visible size of the scroll bar. */
  var VisibleSize: Double
  
  /** registers an adjustment event listener. */
  def addAdjustmentListener(l: XAdjustmentListener): Unit
  
  /** returns the currently set increment for a block move. */
  def getBlockIncrement(): Double
  
  /** returns the currently set increment for a single line move. */
  def getLineIncrement(): Double
  
  /** returns the currently set maximum scroll value of the scroll bar. */
  def getMaximum(): Double
  
  /** returns the currently set {@link ScrollBarOrientation} of the scroll bar. */
  def getOrientation(): Double
  
  /** returns the current scroll value of the scroll bar. */
  def getValue(): Double
  
  /** returns the currently visible size of the scroll bar. */
  def getVisibleSize(): Double
  
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(l: XAdjustmentListener): Unit
  
  /** sets the increment for a block move. */
  def setBlockIncrement(n: Double): Unit
  
  /** sets the increment for a single line move. */
  def setLineIncrement(n: Double): Unit
  
  /** sets the maximum scroll value of the scroll bar. */
  def setMaximum(n: Double): Unit
  
  /** sets the {@link ScrollBarOrientation} of the scroll bar. */
  def setOrientation(n: Double): Unit
  
  /** sets the scroll value of the scroll bar. */
  def setValue(n: Double): Unit
  
  /** sets the scroll value, visible area and maximum scroll value of the scroll bar. */
  def setValues(nValue: Double, nVisible: Double, nMax: Double): Unit
  
  /** sets the visible size of the scroll bar. */
  def setVisibleSize(n: Double): Unit
}
object XScrollBar {
  
  inline def apply(
    BlockIncrement: Double,
    LineIncrement: Double,
    Maximum: Double,
    Orientation: Double,
    Value: Double,
    VisibleSize: Double,
    acquire: Callback,
    addAdjustmentListener: XAdjustmentListener => Callback,
    getBlockIncrement: CallbackTo[Double],
    getLineIncrement: CallbackTo[Double],
    getMaximum: CallbackTo[Double],
    getOrientation: CallbackTo[Double],
    getValue: CallbackTo[Double],
    getVisibleSize: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeAdjustmentListener: XAdjustmentListener => Callback,
    setBlockIncrement: Double => Callback,
    setLineIncrement: Double => Callback,
    setMaximum: Double => Callback,
    setOrientation: Double => Callback,
    setValue: Double => Callback,
    setValues: (Double, Double, Double) => Callback,
    setVisibleSize: Double => Callback
  ): XScrollBar = {
    val __obj = js.Dynamic.literal(BlockIncrement = BlockIncrement.asInstanceOf[js.Any], LineIncrement = LineIncrement.asInstanceOf[js.Any], Maximum = Maximum.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VisibleSize = VisibleSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAdjustmentListener = js.Any.fromFunction1((t0: XAdjustmentListener) => addAdjustmentListener(t0).runNow()), getBlockIncrement = getBlockIncrement.toJsFn, getLineIncrement = getLineIncrement.toJsFn, getMaximum = getMaximum.toJsFn, getOrientation = getOrientation.toJsFn, getValue = getValue.toJsFn, getVisibleSize = getVisibleSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAdjustmentListener = js.Any.fromFunction1((t0: XAdjustmentListener) => removeAdjustmentListener(t0).runNow()), setBlockIncrement = js.Any.fromFunction1((t0: Double) => setBlockIncrement(t0).runNow()), setLineIncrement = js.Any.fromFunction1((t0: Double) => setLineIncrement(t0).runNow()), setMaximum = js.Any.fromFunction1((t0: Double) => setMaximum(t0).runNow()), setOrientation = js.Any.fromFunction1((t0: Double) => setOrientation(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()), setValues = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setValues(t0, t1, t2)).runNow()), setVisibleSize = js.Any.fromFunction1((t0: Double) => setVisibleSize(t0).runNow()))
    __obj.asInstanceOf[XScrollBar]
  }
  
  extension [Self <: XScrollBar](x: Self) {
    
    inline def setAddAdjustmentListener(value: XAdjustmentListener => Callback): Self = StObject.set(x, "addAdjustmentListener", js.Any.fromFunction1((t0: XAdjustmentListener) => value(t0).runNow()))
    
    inline def setBlockIncrement(value: Double): Self = StObject.set(x, "BlockIncrement", value.asInstanceOf[js.Any])
    
    inline def setGetBlockIncrement(value: CallbackTo[Double]): Self = StObject.set(x, "getBlockIncrement", value.toJsFn)
    
    inline def setGetLineIncrement(value: CallbackTo[Double]): Self = StObject.set(x, "getLineIncrement", value.toJsFn)
    
    inline def setGetMaximum(value: CallbackTo[Double]): Self = StObject.set(x, "getMaximum", value.toJsFn)
    
    inline def setGetOrientation(value: CallbackTo[Double]): Self = StObject.set(x, "getOrientation", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetVisibleSize(value: CallbackTo[Double]): Self = StObject.set(x, "getVisibleSize", value.toJsFn)
    
    inline def setLineIncrement(value: Double): Self = StObject.set(x, "LineIncrement", value.asInstanceOf[js.Any])
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setRemoveAdjustmentListener(value: XAdjustmentListener => Callback): Self = StObject.set(x, "removeAdjustmentListener", js.Any.fromFunction1((t0: XAdjustmentListener) => value(t0).runNow()))
    
    inline def setSetBlockIncrement(value: Double => Callback): Self = StObject.set(x, "setBlockIncrement", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLineIncrement(value: Double => Callback): Self = StObject.set(x, "setLineIncrement", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMaximum(value: Double => Callback): Self = StObject.set(x, "setMaximum", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetOrientation(value: Double => Callback): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetValues(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setValues", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetVisibleSize(value: Double => Callback): Self = StObject.set(x, "setVisibleSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setVisibleSize(value: Double): Self = StObject.set(x, "VisibleSize", value.asInstanceOf[js.Any])
  }
}
