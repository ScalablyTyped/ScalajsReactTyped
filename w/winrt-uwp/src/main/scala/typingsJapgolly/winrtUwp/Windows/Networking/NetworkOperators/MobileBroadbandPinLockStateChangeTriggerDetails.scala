package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network registration state change notification. */
trait MobileBroadbandPinLockStateChangeTriggerDetails extends StObject {
  
  /** Gets the collection of PIN lock state change details associated with a notification. */
  var pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange]
}
object MobileBroadbandPinLockStateChangeTriggerDetails {
  
  inline def apply(pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange]): MobileBroadbandPinLockStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(pinLockStateChanges = pinLockStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinLockStateChangeTriggerDetails]
  }
  
  extension [Self <: MobileBroadbandPinLockStateChangeTriggerDetails](x: Self) {
    
    inline def setPinLockStateChanges(value: IVectorView[MobileBroadbandPinLockStateChange]): Self = StObject.set(x, "pinLockStateChanges", value.asInstanceOf[js.Any])
  }
}
