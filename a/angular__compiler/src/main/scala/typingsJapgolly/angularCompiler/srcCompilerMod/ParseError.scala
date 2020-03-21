package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParseError")
@js.native
class ParseError protected ()
  extends typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError {
  def this(span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String,
    level: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

