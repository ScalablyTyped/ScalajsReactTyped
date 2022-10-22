package typingsJapgolly.tizenAccessory

import japgolly.scalajs.react.Callback
import typingsJapgolly.tizenAccessory.anon.Onsent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMessage extends StObject {
  
  def sendData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit
  
  def sendSecureData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit
  
  def setMessageReceiveListener(receiveDataCallback: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit]): Unit
}
object SAMessage {
  
  inline def apply(
    sendData: (SAPeerAgent, String, Onsent) => Callback,
    sendSecureData: (SAPeerAgent, String, Onsent) => Callback,
    setMessageReceiveListener: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Callback
  ): SAMessage = {
    val __obj = js.Dynamic.literal(sendData = js.Any.fromFunction3((t0: SAPeerAgent, t1: String, t2: Onsent) => (sendData(t0, t1, t2)).runNow()), sendSecureData = js.Any.fromFunction3((t0: SAPeerAgent, t1: String, t2: Onsent) => (sendSecureData(t0, t1, t2)).runNow()), setMessageReceiveListener = js.Any.fromFunction1((t0: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit]) => setMessageReceiveListener(t0).runNow()))
    __obj.asInstanceOf[SAMessage]
  }
  
  extension [Self <: SAMessage](x: Self) {
    
    inline def setSendData(value: (SAPeerAgent, String, Onsent) => Callback): Self = StObject.set(x, "sendData", js.Any.fromFunction3((t0: SAPeerAgent, t1: String, t2: Onsent) => (value(t0, t1, t2)).runNow()))
    
    inline def setSendSecureData(value: (SAPeerAgent, String, Onsent) => Callback): Self = StObject.set(x, "sendSecureData", js.Any.fromFunction3((t0: SAPeerAgent, t1: String, t2: Onsent) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetMessageReceiveListener(value: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Callback): Self = StObject.set(x, "setMessageReceiveListener", js.Any.fromFunction1((t0: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit]) => value(t0).runNow()))
  }
}
