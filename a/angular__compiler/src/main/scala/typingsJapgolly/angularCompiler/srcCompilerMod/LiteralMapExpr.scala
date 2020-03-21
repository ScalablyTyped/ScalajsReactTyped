package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.outputAstMod.LiteralMapEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected ()
  extends typingsJapgolly.angularCompiler.outputAstMod.LiteralMapExpr {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: typingsJapgolly.angularCompiler.outputAstMod.MapType) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: typingsJapgolly.angularCompiler.outputAstMod.MapType,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

