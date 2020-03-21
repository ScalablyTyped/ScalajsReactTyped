package typingsJapgolly.angularCompiler.astMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AstVisitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* ast */ AST, /* context */ js.UndefOr[js.Any], _]] = js.undefined
  var visitASTWithSource: js.UndefOr[js.Function2[/* ast */ ASTWithSource, /* context */ js.Any, _]] = js.undefined
  def visitBinary(ast: Binary, context: js.Any): js.Any
  def visitChain(ast: Chain, context: js.Any): js.Any
  def visitConditional(ast: Conditional, context: js.Any): js.Any
  def visitFunctionCall(ast: FunctionCall, context: js.Any): js.Any
  def visitImplicitReceiver(ast: ImplicitReceiver, context: js.Any): js.Any
  def visitInterpolation(ast: Interpolation, context: js.Any): js.Any
  def visitKeyedRead(ast: KeyedRead, context: js.Any): js.Any
  def visitKeyedWrite(ast: KeyedWrite, context: js.Any): js.Any
  def visitLiteralArray(ast: LiteralArray, context: js.Any): js.Any
  def visitLiteralMap(ast: LiteralMap, context: js.Any): js.Any
  def visitLiteralPrimitive(ast: LiteralPrimitive, context: js.Any): js.Any
  def visitMethodCall(ast: MethodCall, context: js.Any): js.Any
  def visitNonNullAssert(ast: NonNullAssert, context: js.Any): js.Any
  def visitPipe(ast: BindingPipe, context: js.Any): js.Any
  def visitPrefixNot(ast: PrefixNot, context: js.Any): js.Any
  def visitPropertyRead(ast: PropertyRead, context: js.Any): js.Any
  def visitPropertyWrite(ast: PropertyWrite, context: js.Any): js.Any
  def visitQuote(ast: Quote, context: js.Any): js.Any
  def visitSafeMethodCall(ast: SafeMethodCall, context: js.Any): js.Any
  def visitSafePropertyRead(ast: SafePropertyRead, context: js.Any): js.Any
}

object AstVisitor {
  @scala.inline
  def apply(
    visitBinary: (Binary, js.Any) => CallbackTo[js.Any],
    visitChain: (Chain, js.Any) => CallbackTo[js.Any],
    visitConditional: (Conditional, js.Any) => CallbackTo[js.Any],
    visitFunctionCall: (FunctionCall, js.Any) => CallbackTo[js.Any],
    visitImplicitReceiver: (ImplicitReceiver, js.Any) => CallbackTo[js.Any],
    visitInterpolation: (Interpolation, js.Any) => CallbackTo[js.Any],
    visitKeyedRead: (KeyedRead, js.Any) => CallbackTo[js.Any],
    visitKeyedWrite: (KeyedWrite, js.Any) => CallbackTo[js.Any],
    visitLiteralArray: (LiteralArray, js.Any) => CallbackTo[js.Any],
    visitLiteralMap: (LiteralMap, js.Any) => CallbackTo[js.Any],
    visitLiteralPrimitive: (LiteralPrimitive, js.Any) => CallbackTo[js.Any],
    visitMethodCall: (MethodCall, js.Any) => CallbackTo[js.Any],
    visitNonNullAssert: (NonNullAssert, js.Any) => CallbackTo[js.Any],
    visitPipe: (BindingPipe, js.Any) => CallbackTo[js.Any],
    visitPrefixNot: (PrefixNot, js.Any) => CallbackTo[js.Any],
    visitPropertyRead: (PropertyRead, js.Any) => CallbackTo[js.Any],
    visitPropertyWrite: (PropertyWrite, js.Any) => CallbackTo[js.Any],
    visitQuote: (Quote, js.Any) => CallbackTo[js.Any],
    visitSafeMethodCall: (SafeMethodCall, js.Any) => CallbackTo[js.Any],
    visitSafePropertyRead: (SafePropertyRead, js.Any) => CallbackTo[js.Any],
    visit: (/* ast */ AST, /* context */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    visitASTWithSource: (/* ast */ ASTWithSource, /* context */ js.Any) => CallbackTo[js.Any] = null
  ): AstVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitBinary")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.Binary, t1: js.Any) => visitBinary(t0, t1).runNow()))
    __obj.updateDynamic("visitChain")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.Chain, t1: js.Any) => visitChain(t0, t1).runNow()))
    __obj.updateDynamic("visitConditional")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.Conditional, t1: js.Any) => visitConditional(t0, t1).runNow()))
    __obj.updateDynamic("visitFunctionCall")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.FunctionCall, t1: js.Any) => visitFunctionCall(t0, t1).runNow()))
    __obj.updateDynamic("visitImplicitReceiver")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.ImplicitReceiver, t1: js.Any) => visitImplicitReceiver(t0, t1).runNow()))
    __obj.updateDynamic("visitInterpolation")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.Interpolation, t1: js.Any) => visitInterpolation(t0, t1).runNow()))
    __obj.updateDynamic("visitKeyedRead")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.KeyedRead, t1: js.Any) => visitKeyedRead(t0, t1).runNow()))
    __obj.updateDynamic("visitKeyedWrite")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.KeyedWrite, t1: js.Any) => visitKeyedWrite(t0, t1).runNow()))
    __obj.updateDynamic("visitLiteralArray")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.LiteralArray, t1: js.Any) => visitLiteralArray(t0, t1).runNow()))
    __obj.updateDynamic("visitLiteralMap")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.LiteralMap, t1: js.Any) => visitLiteralMap(t0, t1).runNow()))
    __obj.updateDynamic("visitLiteralPrimitive")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.LiteralPrimitive, t1: js.Any) => visitLiteralPrimitive(t0, t1).runNow()))
    __obj.updateDynamic("visitMethodCall")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.MethodCall, t1: js.Any) => visitMethodCall(t0, t1).runNow()))
    __obj.updateDynamic("visitNonNullAssert")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.NonNullAssert, t1: js.Any) => visitNonNullAssert(t0, t1).runNow()))
    __obj.updateDynamic("visitPipe")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.BindingPipe, t1: js.Any) => visitPipe(t0, t1).runNow()))
    __obj.updateDynamic("visitPrefixNot")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.PrefixNot, t1: js.Any) => visitPrefixNot(t0, t1).runNow()))
    __obj.updateDynamic("visitPropertyRead")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.PropertyRead, t1: js.Any) => visitPropertyRead(t0, t1).runNow()))
    __obj.updateDynamic("visitPropertyWrite")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.PropertyWrite, t1: js.Any) => visitPropertyWrite(t0, t1).runNow()))
    __obj.updateDynamic("visitQuote")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.Quote, t1: js.Any) => visitQuote(t0, t1).runNow()))
    __obj.updateDynamic("visitSafeMethodCall")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.SafeMethodCall, t1: js.Any) => visitSafeMethodCall(t0, t1).runNow()))
    __obj.updateDynamic("visitSafePropertyRead")(js.Any.fromFunction2((t0: typingsJapgolly.angularCompiler.astMod.SafePropertyRead, t1: js.Any) => visitSafePropertyRead(t0, t1).runNow()))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: /* ast */ typingsJapgolly.angularCompiler.astMod.AST, t1: /* context */ js.UndefOr[js.Any]) => visit(t0, t1).runNow()))
    if (visitASTWithSource != null) __obj.updateDynamic("visitASTWithSource")(js.Any.fromFunction2((t0: /* ast */ typingsJapgolly.angularCompiler.astMod.ASTWithSource, t1: /* context */ js.Any) => visitASTWithSource(t0, t1).runNow()))
    __obj.asInstanceOf[AstVisitor]
  }
}

