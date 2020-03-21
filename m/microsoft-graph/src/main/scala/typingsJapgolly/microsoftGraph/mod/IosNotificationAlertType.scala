package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.banner
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.modal
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
*/
trait IosNotificationAlertType extends js.Object

object IosNotificationAlertType {
  @scala.inline
  def banner: typingsJapgolly.microsoftGraph.microsoftGraphStrings.banner = this.cast("banner")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def modal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.modal = this.cast("modal")
  @scala.inline
  def none: none_ = this.cast("none")
}

