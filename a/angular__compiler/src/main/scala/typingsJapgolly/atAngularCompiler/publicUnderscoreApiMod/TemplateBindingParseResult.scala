package typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsJapgolly.atAngularCompiler.srcCompilerMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[
        typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.TemplateBinding
      ],
    warnings: js.Array[String],
    errors: js.Array[
        typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError
      ]
  ) = this()
}

