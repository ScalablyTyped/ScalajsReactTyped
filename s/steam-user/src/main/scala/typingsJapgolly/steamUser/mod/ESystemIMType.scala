package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESystemIMType extends StObject
@JSImport("steam-user", "ESystemIMType")
@js.native
object ESystemIMType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESystemIMType & Double] = js.native
  
  @js.native
  sealed trait CardWillExpire
    extends StObject
       with ESystemIMType
  /* 3 */ val CardWillExpire: typingsJapgolly.steamUser.mod.ESystemIMType.CardWillExpire & Double = js.native
  
  @js.native
  sealed trait GiftRevoked
    extends StObject
       with ESystemIMType
  /* 7 */ val GiftRevoked: typingsJapgolly.steamUser.mod.ESystemIMType.GiftRevoked & Double = js.native
  
  @js.native
  sealed trait GuestPassGranted
    extends StObject
       with ESystemIMType
  /* 6 */ val GuestPassGranted: typingsJapgolly.steamUser.mod.ESystemIMType.GuestPassGranted & Double = js.native
  
  @js.native
  sealed trait GuestPassReceived
    extends StObject
       with ESystemIMType
  /* 5 */ val GuestPassReceived: typingsJapgolly.steamUser.mod.ESystemIMType.GuestPassReceived & Double = js.native
  
  @js.native
  sealed trait InvalidCard
    extends StObject
       with ESystemIMType
  /* 1 */ val InvalidCard: typingsJapgolly.steamUser.mod.ESystemIMType.InvalidCard & Double = js.native
  
  @js.native
  sealed trait RawText
    extends StObject
       with ESystemIMType
  /* 0 */ val RawText: typingsJapgolly.steamUser.mod.ESystemIMType.RawText & Double = js.native
  
  @js.native
  sealed trait RecurringPurchaseFailed
    extends StObject
       with ESystemIMType
  /* 2 */ val RecurringPurchaseFailed: typingsJapgolly.steamUser.mod.ESystemIMType.RecurringPurchaseFailed & Double = js.native
  
  @js.native
  sealed trait SubscriptionExpired
    extends StObject
       with ESystemIMType
  /* 4 */ val SubscriptionExpired: typingsJapgolly.steamUser.mod.ESystemIMType.SubscriptionExpired & Double = js.native
  
  @js.native
  sealed trait SupportMessage
    extends StObject
       with ESystemIMType
  /* 8 */ val SupportMessage: typingsJapgolly.steamUser.mod.ESystemIMType.SupportMessage & Double = js.native
  
  @js.native
  sealed trait SupportMessageClearAlert
    extends StObject
       with ESystemIMType
  /* 9 */ val SupportMessageClearAlert: typingsJapgolly.steamUser.mod.ESystemIMType.SupportMessageClearAlert & Double = js.native
}
