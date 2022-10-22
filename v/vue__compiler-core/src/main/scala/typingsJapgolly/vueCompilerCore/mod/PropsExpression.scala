package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueCompilerCore.mod.ObjectExpression
  - typingsJapgolly.vueCompilerCore.mod.CallExpression
  - typingsJapgolly.vueCompilerCore.mod.ExpressionNode
*/
trait PropsExpression extends StObject
object PropsExpression {
  
  inline def CallExpression(
    arguments: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    callee: String | js.Symbol,
    loc: SourceLocation
  ): typingsJapgolly.vueCompilerCore.mod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.CallExpression]
  }
  
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
  
  inline def ObjectExpression(loc: SourceLocation, properties: js.Array[Property]): typingsJapgolly.vueCompilerCore.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.ObjectExpression]
  }
  
  inline def SimpleExpressionNode(constType: ConstantTypes, content: String, isStatic: Boolean, loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(constType = constType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.SimpleExpressionNode]
  }
}
