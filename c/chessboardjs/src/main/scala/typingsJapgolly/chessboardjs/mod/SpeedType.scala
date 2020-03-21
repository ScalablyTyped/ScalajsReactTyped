package typingsJapgolly.chessboardjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chessboardjs.chessboardjsStrings.slow
  - typingsJapgolly.chessboardjs.chessboardjsStrings.fast
*/
trait SpeedType extends js.Object

object SpeedType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fast: typingsJapgolly.chessboardjs.chessboardjsStrings.fast = this.cast("fast")
  @scala.inline
  def slow: typingsJapgolly.chessboardjs.chessboardjsStrings.slow = this.cast("slow")
}

