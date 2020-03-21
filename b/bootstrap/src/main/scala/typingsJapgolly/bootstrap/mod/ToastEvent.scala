package typingsJapgolly.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bootstrap.bootstrapStrings.showDotbsDottoast
  - typingsJapgolly.bootstrap.bootstrapStrings.shownDotbsDottoast
  - typingsJapgolly.bootstrap.bootstrapStrings.hideDotbsDottoast
  - typingsJapgolly.bootstrap.bootstrapStrings.hiddenDotbsDottoast
*/
trait ToastEvent extends js.Object

object ToastEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDottoast: typingsJapgolly.bootstrap.bootstrapStrings.hiddenDotbsDottoast = this.cast("hidden.bs.toast")
  @scala.inline
  def hideDotbsDottoast: typingsJapgolly.bootstrap.bootstrapStrings.hideDotbsDottoast = this.cast("hide.bs.toast")
  @scala.inline
  def showDotbsDottoast: typingsJapgolly.bootstrap.bootstrapStrings.showDotbsDottoast = this.cast("show.bs.toast")
  @scala.inline
  def shownDotbsDottoast: typingsJapgolly.bootstrap.bootstrapStrings.shownDotbsDottoast = this.cast("shown.bs.toast")
}

