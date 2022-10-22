package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
/**
  *    VoxImplant.Client general events
  */
@JSImport("voximplant-websdk", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events & Double] = js.native
  
  @js.native
  sealed trait AuthResult
    extends StObject
       with Events
  /* 0 */ val AuthResult: typingsJapgolly.voximplantWebsdk.mod.Events.AuthResult & Double = js.native
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with Events
  /* 1 */ val ConnectionClosed: typingsJapgolly.voximplantWebsdk.mod.Events.ConnectionClosed & Double = js.native
  
  @js.native
  sealed trait ConnectionEstablished
    extends StObject
       with Events
  /* 2 */ val ConnectionEstablished: typingsJapgolly.voximplantWebsdk.mod.Events.ConnectionEstablished & Double = js.native
  
  @js.native
  sealed trait ConnectionFailed
    extends StObject
       with Events
  /* 3 */ val ConnectionFailed: typingsJapgolly.voximplantWebsdk.mod.Events.ConnectionFailed & Double = js.native
  
  @js.native
  sealed trait IncomingCall
    extends StObject
       with Events
  /* 4 */ val IncomingCall: typingsJapgolly.voximplantWebsdk.mod.Events.IncomingCall & Double = js.native
  
  @js.native
  sealed trait MicAccessResult
    extends StObject
       with Events
  /* 5 */ val MicAccessResult: typingsJapgolly.voximplantWebsdk.mod.Events.MicAccessResult & Double = js.native
  
  @js.native
  sealed trait NetStatsReceived
    extends StObject
       with Events
  /* 6 */ val NetStatsReceived: typingsJapgolly.voximplantWebsdk.mod.Events.NetStatsReceived & Double = js.native
  
  @js.native
  sealed trait PlaybackFinished
    extends StObject
       with Events
  /* 7 */ val PlaybackFinished: typingsJapgolly.voximplantWebsdk.mod.Events.PlaybackFinished & Double = js.native
  
  @js.native
  sealed trait SDKReady
    extends StObject
       with Events
  /* 8 */ val SDKReady: typingsJapgolly.voximplantWebsdk.mod.Events.SDKReady & Double = js.native
  
  @js.native
  sealed trait SourcesInfoUpdated
    extends StObject
       with Events
  /* 9 */ val SourcesInfoUpdated: typingsJapgolly.voximplantWebsdk.mod.Events.SourcesInfoUpdated & Double = js.native
}
