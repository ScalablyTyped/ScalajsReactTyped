package typingsJapgolly.forgeViewer.Autodesk.Viewing.Private

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexBufferReader extends StObject {
  
  def enumGeoms(filter: Any, callback: GeometryCallback): Unit
  
  def enumGeomsForObject(dbId: Double, callback: GeometryCallback): Unit
  
  def enumGeomsForVisibleLayer(layerIdsVisible: js.Array[Double], callback: GeometryCallback): Unit
}
object VertexBufferReader {
  
  inline def apply(
    enumGeoms: (Any, GeometryCallback) => Callback,
    enumGeomsForObject: (Double, GeometryCallback) => Callback,
    enumGeomsForVisibleLayer: (js.Array[Double], GeometryCallback) => Callback
  ): VertexBufferReader = {
    val __obj = js.Dynamic.literal(enumGeoms = js.Any.fromFunction2((t0: Any, t1: GeometryCallback) => (enumGeoms(t0, t1)).runNow()), enumGeomsForObject = js.Any.fromFunction2((t0: Double, t1: GeometryCallback) => (enumGeomsForObject(t0, t1)).runNow()), enumGeomsForVisibleLayer = js.Any.fromFunction2((t0: js.Array[Double], t1: GeometryCallback) => (enumGeomsForVisibleLayer(t0, t1)).runNow()))
    __obj.asInstanceOf[VertexBufferReader]
  }
  
  extension [Self <: VertexBufferReader](x: Self) {
    
    inline def setEnumGeoms(value: (Any, GeometryCallback) => Callback): Self = StObject.set(x, "enumGeoms", js.Any.fromFunction2((t0: Any, t1: GeometryCallback) => (value(t0, t1)).runNow()))
    
    inline def setEnumGeomsForObject(value: (Double, GeometryCallback) => Callback): Self = StObject.set(x, "enumGeomsForObject", js.Any.fromFunction2((t0: Double, t1: GeometryCallback) => (value(t0, t1)).runNow()))
    
    inline def setEnumGeomsForVisibleLayer(value: (js.Array[Double], GeometryCallback) => Callback): Self = StObject.set(x, "enumGeomsForVisibleLayer", js.Any.fromFunction2((t0: js.Array[Double], t1: GeometryCallback) => (value(t0, t1)).runNow()))
  }
}
