package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityOptionsStatus extends StObject {
  
  /**
    * The availability options configured for the domain.
    */
  var Options: MultiAZ
  
  var Status: OptionStatus
}
object AvailabilityOptionsStatus {
  
  inline def apply(Options: MultiAZ, Status: OptionStatus): AvailabilityOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityOptionsStatus]
  }
  
  extension [Self <: AvailabilityOptionsStatus](x: Self) {
    
    inline def setOptions(value: MultiAZ): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
