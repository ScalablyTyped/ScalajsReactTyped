package typingsJapgolly.frctlFractal

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.frctlFractal.mod.Adapter
import typingsJapgolly.frctlFractal.mod.fractal.core.entities.Entity
import typingsJapgolly.frctlFractal.mod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegister[T /* <: Entity */, TEngine] extends js.Object {
  def register(source: EntitySource[T, _], app: js.Any): Adapter[TEngine]
}

object AnonRegister {
  @scala.inline
  def apply[T /* <: Entity */, TEngine](register: (EntitySource[T, js.Any], js.Any) => CallbackTo[Adapter[TEngine]]): AnonRegister[T, TEngine] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: typingsJapgolly.frctlFractal.mod.fractal.core.entities.EntitySource[T, js.Any], t1: js.Any) => register(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRegister[T, TEngine]]
  }
}

