package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonHierarchyPolygonHierarchy extends StObject {
  
  var polygonHierarchy: typingsJapgolly.cesium.mod.PolygonHierarchy
}
object PolygonHierarchyPolygonHierarchy {
  
  inline def apply(polygonHierarchy: typingsJapgolly.cesium.mod.PolygonHierarchy): PolygonHierarchyPolygonHierarchy = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonHierarchyPolygonHierarchy]
  }
  
  extension [Self <: PolygonHierarchyPolygonHierarchy](x: Self) {
    
    inline def setPolygonHierarchy(value: typingsJapgolly.cesium.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
  }
}
