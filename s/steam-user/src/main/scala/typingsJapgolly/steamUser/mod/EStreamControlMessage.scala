package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamControlMessage extends StObject
@JSImport("steam-user", "EStreamControlMessage")
@js.native
object EStreamControlMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamControlMessage & Double] = js.native
  
  @js.native
  sealed trait AuthenticationRequest
    extends StObject
       with EStreamControlMessage
  /* 1 */ val AuthenticationRequest: typingsJapgolly.steamUser.mod.EStreamControlMessage.AuthenticationRequest & Double = js.native
  
  @js.native
  sealed trait AuthenticationResponse
    extends StObject
       with EStreamControlMessage
  /* 2 */ val AuthenticationResponse: typingsJapgolly.steamUser.mod.EStreamControlMessage.AuthenticationResponse & Double = js.native
  
  @js.native
  sealed trait ClientHandshake
    extends StObject
       with EStreamControlMessage
  /* 6 */ val ClientHandshake: typingsJapgolly.steamUser.mod.EStreamControlMessage.ClientHandshake & Double = js.native
  
  @js.native
  sealed trait DeleteCursor
    extends StObject
       with EStreamControlMessage
  /* 68 */ val DeleteCursor: typingsJapgolly.steamUser.mod.EStreamControlMessage.DeleteCursor & Double = js.native
  
  @js.native
  sealed trait DisableHighResCapture
    extends StObject
       with EStreamControlMessage
  /* 125 */ val DisableHighResCapture: typingsJapgolly.steamUser.mod.EStreamControlMessage.DisableHighResCapture & Double = js.native
  
  @js.native
  sealed trait EnableHighResCapture
    extends StObject
       with EStreamControlMessage
  /* 124 */ val EnableHighResCapture: typingsJapgolly.steamUser.mod.EStreamControlMessage.EnableHighResCapture & Double = js.native
  
  @js.native
  sealed trait GetCursorImage
    extends StObject
       with EStreamControlMessage
  /* 66 */ val GetCursorImage: typingsJapgolly.steamUser.mod.EStreamControlMessage.GetCursorImage & Double = js.native
  
  @js.native
  sealed trait GetTouchConfigData
    extends StObject
       with EStreamControlMessage
  /* 111 */ val GetTouchConfigData: typingsJapgolly.steamUser.mod.EStreamControlMessage.GetTouchConfigData & Double = js.native
  
  @js.native
  sealed trait GetTouchIconData
    extends StObject
       with EStreamControlMessage
  /* 115 */ val GetTouchIconData: typingsJapgolly.steamUser.mod.EStreamControlMessage.GetTouchIconData & Double = js.native
  
  @js.native
  sealed trait HideCursor
    extends StObject
       with EStreamControlMessage
  /* 64 */ val HideCursor: typingsJapgolly.steamUser.mod.EStreamControlMessage.HideCursor & Double = js.native
  
  @js.native
  sealed trait InputKeyDown
    extends StObject
       with EStreamControlMessage
  /* 58 */ val InputKeyDown: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputKeyDown & Double = js.native
  
  @js.native
  sealed trait InputKeyUp
    extends StObject
       with EStreamControlMessage
  /* 59 */ val InputKeyUp: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputKeyUp & Double = js.native
  
  @js.native
  sealed trait InputLatencyTest
    extends StObject
       with EStreamControlMessage
  /* 70 */ val InputLatencyTest: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputLatencyTest & Double = js.native
  
  @js.native
  sealed trait InputMouseDown
    extends StObject
       with EStreamControlMessage
  /* 56 */ val InputMouseDown: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputMouseDown & Double = js.native
  
  @js.native
  sealed trait InputMouseMotion
    extends StObject
       with EStreamControlMessage
  /* 54 */ val InputMouseMotion: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputMouseMotion & Double = js.native
  
  @js.native
  sealed trait InputMouseUp
    extends StObject
       with EStreamControlMessage
  /* 57 */ val InputMouseUp: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputMouseUp & Double = js.native
  
  @js.native
  sealed trait InputMouseWheel
    extends StObject
       with EStreamControlMessage
  /* 55 */ val InputMouseWheel: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputMouseWheel & Double = js.native
  
  @js.native
  sealed trait InputText
    extends StObject
       with EStreamControlMessage
  /* 109 */ val InputText: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputText & Double = js.native
  
  @js.native
  sealed trait InputTouchFingerDown
    extends StObject
       with EStreamControlMessage
  /* 117 */ val InputTouchFingerDown: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputTouchFingerDown & Double = js.native
  
  @js.native
  sealed trait InputTouchFingerMotion
    extends StObject
       with EStreamControlMessage
  /* 118 */ val InputTouchFingerMotion: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputTouchFingerMotion & Double = js.native
  
  @js.native
  sealed trait InputTouchFingerUp
    extends StObject
       with EStreamControlMessage
  /* 119 */ val InputTouchFingerUp: typingsJapgolly.steamUser.mod.EStreamControlMessage.InputTouchFingerUp & Double = js.native
  
  @js.native
  sealed trait KeepAlive
    extends StObject
       with EStreamControlMessage
  /* 9 */ val KeepAlive: typingsJapgolly.steamUser.mod.EStreamControlMessage.KeepAlive & Double = js.native
  
  @js.native
  sealed trait LAST_SETUP_MESSAGE
    extends StObject
       with EStreamControlMessage
  /* 15 */ val LAST_SETUP_MESSAGE: typingsJapgolly.steamUser.mod.EStreamControlMessage.LAST_SETUP_MESSAGE & Double = js.native
  
  @js.native
  sealed trait NegotiationComplete
    extends StObject
       with EStreamControlMessage
  /* 5 */ val NegotiationComplete: typingsJapgolly.steamUser.mod.EStreamControlMessage.NegotiationComplete & Double = js.native
  
  @js.native
  sealed trait NegotiationInit
    extends StObject
       with EStreamControlMessage
  /* 3 */ val NegotiationInit: typingsJapgolly.steamUser.mod.EStreamControlMessage.NegotiationInit & Double = js.native
  
  @js.native
  sealed trait NegotiationSetConfig
    extends StObject
       with EStreamControlMessage
  /* 4 */ val NegotiationSetConfig: typingsJapgolly.steamUser.mod.EStreamControlMessage.NegotiationSetConfig & Double = js.native
  
  @js.native
  sealed trait OverlayEnabled
    extends StObject
       with EStreamControlMessage
  /* 74 */ val OverlayEnabled: typingsJapgolly.steamUser.mod.EStreamControlMessage.OverlayEnabled & Double = js.native
  
  @js.native
  sealed trait Pause
    extends StObject
       with EStreamControlMessage
  /* 122 */ val Pause: typingsJapgolly.steamUser.mod.EStreamControlMessage.Pause & Double = js.native
  
  @js.native
  sealed trait QuitRequest
    extends StObject
       with EStreamControlMessage
  /* 83 */ val QuitRequest: typingsJapgolly.steamUser.mod.EStreamControlMessage.QuitRequest & Double = js.native
  
  @js.native
  sealed trait RemoteHID
    extends StObject
       with EStreamControlMessage
  /* 106 */ val RemoteHID: typingsJapgolly.steamUser.mod.EStreamControlMessage.RemoteHID & Double = js.native
  
  @js.native
  sealed trait Resume
    extends StObject
       with EStreamControlMessage
  /* 123 */ val Resume: typingsJapgolly.steamUser.mod.EStreamControlMessage.Resume & Double = js.native
  
  @js.native
  sealed trait SaveTouchConfigLayout
    extends StObject
       with EStreamControlMessage
  /* 113 */ val SaveTouchConfigLayout: typingsJapgolly.steamUser.mod.EStreamControlMessage.SaveTouchConfigLayout & Double = js.native
  
  @js.native
  sealed trait ServerHandshake
    extends StObject
       with EStreamControlMessage
  /* 7 */ val ServerHandshake: typingsJapgolly.steamUser.mod.EStreamControlMessage.ServerHandshake & Double = js.native
  
  @js.native
  sealed trait SetActivity
    extends StObject
       with EStreamControlMessage
  /* 98 */ val SetActivity: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetActivity & Double = js.native
  
  @js.native
  sealed trait SetCapslock
    extends StObject
       with EStreamControlMessage
  /* 127 */ val SetCapslock: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetCapslock & Double = js.native
  
  @js.native
  sealed trait SetCaptureSize
    extends StObject
       with EStreamControlMessage
  /* 120 */ val SetCaptureSize: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetCaptureSize & Double = js.native
  
  @js.native
  sealed trait SetCursor
    extends StObject
       with EStreamControlMessage
  /* 65 */ val SetCursor: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetCursor & Double = js.native
  
  @js.native
  sealed trait SetCursorImage
    extends StObject
       with EStreamControlMessage
  /* 67 */ val SetCursorImage: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetCursorImage & Double = js.native
  
  @js.native
  sealed trait SetFlashState
    extends StObject
       with EStreamControlMessage
  /* 121 */ val SetFlashState: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetFlashState & Double = js.native
  
  @js.native
  sealed trait SetGammaRamp
    extends StObject
       with EStreamControlMessage
  /* 89 */ val SetGammaRamp: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetGammaRamp & Double = js.native
  
  @js.native
  sealed trait SetIcon
    extends StObject
       with EStreamControlMessage
  /* 82 */ val SetIcon: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetIcon & Double = js.native
  
  @js.native
  sealed trait SetKeymap
    extends StObject
       with EStreamControlMessage
  /* 128 */ val SetKeymap: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetKeymap & Double = js.native
  
  @js.native
  sealed trait SetQoS
    extends StObject
       with EStreamControlMessage
  /* 87 */ val SetQoS: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetQoS & Double = js.native
  
  @js.native
  sealed trait SetSpectatorMode
    extends StObject
       with EStreamControlMessage
  /* 105 */ val SetSpectatorMode: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetSpectatorMode & Double = js.native
  
  @js.native
  sealed trait SetStreamingClientConfig
    extends StObject
       with EStreamControlMessage
  /* 99 */ val SetStreamingClientConfig: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetStreamingClientConfig & Double = js.native
  
  @js.native
  sealed trait SetTargetBitrate
    extends StObject
       with EStreamControlMessage
  /* 94 */ val SetTargetBitrate: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetTargetBitrate & Double = js.native
  
  @js.native
  sealed trait SetTargetFramerate
    extends StObject
       with EStreamControlMessage
  /* 69 */ val SetTargetFramerate: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetTargetFramerate & Double = js.native
  
  @js.native
  sealed trait SetTitle
    extends StObject
       with EStreamControlMessage
  /* 81 */ val SetTitle: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetTitle & Double = js.native
  
  @js.native
  sealed trait SetTouchConfigData
    extends StObject
       with EStreamControlMessage
  /* 112 */ val SetTouchConfigData: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetTouchConfigData & Double = js.native
  
  @js.native
  sealed trait SetTouchIconData
    extends StObject
       with EStreamControlMessage
  /* 116 */ val SetTouchIconData: typingsJapgolly.steamUser.mod.EStreamControlMessage.SetTouchIconData & Double = js.native
  
  @js.native
  sealed trait ShowCursor
    extends StObject
       with EStreamControlMessage
  /* 63 */ val ShowCursor: typingsJapgolly.steamUser.mod.EStreamControlMessage.ShowCursor & Double = js.native
  
  @js.native
  sealed trait StartAudioData
    extends StObject
       with EStreamControlMessage
  /* 50 */ val StartAudioData: typingsJapgolly.steamUser.mod.EStreamControlMessage.StartAudioData & Double = js.native
  
  @js.native
  sealed trait StartMicrophoneData
    extends StObject
       with EStreamControlMessage
  /* 107 */ val StartMicrophoneData: typingsJapgolly.steamUser.mod.EStreamControlMessage.StartMicrophoneData & Double = js.native
  
  @js.native
  sealed trait StartNetworkTest
    extends StObject
       with EStreamControlMessage
  /* 8 */ val StartNetworkTest: typingsJapgolly.steamUser.mod.EStreamControlMessage.StartNetworkTest & Double = js.native
  
  @js.native
  sealed trait StartVideoData
    extends StObject
       with EStreamControlMessage
  /* 52 */ val StartVideoData: typingsJapgolly.steamUser.mod.EStreamControlMessage.StartVideoData & Double = js.native
  
  @js.native
  sealed trait StopAudioData
    extends StObject
       with EStreamControlMessage
  /* 51 */ val StopAudioData: typingsJapgolly.steamUser.mod.EStreamControlMessage.StopAudioData & Double = js.native
  
  @js.native
  sealed trait StopMicrophoneData
    extends StObject
       with EStreamControlMessage
  /* 108 */ val StopMicrophoneData: typingsJapgolly.steamUser.mod.EStreamControlMessage.StopMicrophoneData & Double = js.native
  
  @js.native
  sealed trait StopRequest
    extends StObject
       with EStreamControlMessage
  /* 129 */ val StopRequest: typingsJapgolly.steamUser.mod.EStreamControlMessage.StopRequest & Double = js.native
  
  @js.native
  sealed trait StopVideoData
    extends StObject
       with EStreamControlMessage
  /* 53 */ val StopVideoData: typingsJapgolly.steamUser.mod.EStreamControlMessage.StopVideoData & Double = js.native
  
  @js.native
  sealed trait SystemSuspend
    extends StObject
       with EStreamControlMessage
  /* 100 */ val SystemSuspend: typingsJapgolly.steamUser.mod.EStreamControlMessage.SystemSuspend & Double = js.native
  
  @js.native
  sealed trait ToggleMagnification
    extends StObject
       with EStreamControlMessage
  /* 126 */ val ToggleMagnification: typingsJapgolly.steamUser.mod.EStreamControlMessage.ToggleMagnification & Double = js.native
  
  @js.native
  sealed trait TouchActionSetActive
    extends StObject
       with EStreamControlMessage
  /* 114 */ val TouchActionSetActive: typingsJapgolly.steamUser.mod.EStreamControlMessage.TouchActionSetActive & Double = js.native
  
  @js.native
  sealed trait TouchActionSetLayerAdded
    extends StObject
       with EStreamControlMessage
  /* 130 */ val TouchActionSetLayerAdded: typingsJapgolly.steamUser.mod.EStreamControlMessage.TouchActionSetLayerAdded & Double = js.native
  
  @js.native
  sealed trait TouchActionSetLayerRemoved
    extends StObject
       with EStreamControlMessage
  /* 131 */ val TouchActionSetLayerRemoved: typingsJapgolly.steamUser.mod.EStreamControlMessage.TouchActionSetLayerRemoved & Double = js.native
  
  @js.native
  sealed trait TouchConfigActive
    extends StObject
       with EStreamControlMessage
  /* 110 */ val TouchConfigActive: typingsJapgolly.steamUser.mod.EStreamControlMessage.TouchConfigActive & Double = js.native
  
  @js.native
  sealed trait VideoDecoderInfo
    extends StObject
       with EStreamControlMessage
  /* 80 */ val VideoDecoderInfo: typingsJapgolly.steamUser.mod.EStreamControlMessage.VideoDecoderInfo & Double = js.native
  
  @js.native
  sealed trait VideoEncoderInfo
    extends StObject
       with EStreamControlMessage
  /* 90 */ val VideoEncoderInfo: typingsJapgolly.steamUser.mod.EStreamControlMessage.VideoEncoderInfo & Double = js.native
  
  @js.native
  sealed trait VirtualHereReady
    extends StObject
       with EStreamControlMessage
  /* 103 */ val VirtualHereReady: typingsJapgolly.steamUser.mod.EStreamControlMessage.VirtualHereReady & Double = js.native
  
  @js.native
  sealed trait VirtualHereRequest
    extends StObject
       with EStreamControlMessage
  /* 102 */ val VirtualHereRequest: typingsJapgolly.steamUser.mod.EStreamControlMessage.VirtualHereRequest & Double = js.native
  
  @js.native
  sealed trait VirtualHereShareDevice
    extends StObject
       with EStreamControlMessage
  /* 104 */ val VirtualHereShareDevice: typingsJapgolly.steamUser.mod.EStreamControlMessage.VirtualHereShareDevice & Double = js.native
}
