package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeNot
  extends StObject
     with shapeExpr {
  
  /**
    * The {@link shapeExprOrRef} that must be non-conformant for this shape expression to be conformant.
    */
  var shapeExpr: shapeExprOrRef
  
  /**
    * Mandatory type "ShapeNot".
    */
  var `type`: typingsJapgolly.shexj.shexjStrings.ShapeNot
}
object ShapeNot {
  
  inline def apply(shapeExpr: shapeExprOrRef): ShapeNot = {
    val __obj = js.Dynamic.literal(shapeExpr = shapeExpr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeNot")
    __obj.asInstanceOf[ShapeNot]
  }
  
  extension [Self <: ShapeNot](x: Self) {
    
    inline def setShapeExpr(value: shapeExprOrRef): Self = StObject.set(x, "shapeExpr", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.shexj.shexjStrings.ShapeNot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
