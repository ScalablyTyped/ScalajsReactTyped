package typingsJapgolly.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartiallySucceeded extends js.Object {
  var canceled: Double
  var inProgress: Double
  var notStarted: Double
  var partiallySucceeded: Double
  var queued: Double
  var rejected: Double
  var scheduled: Double
  var succeeded: Double
  var undefined: Double
}

object AnonPartiallySucceeded {
  @scala.inline
  def apply(
    canceled: Double,
    inProgress: Double,
    notStarted: Double,
    partiallySucceeded: Double,
    queued: Double,
    rejected: Double,
    scheduled: Double,
    succeeded: Double,
    undefined: Double
  ): AnonPartiallySucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPartiallySucceeded]
  }
}

