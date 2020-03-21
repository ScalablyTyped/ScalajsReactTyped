package typingsJapgolly.node.http2Mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSessionOptions extends SessionOptions {
  var Http1IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, IncomingMessage]] = js.undefined
  var Http1ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, ServerResponse]] = js.undefined
  var Http2ServerRequest: js.UndefOr[
    Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      typingsJapgolly.node.http2Mod.Http2ServerRequest
    ]
  ] = js.undefined
  var Http2ServerResponse: js.UndefOr[
    Instantiable1[/* stream */ ServerHttp2Stream, typingsJapgolly.node.http2Mod.Http2ServerResponse]
  ] = js.undefined
}

object ServerSessionOptions {
  @scala.inline
  def apply(
    Http1IncomingMessage: Instantiable1[/* socket */ Socket, IncomingMessage] = null,
    Http1ServerResponse: Instantiable1[/* req */ IncomingMessage, ServerResponse] = null,
    Http2ServerRequest: Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      Http2ServerRequest
    ] = null,
    Http2ServerResponse: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse] = null,
    createConnection: (/* authority */ URL_, ServerSessionOptions) => CallbackTo[Duplex] = null,
    maxDeflateDynamicTableSize: Int | Double = null,
    maxHeaderListPairs: Int | Double = null,
    maxOutstandingPings: Int | Double = null,
    maxSendHeaderBlockLength: Int | Double = null,
    maxSessionMemory: Int | Double = null,
    paddingStrategy: Int | Double = null,
    peerMaxConcurrentStreams: Int | Double = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => CallbackTo[Double] = null,
    settings: Settings = null
  ): ServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (Http1IncomingMessage != null) __obj.updateDynamic("Http1IncomingMessage")(Http1IncomingMessage.asInstanceOf[js.Any])
    if (Http1ServerResponse != null) __obj.updateDynamic("Http1ServerResponse")(Http1ServerResponse.asInstanceOf[js.Any])
    if (Http2ServerRequest != null) __obj.updateDynamic("Http2ServerRequest")(Http2ServerRequest.asInstanceOf[js.Any])
    if (Http2ServerResponse != null) __obj.updateDynamic("Http2ServerResponse")(Http2ServerResponse.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2((t0: /* authority */ typingsJapgolly.node.urlMod.URL_, t1: typingsJapgolly.node.http2Mod.ServerSessionOptions) => createConnection(t0, t1).runNow()))
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxHeaderListPairs != null) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.asInstanceOf[js.Any])
    if (maxOutstandingPings != null) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxSessionMemory != null) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.asInstanceOf[js.Any])
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2((t0: /* frameLen */ scala.Double, t1: /* maxFrameLen */ scala.Double) => selectPadding(t0, t1).runNow()))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSessionOptions]
  }
}

