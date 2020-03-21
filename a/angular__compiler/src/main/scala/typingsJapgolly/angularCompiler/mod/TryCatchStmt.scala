package typingsJapgolly.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.TryCatchStmt {
  def this(
    bodyStmts: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    bodyStmts: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

