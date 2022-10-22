package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import typingsJapgolly.meteorTypings.Meteor.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  def added(collection: String, id: String, fields: js.Object): Unit
  
  def changed(collection: String, id: String, fields: js.Object): Unit
  
  var connection: Connection
  
  def error(error: js.Error): Unit
  
  def onStop(func: js.Function): Unit
  
  def ready(): Unit
  
  def removed(collection: String, id: String): Unit
  
  def stop(): Unit
  
  var userId: String
}
object Subscription {
  
  inline def apply(
    added: (String, String, js.Object) => Callback,
    changed: (String, String, js.Object) => Callback,
    connection: Connection,
    error: js.Error => Callback,
    onStop: js.Function => Callback,
    ready: Callback,
    removed: (String, String) => Callback,
    stop: Callback,
    userId: String
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (added(t0, t1, t2)).runNow()), changed = js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (changed(t0, t1, t2)).runNow()), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), onStop = js.Any.fromFunction1((t0: js.Function) => onStop(t0).runNow()), ready = ready.toJsFn, removed = js.Any.fromFunction2((t0: String, t1: String) => (removed(t0, t1)).runNow()), stop = stop.toJsFn, userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setAdded(value: (String, String, js.Object) => Callback): Self = StObject.set(x, "added", js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setChanged(value: (String, String, js.Object) => Callback): Self = StObject.set(x, "changed", js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setOnStop(value: js.Function => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setRemoved(value: (String, String) => Callback): Self = StObject.set(x, "removed", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
