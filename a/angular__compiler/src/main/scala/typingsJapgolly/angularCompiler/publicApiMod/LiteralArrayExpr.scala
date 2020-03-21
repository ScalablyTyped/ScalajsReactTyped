package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "LiteralArrayExpr")
@js.native
class LiteralArrayExpr protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.LiteralArrayExpr {
  def this(entries: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Expression]) = this()
  def this(
    entries: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Expression],
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    entries: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Expression],
    `type`: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Expression],
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

