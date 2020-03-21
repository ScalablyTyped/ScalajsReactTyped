package typingsJapgolly.baconjs.optionalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option[V] extends js.Object {
  var isDefined: Boolean
  def filter(f: js.Function1[/* value */ V, Boolean]): Option[V]
  def forEach(f: js.Function1[/* value */ V, _]): Unit
  def get(): V
  def getOrElse(arg: V): V
  def inspect(): String
  def map[V2](f: js.Function1[/* value */ V, V2]): Option[V2]
  def toArray(): js.Array[V]
}

object Option {
  @scala.inline
  def apply[V](
    filter: js.Function1[/* value */ V, Boolean] => CallbackTo[Option[V]],
    forEach: js.Function1[/* value */ V, js.Any] => Callback,
    get: CallbackTo[V],
    getOrElse: V => CallbackTo[V],
    inspect: CallbackTo[String],
    isDefined: Boolean,
    map: js.Function1[/* value */ V, js.Any] => CallbackTo[Option[js.Any]],
    toArray: CallbackTo[js.Array[V]]
  ): Option[V] = {
    val __obj = js.Dynamic.literal(isDefined = isDefined.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Function1[/* value */ V, scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[/* value */ V, js.Any]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getOrElse")(js.Any.fromFunction1((t0: V) => getOrElse(t0).runNow()))
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[/* value */ V, js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[Option[V]]
  }
}

