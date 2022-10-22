package typingsJapgolly.hapiHapi.anon

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Req extends StObject {
  
  var req: IncomingMessage
  
  var res: ServerResponse[IncomingMessage]
}
object Req {
  
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  extension [Self <: Req](x: Self) {
    
    inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
