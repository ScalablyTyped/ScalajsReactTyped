package typingsJapgolly.atReachRouter.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atReachRouter.atReachRouterStrings.PUSH
  - typings.atReachRouter.atReachRouterStrings.POP
*/
trait HistoryActionType extends js.Object

object HistoryActionType {
  @scala.inline
  def POP: typingsJapgolly.atReachRouter.atReachRouterStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typingsJapgolly.atReachRouter.atReachRouterStrings.PUSH = this.cast("PUSH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

