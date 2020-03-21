package typingsJapgolly.betterScroll

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.InfinityOption> */
trait PartialInfinityOption extends js.Object {
  var createTombstone: js.UndefOr[js.Function0[Element]] = js.undefined
  var fetch: js.UndefOr[js.Function1[/* count */ Double, Unit]] = js.undefined
  var render: js.UndefOr[js.Function2[/* item */ js.Any, /* div */ Element, Element]] = js.undefined
}

object PartialInfinityOption {
  @scala.inline
  def apply(
    createTombstone: js.UndefOr[CallbackTo[Element]] = js.undefined,
    fetch: /* count */ Double => Callback = null,
    render: (/* item */ js.Any, /* div */ Element) => CallbackTo[Element] = null
  ): PartialInfinityOption = {
    val __obj = js.Dynamic.literal()
    createTombstone.foreach(p => __obj.updateDynamic("createTombstone")(p.toJsFn))
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: /* count */ scala.Double) => fetch(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* div */ org.scalajs.dom.raw.Element) => render(t0, t1).runNow()))
    __obj.asInstanceOf[PartialInfinityOption]
  }
}

