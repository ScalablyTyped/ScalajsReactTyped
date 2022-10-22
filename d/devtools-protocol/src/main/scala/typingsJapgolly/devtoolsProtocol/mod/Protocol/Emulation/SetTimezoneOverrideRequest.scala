package typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTimezoneOverrideRequest extends StObject {
  
  /**
    * The timezone identifier. If empty, disables the override and
    * restores default host system timezone.
    */
  var timezoneId: String
}
object SetTimezoneOverrideRequest {
  
  inline def apply(timezoneId: String): SetTimezoneOverrideRequest = {
    val __obj = js.Dynamic.literal(timezoneId = timezoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimezoneOverrideRequest]
  }
  
  extension [Self <: SetTimezoneOverrideRequest](x: Self) {
    
    inline def setTimezoneId(value: String): Self = StObject.set(x, "timezoneId", value.asInstanceOf[js.Any])
  }
}
