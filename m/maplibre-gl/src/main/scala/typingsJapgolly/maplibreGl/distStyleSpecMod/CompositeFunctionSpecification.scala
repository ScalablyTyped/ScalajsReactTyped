package typingsJapgolly.maplibreGl.distStyleSpecMod

import typingsJapgolly.maplibreGl.anon.Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.Default[T]
  - typingsJapgolly.maplibreGl.anon.Property[T]
  - typingsJapgolly.maplibreGl.anon.DefaultProperty[T]
*/
trait CompositeFunctionSpecification[T]
  extends StObject
     with _DataDrivenPropertyValueSpecification[T]
object CompositeFunctionSpecification {
  
  inline def Default[T](property: String, stops: js.Array[js.Tuple2[typingsJapgolly.maplibreGl.anon.Value, T]]): typingsJapgolly.maplibreGl.anon.Default[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Default[T]]
  }
  
  inline def DefaultProperty[T](property: String, stops: js.Array[js.Tuple2[Zoom, T]]): typingsJapgolly.maplibreGl.anon.DefaultProperty[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.DefaultProperty[T]]
  }
  
  inline def Property[T](property: String, stops: js.Array[js.Tuple2[typingsJapgolly.maplibreGl.anon.Value, T]]): typingsJapgolly.maplibreGl.anon.Property[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Property[T]]
  }
}
