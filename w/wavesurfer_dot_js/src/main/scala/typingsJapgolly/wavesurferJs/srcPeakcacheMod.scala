package typingsJapgolly.wavesurferJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPeakcacheMod {
  
  @JSImport("wavesurfer.js/src/peakcache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PeakCache {
    
    /* CompleteClass */
    override def addRangeToPeakCache(length: Double, start: Double, end: Double): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def clearPeakCache(): Unit = js.native
    
    /* CompleteClass */
    override def getCacheRanges(): js.Array[js.Array[Double]] = js.native
  }
  
  trait PeakCache extends StObject {
    
    def addRangeToPeakCache(length: Double, start: Double, end: Double): js.Array[js.Array[Double]]
    
    def clearPeakCache(): Unit
    
    def getCacheRanges(): js.Array[js.Array[Double]]
  }
  object PeakCache {
    
    inline def apply(
      addRangeToPeakCache: (Double, Double, Double) => js.Array[js.Array[Double]],
      clearPeakCache: Callback,
      getCacheRanges: CallbackTo[js.Array[js.Array[Double]]]
    ): PeakCache = {
      val __obj = js.Dynamic.literal(addRangeToPeakCache = js.Any.fromFunction3(addRangeToPeakCache), clearPeakCache = clearPeakCache.toJsFn, getCacheRanges = getCacheRanges.toJsFn)
      __obj.asInstanceOf[PeakCache]
    }
    
    extension [Self <: PeakCache](x: Self) {
      
      inline def setAddRangeToPeakCache(value: (Double, Double, Double) => js.Array[js.Array[Double]]): Self = StObject.set(x, "addRangeToPeakCache", js.Any.fromFunction3(value))
      
      inline def setClearPeakCache(value: Callback): Self = StObject.set(x, "clearPeakCache", value.toJsFn)
      
      inline def setGetCacheRanges(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getCacheRanges", value.toJsFn)
    }
  }
}
