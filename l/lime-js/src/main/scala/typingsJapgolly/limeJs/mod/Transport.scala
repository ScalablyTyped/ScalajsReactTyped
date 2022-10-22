package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport
  extends StObject
     with ITransportStateListener {
  
  def close(): Unit
  
  var compression: String
  
  var encryption: String
  
  def getSupportedCompression(): js.Array[String]
  
  def getSupportedEncryption(): js.Array[String]
  
  def onEnvelope(envelope: Envelope): Any
  
  def open(uri: String): Unit
  
  def send(envelope: Envelope): Unit
  
  def setCompression(compression: String): Unit
  
  def setEncryption(encryption: String): Unit
}
object Transport {
  
  inline def apply(
    close: Callback,
    compression: String,
    encryption: String,
    getSupportedCompression: CallbackTo[js.Array[String]],
    getSupportedEncryption: CallbackTo[js.Array[String]],
    onClose: Callback,
    onEnvelope: Envelope => Any,
    onError: String => Callback,
    onOpen: Callback,
    open: String => Callback,
    send: Envelope => Callback,
    setCompression: String => Callback,
    setEncryption: String => Callback
  ): Transport = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, compression = compression.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], getSupportedCompression = getSupportedCompression.toJsFn, getSupportedEncryption = getSupportedEncryption.toJsFn, onClose = onClose.toJsFn, onEnvelope = js.Any.fromFunction1(onEnvelope), onError = js.Any.fromFunction1((t0: String) => onError(t0).runNow()), onOpen = onOpen.toJsFn, open = js.Any.fromFunction1((t0: String) => open(t0).runNow()), send = js.Any.fromFunction1((t0: Envelope) => send(t0).runNow()), setCompression = js.Any.fromFunction1((t0: String) => setCompression(t0).runNow()), setEncryption = js.Any.fromFunction1((t0: String) => setEncryption(t0).runNow()))
    __obj.asInstanceOf[Transport]
  }
  
  extension [Self <: Transport](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setGetSupportedCompression(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSupportedCompression", value.toJsFn)
    
    inline def setGetSupportedEncryption(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSupportedEncryption", value.toJsFn)
    
    inline def setOnEnvelope(value: Envelope => Any): Self = StObject.set(x, "onEnvelope", js.Any.fromFunction1(value))
    
    inline def setOpen(value: String => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSend(value: Envelope => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: Envelope) => value(t0).runNow()))
    
    inline def setSetCompression(value: String => Callback): Self = StObject.set(x, "setCompression", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetEncryption(value: String => Callback): Self = StObject.set(x, "setEncryption", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
