package typingsJapgolly.materialTabIndicator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-indicator.@material/tab-indicator/adapter.MDCTabIndicatorAdapter> */
trait PartialMDCTabIndicatorAda extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var computeContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
}

object PartialMDCTabIndicatorAda {
  @scala.inline
  def apply(
    addClass: /* className */ String => Callback = null,
    computeContentClientRect: js.UndefOr[CallbackTo[ClientRect]] = js.undefined,
    removeClass: /* className */ String => Callback = null,
    setContentStyleProperty: (/* propName */ String, /* value */ String) => Callback = null
  ): PartialMDCTabIndicatorAda = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => addClass(t0).runNow()))
    computeContentClientRect.foreach(p => __obj.updateDynamic("computeContentClientRect")(p.toJsFn))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => removeClass(t0).runNow()))
    if (setContentStyleProperty != null) __obj.updateDynamic("setContentStyleProperty")(js.Any.fromFunction2((t0: /* propName */ java.lang.String, t1: /* value */ java.lang.String) => setContentStyleProperty(t0, t1).runNow()))
    __obj.asInstanceOf[PartialMDCTabIndicatorAda]
  }
}

