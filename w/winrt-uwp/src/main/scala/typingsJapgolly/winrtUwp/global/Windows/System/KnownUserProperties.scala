package typingsJapgolly.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains basic information about a user. */
/* note: abstract class */ @JSGlobal("Windows.System.KnownUserProperties")
@js.native
open class KnownUserProperties ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.System.KnownUserProperties
object KnownUserProperties {
  
  @JSGlobal("Windows.System.KnownUserProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the user's account name. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.accountName")
  @js.native
  def accountName: String = js.native
  inline def accountName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountName")(x.asInstanceOf[js.Any])
  
  /** Gets the user's display name. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  /** Gets the user's domain name. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.domainName")
  @js.native
  def domainName: String = js.native
  inline def domainName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainName")(x.asInstanceOf[js.Any])
  
  /** Gets the user's first name. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.firstName")
  @js.native
  def firstName: String = js.native
  inline def firstName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firstName")(x.asInstanceOf[js.Any])
  
  /** Gets the user's guest host. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.guestHost")
  @js.native
  def guestHost: String = js.native
  inline def guestHost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guestHost")(x.asInstanceOf[js.Any])
  
  /** Gets the user's last name. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.lastName")
  @js.native
  def lastName: String = js.native
  inline def lastName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastName")(x.asInstanceOf[js.Any])
  
  /** Gets the user's principal name. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.principalName")
  @js.native
  def principalName: String = js.native
  inline def principalName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("principalName")(x.asInstanceOf[js.Any])
  
  /** Gets the user's provider name. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.providerName")
  @js.native
  def providerName: String = js.native
  inline def providerName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("providerName")(x.asInstanceOf[js.Any])
  
  /** Gets the user's session initiation protocol Uri. */
  /* static member */
  @JSGlobal("Windows.System.KnownUserProperties.sessionInitiationProtocolUri")
  @js.native
  def sessionInitiationProtocolUri: String = js.native
  inline def sessionInitiationProtocolUri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sessionInitiationProtocolUri")(x.asInstanceOf[js.Any])
}
