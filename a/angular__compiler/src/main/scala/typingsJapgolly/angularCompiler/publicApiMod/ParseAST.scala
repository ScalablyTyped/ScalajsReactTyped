package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "_ParseAST")
@js.native
class ParseAST protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ParseAST {
  def this(
    input: String,
    location: js.Any,
    absoluteOffset: Double,
    tokens: js.Array[typingsJapgolly.angularCompiler.lexerMod.Token],
    inputLength: Double,
    parseAction: Boolean,
    errors: js.Array[typingsJapgolly.angularCompiler.astMod.ParserError],
    offset: Double
  ) = this()
}

