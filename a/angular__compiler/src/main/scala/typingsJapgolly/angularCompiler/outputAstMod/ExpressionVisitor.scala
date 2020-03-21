package typingsJapgolly.angularCompiler.outputAstMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionVisitor extends js.Object {
  def visitAssertNotNullExpr(ast: AssertNotNull_, context: js.Any): js.Any
  def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: js.Any): js.Any
  def visitCastExpr(ast: CastExpr, context: js.Any): js.Any
  def visitCommaExpr(ast: CommaExpr, context: js.Any): js.Any
  def visitConditionalExpr(ast: ConditionalExpr, context: js.Any): js.Any
  def visitExternalExpr(ast: ExternalExpr, context: js.Any): js.Any
  def visitFunctionExpr(ast: FunctionExpr, context: js.Any): js.Any
  def visitInstantiateExpr(ast: InstantiateExpr, context: js.Any): js.Any
  def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: js.Any): js.Any
  def visitInvokeMethodExpr(ast: InvokeMethodExpr, context: js.Any): js.Any
  def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: js.Any): js.Any
  def visitLiteralExpr(ast: LiteralExpr, context: js.Any): js.Any
  def visitLiteralMapExpr(ast: LiteralMapExpr, context: js.Any): js.Any
  def visitNotExpr(ast: NotExpr, context: js.Any): js.Any
  def visitReadKeyExpr(ast: ReadKeyExpr, context: js.Any): js.Any
  def visitReadPropExpr(ast: ReadPropExpr, context: js.Any): js.Any
  def visitReadVarExpr(ast: ReadVarExpr, context: js.Any): js.Any
  def visitTypeofExpr(ast: TypeofExpr_, context: js.Any): js.Any
  def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], context: js.Any): js.Any
  def visitWriteKeyExpr(expr: WriteKeyExpr, context: js.Any): js.Any
  def visitWritePropExpr(expr: WritePropExpr, context: js.Any): js.Any
  def visitWriteVarExpr(expr: WriteVarExpr, context: js.Any): js.Any
}

object ExpressionVisitor {
  @scala.inline
  def apply(
    visitAssertNotNullExpr: (AssertNotNull_, js.Any) => CallbackTo[js.Any],
    visitBinaryOperatorExpr: (BinaryOperatorExpr, js.Any) => CallbackTo[js.Any],
    visitCastExpr: (CastExpr, js.Any) => CallbackTo[js.Any],
    visitCommaExpr: (CommaExpr, js.Any) => CallbackTo[js.Any],
    visitConditionalExpr: (ConditionalExpr, js.Any) => CallbackTo[js.Any],
    visitExternalExpr: (ExternalExpr, js.Any) => CallbackTo[js.Any],
    visitFunctionExpr: (FunctionExpr, js.Any) => CallbackTo[js.Any],
    visitInstantiateExpr: (InstantiateExpr, js.Any) => CallbackTo[js.Any],
    visitInvokeFunctionExpr: (InvokeFunctionExpr, js.Any) => CallbackTo[js.Any],
    visitInvokeMethodExpr: (InvokeMethodExpr, js.Any) => CallbackTo[js.Any],
    visitLiteralArrayExpr: (LiteralArrayExpr, js.Any) => CallbackTo[js.Any],
    visitLiteralExpr: (LiteralExpr, js.Any) => CallbackTo[js.Any],
    visitLiteralMapExpr: (LiteralMapExpr, js.Any) => CallbackTo[js.Any],
    visitNotExpr: (NotExpr, js.Any) => CallbackTo[js.Any],
    visitReadKeyExpr: (ReadKeyExpr, js.Any) => CallbackTo[js.Any],
    visitReadPropExpr: (ReadPropExpr, js.Any) => CallbackTo[js.Any],
    visitReadVarExpr: (ReadVarExpr, js.Any) => CallbackTo[js.Any],
    visitTypeofExpr: (TypeofExpr_, js.Any) => CallbackTo[js.Any],
    visitWrappedNodeExpr: (WrappedNodeExpr[js.Any], js.Any) => CallbackTo[js.Any],
    visitWriteKeyExpr: (WriteKeyExpr, js.Any) => CallbackTo[js.Any],
    visitWritePropExpr: (WritePropExpr, js.Any) => CallbackTo[js.Any],
    visitWriteVarExpr: (WriteVarExpr, js.Any) => CallbackTo[js.Any]
  ): ExpressionVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitAssertNotNullExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.AssertNotNull_, t1: js.Any) => visitAssertNotNullExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitBinaryOperatorExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.BinaryOperatorExpr, t1: js.Any) => visitBinaryOperatorExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitCastExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.CastExpr, t1: js.Any) => visitCastExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitCommaExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.CommaExpr, t1: js.Any) => visitCommaExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitConditionalExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.ConditionalExpr, t1: js.Any) => visitConditionalExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitExternalExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.ExternalExpr, t1: js.Any) => visitExternalExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitFunctionExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.FunctionExpr, t1: js.Any) => visitFunctionExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitInstantiateExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.InstantiateExpr, t1: js.Any) => visitInstantiateExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitInvokeFunctionExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.InvokeFunctionExpr, t1: js.Any) => visitInvokeFunctionExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitInvokeMethodExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.InvokeMethodExpr, t1: js.Any) => visitInvokeMethodExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitLiteralArrayExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.LiteralArrayExpr, t1: js.Any) => visitLiteralArrayExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitLiteralExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.LiteralExpr, t1: js.Any) => visitLiteralExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitLiteralMapExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.LiteralMapExpr, t1: js.Any) => visitLiteralMapExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitNotExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.NotExpr, t1: js.Any) => visitNotExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitReadKeyExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.ReadKeyExpr, t1: js.Any) => visitReadKeyExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitReadPropExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.ReadPropExpr, t1: js.Any) => visitReadPropExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitReadVarExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.ReadVarExpr, t1: js.Any) => visitReadVarExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitTypeofExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.TypeofExpr_, t1: js.Any) => visitTypeofExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitWrappedNodeExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.WrappedNodeExpr[js.Any], t1: js.Any) => visitWrappedNodeExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitWriteKeyExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.WriteKeyExpr, t1: js.Any) => visitWriteKeyExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitWritePropExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.WritePropExpr, t1: js.Any) => visitWritePropExpr(t0, t1).runNow()))
    __obj.updateDynamic("visitWriteVarExpr")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.outputAstMod.WriteVarExpr, t1: js.Any) => visitWriteVarExpr(t0, t1).runNow()))
    __obj.asInstanceOf[ExpressionVisitor]
  }
}

