package typingsJapgolly.overlayscrollbars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.overlayscrollbars.AnonXNumber
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compatibility extends js.Object {
  def bind(func: js.Function1[/* repeated */ js.Any, _], thisObj: js.Any, args: js.Any*): js.Any
  def cAF(): js.Function1[/* requestID */ Double, Unit]
  def inA[T](item: T, array: js.Array[T]): Double
  def isA(obj: js.Any): Boolean
  def mBtn(event: MouseEvent): Double
  def mO(): js.Any
  def now(): Double
  def page(event: MouseEvent): AnonXNumber
  def prvD(event: Event_): Unit
  def rAF(): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double]
  def rO(): js.Any
  def stpP(event: Event_): Unit
  def `type`(obj: js.Any): String
  def wH(): Double
  def wW(): Double
}

object Compatibility {
  @scala.inline
  def apply(
    bind: (js.Function1[/* repeated */ js.Any, js.Any], js.Any, /* repeated */ js.Any) => CallbackTo[js.Any],
    cAF: CallbackTo[js.Function1[/* requestID */ Double, Unit]],
    inA: (js.Any, js.Array[js.Any]) => CallbackTo[Double],
    isA: js.Any => CallbackTo[Boolean],
    mBtn: MouseEvent => CallbackTo[Double],
    mO: CallbackTo[js.Any],
    now: CallbackTo[Double],
    page: MouseEvent => CallbackTo[AnonXNumber],
    prvD: Event_ => Callback,
    rAF: CallbackTo[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, js.Any], Double]],
    rO: CallbackTo[js.Any],
    stpP: Event_ => Callback,
    `type`: js.Any => CallbackTo[String],
    wH: CallbackTo[Double],
    wW: CallbackTo[Double]
  ): Compatibility = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction3((t0: js.Function1[/* repeated */ js.Any, js.Any], t1: js.Any, t2: /* repeated */ js.Any) => bind(t0, t1, t2).runNow()))
    __obj.updateDynamic("cAF")(cAF.toJsFn)
    __obj.updateDynamic("inA")(js.Any.fromFunction2((t0: js.Any, t1: js.Array[js.Any]) => inA(t0, t1).runNow()))
    __obj.updateDynamic("isA")(js.Any.fromFunction1((t0: js.Any) => isA(t0).runNow()))
    __obj.updateDynamic("mBtn")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => mBtn(t0).runNow()))
    __obj.updateDynamic("mO")(mO.toJsFn)
    __obj.updateDynamic("now")(now.toJsFn)
    __obj.updateDynamic("page")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => page(t0).runNow()))
    __obj.updateDynamic("prvD")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => prvD(t0).runNow()))
    __obj.updateDynamic("rAF")(rAF.toJsFn)
    __obj.updateDynamic("rO")(rO.toJsFn)
    __obj.updateDynamic("stpP")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => stpP(t0).runNow()))
    __obj.updateDynamic("type")(js.Any.fromFunction1((t0: js.Any) => `type`(t0).runNow()))
    __obj.updateDynamic("wH")(wH.toJsFn)
    __obj.updateDynamic("wW")(wW.toJsFn)
    __obj.asInstanceOf[Compatibility]
  }
}

