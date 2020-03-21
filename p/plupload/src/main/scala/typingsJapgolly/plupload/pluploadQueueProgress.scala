package typingsJapgolly.plupload

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadQueueProgress extends js.Object {
  var bytesPerSec: Double
  var failed: Double
  var loaded: Double
  var percent: Double
  var queued: Double
  var size: Double
  var uploaded: Double
  def reset(): Unit
}

object pluploadQueueProgress {
  @scala.inline
  def apply(
    bytesPerSec: Double,
    failed: Double,
    loaded: Double,
    percent: Double,
    queued: Double,
    reset: Callback,
    size: Double,
    uploaded: Double
  ): pluploadQueueProgress = {
    val __obj = js.Dynamic.literal(bytesPerSec = bytesPerSec.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploaded = uploaded.asInstanceOf[js.Any])
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[pluploadQueueProgress]
  }
}

