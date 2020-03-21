package typingsJapgolly.angularCompiler.templateAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "EmbeddedTemplateAst")
@js.native
class EmbeddedTemplateAst protected () extends TemplateAst {
  def this(
    attrs: js.Array[AttrAst],
    outputs: js.Array[BoundEventAst],
    references: js.Array[ReferenceAst],
    variables: js.Array[VariableAst],
    directives: js.Array[DirectiveAst],
    providers: js.Array[ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: ParseSourceSpan
  ) = this()
  var attrs: js.Array[AttrAst] = js.native
  var children: js.Array[TemplateAst] = js.native
  var directives: js.Array[DirectiveAst] = js.native
  var hasViewContainer: Boolean = js.native
  var ngContentIndex: Double = js.native
  var outputs: js.Array[BoundEventAst] = js.native
  var providers: js.Array[ProviderAst] = js.native
  var queryMatches: js.Array[QueryMatch] = js.native
  var references: js.Array[ReferenceAst] = js.native
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var variables: js.Array[VariableAst] = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

