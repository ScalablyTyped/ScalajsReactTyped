package typingsJapgolly.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedViewportProps
  extends StObject
     with FlyToViewportProps {
  
  var bearing: Double
  
  var pitch: Double
}
object NormalizedViewportProps {
  
  inline def apply(
    bearing: Double,
    height: Double,
    latitude: Double,
    longitude: Double,
    pitch: Double,
    width: Double,
    zoom: Double
  ): NormalizedViewportProps = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedViewportProps]
  }
  
  extension [Self <: NormalizedViewportProps](x: Self) {
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
  }
}
