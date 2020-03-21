package typingsJapgolly.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bootstrap.bootstrapStrings.showDotbsDotmodal
  - typingsJapgolly.bootstrap.bootstrapStrings.shownDotbsDotmodal
  - typingsJapgolly.bootstrap.bootstrapStrings.hideDotbsDotmodal
  - typingsJapgolly.bootstrap.bootstrapStrings.hiddenDotbsDotmodal
*/
trait ModalEvent extends js.Object

object ModalEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDotmodal: typingsJapgolly.bootstrap.bootstrapStrings.hiddenDotbsDotmodal = this.cast("hidden.bs.modal")
  @scala.inline
  def hideDotbsDotmodal: typingsJapgolly.bootstrap.bootstrapStrings.hideDotbsDotmodal = this.cast("hide.bs.modal")
  @scala.inline
  def showDotbsDotmodal: typingsJapgolly.bootstrap.bootstrapStrings.showDotbsDotmodal = this.cast("show.bs.modal")
  @scala.inline
  def shownDotbsDotmodal: typingsJapgolly.bootstrap.bootstrapStrings.shownDotbsDotmodal = this.cast("shown.bs.modal")
}

