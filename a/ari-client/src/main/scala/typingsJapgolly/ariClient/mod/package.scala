package typingsJapgolly.ariClient.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ariClient.ariClientStrings.APILoadError
import typingsJapgolly.ariClient.ariClientStrings.ApplicationReplaced
import typingsJapgolly.ariClient.ariClientStrings.WebSocketConnected
import typingsJapgolly.ariClient.ariClientStrings.WebSocketMaxRetries
import typingsJapgolly.ariClient.ariClientStrings.WebSocketReconnecting
import typingsJapgolly.ariClient.ariClientStrings.pong
import typingsJapgolly.ariClient.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def connect(baseUrl: String, user: String, pass: String): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(baseUrl.asInstanceOf[js.Any], user.asInstanceOf[js.Any], pass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
inline def connect(
  baseUrl: String,
  user: String,
  pass: String,
  callback: js.Function2[/* err */ js.Error, /* client */ Client, Unit]
): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(baseUrl.asInstanceOf[js.Any], user.asInstanceOf[js.Any], pass.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]

type APILoadErrorEventType = APILoadError

type AnyEventType = WebSocketConnectedEventType | WebSocketReconnectingEventType | WebSocketMaxRetriesEventType | PongEventType | APILoadErrorEventType | EventsEventType | MessageEventType | MissingParamsEventType | EventEventType | ContactInfoEventType | PeerEventType | DeviceStateChangedEventType | PlaybackStartedEventType | PlaybackContinuingEventType | PlaybackFinishedEventType | RecordingStartedEventType | RecordingFinishedEventType | RecordingFailedEventType | ApplicationMoveFailedEventType | ApplicationReplacedEventType | BridgeCreatedEventType | BridgeDestroyedEventType | BridgeMergedEventType | BridgeVideoSourceChangedEventType | BridgeBlindTransferEventType | BridgeAttendedTransferEventType | ChannelCreatedEventType | ChannelDestroyedEventType | ChannelEnteredBridgeEventType | ChannelLeftBridgeEventType | ChannelStateChangeEventType | ChannelDtmfReceivedEventType | ChannelDialplanEventType | ChannelCallerIdEventType | ChannelUsereventEventType | ChannelHangupRequestEventType | ChannelVarsetEventType | ChannelHoldEventType | ChannelUnholdEventType | ChannelTalkingStartedEventType | ChannelTalkingFinishedEventType | ContactStatusChangeEventType | PeerStatusChangeEventType | EndpointStateChangeEventType | DialEventType | StasisEndEventType | StasisStartEventType | TextMessageReceivedEventType | ChannelConnectedLineEventType

type ApplicationMoveFailedEventType = typingsJapgolly.ariClient.ariClientStrings.ApplicationMoveFailed

type ApplicationReplacedEventType = ApplicationReplaced

type BridgeAttendedTransferEventType = typingsJapgolly.ariClient.ariClientStrings.BridgeAttendedTransfer

type BridgeBlindTransferEventType = typingsJapgolly.ariClient.ariClientStrings.BridgeBlindTransfer

type BridgeCreatedEventType = typingsJapgolly.ariClient.ariClientStrings.BridgeCreated

type BridgeDestroyedEventType = typingsJapgolly.ariClient.ariClientStrings.BridgeDestroyed

type BridgeMergedEventType = typingsJapgolly.ariClient.ariClientStrings.BridgeMerged

type BridgeVideoSourceChangedEventType = typingsJapgolly.ariClient.ariClientStrings.BridgeVideoSourceChanged

type ChannelCallerIdEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelCallerId

type ChannelConnectedLineEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelConnectedLine

type ChannelCreatedEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelCreated

type ChannelDestroyedEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelDestroyed

type ChannelDialplanEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelDialplan

type ChannelDtmfReceivedEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelDtmfReceived

type ChannelEnteredBridgeEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelEnteredBridge

type ChannelHangupRequestEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelHangupRequest

type ChannelHoldEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelHold

type ChannelLeftBridgeEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelLeftBridge

type ChannelStateChangeEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelStateChange

type ChannelTalkingFinishedEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelTalkingFinished

type ChannelTalkingStartedEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelTalkingStarted

type ChannelUnholdEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelUnhold

type ChannelUsereventEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelUserevent

type ChannelVarsetEventType = typingsJapgolly.ariClient.ariClientStrings.ChannelVarset

type ContactInfoEventType = typingsJapgolly.ariClient.ariClientStrings.ContactInfo

type ContactStatusChangeEventType = typingsJapgolly.ariClient.ariClientStrings.ContactStatusChange

type Containers = StringDictionary[Any]

type DeviceStateChangedEventType = typingsJapgolly.ariClient.ariClientStrings.DeviceStateChanged

type DialEventType = typingsJapgolly.ariClient.ariClientStrings.Dial

type EndpointStateChangeEventType = typingsJapgolly.ariClient.ariClientStrings.EndpointStateChange

type EventEventType = typingsJapgolly.ariClient.ariClientStrings.Event

type EventsEventType = typingsJapgolly.ariClient.ariClientStrings.Events

type IndexableObject = StringDictionary[Any]

type MessageEventType = typingsJapgolly.ariClient.ariClientStrings.Message

type MissingParamsEventType = typingsJapgolly.ariClient.ariClientStrings.MissingParams

type PeerEventType = typingsJapgolly.ariClient.ariClientStrings.Peer

type PeerStatusChangeEventType = typingsJapgolly.ariClient.ariClientStrings.PeerStatusChange

type PlaybackContinuingEventType = typingsJapgolly.ariClient.ariClientStrings.PlaybackContinuing

type PlaybackFinishedEventType = typingsJapgolly.ariClient.ariClientStrings.PlaybackFinished

type PlaybackStartedEventType = typingsJapgolly.ariClient.ariClientStrings.PlaybackStarted

type PongEventType = pong

type RecordingFailedEventType = typingsJapgolly.ariClient.ariClientStrings.RecordingFailed

type RecordingFinishedEventType = typingsJapgolly.ariClient.ariClientStrings.RecordingFinished

type RecordingStartedEventType = typingsJapgolly.ariClient.ariClientStrings.RecordingStarted

type StasisEndEventType = typingsJapgolly.ariClient.ariClientStrings.StasisEnd

type StasisStartEventType = typingsJapgolly.ariClient.ariClientStrings.StasisStart

type TextMessageReceivedEventType = typingsJapgolly.ariClient.ariClientStrings.TextMessageReceived

type WebSocketConnectedEventType = WebSocketConnected

type WebSocketMaxRetriesEventType = WebSocketMaxRetries

type WebSocketReconnectingEventType = WebSocketReconnecting
