package typingsJapgolly.metismenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.metismenu.metismenuStrings.showDotmetisMenu
  - typingsJapgolly.metismenu.metismenuStrings.shownDotmetisMenu
  - typingsJapgolly.metismenu.metismenuStrings.hideDotmetisMenu
  - typingsJapgolly.metismenu.metismenuStrings.hiddenDotmetisMenu
*/
trait MetisMenuEvents extends js.Object

object MetisMenuEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotmetisMenu: typingsJapgolly.metismenu.metismenuStrings.hiddenDotmetisMenu = this.cast("hidden.metisMenu")
  @scala.inline
  def hideDotmetisMenu: typingsJapgolly.metismenu.metismenuStrings.hideDotmetisMenu = this.cast("hide.metisMenu")
  @scala.inline
  def showDotmetisMenu: typingsJapgolly.metismenu.metismenuStrings.showDotmetisMenu = this.cast("show.metisMenu")
  @scala.inline
  def shownDotmetisMenu: typingsJapgolly.metismenu.metismenuStrings.shownDotmetisMenu = this.cast("shown.metisMenu")
}

