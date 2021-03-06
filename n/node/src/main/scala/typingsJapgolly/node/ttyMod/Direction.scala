package typingsJapgolly.node.ttyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * -1 - to the left from cursor
  *  0 - the entire line
  *  1 - to the right from cursor
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.nodeNumbers.`-1`
  - typingsJapgolly.node.nodeNumbers.`0`
  - typingsJapgolly.node.nodeNumbers.`1`
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def `-1`: typingsJapgolly.node.nodeNumbers.`-1` = this.cast(-1)
  @scala.inline
  def `0`: typingsJapgolly.node.nodeNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsJapgolly.node.nodeNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

