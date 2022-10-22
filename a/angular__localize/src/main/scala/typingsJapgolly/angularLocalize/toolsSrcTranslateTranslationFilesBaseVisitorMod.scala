package typingsJapgolly.angularLocalize

import typingsJapgolly.angularCompiler.mod.Attribute
import typingsJapgolly.angularCompiler.mod.Comment
import typingsJapgolly.angularCompiler.mod.Comment2
import typingsJapgolly.angularCompiler.mod.Element
import typingsJapgolly.angularCompiler.mod.Element2
import typingsJapgolly.angularCompiler.mod.Expansion
import typingsJapgolly.angularCompiler.mod.ExpansionCase
import typingsJapgolly.angularCompiler.mod.Text
import typingsJapgolly.angularCompiler.mod.Text2
import typingsJapgolly.angularCompiler.mod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesBaseVisitorMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/base_visitor", "BaseVisitor")
  @js.native
  open class BaseVisitor ()
    extends StObject
       with Visitor {
    
    /* CompleteClass */
    override def visitAttribute(attribute: Attribute, context: Any): Any = js.native
    
    def visitComment(_comment: Comment, _context: Any): Any = js.native
    /* CompleteClass */
    override def visitComment(comment: Comment2, context: Any): Any = js.native
    
    def visitElement(_element: Element, _context: Any): Any = js.native
    /* CompleteClass */
    override def visitElement(element: Element2, context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitExpansion(expansion: Expansion, context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitExpansionCase(expansionCase: ExpansionCase, context: Any): Any = js.native
    
    def visitText(_text: Text, _context: Any): Any = js.native
    /* CompleteClass */
    override def visitText(text: Text2, context: Any): Any = js.native
  }
}
