package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.shexj.mod.ShapeOr
  - typingsJapgolly.shexj.mod.ShapeAnd
  - typingsJapgolly.shexj.mod.ShapeNot
  - typingsJapgolly.shexj.mod.NodeConstraint
  - typingsJapgolly.shexj.mod.Shape
  - typingsJapgolly.shexj.mod.ShapeExternal
*/
trait shapeExpr extends StObject
object shapeExpr {
  
  inline def NodeConstraint(): typingsJapgolly.shexj.mod.NodeConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NodeConstraint")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.NodeConstraint]
  }
  
  inline def Shape(): typingsJapgolly.shexj.mod.Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Shape")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.Shape]
  }
  
  inline def ShapeAnd(shapeExprs: js.Array[shapeExprOrRef]): typingsJapgolly.shexj.mod.ShapeAnd = {
    val __obj = js.Dynamic.literal(shapeExprs = shapeExprs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeAnd")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.ShapeAnd]
  }
  
  inline def ShapeExternal(): typingsJapgolly.shexj.mod.ShapeExternal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ShapeExternal")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.ShapeExternal]
  }
  
  inline def ShapeNot(shapeExpr: shapeExprOrRef): typingsJapgolly.shexj.mod.ShapeNot = {
    val __obj = js.Dynamic.literal(shapeExpr = shapeExpr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeNot")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.ShapeNot]
  }
  
  inline def ShapeOr(shapeExprs: js.Array[shapeExprOrRef]): typingsJapgolly.shexj.mod.ShapeOr = {
    val __obj = js.Dynamic.literal(shapeExprs = shapeExprs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeOr")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.ShapeOr]
  }
}
