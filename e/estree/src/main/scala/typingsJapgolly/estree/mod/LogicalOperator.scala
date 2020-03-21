package typingsJapgolly.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.estreeStrings.VerticallineVerticalline
  - typingsJapgolly.estree.estreeStrings.AmpersandAmpersand
*/
trait LogicalOperator extends js.Object

object LogicalOperator {
  @scala.inline
  def AmpersandAmpersand: typingsJapgolly.estree.estreeStrings.AmpersandAmpersand = this.cast("&&")
  @scala.inline
  def VerticallineVerticalline: typingsJapgolly.estree.estreeStrings.VerticallineVerticalline = this.cast("||")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

