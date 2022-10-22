package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeOr
  extends StObject
     with shapeExpr {
  
  /**
    * List of two or more {@link shapeExprOrRef}s in this disjunction.
    */
  var shapeExprs: js.Array[shapeExprOrRef]
  
  /**
    * Mandatory type "ShapeOr".
    */
  var `type`: typingsJapgolly.shexj.shexjStrings.ShapeOr
}
object ShapeOr {
  
  inline def apply(shapeExprs: js.Array[shapeExprOrRef]): ShapeOr = {
    val __obj = js.Dynamic.literal(shapeExprs = shapeExprs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeOr")
    __obj.asInstanceOf[ShapeOr]
  }
  
  extension [Self <: ShapeOr](x: Self) {
    
    inline def setShapeExprs(value: js.Array[shapeExprOrRef]): Self = StObject.set(x, "shapeExprs", value.asInstanceOf[js.Any])
    
    inline def setShapeExprsVarargs(value: shapeExprOrRef*): Self = StObject.set(x, "shapeExprs", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.shexj.shexjStrings.ShapeOr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
