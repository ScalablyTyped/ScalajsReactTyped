package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESteamNetworkingUDPMsgID extends StObject
@JSImport("steam-user", "ESteamNetworkingUDPMsgID")
@js.native
object ESteamNetworkingUDPMsgID extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESteamNetworkingUDPMsgID & Double] = js.native
  
  @js.native
  sealed trait ChallengeReply
    extends StObject
       with ESteamNetworkingUDPMsgID
  /* 33 */ val ChallengeReply: typingsJapgolly.steamUser.mod.ESteamNetworkingUDPMsgID.ChallengeReply & Double = js.native
  
  @js.native
  sealed trait ChallengeRequest
    extends StObject
       with ESteamNetworkingUDPMsgID
  /* 32 */ val ChallengeRequest: typingsJapgolly.steamUser.mod.ESteamNetworkingUDPMsgID.ChallengeRequest & Double = js.native
  
  @js.native
  sealed trait ConnectOK
    extends StObject
       with ESteamNetworkingUDPMsgID
  /* 35 */ val ConnectOK: typingsJapgolly.steamUser.mod.ESteamNetworkingUDPMsgID.ConnectOK & Double = js.native
  
  @js.native
  sealed trait ConnectRequest
    extends StObject
       with ESteamNetworkingUDPMsgID
  /* 34 */ val ConnectRequest: typingsJapgolly.steamUser.mod.ESteamNetworkingUDPMsgID.ConnectRequest & Double = js.native
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with ESteamNetworkingUDPMsgID
  /* 36 */ val ConnectionClosed: typingsJapgolly.steamUser.mod.ESteamNetworkingUDPMsgID.ConnectionClosed & Double = js.native
  
  @js.native
  sealed trait NoConnection
    extends StObject
       with ESteamNetworkingUDPMsgID
  /* 37 */ val NoConnection: typingsJapgolly.steamUser.mod.ESteamNetworkingUDPMsgID.NoConnection & Double = js.native
}
