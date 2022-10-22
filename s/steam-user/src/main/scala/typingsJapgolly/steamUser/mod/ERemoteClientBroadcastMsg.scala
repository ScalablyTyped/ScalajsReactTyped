package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteClientBroadcastMsg extends StObject
@JSImport("steam-user", "ERemoteClientBroadcastMsg")
@js.native
object ERemoteClientBroadcastMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteClientBroadcastMsg & Double] = js.native
  
  @js.native
  sealed trait AuthorizationCancelRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 9 */ val AuthorizationCancelRequest: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.AuthorizationCancelRequest & Double = js.native
  
  @js.native
  sealed trait AuthorizationRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 3 */ val AuthorizationRequest: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.AuthorizationRequest & Double = js.native
  
  @js.native
  sealed trait AuthorizationResponse
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 4 */ val AuthorizationResponse: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.AuthorizationResponse & Double = js.native
  
  @js.native
  sealed trait ClientIDDeconflict
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 11 */ val ClientIDDeconflict: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.ClientIDDeconflict & Double = js.native
  
  @js.native
  sealed trait Discovery
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 0 */ val Discovery: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.Discovery & Double = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 2 */ val Offline: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.Offline & Double = js.native
  
  @js.native
  sealed trait ProofRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 7 */ val ProofRequest: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.ProofRequest & Double = js.native
  
  @js.native
  sealed trait ProofResponse
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 8 */ val ProofResponse: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.ProofResponse & Double = js.native
  
  @js.native
  sealed trait Status
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 1 */ val Status: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.Status & Double = js.native
  
  @js.native
  sealed trait StreamTransportSignal
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 12 */ val StreamTransportSignal: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.StreamTransportSignal & Double = js.native
  
  @js.native
  sealed trait StreamingCancelRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 10 */ val StreamingCancelRequest: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.StreamingCancelRequest & Double = js.native
  
  @js.native
  sealed trait StreamingProgress
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 13 */ val StreamingProgress: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.StreamingProgress & Double = js.native
  
  @js.native
  sealed trait StreamingRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 5 */ val StreamingRequest: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.StreamingRequest & Double = js.native
  
  @js.native
  sealed trait StreamingResponse
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 6 */ val StreamingResponse: typingsJapgolly.steamUser.mod.ERemoteClientBroadcastMsg.StreamingResponse & Double = js.native
}
