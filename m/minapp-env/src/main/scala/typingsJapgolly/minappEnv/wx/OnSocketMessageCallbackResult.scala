package typingsJapgolly.minappEnv.wx

import typingsJapgolly.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSocketMessageCallbackResult extends StObject {
  
  /** 服务器返回的消息 */
  var data: String | ArrayBuffer
}
object OnSocketMessageCallbackResult {
  
  inline def apply(data: String | ArrayBuffer): OnSocketMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSocketMessageCallbackResult]
  }
  
  extension [Self <: OnSocketMessageCallbackResult](x: Self) {
    
    inline def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
