package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GattProtectionLevel extends StObject
/** Represents the desired security level. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel")
@js.native
object GattProtectionLevel extends StObject {
  
  /** Require the link to be authenticated. */
  @js.native
  sealed trait authenticationRequired
    extends StObject
       with GattProtectionLevel
  
  /** Require the link to be encrypted and authenticated. */
  @js.native
  sealed trait encryptionAndAuthenticationRequired
    extends StObject
       with GattProtectionLevel
  
  /** Require the link to be encrypted. */
  @js.native
  sealed trait encryptionRequired
    extends StObject
       with GattProtectionLevel
  
  /** Uses the default protection level. */
  @js.native
  sealed trait plain
    extends StObject
       with GattProtectionLevel
}
