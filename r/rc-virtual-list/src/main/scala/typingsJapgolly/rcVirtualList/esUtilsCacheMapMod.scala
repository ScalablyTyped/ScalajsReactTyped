package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.ReactText
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsCacheMapMod {
  
  @JSImport("rc-virtual-list/es/utils/CacheMap", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CacheMap {
    
    /* CompleteClass */
    override def get(key: ReactText): Double = js.native
    
    /* CompleteClass */
    var maps: Record[String, Double] = js.native
    
    /* CompleteClass */
    override def set(key: ReactText, value: Double): Unit = js.native
  }
  
  trait CacheMap extends StObject {
    
    def get(key: ReactText): Double
    
    var maps: Record[String, Double]
    
    def set(key: ReactText, value: Double): Unit
  }
  object CacheMap {
    
    inline def apply(get: ReactText => Double, maps: Record[String, Double], set: (ReactText, Double) => Callback): CacheMap = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), maps = maps.asInstanceOf[js.Any], set = js.Any.fromFunction2((t0: ReactText, t1: Double) => (set(t0, t1)).runNow()))
      __obj.asInstanceOf[CacheMap]
    }
    
    extension [Self <: CacheMap](x: Self) {
      
      inline def setGet(value: ReactText => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setMaps(value: Record[String, Double]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (ReactText, Double) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: ReactText, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
}
