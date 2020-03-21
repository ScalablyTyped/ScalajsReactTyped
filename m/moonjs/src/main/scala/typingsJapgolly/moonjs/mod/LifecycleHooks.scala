package typingsJapgolly.moonjs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleHooks extends js.Object {
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object LifecycleHooks {
  @scala.inline
  def apply(
    destroyed: js.UndefOr[Callback] = js.undefined,
    init: js.UndefOr[Callback] = js.undefined,
    mounted: js.UndefOr[Callback] = js.undefined,
    updated: js.UndefOr[Callback] = js.undefined
  ): LifecycleHooks = {
    val __obj = js.Dynamic.literal()
    destroyed.foreach(p => __obj.updateDynamic("destroyed")(p.toJsFn))
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    mounted.foreach(p => __obj.updateDynamic("mounted")(p.toJsFn))
    updated.foreach(p => __obj.updateDynamic("updated")(p.toJsFn))
    __obj.asInstanceOf[LifecycleHooks]
  }
}

