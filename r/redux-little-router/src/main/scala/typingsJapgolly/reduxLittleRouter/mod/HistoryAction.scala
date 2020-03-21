package typingsJapgolly.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.PUSH
  - typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.POP
  - typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.REPLACE
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  def POP: typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.PUSH = this.cast("PUSH")
  @scala.inline
  def REPLACE: typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.REPLACE = this.cast("REPLACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

