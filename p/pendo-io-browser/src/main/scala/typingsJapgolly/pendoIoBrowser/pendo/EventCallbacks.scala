package typingsJapgolly.pendoIoBrowser.pendo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCallbacks extends js.Object {
  var guidesFailed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var guidesLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object EventCallbacks {
  @scala.inline
  def apply(
    guidesFailed: js.UndefOr[Callback] = js.undefined,
    guidesLoaded: js.UndefOr[Callback] = js.undefined,
    ready: js.UndefOr[Callback] = js.undefined
  ): EventCallbacks = {
    val __obj = js.Dynamic.literal()
    guidesFailed.foreach(p => __obj.updateDynamic("guidesFailed")(p.toJsFn))
    guidesLoaded.foreach(p => __obj.updateDynamic("guidesLoaded")(p.toJsFn))
    ready.foreach(p => __obj.updateDynamic("ready")(p.toJsFn))
    __obj.asInstanceOf[EventCallbacks]
  }
}

