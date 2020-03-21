package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webrtc {
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
  type DataChannelEventHandler[E /* <: typingsJapgolly.std.Event_ */] = (js.ThisFunction1[/* this */ typingsJapgolly.webrtc.RTCDataChannel, /* ev */ E, js.Any]) | scala.Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
  type DtlsTransportEventHandler = (js.ThisFunction1[
    /* this */ typingsJapgolly.webrtc.RTCDtlsTransport, 
    /* ev */ typingsJapgolly.std.Event_, 
    js.Any
  ]) | scala.Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
  type IceTransportEventHandler = (js.ThisFunction1[
    /* this */ typingsJapgolly.webrtc.RTCIceTransport, 
    /* ev */ typingsJapgolly.std.Event_, 
    js.Any
  ]) | scala.Null
  type NavigatorGetUserMedia = js.Function3[
    /* constraints */ typingsJapgolly.webrtc.MediaStreamConstraints, 
    /* successCallback */ js.Function1[/* stream */ typingsJapgolly.webrtc.MediaStream, scala.Unit], 
    /* errorCallback */ js.Function1[/* error */ typingsJapgolly.std.MediaStreamError, scala.Unit], 
    scala.Unit
  ]
  // https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
  type PeerConnectionEventHandler[E /* <: typingsJapgolly.std.Event_ */] = (js.ThisFunction1[/* this */ typingsJapgolly.webrtc.RTCPeerConnection, /* ev */ E, js.Any]) | scala.Null
  // Compatibility for older definitions on DefinitelyTyped.
  type RTCPeerConnectionConfig = typingsJapgolly.webrtc.RTCConfiguration
}
