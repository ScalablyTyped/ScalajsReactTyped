package typingsJapgolly.openfin.eventsApplicationMod

import typingsJapgolly.openfin.openfinStrings.`abnormal-termination`
import typingsJapgolly.openfin.openfinStrings.`launch-failed`
import typingsJapgolly.openfin.openfinStrings.`normal-termination`
import typingsJapgolly.openfin.openfinStrings.`out-of-memory`
import typingsJapgolly.openfin.openfinStrings.`still-running`
import typingsJapgolly.openfin.openfinStrings.crashed
import typingsJapgolly.openfin.openfinStrings.killed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashedEvent extends js.Object {
  var reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
}

object CrashedEvent {
  @scala.inline
  def apply(
    reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
  ): CrashedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CrashedEvent]
  }
}

