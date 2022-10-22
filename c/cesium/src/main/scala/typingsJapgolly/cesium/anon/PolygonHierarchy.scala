package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonHierarchy extends StObject {
  
  var ellipsoid: js.UndefOr[typingsJapgolly.cesium.mod.Ellipsoid] = js.undefined
  
  var polygonHierarchy: typingsJapgolly.cesium.mod.PolygonHierarchy
  
  var stRotation: js.UndefOr[Double] = js.undefined
  
  var textureCoordinates: js.UndefOr[typingsJapgolly.cesium.mod.PolygonHierarchy] = js.undefined
  
  var vertexFormat: js.UndefOr[typingsJapgolly.cesium.mod.VertexFormat] = js.undefined
}
object PolygonHierarchy {
  
  inline def apply(polygonHierarchy: typingsJapgolly.cesium.mod.PolygonHierarchy): PolygonHierarchy = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonHierarchy]
  }
  
  extension [Self <: PolygonHierarchy](x: Self) {
    
    inline def setEllipsoid(value: typingsJapgolly.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setPolygonHierarchy(value: typingsJapgolly.cesium.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
    
    inline def setStRotation(value: Double): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
    
    inline def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
    
    inline def setTextureCoordinates(value: typingsJapgolly.cesium.mod.PolygonHierarchy): Self = StObject.set(x, "textureCoordinates", value.asInstanceOf[js.Any])
    
    inline def setTextureCoordinatesUndefined: Self = StObject.set(x, "textureCoordinates", js.undefined)
    
    inline def setVertexFormat(value: typingsJapgolly.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
