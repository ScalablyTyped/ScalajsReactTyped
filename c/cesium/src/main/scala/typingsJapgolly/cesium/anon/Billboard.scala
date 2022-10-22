package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Label
import typingsJapgolly.cesium.mod.PointPrimitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billboard extends StObject {
  
  var billboard: typingsJapgolly.cesium.mod.Billboard
  
  var label: Label
  
  var point: PointPrimitive
}
object Billboard {
  
  inline def apply(billboard: typingsJapgolly.cesium.mod.Billboard, label: Label, point: PointPrimitive): Billboard = {
    val __obj = js.Dynamic.literal(billboard = billboard.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billboard]
  }
  
  extension [Self <: Billboard](x: Self) {
    
    inline def setBillboard(value: typingsJapgolly.cesium.mod.Billboard): Self = StObject.set(x, "billboard", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: PointPrimitive): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
