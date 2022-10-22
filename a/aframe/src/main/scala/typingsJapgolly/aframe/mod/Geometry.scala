package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry[T] extends StObject {
  
  var data: T
  
  var geometry: typingsJapgolly.three.examplesJsmDeprecatedGeometryMod.Geometry
  
  def init(data: Any): Unit
  
  var name: String
  
  var schema: Schema_[Any]
}
object Geometry {
  
  inline def apply[T](
    data: T,
    geometry: typingsJapgolly.three.examplesJsmDeprecatedGeometryMod.Geometry,
    init: Any => Callback,
    name: String,
    schema: Schema_[Any]
  ): Geometry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], init = js.Any.fromFunction1((t0: Any) => init(t0).runNow()), name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry[T]]
  }
  
  extension [Self <: Geometry[?], T](x: Self & Geometry[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: typingsJapgolly.three.examplesJsmDeprecatedGeometryMod.Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Schema_[Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
