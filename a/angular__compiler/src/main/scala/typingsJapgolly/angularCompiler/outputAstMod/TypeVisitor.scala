package typingsJapgolly.angularCompiler.outputAstMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeVisitor extends js.Object {
  def visitArrayType(`type`: ArrayType, context: js.Any): js.Any
  def visitBuiltinType(`type`: BuiltinType, context: js.Any): js.Any
  def visitExpressionType(`type`: ExpressionType_, context: js.Any): js.Any
  def visitMapType(`type`: MapType, context: js.Any): js.Any
}

object TypeVisitor {
  @scala.inline
  def apply(
    visitArrayType: (ArrayType, js.Any) => CallbackTo[js.Any],
    visitBuiltinType: (BuiltinType, js.Any) => CallbackTo[js.Any],
    visitExpressionType: (ExpressionType_, js.Any) => CallbackTo[js.Any],
    visitMapType: (MapType, js.Any) => CallbackTo[js.Any]
  ): TypeVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitArrayType")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.ArrayType, t1: js.Any) => visitArrayType(t0, t1).runNow()))
    __obj.updateDynamic("visitBuiltinType")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.BuiltinType, t1: js.Any) => visitBuiltinType(t0, t1).runNow()))
    __obj.updateDynamic("visitExpressionType")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.ExpressionType_, t1: js.Any) => visitExpressionType(t0, t1).runNow()))
    __obj.updateDynamic("visitMapType")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.MapType, t1: js.Any) => visitMapType(t0, t1).runNow()))
    __obj.asInstanceOf[TypeVisitor]
  }
}

