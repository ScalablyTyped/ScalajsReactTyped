package typingsJapgolly.heremaps.H.map.SpatialStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The style of the end caps for a line, one of 'butt', 'round' or 'square'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.heremaps.heremapsStrings.butt
  - typingsJapgolly.heremaps.heremapsStrings.round
  - typingsJapgolly.heremaps.heremapsStrings.square
*/
trait LineCap extends js.Object

object LineCap {
  @scala.inline
  def butt: typingsJapgolly.heremaps.heremapsStrings.butt = this.cast("butt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def round: typingsJapgolly.heremaps.heremapsStrings.round = this.cast("round")
  @scala.inline
  def square: typingsJapgolly.heremaps.heremapsStrings.square = this.cast("square")
}

