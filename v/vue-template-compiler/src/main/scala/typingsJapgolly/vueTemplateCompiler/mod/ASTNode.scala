package typingsJapgolly.vueTemplateCompiler.mod

import typingsJapgolly.std.Record
import typingsJapgolly.vueTemplateCompiler.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueTemplateCompiler.mod.ASTElement
  - typingsJapgolly.vueTemplateCompiler.mod.ASTText
  - typingsJapgolly.vueTemplateCompiler.mod.ASTExpression
*/
trait ASTNode extends StObject
object ASTNode {
  
  inline def ASTElement(attrsList: js.Array[Name], attrsMap: Record[String, Any], children: js.Array[ASTNode], tag: String): typingsJapgolly.vueTemplateCompiler.mod.ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typingsJapgolly.vueTemplateCompiler.mod.ASTElement]
  }
  
  inline def ASTExpression(expression: String, text: String, tokens: js.Array[String | (Record[String, Any])]): typingsJapgolly.vueTemplateCompiler.mod.ASTExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[typingsJapgolly.vueTemplateCompiler.mod.ASTExpression]
  }
  
  inline def ASTText(text: String): typingsJapgolly.vueTemplateCompiler.mod.ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[typingsJapgolly.vueTemplateCompiler.mod.ASTText]
  }
}
