package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Expansion")
@js.native
class Expansion protected ()
  extends typingsJapgolly.angularCompiler.mlParserAstMod.Expansion {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsJapgolly.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsJapgolly.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsJapgolly.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

