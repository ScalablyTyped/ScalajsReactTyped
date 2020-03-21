package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.templateAstMod.QueryMatch
import typingsJapgolly.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "EmbeddedTemplateAst")
@js.native
class EmbeddedTemplateAst protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.EmbeddedTemplateAst {
  def this(
    attrs: js.Array[typingsJapgolly.angularCompiler.templateAstMod.AttrAst],
    outputs: js.Array[typingsJapgolly.angularCompiler.templateAstMod.BoundEventAst],
    references: js.Array[typingsJapgolly.angularCompiler.templateAstMod.ReferenceAst],
    variables: js.Array[typingsJapgolly.angularCompiler.templateAstMod.VariableAst],
    directives: js.Array[typingsJapgolly.angularCompiler.templateAstMod.DirectiveAst],
    providers: js.Array[typingsJapgolly.angularCompiler.templateAstMod.ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

