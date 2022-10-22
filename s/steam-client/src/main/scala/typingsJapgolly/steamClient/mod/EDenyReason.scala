package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDenyReason extends StObject
@JSImport("steam-client", "EDenyReason")
@js.native
object EDenyReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDenyReason & Double] = js.native
  
  @js.native
  sealed trait Cheater
    extends StObject
       with EDenyReason
  /* 5 */ val Cheater: typingsJapgolly.steamClient.mod.EDenyReason.Cheater & Double = js.native
  
  @js.native
  sealed trait Generic
    extends StObject
       with EDenyReason
  /* 2 */ val Generic: typingsJapgolly.steamClient.mod.EDenyReason.Generic & Double = js.native
  
  @js.native
  sealed trait IncompatibleAnticheat
    extends StObject
       with EDenyReason
  /* 8 */ val IncompatibleAnticheat: typingsJapgolly.steamClient.mod.EDenyReason.IncompatibleAnticheat & Double = js.native
  
  @js.native
  sealed trait IncompatibleSoftware
    extends StObject
       with EDenyReason
  /* 10 */ val IncompatibleSoftware: typingsJapgolly.steamClient.mod.EDenyReason.IncompatibleSoftware & Double = js.native
  
  @js.native
  sealed trait InvalidVersion
    extends StObject
       with EDenyReason
  /* 1 */ val InvalidVersion: typingsJapgolly.steamClient.mod.EDenyReason.InvalidVersion & Double = js.native
  
  @js.native
  sealed trait LoggedInElseWhere
    extends StObject
       with EDenyReason
  /* 6 */ val LoggedInElseWhere: typingsJapgolly.steamClient.mod.EDenyReason.LoggedInElseWhere & Double = js.native
  
  @js.native
  sealed trait MemoryCorruption
    extends StObject
       with EDenyReason
  /* 9 */ val MemoryCorruption: typingsJapgolly.steamClient.mod.EDenyReason.MemoryCorruption & Double = js.native
  
  @js.native
  sealed trait NoLicense
    extends StObject
       with EDenyReason
  /* 4 */ val NoLicense: typingsJapgolly.steamClient.mod.EDenyReason.NoLicense & Double = js.native
  
  @js.native
  sealed trait NotLoggedOn
    extends StObject
       with EDenyReason
  /* 3 */ val NotLoggedOn: typingsJapgolly.steamClient.mod.EDenyReason.NotLoggedOn & Double = js.native
  
  @js.native
  sealed trait SteamConnectionError
    extends StObject
       with EDenyReason
  /* 12 */ val SteamConnectionError: typingsJapgolly.steamClient.mod.EDenyReason.SteamConnectionError & Double = js.native
  
  @js.native
  sealed trait SteamConnectionLost
    extends StObject
       with EDenyReason
  /* 11 */ val SteamConnectionLost: typingsJapgolly.steamClient.mod.EDenyReason.SteamConnectionLost & Double = js.native
  
  @js.native
  sealed trait SteamOwnerLeftGuestUser
    extends StObject
       with EDenyReason
  /* 15 */ val SteamOwnerLeftGuestUser: typingsJapgolly.steamClient.mod.EDenyReason.SteamOwnerLeftGuestUser & Double = js.native
  
  @js.native
  sealed trait SteamResponseTimedOut
    extends StObject
       with EDenyReason
  /* 13 */ val SteamResponseTimedOut: typingsJapgolly.steamClient.mod.EDenyReason.SteamResponseTimedOut & Double = js.native
  
  @js.native
  sealed trait SteamValidationStalled
    extends StObject
       with EDenyReason
  /* 14 */ val SteamValidationStalled: typingsJapgolly.steamClient.mod.EDenyReason.SteamValidationStalled & Double = js.native
  
  @js.native
  sealed trait UnknownText
    extends StObject
       with EDenyReason
  /* 7 */ val UnknownText: typingsJapgolly.steamClient.mod.EDenyReason.UnknownText & Double = js.native
}
