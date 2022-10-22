package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseFlags extends StObject
@JSImport("steam-user", "ELicenseFlags")
@js.native
object ELicenseFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags & Double] = js.native
  
  @js.native
  sealed trait CancelledByAdmin
    extends StObject
       with ELicenseFlags
  /* 32 */ val CancelledByAdmin: typingsJapgolly.steamUser.mod.ELicenseFlags.CancelledByAdmin & Double = js.native
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock
    extends StObject
       with ELicenseFlags
  /* 1024 */ val CancelledByFriendlyFraudLock: typingsJapgolly.steamUser.mod.ELicenseFlags.CancelledByFriendlyFraudLock & Double = js.native
  
  @js.native
  sealed trait CancelledByUser
    extends StObject
       with ELicenseFlags
  /* 16 */ val CancelledByUser: typingsJapgolly.steamUser.mod.ELicenseFlags.CancelledByUser & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with ELicenseFlags
  /* 8 */ val Expired: typingsJapgolly.steamUser.mod.ELicenseFlags.Expired & Double = js.native
  
  @js.native
  sealed trait ForceRunRestriction
    extends StObject
       with ELicenseFlags
  /* 256 */ val ForceRunRestriction: typingsJapgolly.steamUser.mod.ELicenseFlags.ForceRunRestriction & Double = js.native
  
  @js.native
  sealed trait ImportedFromSteam2
    extends StObject
       with ELicenseFlags
  /* 128 */ val ImportedFromSteam2: typingsJapgolly.steamUser.mod.ELicenseFlags.ImportedFromSteam2 & Double = js.native
  
  @js.native
  sealed trait LowViolenceContent
    extends StObject
       with ELicenseFlags
  /* 64 */ val LowViolenceContent: typingsJapgolly.steamUser.mod.ELicenseFlags.LowViolenceContent & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ELicenseFlags
  /* 0 */ val None: typingsJapgolly.steamUser.mod.ELicenseFlags.None & Double = js.native
  
  @js.native
  sealed trait NotActivated
    extends StObject
       with ELicenseFlags
  /* 2048 */ val NotActivated: typingsJapgolly.steamUser.mod.ELicenseFlags.NotActivated & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with ELicenseFlags
  /* 4 */ val Pending: typingsJapgolly.steamUser.mod.ELicenseFlags.Pending & Double = js.native
  
  @js.native
  sealed trait RegionRestrictionExpired
    extends StObject
       with ELicenseFlags
  /* 512 */ val RegionRestrictionExpired: typingsJapgolly.steamUser.mod.ELicenseFlags.RegionRestrictionExpired & Double = js.native
  
  @js.native
  sealed trait Renew
    extends StObject
       with ELicenseFlags
  /* 1 */ val Renew: typingsJapgolly.steamUser.mod.ELicenseFlags.Renew & Double = js.native
  
  @js.native
  sealed trait RenewalFailed
    extends StObject
       with ELicenseFlags
  /* 2 */ val RenewalFailed: typingsJapgolly.steamUser.mod.ELicenseFlags.RenewalFailed & Double = js.native
}
