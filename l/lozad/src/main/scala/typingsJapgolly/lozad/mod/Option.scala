package typingsJapgolly.lozad.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var load: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  var loaded: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  var rootMargin: js.UndefOr[String] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    load: /* element */ Element => Callback = null,
    loaded: /* element */ Element => Callback = null,
    rootMargin: String = null,
    threshold: Int | Double = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.Element) => load(t0).runNow()))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.Element) => loaded(t0).runNow()))
    if (rootMargin != null) __obj.updateDynamic("rootMargin")(rootMargin.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

