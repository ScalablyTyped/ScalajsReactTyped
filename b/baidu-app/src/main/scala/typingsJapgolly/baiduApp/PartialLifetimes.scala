package typingsJapgolly.baiduApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<baidu-app.swan.Lifetimes> */
trait PartialLifetimes extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialLifetimes {
  @scala.inline
  def apply(
    attached: js.UndefOr[Callback] = js.undefined,
    created: js.UndefOr[Callback] = js.undefined,
    detached: js.UndefOr[Callback] = js.undefined,
    moved: js.UndefOr[Callback] = js.undefined,
    ready: js.UndefOr[Callback] = js.undefined
  ): PartialLifetimes = {
    val __obj = js.Dynamic.literal()
    attached.foreach(p => __obj.updateDynamic("attached")(p.toJsFn))
    created.foreach(p => __obj.updateDynamic("created")(p.toJsFn))
    detached.foreach(p => __obj.updateDynamic("detached")(p.toJsFn))
    moved.foreach(p => __obj.updateDynamic("moved")(p.toJsFn))
    ready.foreach(p => __obj.updateDynamic("ready")(p.toJsFn))
    __obj.asInstanceOf[PartialLifetimes]
  }
}

