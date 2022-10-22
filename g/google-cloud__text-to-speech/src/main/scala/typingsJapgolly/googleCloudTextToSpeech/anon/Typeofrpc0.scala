package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleGax.mod.protobuf.rpc.Service
import typingsJapgolly.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofrpc0 extends StObject {
  
  /** An RPC service as returned by {@link Service#create}. */
  var Service: Instantiable1[/* rpcImpl */ RPCImpl, typingsJapgolly.googleGax.mod.protobuf.rpc.Service]
}
object Typeofrpc0 {
  
  inline def apply(Service: Instantiable1[/* rpcImpl */ RPCImpl, Service]): Typeofrpc0 = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofrpc0]
  }
  
  extension [Self <: Typeofrpc0](x: Self) {
    
    inline def setService(value: Instantiable1[/* rpcImpl */ RPCImpl, Service]): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
