package typingsJapgolly.chainsafeLibp2pGossipsub.anon

import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var msg: IMessage
}
object Count {
  
  inline def apply(count: Double, msg: IMessage): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: IMessage): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
