package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian2
import typingsJapgolly.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapePositions extends StObject {
  
  var cornerType: js.UndefOr[typingsJapgolly.cesium.mod.CornerType] = js.undefined
  
  var ellipsoid: js.UndefOr[typingsJapgolly.cesium.mod.Ellipsoid] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var polylinePositions: js.Array[Cartesian3]
  
  var shapePositions: js.Array[Cartesian2]
}
object ShapePositions {
  
  inline def apply(polylinePositions: js.Array[Cartesian3], shapePositions: js.Array[Cartesian2]): ShapePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions.asInstanceOf[js.Any], shapePositions = shapePositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapePositions]
  }
  
  extension [Self <: ShapePositions](x: Self) {
    
    inline def setCornerType(value: typingsJapgolly.cesium.mod.CornerType): Self = StObject.set(x, "cornerType", value.asInstanceOf[js.Any])
    
    inline def setCornerTypeUndefined: Self = StObject.set(x, "cornerType", js.undefined)
    
    inline def setEllipsoid(value: typingsJapgolly.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setPolylinePositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "polylinePositions", value.asInstanceOf[js.Any])
    
    inline def setPolylinePositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "polylinePositions", js.Array(value*))
    
    inline def setShapePositions(value: js.Array[Cartesian2]): Self = StObject.set(x, "shapePositions", value.asInstanceOf[js.Any])
    
    inline def setShapePositionsVarargs(value: Cartesian2*): Self = StObject.set(x, "shapePositions", js.Array(value*))
  }
}
