package typingsJapgolly.gdal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetBands extends StObject {
  
  def count(): Double
  
  def create(dataType: Double): RasterBand
  
  val ds: Dataset
  
  def forEach(callback: js.Function2[/* band */ RasterBand, /* i */ Double, Unit]): Unit
  
  def get(id: Double): RasterBand
  
  def map[T](callback: js.Function2[/* band */ RasterBand, /* i */ Double, T]): js.Array[T]
}
object DatasetBands {
  
  inline def apply(
    count: CallbackTo[Double],
    create: Double => RasterBand,
    ds: Dataset,
    forEach: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Callback,
    get: Double => RasterBand,
    map: js.Function2[/* band */ RasterBand, /* i */ Double, Any] => js.Array[Any]
  ): DatasetBands = {
    val __obj = js.Dynamic.literal(count = count.toJsFn, create = js.Any.fromFunction1(create), ds = ds.asInstanceOf[js.Any], forEach = js.Any.fromFunction1((t0: js.Function2[/* band */ RasterBand, /* i */ Double, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[DatasetBands]
  }
  
  extension [Self <: DatasetBands](x: Self) {
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setCreate(value: Double => RasterBand): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setDs(value: Dataset): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
    
    inline def setForEach(value: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* band */ RasterBand, /* i */ Double, Unit]) => value(t0).runNow()))
    
    inline def setGet(value: Double => RasterBand): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setMap(value: js.Function2[/* band */ RasterBand, /* i */ Double, Any] => js.Array[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
