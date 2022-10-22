package typingsJapgolly.ot.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerAdapterCallbacks extends StObject {
  
  def ack(): Unit
  
  def client_left(clientId: String): Unit
  
  def clients(clients: Any): Unit
  
  def operation(operation: SerializedTextOperation): Unit
  
  def reconnect(): Unit
  
  def selection(clientId: String, selection: String): Unit
  
  def set_name(clientId: String, name: String): Unit
}
object ServerAdapterCallbacks {
  
  inline def apply(
    ack: Callback,
    client_left: String => Callback,
    clients: Any => Callback,
    operation: SerializedTextOperation => Callback,
    reconnect: Callback,
    selection: (String, String) => Callback,
    set_name: (String, String) => Callback
  ): ServerAdapterCallbacks = {
    val __obj = js.Dynamic.literal(ack = ack.toJsFn, client_left = js.Any.fromFunction1((t0: String) => client_left(t0).runNow()), clients = js.Any.fromFunction1((t0: Any) => clients(t0).runNow()), operation = js.Any.fromFunction1((t0: SerializedTextOperation) => operation(t0).runNow()), reconnect = reconnect.toJsFn, selection = js.Any.fromFunction2((t0: String, t1: String) => (selection(t0, t1)).runNow()), set_name = js.Any.fromFunction2((t0: String, t1: String) => (set_name(t0, t1)).runNow()))
    __obj.asInstanceOf[ServerAdapterCallbacks]
  }
  
  extension [Self <: ServerAdapterCallbacks](x: Self) {
    
    inline def setAck(value: Callback): Self = StObject.set(x, "ack", value.toJsFn)
    
    inline def setClient_left(value: String => Callback): Self = StObject.set(x, "client_left", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClients(value: Any => Callback): Self = StObject.set(x, "clients", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOperation(value: SerializedTextOperation => Callback): Self = StObject.set(x, "operation", js.Any.fromFunction1((t0: SerializedTextOperation) => value(t0).runNow()))
    
    inline def setReconnect(value: Callback): Self = StObject.set(x, "reconnect", value.toJsFn)
    
    inline def setSelection(value: (String, String) => Callback): Self = StObject.set(x, "selection", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSet_name(value: (String, String) => Callback): Self = StObject.set(x, "set_name", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
