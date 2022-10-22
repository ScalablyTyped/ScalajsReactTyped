package typingsJapgolly.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information and enables pairing for a device. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing")
@js.native
open class DeviceInformationPairing ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceInformationPairing
object DeviceInformationPairing {
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attempts to pair for all inbound pairing requests
    * @param pairingKindsSupported The pairing kinds this device supports.
    * @return Whether or not the attempt was successful.
    */
  /* static member */
  inline def tryRegisterForAllInboundPairingRequests(pairingKindsSupported: typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryRegisterForAllInboundPairingRequests")(pairingKindsSupported.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
