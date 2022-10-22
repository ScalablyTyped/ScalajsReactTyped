package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseFlags extends StObject
@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags & Double] = js.native
  
  @js.native
  sealed trait CancelledByAdmin
    extends StObject
       with ELicenseFlags
  /* 0x20 */ val CancelledByAdmin: typingsJapgolly.steamClient.mod.ELicenseFlags.CancelledByAdmin & Double = js.native
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock
    extends StObject
       with ELicenseFlags
  /* 0x400 */ val CancelledByFriendlyFraudLock: typingsJapgolly.steamClient.mod.ELicenseFlags.CancelledByFriendlyFraudLock & Double = js.native
  
  @js.native
  sealed trait CancelledByUser
    extends StObject
       with ELicenseFlags
  /* 0x10 */ val CancelledByUser: typingsJapgolly.steamClient.mod.ELicenseFlags.CancelledByUser & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with ELicenseFlags
  /* 0x08 */ val Expired: typingsJapgolly.steamClient.mod.ELicenseFlags.Expired & Double = js.native
  
  @js.native
  sealed trait ForceRunRestriction
    extends StObject
       with ELicenseFlags
  /* 0x100 */ val ForceRunRestriction: typingsJapgolly.steamClient.mod.ELicenseFlags.ForceRunRestriction & Double = js.native
  
  @js.native
  sealed trait ImportedFromSteam2
    extends StObject
       with ELicenseFlags
  /* 0x80 */ val ImportedFromSteam2: typingsJapgolly.steamClient.mod.ELicenseFlags.ImportedFromSteam2 & Double = js.native
  
  @js.native
  sealed trait LowViolenceContent
    extends StObject
       with ELicenseFlags
  /* 0x40 */ val LowViolenceContent: typingsJapgolly.steamClient.mod.ELicenseFlags.LowViolenceContent & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ELicenseFlags
  /* 0 */ val None: typingsJapgolly.steamClient.mod.ELicenseFlags.None & Double = js.native
  
  @js.native
  sealed trait NotActivated
    extends StObject
       with ELicenseFlags
  /* 0x800 */ val NotActivated: typingsJapgolly.steamClient.mod.ELicenseFlags.NotActivated & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with ELicenseFlags
  /* 0x04 */ val Pending: typingsJapgolly.steamClient.mod.ELicenseFlags.Pending & Double = js.native
  
  @js.native
  sealed trait RegionRestrictionExpired
    extends StObject
       with ELicenseFlags
  /* 0x200 */ val RegionRestrictionExpired: typingsJapgolly.steamClient.mod.ELicenseFlags.RegionRestrictionExpired & Double = js.native
  
  @js.native
  sealed trait Renew
    extends StObject
       with ELicenseFlags
  /* 0x01 */ val Renew: typingsJapgolly.steamClient.mod.ELicenseFlags.Renew & Double = js.native
  
  @js.native
  sealed trait RenewalFailed
    extends StObject
       with ELicenseFlags
  /* 0x02 */ val RenewalFailed: typingsJapgolly.steamClient.mod.ELicenseFlags.RenewalFailed & Double = js.native
}
