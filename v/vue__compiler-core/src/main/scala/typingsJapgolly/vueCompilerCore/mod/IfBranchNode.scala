package typingsJapgolly.vueCompilerCore.mod

import typingsJapgolly.vueCompilerCore.vueCompilerCoreInts.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfBranchNode
  extends StObject
     with Node2
     with ParentNode2
     with TemplateChildNode {
  
  var children: js.Array[TemplateChildNode]
  
  var condition: js.UndefOr[ExpressionNode] = js.undefined
  
  var isTemplateIf: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_IfBranchNode: `10`
  
  var userKey: js.UndefOr[AttributeNode | DirectiveNode] = js.undefined
}
object IfBranchNode {
  
  inline def apply(children: js.Array[TemplateChildNode], loc: SourceLocation): IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(10)
    __obj.asInstanceOf[IfBranchNode]
  }
  
  extension [Self <: IfBranchNode](x: Self) {
    
    inline def setChildren(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCondition(value: ExpressionNode): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setIsTemplateIf(value: Boolean): Self = StObject.set(x, "isTemplateIf", value.asInstanceOf[js.Any])
    
    inline def setIsTemplateIfUndefined: Self = StObject.set(x, "isTemplateIf", js.undefined)
    
    inline def setType(value: `10`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserKey(value: AttributeNode | DirectiveNode): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
