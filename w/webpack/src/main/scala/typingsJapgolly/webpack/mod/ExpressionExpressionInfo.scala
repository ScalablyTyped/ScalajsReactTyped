package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpack.webpackStrings.expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionExpressionInfo extends StObject {
  
  def getMembers(): js.Array[String]
  
  def getMembersOptionals(): js.Array[Boolean]
  
  var name: String
  
  var rootInfo: String | VariableInfo
  
  var `type`: expression
}
object ExpressionExpressionInfo {
  
  inline def apply(
    getMembers: CallbackTo[js.Array[String]],
    getMembersOptionals: CallbackTo[js.Array[Boolean]],
    name: String,
    rootInfo: String | VariableInfo
  ): ExpressionExpressionInfo = {
    val __obj = js.Dynamic.literal(getMembers = getMembers.toJsFn, getMembersOptionals = getMembersOptionals.toJsFn, name = name.asInstanceOf[js.Any], rootInfo = rootInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expression")
    __obj.asInstanceOf[ExpressionExpressionInfo]
  }
  
  extension [Self <: ExpressionExpressionInfo](x: Self) {
    
    inline def setGetMembers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getMembers", value.toJsFn)
    
    inline def setGetMembersOptionals(value: CallbackTo[js.Array[Boolean]]): Self = StObject.set(x, "getMembersOptionals", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRootInfo(value: String | VariableInfo): Self = StObject.set(x, "rootInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
