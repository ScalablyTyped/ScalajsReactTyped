package typingsJapgolly.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information that identifies the reason for a lost session. */
trait AllJoynSessionLostEventArgs extends StObject {
  
  /** Retrieves a value that indicates the reason for a lost session. */
  var reason: AllJoynSessionLostReason
}
object AllJoynSessionLostEventArgs {
  
  inline def apply(reason: AllJoynSessionLostReason): AllJoynSessionLostEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionLostEventArgs]
  }
  
  extension [Self <: AllJoynSessionLostEventArgs](x: Self) {
    
    inline def setReason(value: AllJoynSessionLostReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
