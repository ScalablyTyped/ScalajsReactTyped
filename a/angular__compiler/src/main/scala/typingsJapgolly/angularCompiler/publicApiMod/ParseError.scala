package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseError")
@js.native
class ParseError protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ParseError {
  def this(span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String,
    level: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

