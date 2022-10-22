package typingsJapgolly.vueCompilerCore.mod

import typingsJapgolly.vueCompilerCore.vueCompilerCoreStrings.LeftcurlybracketRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueCompilerCore.mod.VNodeCall
  - typingsJapgolly.vueCompilerCore.mod.RenderSlotCall
*/
trait BlockCodegenNode extends StObject
object BlockCodegenNode {
  
  inline def RenderSlotCall(
    arguments: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
      String, 
      String | ExpressionNode, 
      PropsExpression | LeftcurlybracketRightcurlybracket, 
      js.Array[TemplateChildNode]
    ]),
    callee: js.Symbol,
    loc: SourceLocation
  ): typingsJapgolly.vueCompilerCore.mod.RenderSlotCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.RenderSlotCall]
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
