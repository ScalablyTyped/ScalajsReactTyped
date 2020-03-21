package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.astMod.ParsedEventType
import typingsJapgolly.angularCompiler.r3AstMod.BoundEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.TmplAstBoundEvent {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsJapgolly.angularCompiler.astMod.AST,
    target: String,
    phase: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsJapgolly.angularCompiler.astMod.AST,
    target: String,
    phase: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsJapgolly.angularCompiler.astMod.AST,
    target: Null,
    phase: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsJapgolly.angularCompiler.astMod.AST,
    target: Null,
    phase: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "TmplAstBoundEvent")
@js.native
object TmplAstBoundEvent extends js.Object {
  def fromParsedEvent(event: typingsJapgolly.angularCompiler.astMod.ParsedEvent): BoundEvent = js.native
}

