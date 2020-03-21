package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typingsJapgolly.angularCompiler.outputAstMod.TryCatchStmt {
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

