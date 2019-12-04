package typingsJapgolly.rxjs.internalObservableDomWebSocketSubjectMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MessageEvent
import typingsJapgolly.rxjs.Anon_Protocols
import typingsJapgolly.rxjs.internalTypesMod.NextObserver
import typingsJapgolly.rxjs.rxjsStrings.arraybuffer
import typingsJapgolly.rxjs.rxjsStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketSubjectConfig[T] extends js.Object {
  /**
    * A WebSocket constructor to use. This is useful for situations like using a
    * WebSocket impl in Node (WebSocket is a DOM API), or for mocking a WebSocket
    * for testing purposes
    */
  var WebSocketCtor: js.UndefOr[Anon_Protocols] = js.undefined
  /** Sets the `binaryType` property of the underlying WebSocket. */
  var binaryType: js.UndefOr[blob | arraybuffer] = js.undefined
  /**
    * An Observer than watches when close events occur on the underlying webSocket
    */
  var closeObserver: js.UndefOr[NextObserver[CloseEvent]] = js.undefined
  /**
    * An Observer that watches when a close is about to occur due to
    * unsubscription.
    */
  var closingObserver: js.UndefOr[NextObserver[Unit]] = js.undefined
  /**
    * A deserializer used for messages arriving on the socket from the
    * server. Defaults to JSON.parse.
    */
  var deserializer: js.UndefOr[js.Function1[/* e */ MessageEvent, T]] = js.undefined
  /**
    * An Observer that watches when open events occur on the underlying web socket.
    */
  var openObserver: js.UndefOr[NextObserver[Event]] = js.undefined
  /** The protocol to use to connect */
  var protocol: js.UndefOr[String | js.Array[String]] = js.undefined
  /** @deprecated use {@link deserializer} */
  var resultSelector: js.UndefOr[js.Function1[/* e */ MessageEvent, T]] = js.undefined
  /**
    * A serializer used to create messages from passed values before the
    * messages are sent to the server. Defaults to JSON.stringify.
    */
  var serializer: js.UndefOr[js.Function1[/* value */ T, WebSocketMessage]] = js.undefined
  /** The url of the socket server to connect to */
  var url: String
}

object WebSocketSubjectConfig {
  @scala.inline
  def apply[T](
    url: String,
    WebSocketCtor: Anon_Protocols = null,
    binaryType: blob | arraybuffer = null,
    closeObserver: NextObserver[CloseEvent] = null,
    closingObserver: NextObserver[Unit] = null,
    deserializer: /* e */ MessageEvent => CallbackTo[T] = null,
    openObserver: NextObserver[Event] = null,
    protocol: String | js.Array[String] = null,
    resultSelector: /* e */ MessageEvent => CallbackTo[T] = null,
    serializer: /* value */ T => CallbackTo[WebSocketMessage] = null
  ): WebSocketSubjectConfig[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (WebSocketCtor != null) __obj.updateDynamic("WebSocketCtor")(WebSocketCtor.asInstanceOf[js.Any])
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (closeObserver != null) __obj.updateDynamic("closeObserver")(closeObserver.asInstanceOf[js.Any])
    if (closingObserver != null) __obj.updateDynamic("closingObserver")(closingObserver.asInstanceOf[js.Any])
    if (deserializer != null) __obj.updateDynamic("deserializer")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MessageEvent) => deserializer(t0).runNow()))
    if (openObserver != null) __obj.updateDynamic("openObserver")(openObserver.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (resultSelector != null) __obj.updateDynamic("resultSelector")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MessageEvent) => resultSelector(t0).runNow()))
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction1((t0: /* value */ T) => serializer(t0).runNow()))
    __obj.asInstanceOf[WebSocketSubjectConfig[T]]
  }
}

