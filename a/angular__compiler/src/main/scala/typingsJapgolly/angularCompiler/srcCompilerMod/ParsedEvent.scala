package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.astMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typingsJapgolly.angularCompiler.astMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typingsJapgolly.angularCompiler.astMod.AST,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

