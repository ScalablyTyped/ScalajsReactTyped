package typingsJapgolly.node.http2Mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.nodeStrings.httpColon
import typingsJapgolly.node.nodeStrings.httpsColon
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSessionOptions extends SessionOptions {
  @JSName("createConnection")
  var createConnection_ClientSessionOptions: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ SessionOptions, Duplex]] = js.undefined
  var maxReservedRemoteStreams: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[httpColon | httpsColon] = js.undefined
}

object ClientSessionOptions {
  @scala.inline
  def apply(
    createConnection: (/* authority */ URL_, /* option */ SessionOptions) => CallbackTo[Duplex] = null,
    maxDeflateDynamicTableSize: Int | Double = null,
    maxHeaderListPairs: Int | Double = null,
    maxOutstandingPings: Int | Double = null,
    maxReservedRemoteStreams: Int | Double = null,
    maxSendHeaderBlockLength: Int | Double = null,
    maxSessionMemory: Int | Double = null,
    paddingStrategy: Int | Double = null,
    peerMaxConcurrentStreams: Int | Double = null,
    protocol: httpColon | httpsColon = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => CallbackTo[Double] = null,
    settings: Settings = null
  ): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2((t0: /* authority */ typingsJapgolly.node.urlMod.URL_, t1: /* option */ typingsJapgolly.node.http2Mod.SessionOptions) => createConnection(t0, t1).runNow()))
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxHeaderListPairs != null) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.asInstanceOf[js.Any])
    if (maxOutstandingPings != null) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.asInstanceOf[js.Any])
    if (maxReservedRemoteStreams != null) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxSessionMemory != null) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.asInstanceOf[js.Any])
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2((t0: /* frameLen */ scala.Double, t1: /* maxFrameLen */ scala.Double) => selectPadding(t0, t1).runNow()))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSessionOptions]
  }
}

