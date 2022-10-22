package typingsJapgolly.mapboxMapboxGlDraw.mod

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.mapboxGl.mod.Map
import typingsJapgolly.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotdelete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawDeleteEvent
  extends StObject
     with DrawEvent {
  
  // Array of GeoJSON objects representing the features that were deleted
  var features: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  @JSName("type")
  var type_DrawDeleteEvent: drawDotdelete
}
object DrawDeleteEvent {
  
  inline def apply(features: js.Array[Feature[Geometry, GeoJsonProperties]], target: Map): DrawDeleteEvent = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.delete")
    __obj.asInstanceOf[DrawDeleteEvent]
  }
  
  extension [Self <: DrawDeleteEvent](x: Self) {
    
    inline def setFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setType(value: drawDotdelete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
