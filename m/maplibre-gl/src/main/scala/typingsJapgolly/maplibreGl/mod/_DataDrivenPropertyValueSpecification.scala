package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.maplibreGl.anon.Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DataDrivenPropertyValueSpecification[T] extends StObject
object _DataDrivenPropertyValueSpecification {
  
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
  
  inline def DefaultPropertyStops[T](property: String, stops: js.Array[js.Tuple2[String | Double | Boolean, T]]): typingsJapgolly.maplibreGl.anon.DefaultPropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.DefaultPropertyStops[T]]
  }
  
  inline def Property[T](property: String, stops: js.Array[js.Tuple2[typingsJapgolly.maplibreGl.anon.Value, T]]): typingsJapgolly.maplibreGl.anon.Property[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Property[T]]
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
  
  inline def Stops[T](stops: js.Array[js.Tuple2[Double, T]]): typingsJapgolly.maplibreGl.anon.Stops[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Stops[T]]
  }
  
  inline def StopsType[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): typingsJapgolly.maplibreGl.anon.StopsType[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.StopsType[T]]
  }
  
  inline def Type[T](stops: js.Array[js.Tuple2[Double, T]]): typingsJapgolly.maplibreGl.anon.Type[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Type[T]]
  }
}
