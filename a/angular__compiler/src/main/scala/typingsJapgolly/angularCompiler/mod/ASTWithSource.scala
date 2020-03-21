package typingsJapgolly.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.ASTWithSource {
  def this(
    ast: typingsJapgolly.angularCompiler.astMod.AST,
    source: String,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typingsJapgolly.angularCompiler.astMod.ParserError]
  ) = this()
  def this(
    ast: typingsJapgolly.angularCompiler.astMod.AST,
    source: Null,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typingsJapgolly.angularCompiler.astMod.ParserError]
  ) = this()
}

