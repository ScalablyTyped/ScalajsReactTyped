package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ETradeOfferState extends StObject
@JSImport("steam-user", "ETradeOfferState")
@js.native
object ETradeOfferState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ETradeOfferState & Double] = js.native
  
  @js.native
  sealed trait Accepted
    extends StObject
       with ETradeOfferState
  /* 3 */ val Accepted: typingsJapgolly.steamUser.mod.ETradeOfferState.Accepted & Double = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with ETradeOfferState
  /* 2 */ val Active: typingsJapgolly.steamUser.mod.ETradeOfferState.Active & Double = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with ETradeOfferState
  /* 6 */ val Canceled: typingsJapgolly.steamUser.mod.ETradeOfferState.Canceled & Double = js.native
  
  @js.native
  sealed trait CanceledBySecondFactor
    extends StObject
       with ETradeOfferState
  /* 10 */ val CanceledBySecondFactor: typingsJapgolly.steamUser.mod.ETradeOfferState.CanceledBySecondFactor & Double = js.native
  
  @js.native
  sealed trait Countered
    extends StObject
       with ETradeOfferState
  /* 4 */ val Countered: typingsJapgolly.steamUser.mod.ETradeOfferState.Countered & Double = js.native
  
  @js.native
  sealed trait CreatedNeedsConfirmation
    extends StObject
       with ETradeOfferState
  /* 9 */ val CreatedNeedsConfirmation: typingsJapgolly.steamUser.mod.ETradeOfferState.CreatedNeedsConfirmation & Double = js.native
  
  @js.native
  sealed trait Declined
    extends StObject
       with ETradeOfferState
  /* 7 */ val Declined: typingsJapgolly.steamUser.mod.ETradeOfferState.Declined & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with ETradeOfferState
  /* 5 */ val Expired: typingsJapgolly.steamUser.mod.ETradeOfferState.Expired & Double = js.native
  
  @js.native
  sealed trait InEscrow
    extends StObject
       with ETradeOfferState
  /* 11 */ val InEscrow: typingsJapgolly.steamUser.mod.ETradeOfferState.InEscrow & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ETradeOfferState
  /* 1 */ val Invalid: typingsJapgolly.steamUser.mod.ETradeOfferState.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidItems
    extends StObject
       with ETradeOfferState
  /* 8 */ val InvalidItems: typingsJapgolly.steamUser.mod.ETradeOfferState.InvalidItems & Double = js.native
}
