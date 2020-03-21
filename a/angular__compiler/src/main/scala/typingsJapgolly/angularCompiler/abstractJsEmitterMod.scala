package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.abstractEmitterMod.AbstractEmitterVisitor
import typingsJapgolly.angularCompiler.abstractEmitterMod.EmitterVisitorContext
import typingsJapgolly.angularCompiler.outputAstMod.CastExpr
import typingsJapgolly.angularCompiler.outputAstMod.DeclareFunctionStmt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_js_emitter", JSImport.Namespace)
@js.native
object abstractJsEmitterMod extends js.Object {
  @js.native
  abstract class AbstractJsEmitterVisitor () extends AbstractEmitterVisitor {
    var _visitClassConstructor: js.Any = js.native
    var _visitClassGetter: js.Any = js.native
    var _visitClassMethod: js.Any = js.native
    var _visitParams: js.Any = js.native
    def visitCastExpr(ast: CastExpr, ctx: EmitterVisitorContext): js.Any = js.native
    def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, ctx: EmitterVisitorContext): js.Any = js.native
  }
  
}

