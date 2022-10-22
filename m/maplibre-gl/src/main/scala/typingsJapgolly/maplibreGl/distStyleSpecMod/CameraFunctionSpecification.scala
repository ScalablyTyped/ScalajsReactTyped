package typingsJapgolly.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.Stops[T]
  - typingsJapgolly.maplibreGl.anon.Type[T]
*/
trait CameraFunctionSpecification[T]
  extends StObject
     with _DataDrivenPropertyValueSpecification[T]
object CameraFunctionSpecification {
  
  inline def Stops[T](stops: js.Array[js.Tuple2[Double, T]]): typingsJapgolly.maplibreGl.anon.Stops[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Stops[T]]
  }
  
  inline def Type[T](stops: js.Array[js.Tuple2[Double, T]]): typingsJapgolly.maplibreGl.anon.Type[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Type[T]]
  }
}
