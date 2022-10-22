package typingsJapgolly.openlayers.mod.olx

import typingsJapgolly.openlayers.mod.Coordinate_
import typingsJapgolly.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewState extends StObject {
  
  var center: Coordinate_
  
  var projection: Projection
  
  var resolution: Double
  
  var rotation: Double
}
object ViewState {
  
  inline def apply(center: Coordinate_, projection: Projection, resolution: Double, rotation: Double): ViewState = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
  
  extension [Self <: ViewState](x: Self) {
    
    inline def setCenter(value: Coordinate_): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
