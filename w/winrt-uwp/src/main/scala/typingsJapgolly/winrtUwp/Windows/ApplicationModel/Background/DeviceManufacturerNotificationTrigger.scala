package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task to enable device manufacturer operations. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceManufacturerNotificationTrigger")
@js.native
class DeviceManufacturerNotificationTrigger protected () extends js.Object {
  /**
    * Initializes a new instance of the DeviceManufacturerNotificationTrigger class.
    * @param triggerQualifier An app-defined string that qualifies the trigger.
    * @param oneShot Whether the trigger is used only once.
    */
  def this(triggerQualifier: String, oneShot: Boolean) = this()
  /** Gets whether the trigger is used only once. */
  var oneShot: Boolean = js.native
  /** Gets an app-defined string that qualifies the trigger. */
  var triggerQualifier: String = js.native
}

