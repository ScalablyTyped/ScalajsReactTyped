package typingsJapgolly.tstl.icomputableMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.inegatableMod.INegatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputable[Param, Ret] extends INegatable[Ret] {
  def divides(`val`: Param): Ret
  def minus(`val`: Param): Ret
  def modules(`val`: Param): Ret
  def multiplies(`val`: Param): Ret
  def plus(`val`: Param): Ret
}

object IComputable {
  @scala.inline
  def apply[Param, Ret](
    divides: Param => CallbackTo[Ret],
    minus: Param => CallbackTo[Ret],
    modules: Param => CallbackTo[Ret],
    multiplies: Param => CallbackTo[Ret],
    negate: CallbackTo[Ret],
    plus: Param => CallbackTo[Ret]
  ): IComputable[Param, Ret] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("divides")(js.Any.fromFunction1((t0: Param) => divides(t0).runNow()))
    __obj.updateDynamic("minus")(js.Any.fromFunction1((t0: Param) => minus(t0).runNow()))
    __obj.updateDynamic("modules")(js.Any.fromFunction1((t0: Param) => modules(t0).runNow()))
    __obj.updateDynamic("multiplies")(js.Any.fromFunction1((t0: Param) => multiplies(t0).runNow()))
    __obj.updateDynamic("negate")(negate.toJsFn)
    __obj.updateDynamic("plus")(js.Any.fromFunction1((t0: Param) => plus(t0).runNow()))
    __obj.asInstanceOf[IComputable[Param, Ret]]
  }
}

