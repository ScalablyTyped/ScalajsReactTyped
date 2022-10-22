package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseType extends StObject
@JSImport("steam-client", "ELicenseType")
@js.native
object ELicenseType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseType & Double] = js.native
  
  @js.native
  sealed trait LimitedUseDelayedActivation
    extends StObject
       with ELicenseType
  /* 7 */ val LimitedUseDelayedActivation: typingsJapgolly.steamClient.mod.ELicenseType.LimitedUseDelayedActivation & Double = js.native
  
  @js.native
  sealed trait NoLicense
    extends StObject
       with ELicenseType
  /* 0 */ val NoLicense: typingsJapgolly.steamClient.mod.ELicenseType.NoLicense & Double = js.native
  
  @js.native
  sealed trait RecurringCharge
    extends StObject
       with ELicenseType
  /* 3 */ val RecurringCharge: typingsJapgolly.steamClient.mod.ELicenseType.RecurringCharge & Double = js.native
  
  @js.native
  sealed trait RecurringChargeLimitedUse
    extends StObject
       with ELicenseType
  /* 4 */ val RecurringChargeLimitedUse: typingsJapgolly.steamClient.mod.ELicenseType.RecurringChargeLimitedUse & Double = js.native
  
  @js.native
  sealed trait RecurringChargeLimitedUseWithOverages
    extends StObject
       with ELicenseType
  /* 5 */ val RecurringChargeLimitedUseWithOverages: typingsJapgolly.steamClient.mod.ELicenseType.RecurringChargeLimitedUseWithOverages & Double = js.native
  
  @js.native
  sealed trait RecurringOption
    extends StObject
       with ELicenseType
  /* 6 */ val RecurringOption: typingsJapgolly.steamClient.mod.ELicenseType.RecurringOption & Double = js.native
  
  @js.native
  sealed trait SinglePurchase
    extends StObject
       with ELicenseType
  /* 1 */ val SinglePurchase: typingsJapgolly.steamClient.mod.ELicenseType.SinglePurchase & Double = js.native
  
  @js.native
  sealed trait SinglePurchaseLimitedUse
    extends StObject
       with ELicenseType
  /* 2 */ val SinglePurchaseLimitedUse: typingsJapgolly.steamClient.mod.ELicenseType.SinglePurchaseLimitedUse & Double = js.native
}
