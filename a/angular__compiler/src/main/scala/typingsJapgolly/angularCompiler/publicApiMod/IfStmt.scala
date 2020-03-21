package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "IfStmt")
@js.native
class IfStmt protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.IfStmt {
  def this(
    condition: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

