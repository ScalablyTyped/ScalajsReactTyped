package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeExternal
  extends StObject
     with shapeExpr {
  
  /**
    * Mandatory type "ShapeExternal".
    */
  var `type`: typingsJapgolly.shexj.shexjStrings.ShapeExternal
}
object ShapeExternal {
  
  inline def apply(): ShapeExternal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ShapeExternal")
    __obj.asInstanceOf[ShapeExternal]
  }
  
  extension [Self <: ShapeExternal](x: Self) {
    
    inline def setType(value: typingsJapgolly.shexj.shexjStrings.ShapeExternal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
