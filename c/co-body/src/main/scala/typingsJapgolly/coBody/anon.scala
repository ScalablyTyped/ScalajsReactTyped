package typingsJapgolly.coBody

import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Req extends StObject {
    
    var req: IncomingMessage
  }
  object Req {
    
    inline def apply(req: IncomingMessage): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    extension [Self <: Req](x: Self) {
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
}
