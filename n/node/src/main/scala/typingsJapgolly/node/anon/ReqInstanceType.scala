package typingsJapgolly.node.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReqInstanceType[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */] extends StObject {
  
  var req: InstanceType[Request]
}
object ReqInstanceType {
  
  inline def apply[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */](req: InstanceType[Request]): ReqInstanceType[Request] = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqInstanceType[Request]]
  }
  
  extension [Self <: ReqInstanceType[?], Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */](x: Self & ReqInstanceType[Request]) {
    
    inline def setReq(value: InstanceType[Request]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
