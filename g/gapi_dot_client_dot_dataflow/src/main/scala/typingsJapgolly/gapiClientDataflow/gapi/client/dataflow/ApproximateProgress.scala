package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApproximateProgress extends js.Object {
  /** Obsolete. */
  var percentComplete: js.UndefOr[Double] = js.undefined
  /** Obsolete. */
  var position: js.UndefOr[Position] = js.undefined
  /** Obsolete. */
  var remainingTime: js.UndefOr[String] = js.undefined
}

object ApproximateProgress {
  @scala.inline
  def apply(percentComplete: Int | Double = null, position: Position = null, remainingTime: String = null): ApproximateProgress = {
    val __obj = js.Dynamic.literal()
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (remainingTime != null) __obj.updateDynamic("remainingTime")(remainingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproximateProgress]
  }
}

