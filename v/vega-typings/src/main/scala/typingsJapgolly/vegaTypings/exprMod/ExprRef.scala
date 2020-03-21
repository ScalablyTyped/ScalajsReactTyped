package typingsJapgolly.vegaTypings.exprMod

import typingsJapgolly.vegaTypings.onEventsMod._Update
import typingsJapgolly.vegaTypings.transformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExprRef
  extends TransformField
     with _Update {
  var expr: Expr
}

object ExprRef {
  @scala.inline
  def apply(expr: Expr): ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExprRef]
  }
}

