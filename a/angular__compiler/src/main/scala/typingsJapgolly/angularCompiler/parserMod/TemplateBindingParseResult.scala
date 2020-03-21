package typingsJapgolly.angularCompiler.parserMod

import typingsJapgolly.angularCompiler.astMod.ParserError
import typingsJapgolly.angularCompiler.astMod.TemplateBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/parser", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected () extends js.Object {
  def this(
    templateBindings: js.Array[TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[ParserError]
  ) = this()
  var errors: js.Array[ParserError] = js.native
  var templateBindings: js.Array[TemplateBinding] = js.native
  var warnings: js.Array[String] = js.native
}

