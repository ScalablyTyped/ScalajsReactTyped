package typingsJapgolly.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Form Notification Levels for {@link Ui.setFormNotification formContext.ui.setFormNotification()}.
  * @see {@link XrmEnum.FormNotificationLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.ERROR
  - typingsJapgolly.xrm.xrmStrings.INFO
  - typingsJapgolly.xrm.xrmStrings.WARNING
*/
trait FormNotificationLevel extends js.Object

object FormNotificationLevel {
  @scala.inline
  def ERROR: typingsJapgolly.xrm.xrmStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typingsJapgolly.xrm.xrmStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARNING: typingsJapgolly.xrm.xrmStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

