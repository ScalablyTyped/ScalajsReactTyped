package typingsJapgolly.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTaskStartedEventAttributes extends js.Object {
  /**
    * Identity of the worker that was assigned this task. This aids diagnostics when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.native
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
}

object ActivityTaskStartedEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, identity: Identity = null): ActivityTaskStartedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskStartedEventAttributes]
  }
}

