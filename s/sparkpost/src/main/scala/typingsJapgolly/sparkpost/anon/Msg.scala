package typingsJapgolly.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msg extends StObject {
  
  var msg: String
  
  var response: Body
}
object Msg {
  
  inline def apply(msg: String, response: Body): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  
  extension [Self <: Msg](x: Self) {
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Body): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
