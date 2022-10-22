package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueCompilerCore.mod.VNodeCall
  - typingsJapgolly.vueCompilerCore.mod.CallExpression
  - typingsJapgolly.vueCompilerCore.mod.ObjectExpression
  - typingsJapgolly.vueCompilerCore.mod.ArrayExpression
  - typingsJapgolly.vueCompilerCore.mod.ExpressionNode
  - typingsJapgolly.vueCompilerCore.mod.FunctionExpression
  - typingsJapgolly.vueCompilerCore.mod.ConditionalExpression
  - typingsJapgolly.vueCompilerCore.mod.CacheExpression
  - typingsJapgolly.vueCompilerCore.mod.AssignmentExpression
  - typingsJapgolly.vueCompilerCore.mod.SequenceExpression
*/
trait JSChildNode
  extends StObject
     with CodegenNode
object JSChildNode {
  
  inline def ArrayExpression(elements: js.Array[String | Node2], loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.ArrayExpression]
  }
  
  inline def AssignmentExpression(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode): typingsJapgolly.vueCompilerCore.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(24)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.AssignmentExpression]
  }
  
  inline def CacheExpression(index: Double, isVNode: Boolean, loc: SourceLocation, value: JSChildNode): typingsJapgolly.vueCompilerCore.mod.CacheExpression = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isVNode = isVNode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(20)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.CacheExpression]
  }
  
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
  
  inline def ConditionalExpression(
    alternate: JSChildNode,
    consequent: JSChildNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode
  ): typingsJapgolly.vueCompilerCore.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(19)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.ConditionalExpression]
  }
  
  inline def FunctionExpression(isSlot: Boolean, loc: SourceLocation, newline: Boolean): typingsJapgolly.vueCompilerCore.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(18)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.FunctionExpression]
  }
  
  inline def ObjectExpression(loc: SourceLocation, properties: js.Array[Property]): typingsJapgolly.vueCompilerCore.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.ObjectExpression]
  }
  
  inline def SequenceExpression(expressions: js.Array[JSChildNode], loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(25)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.SequenceExpression]
  }
  
  inline def SimpleExpressionNode(constType: ConstantTypes, content: String, isStatic: Boolean, loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(constType = constType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.SimpleExpressionNode]
  }
  
  inline def VNodeCall(
    disableTracking: Boolean,
    isBlock: Boolean,
    isComponent: Boolean,
    loc: SourceLocation,
    tag: String | js.Symbol | CallExpression
  ): typingsJapgolly.vueCompilerCore.mod.VNodeCall = {
    val __obj = js.Dynamic.literal(disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(13)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.VNodeCall]
  }
}
