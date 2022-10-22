package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueCompilerCore.mod.TextNode
  - typingsJapgolly.vueCompilerCore.mod.InterpolationNode
  - typingsJapgolly.vueCompilerCore.mod.CompoundExpressionNode
*/
trait TemplateTextChildNode extends StObject
object TemplateTextChildNode {
  
  inline def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typingsJapgolly.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): typingsJapgolly.vueCompilerCore.mod.CompoundExpressionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.CompoundExpressionNode]
  }
  
  inline def InterpolationNode(content: ExpressionNode, loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.InterpolationNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(5)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.InterpolationNode]
  }
  
  inline def TextNode(content: String, loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.TextNode]
  }
}
