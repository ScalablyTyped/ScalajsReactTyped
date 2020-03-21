package typingsJapgolly.meteor

import japgolly.scalajs.react.Callback
import typingsJapgolly.meteor.Meteor.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var connection: Connection
  var userId: String
  def added(collection: String, id: String, fields: js.Object): Unit
  def changed(collection: String, id: String, fields: js.Object): Unit
  def error(error: js.Error): Unit
  def onStop(func: js.Function): Unit
  def ready(): Unit
  def removed(collection: String, id: String): Unit
  def stop(): Unit
}

object Subscription {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.updateDynamic("added")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Object) => added(t0, t1, t2).runNow()))
    __obj.updateDynamic("changed")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Object) => changed(t0, t1, t2).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: js.Function) => onStop(t0).runNow()))
    __obj.updateDynamic("ready")(ready.toJsFn)
    __obj.updateDynamic("removed")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => removed(t0, t1).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Subscription]
  }
}

