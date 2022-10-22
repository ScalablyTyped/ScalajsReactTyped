package typingsJapgolly.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardingConfig extends StObject {
  
  /**
    * The forwarding state for the given property. 
    */
  var state: ForwardingConfigState
}
object ForwardingConfig {
  
  inline def apply(state: ForwardingConfigState): ForwardingConfig = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardingConfig]
  }
  
  extension [Self <: ForwardingConfig](x: Self) {
    
    inline def setState(value: ForwardingConfigState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
