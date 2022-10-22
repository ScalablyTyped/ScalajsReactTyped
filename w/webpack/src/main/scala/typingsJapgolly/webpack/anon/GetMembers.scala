package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpack.mod.ExportedVariableInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembers extends StObject {
  
  def getMembers(): js.Array[String]
  
  var name: String
  
  var rootInfo: ExportedVariableInfo
}
object GetMembers {
  
  inline def apply(getMembers: CallbackTo[js.Array[String]], name: String, rootInfo: ExportedVariableInfo): GetMembers = {
    val __obj = js.Dynamic.literal(getMembers = getMembers.toJsFn, name = name.asInstanceOf[js.Any], rootInfo = rootInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembers]
  }
  
  extension [Self <: GetMembers](x: Self) {
    
    inline def setGetMembers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getMembers", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRootInfo(value: ExportedVariableInfo): Self = StObject.set(x, "rootInfo", value.asInstanceOf[js.Any])
  }
}
