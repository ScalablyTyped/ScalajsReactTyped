package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Expansion")
@js.native
class Expansion protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.Expansion {
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

