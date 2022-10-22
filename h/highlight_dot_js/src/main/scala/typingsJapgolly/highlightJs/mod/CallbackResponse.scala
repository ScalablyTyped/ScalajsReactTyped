package typingsJapgolly.highlightJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackResponse extends StObject {
  
  var data: Record[String, Any]
  
  def ignoreMatch(): Unit
  
  var isMatchIgnored: Boolean
}
object CallbackResponse {
  
  inline def apply(data: Record[String, Any], ignoreMatch: Callback, isMatchIgnored: Boolean): CallbackResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ignoreMatch = ignoreMatch.toJsFn, isMatchIgnored = isMatchIgnored.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackResponse]
  }
  
  extension [Self <: CallbackResponse](x: Self) {
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMatch(value: Callback): Self = StObject.set(x, "ignoreMatch", value.toJsFn)
    
    inline def setIsMatchIgnored(value: Boolean): Self = StObject.set(x, "isMatchIgnored", value.asInstanceOf[js.Any])
  }
}
