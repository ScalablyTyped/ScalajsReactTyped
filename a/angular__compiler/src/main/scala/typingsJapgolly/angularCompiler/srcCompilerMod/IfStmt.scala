package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.outputAstMod.IfStmt_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "IfStmt")
@js.native
class IfStmt protected () extends IfStmt_ {
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

