package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "WriteVarExpr")
@js.native
class WriteVarExpr protected ()
  extends typingsJapgolly.angularCompiler.outputAstMod.WriteVarExpr {
  def this(name: String, value: typingsJapgolly.angularCompiler.outputAstMod.Expression) = this()
  def this(
    name: String,
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    name: String,
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    `type`: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

