package typingsJapgolly.cryptojs.CryptoJS.lib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  //arguments of create() is same as init(). This is true for all subclasses
  def create(args: js.Any*): Base
  def extend(overrides: js.Object): js.Object
  def init(args: js.Any*): Unit
  def mixIn(properties: js.Object): Unit
}

object Base {
  @scala.inline
  def apply(
    create: /* repeated */ js.Any => CallbackTo[Base],
    extend: js.Object => CallbackTo[js.Object],
    init: /* repeated */ js.Any => Callback,
    mixIn: js.Object => Callback
  ): Base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => create(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction1((t0: js.Object) => extend(t0).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => init(t0).runNow()))
    __obj.updateDynamic("mixIn")(js.Any.fromFunction1((t0: js.Object) => mixIn(t0).runNow()))
    __obj.asInstanceOf[Base]
  }
}

