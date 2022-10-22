package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpack.webpackStrings.call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpressionInfo extends StObject {
  
  var call: CallExpression
  
  var calleeName: String
  
  def getCalleeMembers(): js.Array[String]
  
  def getMembers(): js.Array[String]
  
  def getMembersOptionals(): js.Array[Boolean]
  
  var name: String
  
  var rootInfo: String | VariableInfo
  
  var `type`: call
}
object CallExpressionInfo {
  
  inline def apply(
    call: CallExpression,
    calleeName: String,
    getCalleeMembers: CallbackTo[js.Array[String]],
    getMembers: CallbackTo[js.Array[String]],
    getMembersOptionals: CallbackTo[js.Array[Boolean]],
    name: String,
    rootInfo: String | VariableInfo
  ): CallExpressionInfo = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], calleeName = calleeName.asInstanceOf[js.Any], getCalleeMembers = getCalleeMembers.toJsFn, getMembers = getMembers.toJsFn, getMembersOptionals = getMembersOptionals.toJsFn, name = name.asInstanceOf[js.Any], rootInfo = rootInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("call")
    __obj.asInstanceOf[CallExpressionInfo]
  }
  
  extension [Self <: CallExpressionInfo](x: Self) {
    
    inline def setCall(value: CallExpression): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCalleeName(value: String): Self = StObject.set(x, "calleeName", value.asInstanceOf[js.Any])
    
    inline def setGetCalleeMembers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getCalleeMembers", value.toJsFn)
    
    inline def setGetMembers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getMembers", value.toJsFn)
    
    inline def setGetMembersOptionals(value: CallbackTo[js.Array[Boolean]]): Self = StObject.set(x, "getMembersOptionals", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRootInfo(value: String | VariableInfo): Self = StObject.set(x, "rootInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: call): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
