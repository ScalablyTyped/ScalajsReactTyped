package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBillingType extends StObject
@JSImport("steam-user", "EBillingType")
@js.native
object EBillingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType & Double] = js.native
  
  @js.native
  sealed trait AutoGrant
    extends StObject
       with EBillingType
  /* 7 */ val AutoGrant: typingsJapgolly.steamUser.mod.EBillingType.AutoGrant & Double = js.native
  
  @js.native
  sealed trait BillMonthly
    extends StObject
       with EBillingType
  /* 2 */ val BillMonthly: typingsJapgolly.steamUser.mod.EBillingType.BillMonthly & Double = js.native
  
  @js.native
  sealed trait BillOnceOnly
    extends StObject
       with EBillingType
  /* 1 */ val BillOnceOnly: typingsJapgolly.steamUser.mod.EBillingType.BillOnceOnly & Double = js.native
  
  @js.native
  sealed trait BillOnceOrCDKey
    extends StObject
       with EBillingType
  /* 10 */ val BillOnceOrCDKey: typingsJapgolly.steamUser.mod.EBillingType.BillOnceOrCDKey & Double = js.native
  
  @js.native
  sealed trait CommercialLicense
    extends StObject
       with EBillingType
  /* 14 */ val CommercialLicense: typingsJapgolly.steamUser.mod.EBillingType.CommercialLicense & Double = js.native
  
  @js.native
  sealed trait FreeCommercialLicense
    extends StObject
       with EBillingType
  /* 15 */ val FreeCommercialLicense: typingsJapgolly.steamUser.mod.EBillingType.FreeCommercialLicense & Double = js.native
  
  @js.native
  sealed trait FreeOnDemand
    extends StObject
       with EBillingType
  /* 12 */ val FreeOnDemand: typingsJapgolly.steamUser.mod.EBillingType.FreeOnDemand & Double = js.native
  
  @js.native
  sealed trait Gift
    extends StObject
       with EBillingType
  /* 6 */ val Gift: typingsJapgolly.steamUser.mod.EBillingType.Gift & Double = js.native
  
  @js.native
  sealed trait GuestPass
    extends StObject
       with EBillingType
  /* 4 */ val GuestPass: typingsJapgolly.steamUser.mod.EBillingType.GuestPass & Double = js.native
  
  @js.native
  sealed trait HardwarePromo
    extends StObject
       with EBillingType
  /* 5 */ val HardwarePromo: typingsJapgolly.steamUser.mod.EBillingType.HardwarePromo & Double = js.native
  
  @js.native
  sealed trait NoCost
    extends StObject
       with EBillingType
  /* 0 */ val NoCost: typingsJapgolly.steamUser.mod.EBillingType.NoCost & Double = js.native
  
  @js.native
  sealed trait NumBillingTypes
    extends StObject
       with EBillingType
  /* 16 */ val NumBillingTypes: typingsJapgolly.steamUser.mod.EBillingType.NumBillingTypes & Double = js.native
  
  @js.native
  sealed trait OEMTicket
    extends StObject
       with EBillingType
  /* 8 */ val OEMTicket: typingsJapgolly.steamUser.mod.EBillingType.OEMTicket & Double = js.native
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly
    extends StObject
       with EBillingType
  /* 3 */ val ProofOfPrepurchaseOnly: typingsJapgolly.steamUser.mod.EBillingType.ProofOfPrepurchaseOnly & Double = js.native
  
  @js.native
  sealed trait RecurringOption
    extends StObject
       with EBillingType
  /* 9 */ val RecurringOption: typingsJapgolly.steamUser.mod.EBillingType.RecurringOption & Double = js.native
  
  @js.native
  sealed trait Rental
    extends StObject
       with EBillingType
  /* 13 */ val Rental: typingsJapgolly.steamUser.mod.EBillingType.Rental & Double = js.native
  
  @js.native
  sealed trait Repurchaseable
    extends StObject
       with EBillingType
  /* 11 */ val Repurchaseable: typingsJapgolly.steamUser.mod.EBillingType.Repurchaseable & Double = js.native
}
