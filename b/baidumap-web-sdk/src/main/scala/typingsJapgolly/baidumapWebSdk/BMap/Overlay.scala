package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlay extends js.Object {
  var draw: js.UndefOr[js.Function0[Unit]] = js.undefined
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var initialize: js.UndefOr[js.Function1[/* map */ Map, HTMLElement]] = js.undefined
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Overlay {
  @scala.inline
  def apply(
    draw: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    hide: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    initialize: /* map */ Map => CallbackTo[HTMLElement] = null,
    isVisible: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    show: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): Overlay = {
    val __obj = js.Dynamic.literal()
    draw.foreach(p => __obj.updateDynamic("draw")(p.toJsFn))
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: /* map */ typingsJapgolly.baidumapWebSdk.BMap.Map) => initialize(t0).runNow()))
    isVisible.foreach(p => __obj.updateDynamic("isVisible")(p.toJsFn))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    __obj.asInstanceOf[Overlay]
  }
}

