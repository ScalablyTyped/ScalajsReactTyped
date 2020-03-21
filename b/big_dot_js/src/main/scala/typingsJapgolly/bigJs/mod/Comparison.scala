package typingsJapgolly.bigJs.mod

import typingsJapgolly.bigJs.bigJsNumbers.`-1`
import typingsJapgolly.bigJs.bigJsNumbers.`0`
import typingsJapgolly.bigJs.bigJsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bigJs.bigJsNumbers.`1`
  - typingsJapgolly.bigJs.bigJsNumbers.`0`
  - typingsJapgolly.bigJs.bigJsNumbers.`-1`
*/
trait Comparison extends js.Object

object Comparison {
  @scala.inline
  def EQ: `0` = this.cast(0)
  @scala.inline
  def GT: `1` = this.cast(1)
  @scala.inline
  def LT: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

