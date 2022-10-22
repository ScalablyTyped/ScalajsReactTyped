package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.maplibreGlStrings.composite
import typingsJapgolly.maplibreGl.mod.SizeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxZoom_
  extends StObject
     with SizeData {
  
  var interpolationType: typingsJapgolly.maplibreGl.mod.InterpolationType
  
  var kind: composite
  
  var maxZoom: Double
  
  var minZoom: Double
}
object MaxZoom_ {
  
  inline def apply(
    interpolationType: typingsJapgolly.maplibreGl.mod.InterpolationType,
    maxZoom: Double,
    minZoom: Double
  ): MaxZoom_ = {
    val __obj = js.Dynamic.literal(interpolationType = interpolationType.asInstanceOf[js.Any], kind = "composite", maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoom_]
  }
  
  extension [Self <: MaxZoom_](x: Self) {
    
    inline def setInterpolationType(value: typingsJapgolly.maplibreGl.mod.InterpolationType): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: composite): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
  }
}
