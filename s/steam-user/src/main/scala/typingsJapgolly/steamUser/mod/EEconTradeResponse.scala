package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EEconTradeResponse extends StObject
@JSImport("steam-user", "EEconTradeResponse")
@js.native
object EEconTradeResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EEconTradeResponse & Double] = js.native
  
  @js.native
  sealed trait Accepted
    extends StObject
       with EEconTradeResponse
  /* 0 */ val Accepted: typingsJapgolly.steamUser.mod.EEconTradeResponse.Accepted & Double = js.native
  
  @js.native
  sealed trait AlreadyHasTradeRequest
    extends StObject
       with EEconTradeResponse
  /* 12 */ val AlreadyHasTradeRequest: typingsJapgolly.steamUser.mod.EEconTradeResponse.AlreadyHasTradeRequest & Double = js.native
  
  @js.native
  sealed trait AlreadyTrading
    extends StObject
       with EEconTradeResponse
  /* 11 */ val AlreadyTrading: typingsJapgolly.steamUser.mod.EEconTradeResponse.AlreadyTrading & Double = js.native
  
  @js.native
  sealed trait Cancel
    extends StObject
       with EEconTradeResponse
  /* 7 */ val Cancel: typingsJapgolly.steamUser.mod.EEconTradeResponse.Cancel & Double = js.native
  
  @js.native
  sealed trait ConnectionFailed
    extends StObject
       with EEconTradeResponse
  /* 10 */ val ConnectionFailed: typingsJapgolly.steamUser.mod.EEconTradeResponse.ConnectionFailed & Double = js.native
  
  @js.native
  sealed trait CyberCafeInitiator
    extends StObject
       with EEconTradeResponse
  /* 14 */ val CyberCafeInitiator: typingsJapgolly.steamUser.mod.EEconTradeResponse.CyberCafeInitiator & Double = js.native
  
  @js.native
  sealed trait CyberCafeTarget
    extends StObject
       with EEconTradeResponse
  /* 15 */ val CyberCafeTarget: typingsJapgolly.steamUser.mod.EEconTradeResponse.CyberCafeTarget & Double = js.native
  
  @js.native
  sealed trait Declined
    extends StObject
       with EEconTradeResponse
  /* 1 */ val Declined: typingsJapgolly.steamUser.mod.EEconTradeResponse.Declined & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EEconTradeResponse
  /* 5 */ val Disabled: typingsJapgolly.steamUser.mod.EEconTradeResponse.Disabled & Double = js.native
  
  @js.native
  sealed trait DisabledInPartnerRegion
    extends StObject
       with EEconTradeResponse
  /* 33 */ val DisabledInPartnerRegion: typingsJapgolly.steamUser.mod.EEconTradeResponse.DisabledInPartnerRegion & Double = js.native
  
  @js.native
  sealed trait DisabledInRegion
    extends StObject
       with EEconTradeResponse
  /* 32 */ val DisabledInRegion: typingsJapgolly.steamUser.mod.EEconTradeResponse.DisabledInRegion & Double = js.native
  
  @js.native
  sealed trait InitiatorBlockedTarget
    extends StObject
       with EEconTradeResponse
  /* 18 */ val InitiatorBlockedTarget: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorBlockedTarget & Double = js.native
  
  @js.native
  sealed trait InitiatorNeedsSteamGuard
    extends StObject
       with EEconTradeResponse
  /* 21 */ val InitiatorNeedsSteamGuard: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorNeedsSteamGuard & Double = js.native
  
  @js.native
  sealed trait InitiatorNeedsVerifiedEmail
    extends StObject
       with EEconTradeResponse
  /* 20 */ val InitiatorNeedsVerifiedEmail: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorNeedsVerifiedEmail & Double = js.native
  
  @js.native
  sealed trait InitiatorNewDeviceCooldown
    extends StObject
       with EEconTradeResponse
  /* 25 */ val InitiatorNewDeviceCooldown: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorNewDeviceCooldown & Double = js.native
  
  @js.native
  sealed trait InitiatorPasswordResetProbation
    extends StObject
       with EEconTradeResponse
  /* 24 */ val InitiatorPasswordResetProbation: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorPasswordResetProbation & Double = js.native
  
  @js.native
  sealed trait InitiatorRecentEmailChange
    extends StObject
       with EEconTradeResponse
  /* 28 */ val InitiatorRecentEmailChange: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorRecentEmailChange & Double = js.native
  
  @js.native
  sealed trait InitiatorSentInvalidCookie
    extends StObject
       with EEconTradeResponse
  /* 26 */ val InitiatorSentInvalidCookie: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorSentInvalidCookie & Double = js.native
  
  @js.native
  sealed trait InitiatorSteamGuardDuration
    extends StObject
       with EEconTradeResponse
  /* 23 */ val InitiatorSteamGuardDuration: typingsJapgolly.steamUser.mod.EEconTradeResponse.InitiatorSteamGuardDuration & Double = js.native
  
  @js.native
  sealed trait NeedsEmailConfirmation
    extends StObject
       with EEconTradeResponse
  /* 27 */ val NeedsEmailConfirmation: typingsJapgolly.steamUser.mod.EEconTradeResponse.NeedsEmailConfirmation & Double = js.native
  
  @js.native
  sealed trait NeedsMobileConfirmation
    extends StObject
       with EEconTradeResponse
  /* 29 */ val NeedsMobileConfirmation: typingsJapgolly.steamUser.mod.EEconTradeResponse.NeedsMobileConfirmation & Double = js.native
  
  @js.native
  sealed trait NoResponse
    extends StObject
       with EEconTradeResponse
  /* 13 */ val NoResponse: typingsJapgolly.steamUser.mod.EEconTradeResponse.NoResponse & Double = js.native
  
  @js.native
  sealed trait NotLoggedIn
    extends StObject
       with EEconTradeResponse
  /* 6 */ val NotLoggedIn: typingsJapgolly.steamUser.mod.EEconTradeResponse.NotLoggedIn & Double = js.native
  
  @js.native
  sealed trait OKToDeliver
    extends StObject
       with EEconTradeResponse
  /* 50 */ val OKToDeliver: typingsJapgolly.steamUser.mod.EEconTradeResponse.OKToDeliver & Double = js.native
  
  @js.native
  sealed trait SchoolLabInitiator
    extends StObject
       with EEconTradeResponse
  /* 16 */ val SchoolLabInitiator: typingsJapgolly.steamUser.mod.EEconTradeResponse.SchoolLabInitiator & Double = js.native
  
  @js.native
  sealed trait SchoolLabTarget
    extends StObject
       with EEconTradeResponse
  /* 16 */ val SchoolLabTarget: typingsJapgolly.steamUser.mod.EEconTradeResponse.SchoolLabTarget & Double = js.native
  
  @js.native
  sealed trait TargetAccountCannotTrade
    extends StObject
       with EEconTradeResponse
  /* 22 */ val TargetAccountCannotTrade: typingsJapgolly.steamUser.mod.EEconTradeResponse.TargetAccountCannotTrade & Double = js.native
  
  @js.native
  sealed trait TargetAlreadyTrading
    extends StObject
       with EEconTradeResponse
  /* 4 */ val TargetAlreadyTrading: typingsJapgolly.steamUser.mod.EEconTradeResponse.TargetAlreadyTrading & Double = js.native
  
  @js.native
  sealed trait TooSoon
    extends StObject
       with EEconTradeResponse
  /* 8 */ val TooSoon: typingsJapgolly.steamUser.mod.EEconTradeResponse.TooSoon & Double = js.native
  
  @js.native
  sealed trait TooSoonPenalty
    extends StObject
       with EEconTradeResponse
  /* 9 */ val TooSoonPenalty: typingsJapgolly.steamUser.mod.EEconTradeResponse.TooSoonPenalty & Double = js.native
  
  @js.native
  sealed trait TradeBannedInitiator
    extends StObject
       with EEconTradeResponse
  /* 2 */ val TradeBannedInitiator: typingsJapgolly.steamUser.mod.EEconTradeResponse.TradeBannedInitiator & Double = js.native
  
  @js.native
  sealed trait TradeBannedTarget
    extends StObject
       with EEconTradeResponse
  /* 3 */ val TradeBannedTarget: typingsJapgolly.steamUser.mod.EEconTradeResponse.TradeBannedTarget & Double = js.native
  
  @js.native
  sealed trait TradingHoldForClearedTradeOffersInitiator
    extends StObject
       with EEconTradeResponse
  /* 30 */ val TradingHoldForClearedTradeOffersInitiator: typingsJapgolly.steamUser.mod.EEconTradeResponse.TradingHoldForClearedTradeOffersInitiator & Double = js.native
  
  @js.native
  sealed trait WouldExceedMaxAssetCount
    extends StObject
       with EEconTradeResponse
  /* 31 */ val WouldExceedMaxAssetCount: typingsJapgolly.steamUser.mod.EEconTradeResponse.WouldExceedMaxAssetCount & Double = js.native
}
