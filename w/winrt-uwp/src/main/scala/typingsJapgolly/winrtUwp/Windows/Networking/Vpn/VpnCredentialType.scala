package typingsJapgolly.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnCredentialType extends StObject
/** Specifies the types of credentials that can be requested by the VPN platform. */
@JSGlobal("Windows.Networking.Vpn.VpnCredentialType")
@js.native
object VpnCredentialType extends StObject {
  
  /** Represents a credential type of a protected certificate. */
  @js.native
  sealed trait protectedCertificate
    extends StObject
       with VpnCredentialType
  
  /** Represents a credential type of smart card. */
  @js.native
  sealed trait smartCard
    extends StObject
       with VpnCredentialType
  
  /** Represents a credential type of a certificate. */
  @js.native
  sealed trait unProtectedCertificate
    extends StObject
       with VpnCredentialType
  
  /** Represents a credential type of username, and a PIN or OTP. */
  @js.native
  sealed trait usernameOtpPin
    extends StObject
       with VpnCredentialType
  
  /** Represents a credential of type Username and Password. */
  @js.native
  sealed trait usernamePassword
    extends StObject
       with VpnCredentialType
  
  /** Represents a credential type of username, password, and PIN. */
  @js.native
  sealed trait usernamePasswordAndPin
    extends StObject
       with VpnCredentialType
  
  /** Represents a password change. The current password, new password, and a confirmation of the new password will be collected. */
  @js.native
  sealed trait usernamePasswordChange
    extends StObject
       with VpnCredentialType
}
