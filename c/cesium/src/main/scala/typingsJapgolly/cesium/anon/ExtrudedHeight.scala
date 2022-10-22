package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtrudedHeight extends StObject {
  
  var center: Cartesian3
  
  var ellipsoid: js.UndefOr[typingsJapgolly.cesium.mod.Ellipsoid] = js.undefined
  
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var numberOfVerticalLines: js.UndefOr[Double] = js.undefined
  
  var radius: Double
}
object ExtrudedHeight {
  
  inline def apply(center: Cartesian3, radius: Double): ExtrudedHeight = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrudedHeight]
  }
  
  extension [Self <: ExtrudedHeight](x: Self) {
    
    inline def setCenter(value: Cartesian3): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEllipsoid(value: typingsJapgolly.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setExtrudedHeight(value: Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    inline def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setNumberOfVerticalLines(value: Double): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
