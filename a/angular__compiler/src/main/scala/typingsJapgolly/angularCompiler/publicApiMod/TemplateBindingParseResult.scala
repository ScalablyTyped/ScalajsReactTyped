package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typingsJapgolly.angularCompiler.astMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typingsJapgolly.angularCompiler.astMod.ParserError]
  ) = this()
}

