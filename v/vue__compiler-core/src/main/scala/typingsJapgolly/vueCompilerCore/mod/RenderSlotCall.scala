package typingsJapgolly.vueCompilerCore.mod

import typingsJapgolly.vueCompilerCore.vueCompilerCoreStrings.LeftcurlybracketRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSlotCall
  extends StObject
     with CallExpression
     with BlockCodegenNode {
  
  @JSName("arguments")
  var arguments_RenderSlotCall: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
    String, 
    String | ExpressionNode, 
    PropsExpression | LeftcurlybracketRightcurlybracket, 
    js.Array[TemplateChildNode]
  ])
  
  @JSName("callee")
  var callee_RenderSlotCall: js.Symbol
}
object RenderSlotCall {
  
  inline def apply(
    arguments: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
      String, 
      String | ExpressionNode, 
      PropsExpression | LeftcurlybracketRightcurlybracket, 
      js.Array[TemplateChildNode]
    ]),
    callee: js.Symbol,
    loc: SourceLocation
  ): RenderSlotCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[RenderSlotCall]
  }
  
  extension [Self <: RenderSlotCall](x: Self) {
    
    inline def setArguments(
      value: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
          String, 
          String | ExpressionNode, 
          PropsExpression | LeftcurlybracketRightcurlybracket, 
          js.Array[TemplateChildNode]
        ])
    ): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
