package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Manages reminders in calendars._
  *
  * In order to add the reminder to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/reminder/#-new-reminder
  */
trait Reminder extends StObject {
  
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/reminder/#-addrecurrencerule
    */
  def addRecurrenceRule(recurrenceRule: RecurrenceRule): Unit
  
  /**
    * _Calendar the reminder is stored in._
    * @see https://docs.scriptable.app/reminder/#calendar
    */
  var calendar: Calendar
  
  /**
    * _Completion date of reminder._
    * @see https://docs.scriptable.app/reminder/#completiondate
    */
  var completionDate: js.Date
  
  /**
    * _Creation date of reminder._
    * @see https://docs.scriptable.app/reminder/#creationdate
    */
  var creationDate: js.Date
  
  /**
    * _Due date of reminder._
    * @see https://docs.scriptable.app/reminder/#duedate
    */
  var dueDate: js.Date
  
  /**
    * _Whether the due date includes a time._
    *
    * When this is true, assignments to the `dueDate` property will include a time, when this is false, the time component of the date will be ignored. Defaults to true.
    * @see https://docs.scriptable.app/reminder/#duedateincludestime
    */
  var dueDateIncludesTime: Boolean
  
  /**
    * _Identifier of reminder._
    * @see https://docs.scriptable.app/reminder/#identifier
    */
  var identifier: String
  
  /**
    * _Whether the reminder is completed._
    * @see https://docs.scriptable.app/reminder/#iscompleted
    */
  var isCompleted: Boolean
  
  /**
    * _Whether the reminder is overdue._
    * @see https://docs.scriptable.app/reminder/#isoverdue
    */
  var isOverdue: Boolean
  
  /**
    * _Notes associated with reminder._
    * @see https://docs.scriptable.app/reminder/#notes
    */
  var notes: String
  
  /**
    * _Priority of reminder._
    *
    * Specifies the prirority of the reminder with 0 representing an undefined priority, 1 the highest priority, and 9 the lowest priority.
    * @see https://docs.scriptable.app/reminder/#priority
    */
  var priority: Double
  
  /**
    * _Removes reminder from calendar._
    * @see https://docs.scriptable.app/reminder/#-remove
    */
  def remove(): Unit
  
  /**
    * _Removes all recurrence rules._
    * @see https://docs.scriptable.app/reminder/#-removeallrecurrencerules
    */
  def removeAllRecurrenceRules(): Unit
  
  /**
    * _Saves reminder._
    *
    * Saves changes to a reminder, inserting it into the calendar if it is newly created.
    * @see https://docs.scriptable.app/reminder/#-save
    */
  def save(): Unit
  
  /**
    * _Title of reminder._
    * @see https://docs.scriptable.app/reminder/#title
    */
  var title: String
}
object Reminder {
  
  inline def apply(
    addRecurrenceRule: RecurrenceRule => Callback,
    calendar: Calendar,
    completionDate: js.Date,
    creationDate: js.Date,
    dueDate: js.Date,
    dueDateIncludesTime: Boolean,
    identifier: String,
    isCompleted: Boolean,
    isOverdue: Boolean,
    notes: String,
    priority: Double,
    remove: Callback,
    removeAllRecurrenceRules: Callback,
    save: Callback,
    title: String
  ): Reminder = {
    val __obj = js.Dynamic.literal(addRecurrenceRule = js.Any.fromFunction1((t0: RecurrenceRule) => addRecurrenceRule(t0).runNow()), calendar = calendar.asInstanceOf[js.Any], completionDate = completionDate.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], dueDateIncludesTime = dueDateIncludesTime.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isCompleted = isCompleted.asInstanceOf[js.Any], isOverdue = isOverdue.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], remove = remove.toJsFn, removeAllRecurrenceRules = removeAllRecurrenceRules.toJsFn, save = save.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reminder]
  }
  
  extension [Self <: Reminder](x: Self) {
    
    inline def setAddRecurrenceRule(value: RecurrenceRule => Callback): Self = StObject.set(x, "addRecurrenceRule", js.Any.fromFunction1((t0: RecurrenceRule) => value(t0).runNow()))
    
    inline def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCompletionDate(value: js.Date): Self = StObject.set(x, "completionDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setDueDate(value: js.Date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateIncludesTime(value: Boolean): Self = StObject.set(x, "dueDateIncludesTime", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIsCompleted(value: Boolean): Self = StObject.set(x, "isCompleted", value.asInstanceOf[js.Any])
    
    inline def setIsOverdue(value: Boolean): Self = StObject.set(x, "isOverdue", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setRemoveAllRecurrenceRules(value: Callback): Self = StObject.set(x, "removeAllRecurrenceRules", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
