package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseLocation")
@js.native
class ParseLocation protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ParseLocation {
  def this(
    file: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceFile,
    offset: Double,
    line: Double,
    col: Double
  ) = this()
}

