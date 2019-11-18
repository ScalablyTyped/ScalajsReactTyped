package typingsJapgolly.atAngularCompiler.srcCompilerMod

import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected ()
  extends typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: Null,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

