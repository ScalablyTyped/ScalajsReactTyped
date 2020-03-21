package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.angularCompilerStrings.ngPreserveWhitespaces
import typingsJapgolly.angularCompiler.mlParserAstMod.Attribute
import typingsJapgolly.angularCompiler.mlParserAstMod.Comment
import typingsJapgolly.angularCompiler.mlParserAstMod.Element
import typingsJapgolly.angularCompiler.mlParserAstMod.Expansion
import typingsJapgolly.angularCompiler.mlParserAstMod.ExpansionCase
import typingsJapgolly.angularCompiler.mlParserAstMod.Text
import typingsJapgolly.angularCompiler.mlParserAstMod.Visitor
import typingsJapgolly.angularCompiler.mlParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_whitespaces", JSImport.Namespace)
@js.native
object htmlWhitespacesMod extends js.Object {
  @js.native
  class WhitespaceVisitor () extends Visitor {
    /* CompleteClass */
    override def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitComment(comment: Comment, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitElement(element: Element, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitText(text: Text, context: js.Any): js.Any = js.native
  }
  
  val PRESERVE_WS_ATTR_NAME: ngPreserveWhitespaces = js.native
  def removeWhitespaces(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
  def replaceNgsp(value: String): String = js.native
}

