package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueCompilerCore.mod.ElementNode
  - typingsJapgolly.vueCompilerCore.mod.InterpolationNode
  - typingsJapgolly.vueCompilerCore.mod.CompoundExpressionNode
  - typingsJapgolly.vueCompilerCore.mod.TextNode
  - typingsJapgolly.vueCompilerCore.mod.CommentNode
  - typingsJapgolly.vueCompilerCore.mod.IfNode
  - typingsJapgolly.vueCompilerCore.mod.IfBranchNode
  - typingsJapgolly.vueCompilerCore.mod.ForNode
  - typingsJapgolly.vueCompilerCore.mod.TextCallNode
*/
trait TemplateChildNode
  extends StObject
     with CodegenNode
object TemplateChildNode {
  
  inline def CommentNode(content: String, loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.CommentNode]
  }
  
  inline def ComponentNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typingsJapgolly.vueCompilerCore.mod.ComponentNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 1)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.ComponentNode]
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
  
  inline def ForNode(
    children: js.Array[TemplateChildNode],
    loc: SourceLocation,
    parseResult: ForParseResult,
    source: ExpressionNode
  ): typingsJapgolly.vueCompilerCore.mod.ForNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parseResult = parseResult.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(11)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.ForNode]
  }
  
  inline def IfBranchNode(children: js.Array[TemplateChildNode], loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(10)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.IfBranchNode]
  }
  
  inline def IfNode(branches: js.Array[IfBranchNode], loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.IfNode = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.IfNode]
  }
  
  inline def InterpolationNode(content: ExpressionNode, loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.InterpolationNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(5)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.InterpolationNode]
  }
  
  inline def PlainElementNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typingsJapgolly.vueCompilerCore.mod.PlainElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 0)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.PlainElementNode]
  }
  
  inline def SlotOutletNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typingsJapgolly.vueCompilerCore.mod.SlotOutletNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 2)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.SlotOutletNode]
  }
  
  inline def TemplateNode(
    children: js.Array[TemplateChildNode],
    codegenNode: Unit,
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typingsJapgolly.vueCompilerCore.mod.TemplateNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], codegenNode = codegenNode.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 3)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.TemplateNode]
  }
  
  inline def TextCallNode(
    codegenNode: CallExpression | SimpleExpressionNode,
    content: TextNode | InterpolationNode | CompoundExpressionNode,
    loc: SourceLocation
  ): typingsJapgolly.vueCompilerCore.mod.TextCallNode = {
    val __obj = js.Dynamic.literal(codegenNode = codegenNode.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(12)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.TextCallNode]
  }
  
  inline def TextNode(content: String, loc: SourceLocation): typingsJapgolly.vueCompilerCore.mod.TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.TextNode]
  }
}
