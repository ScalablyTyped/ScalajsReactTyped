package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typingsJapgolly.relayRuntime.relayRuntimeStrings.networkDotunsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'network.unsubscribe',   networkRequestId :number}> */
trait Readonlynamenetworkunsubs
  extends StObject
     with LogEvent {
  
  val name: networkDotunsubscribe
  
  val networkRequestId: Double
}
object Readonlynamenetworkunsubs {
  
  inline def apply(networkRequestId: Double): Readonlynamenetworkunsubs = {
    val __obj = js.Dynamic.literal(name = "network.unsubscribe", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamenetworkunsubs]
  }
  
  extension [Self <: Readonlynamenetworkunsubs](x: Self) {
    
    inline def setName(value: networkDotunsubscribe): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestId(value: Double): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
  }
}
