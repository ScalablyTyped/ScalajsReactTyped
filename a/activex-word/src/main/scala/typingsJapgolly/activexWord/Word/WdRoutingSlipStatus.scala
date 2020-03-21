package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`0`
import typingsJapgolly.activexWord.activexWordNumbers.`1`
import typingsJapgolly.activexWord.activexWordNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`0`
  - typingsJapgolly.activexWord.activexWordNumbers.`2`
  - typingsJapgolly.activexWord.activexWordNumbers.`1`
*/
trait WdRoutingSlipStatus extends js.Object

object WdRoutingSlipStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdNotYetRouted: `0` = this.cast(0)
  @scala.inline
  def wdRouteComplete: `2` = this.cast(2)
  @scala.inline
  def wdRouteInProgress: `1` = this.cast(1)
}

