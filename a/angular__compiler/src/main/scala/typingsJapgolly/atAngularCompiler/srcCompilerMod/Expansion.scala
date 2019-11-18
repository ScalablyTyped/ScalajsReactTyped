package typingsJapgolly.atAngularCompiler.srcCompilerMod

import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Expansion")
@js.native
class Expansion protected ()
  extends typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Expansion {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

