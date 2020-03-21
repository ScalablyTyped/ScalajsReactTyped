package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends ITransportStateListener {
  var compression: String
  var encryption: String
  def close(): Unit
  def getSupportedCompression(): js.Array[String]
  def getSupportedEncryption(): js.Array[String]
  def onEnvelope(envelope: Envelope): js.Any
  def open(uri: String): Unit
  def send(envelope: Envelope): Unit
  def setCompression(compression: String): Unit
  def setEncryption(encryption: String): Unit
}

object Transport {
  @scala.inline
  def apply(
    close: Callback,
    compression: String,
    encryption: String,
    getSupportedCompression: CallbackTo[js.Array[String]],
    getSupportedEncryption: CallbackTo[js.Array[String]],
    onClose: Callback,
    onEnvelope: Envelope => CallbackTo[js.Any],
    onError: String => Callback,
    onOpen: Callback,
    open: String => Callback,
    send: Envelope => Callback,
    setCompression: String => Callback,
    setEncryption: String => Callback
  ): Transport = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getSupportedCompression")(getSupportedCompression.toJsFn)
    __obj.updateDynamic("getSupportedEncryption")(getSupportedEncryption.toJsFn)
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onEnvelope")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Envelope) => onEnvelope(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: java.lang.String) => onError(t0).runNow()))
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: java.lang.String) => open(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Envelope) => send(t0).runNow()))
    __obj.updateDynamic("setCompression")(js.Any.fromFunction1((t0: java.lang.String) => setCompression(t0).runNow()))
    __obj.updateDynamic("setEncryption")(js.Any.fromFunction1((t0: java.lang.String) => setEncryption(t0).runNow()))
    __obj.asInstanceOf[Transport]
  }
}

