package typingsJapgolly.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsplumb.jsplumbStrings.Label
  - typingsJapgolly.jsplumb.jsplumbStrings.Arrow
  - typingsJapgolly.jsplumb.jsplumbStrings.PlainArrow
  - typingsJapgolly.jsplumb.jsplumbStrings.Custom
*/
trait OverlayId extends js.Object

object OverlayId {
  @scala.inline
  def Arrow: typingsJapgolly.jsplumb.jsplumbStrings.Arrow = this.cast("Arrow")
  @scala.inline
  def Custom: typingsJapgolly.jsplumb.jsplumbStrings.Custom = this.cast("Custom")
  @scala.inline
  def Label: typingsJapgolly.jsplumb.jsplumbStrings.Label = this.cast("Label")
  @scala.inline
  def PlainArrow: typingsJapgolly.jsplumb.jsplumbStrings.PlainArrow = this.cast("PlainArrow")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

