package typingsJapgolly.a11yDialog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.a11yDialog.a11yDialogStrings.show
  - typingsJapgolly.a11yDialog.a11yDialogStrings.hide
  - typingsJapgolly.a11yDialog.a11yDialogStrings.destroy
  - typingsJapgolly.a11yDialog.a11yDialogStrings.create
*/
trait DialogEvents extends js.Object

object DialogEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsJapgolly.a11yDialog.a11yDialogStrings.create = this.cast("create")
  @scala.inline
  def destroy: typingsJapgolly.a11yDialog.a11yDialogStrings.destroy = this.cast("destroy")
  @scala.inline
  def hide: typingsJapgolly.a11yDialog.a11yDialogStrings.hide = this.cast("hide")
  @scala.inline
  def show: typingsJapgolly.a11yDialog.a11yDialogStrings.show = this.cast("show")
}

