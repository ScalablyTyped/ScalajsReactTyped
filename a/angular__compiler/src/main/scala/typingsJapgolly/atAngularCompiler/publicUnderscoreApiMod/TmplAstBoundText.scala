package typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod

import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected ()
  extends typingsJapgolly.atAngularCompiler.srcCompilerMod.TmplAstBoundText {
  def this(
    value: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

