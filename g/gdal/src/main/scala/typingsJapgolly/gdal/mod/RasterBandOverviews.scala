package typingsJapgolly.gdal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterBandOverviews extends StObject {
  
  def count(): Double
  
  def forEach(callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit]): Unit
  
  def get(index: Double): RasterBand
  
  def getBySampleCount(samples: Double): RasterBand
  
  def map[T](callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, T]): js.Array[T]
}
object RasterBandOverviews {
  
  inline def apply(
    count: CallbackTo[Double],
    forEach: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit] => Callback,
    get: Double => RasterBand,
    getBySampleCount: Double => RasterBand,
    map: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Any] => js.Array[Any]
  ): RasterBandOverviews = {
    val __obj = js.Dynamic.literal(count = count.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), getBySampleCount = js.Any.fromFunction1(getBySampleCount), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[RasterBandOverviews]
  }
  
  extension [Self <: RasterBandOverviews](x: Self) {
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setForEach(value: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit]) => value(t0).runNow()))
    
    inline def setGet(value: Double => RasterBand): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetBySampleCount(value: Double => RasterBand): Self = StObject.set(x, "getBySampleCount", js.Any.fromFunction1(value))
    
    inline def setMap(value: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Any] => js.Array[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
