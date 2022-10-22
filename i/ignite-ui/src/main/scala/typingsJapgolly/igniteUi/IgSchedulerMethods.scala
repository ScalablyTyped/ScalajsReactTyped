package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSchedulerMethods extends StObject {
  
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
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    createAppointment: js.Object => js.Object,
    dateRangeButton: CallbackTo[String],
    deleteAppointment: js.Object => js.Object,
    destroy: Callback,
    editAppointment: (js.Object, js.Object) => js.Object,
    getAppointmentsInRange: (js.Date, js.Date) => js.Object,
    getCalendar: CallbackTo[String],
    nextButton: CallbackTo[String],
    previousButton: CallbackTo[String],
    todayButton: CallbackTo[String]
  ): IgSchedulerMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = changeLocale.toJsFn, createAppointment = js.Any.fromFunction1(createAppointment), dateRangeButton = dateRangeButton.toJsFn, deleteAppointment = js.Any.fromFunction1(deleteAppointment), destroy = destroy.toJsFn, editAppointment = js.Any.fromFunction2(editAppointment), getAppointmentsInRange = js.Any.fromFunction2(getAppointmentsInRange), getCalendar = getCalendar.toJsFn, nextButton = nextButton.toJsFn, previousButton = previousButton.toJsFn, todayButton = todayButton.toJsFn)
    __obj.asInstanceOf[IgSchedulerMethods]
  }
  
  extension [Self <: IgSchedulerMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setCreateAppointment(value: js.Object => js.Object): Self = StObject.set(x, "createAppointment", js.Any.fromFunction1(value))
    
    inline def setDateRangeButton(value: CallbackTo[String]): Self = StObject.set(x, "dateRangeButton", value.toJsFn)
    
    inline def setDeleteAppointment(value: js.Object => js.Object): Self = StObject.set(x, "deleteAppointment", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setEditAppointment(value: (js.Object, js.Object) => js.Object): Self = StObject.set(x, "editAppointment", js.Any.fromFunction2(value))
    
    inline def setGetAppointmentsInRange(value: (js.Date, js.Date) => js.Object): Self = StObject.set(x, "getAppointmentsInRange", js.Any.fromFunction2(value))
    
    inline def setGetCalendar(value: CallbackTo[String]): Self = StObject.set(x, "getCalendar", value.toJsFn)
    
    inline def setNextButton(value: CallbackTo[String]): Self = StObject.set(x, "nextButton", value.toJsFn)
    
    inline def setPreviousButton(value: CallbackTo[String]): Self = StObject.set(x, "previousButton", value.toJsFn)
    
    inline def setTodayButton(value: CallbackTo[String]): Self = StObject.set(x, "todayButton", value.toJsFn)
  }
}
