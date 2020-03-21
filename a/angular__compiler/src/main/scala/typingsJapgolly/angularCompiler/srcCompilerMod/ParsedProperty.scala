package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParsedProperty")
@js.native
class ParsedProperty protected ()
  extends typingsJapgolly.angularCompiler.astMod.ParsedProperty {
  def this(
    name: String,
    expression: typingsJapgolly.angularCompiler.astMod.ASTWithSource,
    `type`: typingsJapgolly.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    expression: typingsJapgolly.angularCompiler.astMod.ASTWithSource,
    `type`: typingsJapgolly.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

