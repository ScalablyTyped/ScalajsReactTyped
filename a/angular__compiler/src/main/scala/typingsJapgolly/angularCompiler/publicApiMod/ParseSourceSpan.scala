package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseSourceSpan")
@js.native
class ParseSourceSpan protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ParseSourceSpan {
  def this(
    start: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseLocation
  ) = this()
  def this(
    start: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseLocation,
    details: String
  ) = this()
}

