package typingsJapgolly.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bootstrap.bootstrapStrings.showDotbsDottooltip
  - typingsJapgolly.bootstrap.bootstrapStrings.shownDotbsDottooltip
  - typingsJapgolly.bootstrap.bootstrapStrings.hideDotbsDottooltip
  - typingsJapgolly.bootstrap.bootstrapStrings.hiddenDotbsDottooltip
  - typingsJapgolly.bootstrap.bootstrapStrings.insertedDotbsDottooltip
*/
trait TooltipEvent extends js.Object

object TooltipEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotbsDottooltip: typingsJapgolly.bootstrap.bootstrapStrings.hiddenDotbsDottooltip = this.cast("hidden.bs.tooltip")
  @scala.inline
  def hideDotbsDottooltip: typingsJapgolly.bootstrap.bootstrapStrings.hideDotbsDottooltip = this.cast("hide.bs.tooltip")
  @scala.inline
  def insertedDotbsDottooltip: typingsJapgolly.bootstrap.bootstrapStrings.insertedDotbsDottooltip = this.cast("inserted.bs.tooltip")
  @scala.inline
  def showDotbsDottooltip: typingsJapgolly.bootstrap.bootstrapStrings.showDotbsDottooltip = this.cast("show.bs.tooltip")
  @scala.inline
  def shownDotbsDottooltip: typingsJapgolly.bootstrap.bootstrapStrings.shownDotbsDottooltip = this.cast("shown.bs.tooltip")
}

