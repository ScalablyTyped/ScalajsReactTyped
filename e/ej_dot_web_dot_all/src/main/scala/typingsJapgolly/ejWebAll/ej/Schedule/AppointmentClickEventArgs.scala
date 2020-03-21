package typingsJapgolly.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentClickEventArgs extends js.Object {
  /** Returns the clicked appointment object.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the object of appointmentClick event.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AppointmentClickEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    `object`: js.Any = null,
    `type`: String = null
  ): AppointmentClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
}

