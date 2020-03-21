package typingsJapgolly.c3

import japgolly.scalajs.react.Callback
import typingsJapgolly.c3.mod.ArrayOrString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone extends js.Object {
  /** Called after data is loaded, but not after rendering. This is because rendering will finish after some transition and there is some time lag between loading and rendering. */
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ids: js.UndefOr[ArrayOrString] = js.undefined
}

object AnonDone {
  @scala.inline
  def apply(done: js.UndefOr[Callback] = js.undefined, ids: ArrayOrString = null): AnonDone = {
    val __obj = js.Dynamic.literal()
    done.foreach(p => __obj.updateDynamic("done")(p.toJsFn))
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDone]
  }
}

