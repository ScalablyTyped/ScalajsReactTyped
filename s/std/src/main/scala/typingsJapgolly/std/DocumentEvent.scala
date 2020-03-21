package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.Event
import typingsJapgolly.std.stdStrings.Events
import typingsJapgolly.std.stdStrings.MouseEvents
import typingsJapgolly.std.stdStrings.MutationEvents
import typingsJapgolly.std.stdStrings.SVGZoomEvents
import typingsJapgolly.std.stdStrings.UIEvents
import typingsJapgolly.std.stdStrings.`VRDisplayEvent `
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentEvent extends js.Object {
  def createEvent(eventInterface: java.lang.String): Event_ = js.native
  @JSName("createEvent")
  def createEvent_AnimationEvent(eventInterface: typingsJapgolly.std.stdStrings.AnimationEvent): org.scalajs.dom.raw.AnimationEvent = js.native
  @JSName("createEvent")
  def createEvent_AnimationPlaybackEvent(eventInterface: typingsJapgolly.std.stdStrings.AnimationPlaybackEvent): AnimationPlaybackEvent = js.native
  @JSName("createEvent")
  def createEvent_AudioProcessingEvent(eventInterface: typingsJapgolly.std.stdStrings.AudioProcessingEvent): AudioProcessingEvent = js.native
  @JSName("createEvent")
  def createEvent_BeforeUnloadEvent(eventInterface: typingsJapgolly.std.stdStrings.BeforeUnloadEvent): org.scalajs.dom.raw.BeforeUnloadEvent = js.native
  @JSName("createEvent")
  def createEvent_ClipboardEvent(eventInterface: typingsJapgolly.std.stdStrings.ClipboardEvent): org.scalajs.dom.raw.ClipboardEvent = js.native
  @JSName("createEvent")
  def createEvent_CloseEvent(eventInterface: typingsJapgolly.std.stdStrings.CloseEvent): org.scalajs.dom.raw.CloseEvent = js.native
  @JSName("createEvent")
  def createEvent_CompositionEvent(eventInterface: typingsJapgolly.std.stdStrings.CompositionEvent): org.scalajs.dom.raw.CompositionEvent = js.native
  @JSName("createEvent")
  def createEvent_CustomEvent(eventInterface: typingsJapgolly.std.stdStrings.CustomEvent): org.scalajs.dom.raw.CustomEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceLightEvent(eventInterface: typingsJapgolly.std.stdStrings.DeviceLightEvent): DeviceLightEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceMotionEvent(eventInterface: typingsJapgolly.std.stdStrings.DeviceMotionEvent): org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceOrientationEvent(eventInterface: typingsJapgolly.std.stdStrings.DeviceOrientationEvent): org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent = js.native
  @JSName("createEvent")
  def createEvent_DragEvent(eventInterface: typingsJapgolly.std.stdStrings.DragEvent): org.scalajs.dom.raw.DragEvent = js.native
  @JSName("createEvent")
  def createEvent_ErrorEvent(eventInterface: typingsJapgolly.std.stdStrings.ErrorEvent): org.scalajs.dom.raw.ErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_Event(eventInterface: Event): Event_ = js.native
  @JSName("createEvent")
  def createEvent_Events(eventInterface: Events): Event_ = js.native
  @JSName("createEvent")
  def createEvent_FocusEvent(eventInterface: typingsJapgolly.std.stdStrings.FocusEvent): org.scalajs.dom.raw.FocusEvent = js.native
  @JSName("createEvent")
  def createEvent_FocusNavigationEvent(eventInterface: typingsJapgolly.std.stdStrings.FocusNavigationEvent): FocusNavigationEvent = js.native
  @JSName("createEvent")
  def createEvent_GamepadEvent(eventInterface: typingsJapgolly.std.stdStrings.GamepadEvent): org.scalajs.dom.experimental.gamepad.GamepadEvent = js.native
  @JSName("createEvent")
  def createEvent_HashChangeEvent(eventInterface: typingsJapgolly.std.stdStrings.HashChangeEvent): org.scalajs.dom.raw.HashChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_IDBVersionChangeEvent(eventInterface: typingsJapgolly.std.stdStrings.IDBVersionChangeEvent): org.scalajs.dom.raw.IDBVersionChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_InputEvent(eventInterface: typingsJapgolly.std.stdStrings.InputEvent): InputEvent = js.native
  @JSName("createEvent")
  def createEvent_KeyboardEvent(eventInterface: typingsJapgolly.std.stdStrings.KeyboardEvent): org.scalajs.dom.raw.KeyboardEvent = js.native
  @JSName("createEvent")
  def createEvent_ListeningStateChangedEvent(eventInterface: typingsJapgolly.std.stdStrings.ListeningStateChangedEvent): ListeningStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_MSGestureEvent(eventInterface: typingsJapgolly.std.stdStrings.MSGestureEvent): MSGestureEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyMessageEvent(eventInterface: typingsJapgolly.std.stdStrings.MSMediaKeyMessageEvent): MSMediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyNeededEvent(eventInterface: typingsJapgolly.std.stdStrings.MSMediaKeyNeededEvent): MSMediaKeyNeededEvent = js.native
  @JSName("createEvent")
  def createEvent_MSPointerEvent(eventInterface: typingsJapgolly.std.stdStrings.MSPointerEvent): MSPointerEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaEncryptedEvent(eventInterface: typingsJapgolly.std.stdStrings.MediaEncryptedEvent): MediaEncryptedEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaKeyMessageEvent(eventInterface: typingsJapgolly.std.stdStrings.MediaKeyMessageEvent): MediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaQueryListEvent(eventInterface: typingsJapgolly.std.stdStrings.MediaQueryListEvent): MediaQueryListEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamErrorEvent(eventInterface: typingsJapgolly.std.stdStrings.MediaStreamErrorEvent): MediaStreamErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamEvent(eventInterface: typingsJapgolly.std.stdStrings.MediaStreamEvent): MediaStreamEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamTrackEvent(eventInterface: typingsJapgolly.std.stdStrings.MediaStreamTrackEvent): org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_MessageEvent(eventInterface: typingsJapgolly.std.stdStrings.MessageEvent): org.scalajs.dom.raw.MessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvent(eventInterface: typingsJapgolly.std.stdStrings.MouseEvent): org.scalajs.dom.raw.MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvents(eventInterface: MouseEvents): org.scalajs.dom.raw.MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvent(eventInterface: typingsJapgolly.std.stdStrings.MutationEvent): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvents(eventInterface: MutationEvents): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_OfflineAudioCompletionEvent(eventInterface: typingsJapgolly.std.stdStrings.OfflineAudioCompletionEvent): org.scalajs.dom.raw.OfflineAudioCompletionEvent = js.native
  @JSName("createEvent")
  def createEvent_OverflowEvent(eventInterface: typingsJapgolly.std.stdStrings.OverflowEvent): OverflowEvent = js.native
  @JSName("createEvent")
  def createEvent_PageTransitionEvent(eventInterface: typingsJapgolly.std.stdStrings.PageTransitionEvent): PageTransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_PaymentRequestUpdateEvent(eventInterface: typingsJapgolly.std.stdStrings.PaymentRequestUpdateEvent): PaymentRequestUpdateEvent = js.native
  @JSName("createEvent")
  def createEvent_PermissionRequestedEvent(eventInterface: typingsJapgolly.std.stdStrings.PermissionRequestedEvent): PermissionRequestedEvent = js.native
  @JSName("createEvent")
  def createEvent_PointerEvent(eventInterface: typingsJapgolly.std.stdStrings.PointerEvent): org.scalajs.dom.raw.PointerEvent = js.native
  @JSName("createEvent")
  def createEvent_PopStateEvent(eventInterface: typingsJapgolly.std.stdStrings.PopStateEvent): org.scalajs.dom.raw.PopStateEvent = js.native
  @JSName("createEvent")
  def createEvent_ProgressEvent(eventInterface: typingsJapgolly.std.stdStrings.ProgressEvent): org.scalajs.dom.raw.ProgressEvent = js.native
  @JSName("createEvent")
  def createEvent_PromiseRejectionEvent(eventInterface: typingsJapgolly.std.stdStrings.PromiseRejectionEvent): PromiseRejectionEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDTMFToneChangeEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCDTMFToneChangeEvent): RTCDTMFToneChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDataChannelEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCDataChannelEvent): org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDtlsTransportStateChangedEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCDtlsTransportStateChangedEvent): RTCDtlsTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCErrorEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCErrorEvent): RTCErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceCandidatePairChangedEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCIceCandidatePairChangedEvent): RTCIceCandidatePairChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceGathererEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCIceGathererEvent): RTCIceGathererEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceTransportStateChangedEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCIceTransportStateChangedEvent): RTCIceTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceErrorEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCPeerConnectionIceErrorEvent): RTCPeerConnectionIceErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCPeerConnectionIceEvent): org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCSsrcConflictEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCSsrcConflictEvent): RTCSsrcConflictEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCStatsEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCStatsEvent): RTCStatsEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCTrackEvent(eventInterface: typingsJapgolly.std.stdStrings.RTCTrackEvent): RTCTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvent(eventInterface: typingsJapgolly.std.stdStrings.SVGZoomEvent): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvents(eventInterface: SVGZoomEvents): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SecurityPolicyViolationEvent(eventInterface: typingsJapgolly.std.stdStrings.SecurityPolicyViolationEvent): SecurityPolicyViolationEvent = js.native
  @JSName("createEvent")
  def createEvent_ServiceWorkerMessageEvent(eventInterface: typingsJapgolly.std.stdStrings.ServiceWorkerMessageEvent): ServiceWorkerMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionEvent(eventInterface: typingsJapgolly.std.stdStrings.SpeechRecognitionEvent): SpeechRecognitionEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisErrorEvent(eventInterface: typingsJapgolly.std.stdStrings.SpeechSynthesisErrorEvent): SpeechSynthesisErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisEvent(eventInterface: typingsJapgolly.std.stdStrings.SpeechSynthesisEvent): SpeechSynthesisEvent = js.native
  @JSName("createEvent")
  def createEvent_StorageEvent(eventInterface: typingsJapgolly.std.stdStrings.StorageEvent): org.scalajs.dom.raw.StorageEvent = js.native
  @JSName("createEvent")
  def createEvent_TextEvent(eventInterface: typingsJapgolly.std.stdStrings.TextEvent): org.scalajs.dom.raw.TextEvent = js.native
  @JSName("createEvent")
  def createEvent_TouchEvent(eventInterface: typingsJapgolly.std.stdStrings.TouchEvent): org.scalajs.dom.raw.TouchEvent = js.native
  @JSName("createEvent")
  def createEvent_TrackEvent(eventInterface: typingsJapgolly.std.stdStrings.TrackEvent): org.scalajs.dom.raw.TrackEvent = js.native
  @JSName("createEvent")
  def createEvent_TransitionEvent(eventInterface: typingsJapgolly.std.stdStrings.TransitionEvent): org.scalajs.dom.raw.TransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvent(eventInterface: typingsJapgolly.std.stdStrings.UIEvent): org.scalajs.dom.raw.UIEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvents(eventInterface: UIEvents): org.scalajs.dom.raw.UIEvent = js.native
  @JSName("createEvent")
  def createEvent_VRDisplayEvent(eventInterface: typingsJapgolly.std.stdStrings.VRDisplayEvent): VRDisplayEvent = js.native
  @JSName("createEvent")
  def createEvent_VRDisplayEvent(eventInterface: `VRDisplayEvent `): VRDisplayEvent = js.native
  @JSName("createEvent")
  def createEvent_WebGLContextEvent(eventInterface: typingsJapgolly.std.stdStrings.WebGLContextEvent): WebGLContextEvent = js.native
  @JSName("createEvent")
  def createEvent_WheelEvent(eventInterface: typingsJapgolly.std.stdStrings.WheelEvent): org.scalajs.dom.raw.WheelEvent = js.native
}

