package typingsJapgolly.materializeCss

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ScrollSpyOptions> */
trait PartialScrollSpyOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var getActiveElement: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
}

object PartialScrollSpyOptions {
  @scala.inline
  def apply(
    activeClass: String = null,
    getActiveElement: /* id */ String => CallbackTo[String] = null,
    scrollOffset: Int | Double = null,
    throttle: Int | Double = null
  ): PartialScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (getActiveElement != null) __obj.updateDynamic("getActiveElement")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => getActiveElement(t0).runNow()))
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollSpyOptions]
  }
}

