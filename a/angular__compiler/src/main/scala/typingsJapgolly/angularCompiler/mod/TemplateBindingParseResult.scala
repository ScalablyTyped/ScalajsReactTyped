package typingsJapgolly.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typingsJapgolly.angularCompiler.astMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typingsJapgolly.angularCompiler.astMod.ParserError]
  ) = this()
}

