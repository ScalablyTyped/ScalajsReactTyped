package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igscheduler#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igscheduler#options:language) or [locale](ui.igscheduler#options:locale) option setter
  	 */
  def changeLocale(): Unit
  /**
  	 * Creates an appointment and adds it to the appointment collection
  	 *
  	 * @param appointment appointment
  	 */
  def createAppointment(appointment: js.Object): js.Object
  /**
  	 * Gets reference to the date range UI button.
  	 */
  def dateRangeButton(): String
  /**
  	 * Deletes appointment from the appointment collection
  	 *
  	 * @param appointment appointment
  	 */
  def deleteAppointment(appointment: js.Object): js.Object
  /**
  	 * Destroys the widget
  	 */
  def destroy(): Unit
  /**
  	 * Deletes appointment from the appointment collection
  	 *
  	 * @param appointment appointment
  	 * @param updateAppoinment updateAppoinment
  	 */
  def editAppointment(appointment: js.Object, updateAppoinment: js.Object): js.Object
  /**
  	 * Gets reference to a collection of all appointments for the given time range
  	 *
  	 * @param start Start date.
  	 * @param end End date.
  	 */
  def getAppointmentsInRange(start: js.Date, end: js.Date): js.Object
  /**
  	 * Gets reference to the jQuery calendar UI control.
  	 */
  def getCalendar(): String
  /**
  	 * Gets reference to the next UI button.
  	 */
  def nextButton(): String
  /**
  	 * Gets reference to the previous UI button.
  	 */
  def previousButton(): String
  /**
  	 * Gets reference to the today UI button.
  	 */
  def todayButton(): String
}

object IgSchedulerMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    createAppointment: js.Object => CallbackTo[js.Object],
    dateRangeButton: CallbackTo[String],
    deleteAppointment: js.Object => CallbackTo[js.Object],
    destroy: Callback,
    editAppointment: (js.Object, js.Object) => CallbackTo[js.Object],
    getAppointmentsInRange: (js.Date, js.Date) => CallbackTo[js.Object],
    getCalendar: CallbackTo[String],
    nextButton: CallbackTo[String],
    previousButton: CallbackTo[String],
    todayButton: CallbackTo[String]
  ): IgSchedulerMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("createAppointment")(js.Any.fromFunction1((t0: js.Object) => createAppointment(t0).runNow()))
    __obj.updateDynamic("dateRangeButton")(dateRangeButton.toJsFn)
    __obj.updateDynamic("deleteAppointment")(js.Any.fromFunction1((t0: js.Object) => deleteAppointment(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("editAppointment")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => editAppointment(t0, t1).runNow()))
    __obj.updateDynamic("getAppointmentsInRange")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => getAppointmentsInRange(t0, t1).runNow()))
    __obj.updateDynamic("getCalendar")(getCalendar.toJsFn)
    __obj.updateDynamic("nextButton")(nextButton.toJsFn)
    __obj.updateDynamic("previousButton")(previousButton.toJsFn)
    __obj.updateDynamic("todayButton")(todayButton.toJsFn)
    __obj.asInstanceOf[IgSchedulerMethods]
  }
}

