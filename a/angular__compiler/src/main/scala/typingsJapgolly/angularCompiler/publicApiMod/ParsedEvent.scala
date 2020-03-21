package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.astMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typingsJapgolly.angularCompiler.astMod.AST,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

