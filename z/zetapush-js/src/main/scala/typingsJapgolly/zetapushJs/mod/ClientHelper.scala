package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientHelper extends StObject {
  
  def authentication(): AbstractHandshake
  @JSName("authentication")
  var authentication_Original: AuthenticationCallback
  
  def getUniqRequestId(): String
  
  var servers: js.Promise[js.Array[String]]
}
object ClientHelper {
  
  inline def apply(
    authentication: CallbackTo[AbstractHandshake],
    getUniqRequestId: CallbackTo[String],
    servers: js.Promise[js.Array[String]]
  ): ClientHelper = {
    val __obj = js.Dynamic.literal(authentication = authentication.toJsFn, getUniqRequestId = getUniqRequestId.toJsFn, servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHelper]
  }
  
  extension [Self <: ClientHelper](x: Self) {
    
    inline def setAuthentication(value: CallbackTo[AbstractHandshake]): Self = StObject.set(x, "authentication", value.toJsFn)
    
    inline def setGetUniqRequestId(value: CallbackTo[String]): Self = StObject.set(x, "getUniqRequestId", value.toJsFn)
    
    inline def setServers(value: js.Promise[js.Array[String]]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
  }
}
