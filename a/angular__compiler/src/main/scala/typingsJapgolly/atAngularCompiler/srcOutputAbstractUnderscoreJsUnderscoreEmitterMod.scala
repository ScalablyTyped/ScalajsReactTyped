package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.AbstractEmitterVisitor
import typingsJapgolly.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.CastExpr
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.DeclareFunctionStmt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_js_emitter", JSImport.Namespace)
@js.native
object srcOutputAbstractUnderscoreJsUnderscoreEmitterMod extends js.Object {
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

