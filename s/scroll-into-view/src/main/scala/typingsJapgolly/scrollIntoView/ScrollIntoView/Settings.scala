package typingsJapgolly.scrollIntoView.ScrollIntoView

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var align: js.UndefOr[Alignment] = js.undefined
  var ease: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
  var validTarget: js.UndefOr[js.Function2[/* target */ HTMLElement, /* parentsScrolled */ Double, Boolean]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    align: Alignment = null,
    ease: /* value */ Double => CallbackTo[Double] = null,
    time: Int | Double = null,
    validTarget: (/* target */ HTMLElement, /* parentsScrolled */ Double) => CallbackTo[Boolean] = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(js.Any.fromFunction1((t0: /* value */ scala.Double) => ease(t0).runNow()))
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (validTarget != null) __obj.updateDynamic("validTarget")(js.Any.fromFunction2((t0: /* target */ org.scalajs.dom.raw.HTMLElement, t1: /* parentsScrolled */ scala.Double) => validTarget(t0, t1).runNow()))
    __obj.asInstanceOf[Settings]
  }
}

