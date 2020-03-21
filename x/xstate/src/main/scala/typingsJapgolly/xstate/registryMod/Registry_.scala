package typingsJapgolly.xstate.registryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xstate.actorMod.Actor
import typingsJapgolly.xstate.typesMod.AnyEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry_ extends js.Object {
  def bookId(): String
  def free(id: String): Unit
  def get(id: String): js.UndefOr[Actor[_, AnyEventObject]]
  def register(id: String, actor: Actor[_, AnyEventObject]): String
}

object Registry_ {
  @scala.inline
  def apply(
    bookId: CallbackTo[String],
    free: String => Callback,
    get: String => CallbackTo[js.UndefOr[Actor[js.Any, AnyEventObject]]],
    register: (String, Actor[js.Any, AnyEventObject]) => CallbackTo[String]
  ): Registry_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bookId")(bookId.toJsFn)
    __obj.updateDynamic("free")(js.Any.fromFunction1((t0: java.lang.String) => free(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.xstate.actorMod.Actor[js.Any, typingsJapgolly.xstate.typesMod.AnyEventObject]) => register(t0, t1).runNow()))
    __obj.asInstanceOf[Registry_]
  }
}

