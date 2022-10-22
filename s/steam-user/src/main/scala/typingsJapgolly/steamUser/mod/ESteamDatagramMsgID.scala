package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESteamDatagramMsgID extends StObject
@JSImport("steam-user", "ESteamDatagramMsgID")
@js.native
object ESteamDatagramMsgID extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESteamDatagramMsgID & Double] = js.native
  
  @js.native
  sealed trait ClientPingSampleReply
    extends StObject
       with ESteamDatagramMsgID
  /* 15 */ val ClientPingSampleReply: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.ClientPingSampleReply & Double = js.native
  
  @js.native
  sealed trait ClientPingSampleRequest
    extends StObject
       with ESteamDatagramMsgID
  /* 14 */ val ClientPingSampleRequest: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.ClientPingSampleRequest & Double = js.native
  
  @js.native
  sealed trait ClientToRouterSwitchedPrimary
    extends StObject
       with ESteamDatagramMsgID
  /* 16 */ val ClientToRouterSwitchedPrimary: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.ClientToRouterSwitchedPrimary & Double = js.native
  
  @js.native
  sealed trait ConnectOK
    extends StObject
       with ESteamDatagramMsgID
  /* 19 */ val ConnectOK: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.ConnectOK & Double = js.native
  
  @js.native
  sealed trait ConnectRequest
    extends StObject
       with ESteamDatagramMsgID
  /* 18 */ val ConnectRequest: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.ConnectRequest & Double = js.native
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with ESteamDatagramMsgID
  /* 20 */ val ConnectionClosed: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.ConnectionClosed & Double = js.native
  
  @js.native
  sealed trait DataClientToRouter
    extends StObject
       with ESteamDatagramMsgID
  /* 9 */ val DataClientToRouter: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.DataClientToRouter & Double = js.native
  
  @js.native
  sealed trait DataRouterToClient
    extends StObject
       with ESteamDatagramMsgID
  /* 12 */ val DataRouterToClient: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.DataRouterToClient & Double = js.native
  
  @js.native
  sealed trait DataRouterToServer
    extends StObject
       with ESteamDatagramMsgID
  /* 10 */ val DataRouterToServer: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.DataRouterToServer & Double = js.native
  
  @js.native
  sealed trait DataServerToRouter
    extends StObject
       with ESteamDatagramMsgID
  /* 11 */ val DataServerToRouter: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.DataServerToRouter & Double = js.native
  
  @js.native
  sealed trait Diagnostic
    extends StObject
       with ESteamDatagramMsgID
  /* 8 */ val Diagnostic: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.Diagnostic & Double = js.native
  
  @js.native
  sealed trait GameserverPingReply
    extends StObject
       with ESteamDatagramMsgID
  /* 29 */ val GameserverPingReply: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.GameserverPingReply & Double = js.native
  
  @js.native
  sealed trait GameserverPingRequest
    extends StObject
       with ESteamDatagramMsgID
  /* 3 */ val GameserverPingRequest: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.GameserverPingRequest & Double = js.native
  
  @js.native
  sealed trait GameserverRegistration
    extends StObject
       with ESteamDatagramMsgID
  /* 30 */ val GameserverRegistration: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.GameserverRegistration & Double = js.native
  
  @js.native
  sealed trait GameserverSessionEstablished
    extends StObject
       with ESteamDatagramMsgID
  /* 6 */ val GameserverSessionEstablished: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.GameserverSessionEstablished & Double = js.native
  
  @js.native
  sealed trait GameserverSessionRequest
    extends StObject
       with ESteamDatagramMsgID
  /* 5 */ val GameserverSessionRequest: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.GameserverSessionRequest & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ESteamDatagramMsgID
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.Invalid & Double = js.native
  
  @js.native
  sealed trait LegacyGameserverPingReply
    extends StObject
       with ESteamDatagramMsgID
  /* 4 */ val LegacyGameserverPingReply: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.LegacyGameserverPingReply & Double = js.native
  
  @js.native
  sealed trait NoConnection
    extends StObject
       with ESteamDatagramMsgID
  /* 21 */ val NoConnection: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.NoConnection & Double = js.native
  
  @js.native
  sealed trait NoSession
    extends StObject
       with ESteamDatagramMsgID
  /* 7 */ val NoSession: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.NoSession & Double = js.native
  
  @js.native
  sealed trait P2PBadRoute
    extends StObject
       with ESteamDatagramMsgID
  /* 28 */ val P2PBadRoute: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.P2PBadRoute & Double = js.native
  
  @js.native
  sealed trait P2PSessionEstablished
    extends StObject
       with ESteamDatagramMsgID
  /* 25 */ val P2PSessionEstablished: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.P2PSessionEstablished & Double = js.native
  
  @js.native
  sealed trait P2PSessionRequest
    extends StObject
       with ESteamDatagramMsgID
  /* 24 */ val P2PSessionRequest: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.P2PSessionRequest & Double = js.native
  
  @js.native
  sealed trait P2PStatsClient
    extends StObject
       with ESteamDatagramMsgID
  /* 26 */ val P2PStatsClient: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.P2PStatsClient & Double = js.native
  
  @js.native
  sealed trait P2PStatsRelay
    extends StObject
       with ESteamDatagramMsgID
  /* 27 */ val P2PStatsRelay: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.P2PStatsRelay & Double = js.native
  
  @js.native
  sealed trait RelayHealth
    extends StObject
       with ESteamDatagramMsgID
  /* 17 */ val RelayHealth: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.RelayHealth & Double = js.native
  
  @js.native
  sealed trait RelayToRelayPingReply
    extends StObject
       with ESteamDatagramMsgID
  /* 23 */ val RelayToRelayPingReply: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.RelayToRelayPingReply & Double = js.native
  
  @js.native
  sealed trait RelayToRelayPingRequest
    extends StObject
       with ESteamDatagramMsgID
  /* 22 */ val RelayToRelayPingRequest: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.RelayToRelayPingRequest & Double = js.native
  
  @js.native
  sealed trait RouterPingReply
    extends StObject
       with ESteamDatagramMsgID
  /* 2 */ val RouterPingReply: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.RouterPingReply & Double = js.native
  
  @js.native
  sealed trait RouterPingRequest
    extends StObject
       with ESteamDatagramMsgID
  /* 1 */ val RouterPingRequest: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.RouterPingRequest & Double = js.native
  
  @js.native
  sealed trait Stats
    extends StObject
       with ESteamDatagramMsgID
  /* 13 */ val Stats: typingsJapgolly.steamUser.mod.ESteamDatagramMsgID.Stats & Double = js.native
}
