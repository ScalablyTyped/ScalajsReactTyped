package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "LiteralArrayExpr")
@js.native
class LiteralArrayExpr protected ()
  extends typingsJapgolly.angularCompiler.outputAstMod.LiteralArrayExpr {
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

