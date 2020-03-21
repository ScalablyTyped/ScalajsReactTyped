package typingsJapgolly.workboxBackgroundSync.queueMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  var maxRetentionTime: js.UndefOr[Double] = js.undefined
  var onSync: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(maxRetentionTime: Int | Double = null, onSync: js.UndefOr[Callback] = js.undefined): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (maxRetentionTime != null) __obj.updateDynamic("maxRetentionTime")(maxRetentionTime.asInstanceOf[js.Any])
    onSync.foreach(p => __obj.updateDynamic("onSync")(p.toJsFn))
    __obj.asInstanceOf[QueueOptions]
  }
}

