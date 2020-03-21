package typingsJapgolly.officeJs.Office

import typingsJapgolly.officeJs.officeJsStrings.olkRecurrenceChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceChangedEventArgs extends js.Object {
  /** 
    * Gets the updated recurrence object. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var recurrence: Recurrence
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var `type`: olkRecurrenceChanged
}

object RecurrenceChangedEventArgs {
  @scala.inline
  def apply(recurrence: Recurrence, `type`: olkRecurrenceChanged): RecurrenceChangedEventArgs = {
    val __obj = js.Dynamic.literal(recurrence = recurrence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceChangedEventArgs]
  }
}

