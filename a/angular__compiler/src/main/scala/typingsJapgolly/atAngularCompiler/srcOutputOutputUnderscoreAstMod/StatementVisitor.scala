package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatementVisitor extends js.Object {
  def visitCommentStmt(stmt: CommentStmt, context: js.Any): js.Any
  def visitDeclareClassStmt(stmt: ClassStmt, context: js.Any): js.Any
  def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: js.Any): js.Any
  def visitDeclareVarStmt(stmt: DeclareVarStmt, context: js.Any): js.Any
  def visitExpressionStmt(stmt: ExpressionStatement, context: js.Any): js.Any
  def visitIfStmt(stmt: IfStmt, context: js.Any): js.Any
  def visitJSDocCommentStmt(stmt: JSDocCommentStmt, context: js.Any): js.Any
  def visitReturnStmt(stmt: ReturnStatement, context: js.Any): js.Any
  def visitThrowStmt(stmt: ThrowStmt, context: js.Any): js.Any
  def visitTryCatchStmt(stmt: TryCatchStmt, context: js.Any): js.Any
}

object StatementVisitor {
  @scala.inline
  def apply(
    visitCommentStmt: (CommentStmt, js.Any) => CallbackTo[js.Any],
    visitDeclareClassStmt: (ClassStmt, js.Any) => CallbackTo[js.Any],
    visitDeclareFunctionStmt: (DeclareFunctionStmt, js.Any) => CallbackTo[js.Any],
    visitDeclareVarStmt: (DeclareVarStmt, js.Any) => CallbackTo[js.Any],
    visitExpressionStmt: (ExpressionStatement, js.Any) => CallbackTo[js.Any],
    visitIfStmt: (IfStmt, js.Any) => CallbackTo[js.Any],
    visitJSDocCommentStmt: (JSDocCommentStmt, js.Any) => CallbackTo[js.Any],
    visitReturnStmt: (ReturnStatement, js.Any) => CallbackTo[js.Any],
    visitThrowStmt: (ThrowStmt, js.Any) => CallbackTo[js.Any],
    visitTryCatchStmt: (TryCatchStmt, js.Any) => CallbackTo[js.Any]
  ): StatementVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitCommentStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.CommentStmt, t1: js.Any) => visitCommentStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitDeclareClassStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ClassStmt, t1: js.Any) => visitDeclareClassStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitDeclareFunctionStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.DeclareFunctionStmt, t1: js.Any) => visitDeclareFunctionStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitDeclareVarStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.DeclareVarStmt, t1: js.Any) => visitDeclareVarStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitExpressionStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExpressionStatement, t1: js.Any) => visitExpressionStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitIfStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.IfStmt, t1: js.Any) => visitIfStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitJSDocCommentStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.JSDocCommentStmt, t1: js.Any) => visitJSDocCommentStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitReturnStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReturnStatement, t1: js.Any) => visitReturnStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitThrowStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ThrowStmt, t1: js.Any) => visitThrowStmt(t0, t1).runNow()))
    __obj.updateDynamic("visitTryCatchStmt")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.TryCatchStmt, t1: js.Any) => visitTryCatchStmt(t0, t1).runNow()))
    __obj.asInstanceOf[StatementVisitor]
  }
}

