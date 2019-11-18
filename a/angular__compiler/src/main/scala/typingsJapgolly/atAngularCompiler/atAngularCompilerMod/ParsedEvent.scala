package typingsJapgolly.atAngularCompiler.atAngularCompilerMod

import typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

