package typingsJapgolly.hdrHistogramJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.hdrHistogramJs.distJsHistogramMod.JsHistogram
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypedArrayHistogramMod {
  
  @JSImport("hdr-histogram-js/dist/TypedArrayHistogram", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TypedArrayHistogram {
    def this(
      arrayCtr: Instantiable1[/* size */ Double, TypedArray],
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
    
    /* CompleteClass */
    var _counts: TypedArray = js.native
    
    /* protected */ /* CompleteClass */
    override def _getEstimatedFootprintInBytes(): Double = js.native
    
    /* CompleteClass */
    var _totalCount: Double = js.native
    
    /* CompleteClass */
    override def addToCountAtIndex(index: Double, value: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var arrayCtr: Any = js.native
    
    /* CompleteClass */
    override def clearCounts(): Unit = js.native
    
    /* CompleteClass */
    override def copyCorrectedForCoordinatedOmission(expectedIntervalBetweenValueSamples: Double): TypedArrayHistogram = js.native
    
    /* CompleteClass */
    var encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any = js.native
    
    /* CompleteClass */
    override def getCountAtIndex(index: Double): Double = js.native
    
    /* CompleteClass */
    override def incrementCountAtIndex(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def resize(newHighestTrackableValue: Double): Unit = js.native
    
    /* CompleteClass */
    override def setCountAtIndex(index: Double, value: Double): Unit = js.native
  }
  
  trait TypedArray
    extends StObject
       with ArrayLike[Double] {
    
    val BYTES_PER_ELEMENT: Double
    
    def fill(v: Double): Unit
    
    def set(other: TypedArray): Unit
  }
  object TypedArray {
    
    inline def apply(BYTES_PER_ELEMENT: Double, fill: Double => Callback, length: Double, set: TypedArray => Callback): TypedArray = {
      val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], fill = js.Any.fromFunction1((t0: Double) => fill(t0).runNow()), length = length.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: TypedArray) => set(t0).runNow()))
      __obj.asInstanceOf[TypedArray]
    }
    
    extension [Self <: TypedArray](x: Self) {
      
      inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
      
      inline def setFill(value: Double => Callback): Self = StObject.set(x, "fill", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet(value: TypedArray => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: TypedArray) => value(t0).runNow()))
    }
  }
  
  trait TypedArrayHistogram
    extends StObject
       with JsHistogram {
    
    var _counts: TypedArray
    
    /* protected */ def _getEstimatedFootprintInBytes(): Double
    
    var _totalCount: Double
    
    def addToCountAtIndex(index: Double, value: Double): Unit
    
    /* private */ var arrayCtr: Any
    
    def clearCounts(): Unit
    
    def copyCorrectedForCoordinatedOmission(expectedIntervalBetweenValueSamples: Double): TypedArrayHistogram
    
    def getCountAtIndex(index: Double): Double
    
    def incrementCountAtIndex(index: Double): Unit
    
    def resize(newHighestTrackableValue: Double): Unit
    
    def setCountAtIndex(index: Double, value: Double): Unit
  }
  object TypedArrayHistogram {
    
    inline def apply(
      _counts: TypedArray,
      _getEstimatedFootprintInBytes: CallbackTo[Double],
      _totalCount: Double,
      addToCountAtIndex: (Double, Double) => Callback,
      arrayCtr: Any,
      clearCounts: Callback,
      copyCorrectedForCoordinatedOmission: Double => TypedArrayHistogram,
      encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any,
      getCountAtIndex: Double => Double,
      incrementCountAtIndex: Double => Callback,
      resize: Double => Callback,
      setCountAtIndex: (Double, Double) => Callback
    ): TypedArrayHistogram = {
      val __obj = js.Dynamic.literal(_counts = _counts.asInstanceOf[js.Any], _getEstimatedFootprintInBytes = _getEstimatedFootprintInBytes.toJsFn, _totalCount = _totalCount.asInstanceOf[js.Any], addToCountAtIndex = js.Any.fromFunction2((t0: Double, t1: Double) => (addToCountAtIndex(t0, t1)).runNow()), arrayCtr = arrayCtr.asInstanceOf[js.Any], clearCounts = clearCounts.toJsFn, copyCorrectedForCoordinatedOmission = js.Any.fromFunction1(copyCorrectedForCoordinatedOmission), encodeIntoCompressedBase64 = encodeIntoCompressedBase64.asInstanceOf[js.Any], getCountAtIndex = js.Any.fromFunction1(getCountAtIndex), incrementCountAtIndex = js.Any.fromFunction1((t0: Double) => incrementCountAtIndex(t0).runNow()), resize = js.Any.fromFunction1((t0: Double) => resize(t0).runNow()), setCountAtIndex = js.Any.fromFunction2((t0: Double, t1: Double) => (setCountAtIndex(t0, t1)).runNow()))
      __obj.asInstanceOf[TypedArrayHistogram]
    }
    
    extension [Self <: TypedArrayHistogram](x: Self) {
      
      inline def setAddToCountAtIndex(value: (Double, Double) => Callback): Self = StObject.set(x, "addToCountAtIndex", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setArrayCtr(value: Any): Self = StObject.set(x, "arrayCtr", value.asInstanceOf[js.Any])
      
      inline def setClearCounts(value: Callback): Self = StObject.set(x, "clearCounts", value.toJsFn)
      
      inline def setCopyCorrectedForCoordinatedOmission(value: Double => TypedArrayHistogram): Self = StObject.set(x, "copyCorrectedForCoordinatedOmission", js.Any.fromFunction1(value))
      
      inline def setGetCountAtIndex(value: Double => Double): Self = StObject.set(x, "getCountAtIndex", js.Any.fromFunction1(value))
      
      inline def setIncrementCountAtIndex(value: Double => Callback): Self = StObject.set(x, "incrementCountAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setResize(value: Double => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetCountAtIndex(value: (Double, Double) => Callback): Self = StObject.set(x, "setCountAtIndex", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def set_counts(value: TypedArray): Self = StObject.set(x, "_counts", value.asInstanceOf[js.Any])
      
      inline def set_getEstimatedFootprintInBytes(value: CallbackTo[Double]): Self = StObject.set(x, "_getEstimatedFootprintInBytes", value.toJsFn)
      
      inline def set_totalCount(value: Double): Self = StObject.set(x, "_totalCount", value.asInstanceOf[js.Any])
    }
  }
}
