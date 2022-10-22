package typingsJapgolly.meteor

import typingsJapgolly.meteor.Meteor.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * Call inside the publish function.  Informs the subscriber that a document has been added to the record set.
    * @param collection The name of the collection that contains the new document.
    * @param id The new document's ID.
    * @param fields The fields in the new document.  If `_id` is present it is ignored.
    */
  def added(collection: String, id: String, fields: js.Object): Unit
  
  /**
    * Call inside the publish function. Informs the subscriber that a document in the record set has been modified.
    * @param collection The name of the collection that contains the changed document.
    * @param id The changed document's ID.
    * @param fields The fields in the document that have changed, together with their new values.  If a field is not present in `fields` it was left unchanged; if it is present in `fields` and
    * has a value of `undefined` it was removed from the document.  If `_id` is present it is ignored.
    */
  def changed(collection: String, id: String, fields: js.Object): Unit
  
  /** Access inside the publish function. The incoming connection for this subscription. */
  var connection: Connection
  
  /**
    * Call inside the publish function. Stops this client's subscription, triggering a call on the client to the `onStop` callback passed to `Meteor.subscribe`, if any. If `error` is not a
    * `Meteor.Error`, it will be sanitized.
    * @param error The error to pass to the client.
    */
  def error(error: js.Error): Unit
  
  /**
    * Call inside the publish function. Registers a callback function to run when the subscription is stopped.
    * @param func The callback function
    */
  def onStop(func: js.Function): Unit
  
  /**
    * Call inside the publish function. Informs the subscriber that an initial, complete snapshot of the record set has been sent.  This will trigger a call on the client to the `onReady`
    * callback passed to  `Meteor.subscribe`, if any.
    */
  def ready(): Unit
  
  /**
    * Call inside the publish function. Informs the subscriber that a document has been removed from the record set.
    * @param collection The name of the collection that the document has been removed from.
    * @param id The ID of the document that has been removed.
    */
  def removed(collection: String, id: String): Unit
  
  /**
    * Access inside the publish function. The incoming connection for this subscription.
    */
  def stop(): Unit
  
  /**
    * Call inside the publish function. Allows subsequent methods or subscriptions for the client of this subscription
    * to begin running without waiting for the publishing to become ready.
    */
  def unblock(): Unit
  
  /** Access inside the publish function. The id of the logged-in user, or `null` if no user is logged in. */
  var userId: String | Null
}
object Subscription {
  
  inline def apply(
    added: (String, String, js.Object) => japgolly.scalajs.react.Callback,
    changed: (String, String, js.Object) => japgolly.scalajs.react.Callback,
    connection: Connection,
    error: js.Error => japgolly.scalajs.react.Callback,
    onStop: js.Function => japgolly.scalajs.react.Callback,
    ready: japgolly.scalajs.react.Callback,
    removed: (String, String) => japgolly.scalajs.react.Callback,
    stop: japgolly.scalajs.react.Callback,
    unblock: japgolly.scalajs.react.Callback
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (added(t0, t1, t2)).runNow()), changed = js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (changed(t0, t1, t2)).runNow()), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), onStop = js.Any.fromFunction1((t0: js.Function) => onStop(t0).runNow()), ready = ready.toJsFn, removed = js.Any.fromFunction2((t0: String, t1: String) => (removed(t0, t1)).runNow()), stop = stop.toJsFn, unblock = unblock.toJsFn, userId = null)
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setAdded(value: (String, String, js.Object) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "added", js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setChanged(value: (String, String, js.Object) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "changed", js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setOnStop(value: js.Function => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setReady(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setRemoved(value: (String, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removed", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setStop(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setUnblock(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "unblock", value.toJsFn)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
  }
}
