package typingsJapgolly.jsMoney.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsMoney.jsMoneyStrings.round
  - typingsJapgolly.jsMoney.jsMoneyStrings.floor
  - typingsJapgolly.jsMoney.jsMoneyStrings.ceil
*/
trait Rounders extends js.Object

object Rounders {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ceil: typingsJapgolly.jsMoney.jsMoneyStrings.ceil = this.cast("ceil")
  @scala.inline
  def floor: typingsJapgolly.jsMoney.jsMoneyStrings.floor = this.cast("floor")
  @scala.inline
  def round: typingsJapgolly.jsMoney.jsMoneyStrings.round = this.cast("round")
}

