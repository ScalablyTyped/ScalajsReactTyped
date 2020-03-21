package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "WriteVarExpr")
@js.native
class WriteVarExpr protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.WriteVarExpr {
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

