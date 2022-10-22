package typingsJapgolly.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialStationaryFrameOfReference extends StObject {
  
  var coordinateSystem: Any
}
object SpatialStationaryFrameOfReference {
  
  inline def apply(coordinateSystem: Any): SpatialStationaryFrameOfReference = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialStationaryFrameOfReference]
  }
  
  extension [Self <: SpatialStationaryFrameOfReference](x: Self) {
    
    inline def setCoordinateSystem(value: Any): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
  }
}
