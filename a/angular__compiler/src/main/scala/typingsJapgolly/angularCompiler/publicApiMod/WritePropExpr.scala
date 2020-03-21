package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "WritePropExpr")
@js.native
class WritePropExpr protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.WritePropExpr {
  def this(
    receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression
  ) = this()
  def this(
    receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    `type`: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

