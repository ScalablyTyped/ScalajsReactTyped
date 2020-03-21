package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a phone event that triggers a background task. */
@JSGlobal("Windows.ApplicationModel.Background.PhoneTrigger")
@js.native
class PhoneTrigger protected () extends js.Object {
  /**
    * Initializes a new instance of the PhoneTrigger class.
    * @param type Specifies the type of phone event.
    * @param oneShot Indicates if the trigger is a one-shot notification. If you weren't subscribed when a one-shot notification was sent, you get nothing. If you weren't connected when you fired a one-shot notification, nothing happens.
    */
  def this(`type`: PhoneTriggerType, oneShot: Boolean) = this()
  /** Gets a Boolean value indicating if the trigger is a one-shot notification. */
  var oneShot: Boolean = js.native
  /** Gets the type of phone event indicated by the trigger. */
  var triggerType: PhoneTriggerType = js.native
}

