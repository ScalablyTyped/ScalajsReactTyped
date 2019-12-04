package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.atAngularCompilerStrings.ngPreserveWhitespaces
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Attribute
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Comment
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Element
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Expansion
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Text
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Visitor
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_whitespaces", JSImport.Namespace)
@js.native
object srcMlUnderscoreParserHtmlUnderscoreWhitespacesMod extends js.Object {
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

