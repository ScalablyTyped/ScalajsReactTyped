package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.TryCatchStmt {
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

