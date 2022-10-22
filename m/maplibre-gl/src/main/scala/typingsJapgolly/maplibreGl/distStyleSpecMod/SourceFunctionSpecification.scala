package typingsJapgolly.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.PropertyStops[T]
  - typingsJapgolly.maplibreGl.anon.StopsType[T]
  - typingsJapgolly.maplibreGl.anon.DefaultPropertyStops[T]
  - typingsJapgolly.maplibreGl.anon.PropertyType_[T]
*/
trait SourceFunctionSpecification[T]
  extends StObject
     with _DataDrivenPropertyValueSpecification[T]
object SourceFunctionSpecification {
  
  inline def DefaultPropertyStops[T](property: String, stops: js.Array[js.Tuple2[String | Double | Boolean, T]]): typingsJapgolly.maplibreGl.anon.DefaultPropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.DefaultPropertyStops[T]]
  }
  
  inline def PropertyStops[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): typingsJapgolly.maplibreGl.anon.PropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.PropertyStops[T]]
  }
  
  inline def PropertyType_[T](property: String): typingsJapgolly.maplibreGl.anon.PropertyType_[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.PropertyType_[T]]
  }
  
  inline def StopsType[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): typingsJapgolly.maplibreGl.anon.StopsType[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.StopsType[T]]
  }
}
