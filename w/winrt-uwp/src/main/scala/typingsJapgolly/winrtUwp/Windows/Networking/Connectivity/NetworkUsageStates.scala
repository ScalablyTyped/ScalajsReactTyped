package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the desired state of the connection profile for which usage data is returned by the method GetNetworkUsageAsync . */
trait NetworkUsageStates extends StObject {
  
  /** Defines the desired roaming state of the network connection. */
  var roaming: TriStates
  
  /** Defines the desired sharing state of the network connection. */
  var shared: TriStates
}
object NetworkUsageStates {
  
  inline def apply(roaming: TriStates, shared: TriStates): NetworkUsageStates = {
    val __obj = js.Dynamic.literal(roaming = roaming.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUsageStates]
  }
  
  extension [Self <: NetworkUsageStates](x: Self) {
    
    inline def setRoaming(value: TriStates): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
    
    inline def setShared(value: TriStates): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
  }
}
