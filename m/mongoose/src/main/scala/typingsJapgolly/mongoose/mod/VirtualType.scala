package typingsJapgolly.mongoose.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section virtualtype.js
  * http://mongoosejs.com/docs/api.html#virtualtype-js
  */
trait VirtualType extends js.Object {
  /** Applies getters to value using optional scope. */
  def applyGetters(value: js.Any, scope: js.Any): js.Any
  /** Applies setters to value using optional scope. */
  def applySetters(value: js.Any, scope: js.Any): js.Any
  /** Defines a getter. */
  def get(fn: js.Function): this.type
  /** Defines a setter. */
  def set(fn: js.Function): this.type
}

object VirtualType {
  @scala.inline
  def apply(
    applyGetters: (js.Any, js.Any) => CallbackTo[js.Any],
    applySetters: (js.Any, js.Any) => CallbackTo[js.Any],
    get: js.Function => CallbackTo[VirtualType],
    set: js.Function => CallbackTo[VirtualType]
  ): VirtualType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyGetters")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => applyGetters(t0, t1).runNow()))
    __obj.updateDynamic("applySetters")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => applySetters(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Function) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: js.Function) => set(t0).runNow()))
    __obj.asInstanceOf[VirtualType]
  }
}

