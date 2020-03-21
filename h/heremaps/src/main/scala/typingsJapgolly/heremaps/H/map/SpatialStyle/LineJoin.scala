package typingsJapgolly.heremaps.H.map.SpatialStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of corner created, when two lines meet, one of 'round', 'bevel' or 'miter'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.heremaps.heremapsStrings.round
  - typingsJapgolly.heremaps.heremapsStrings.bevel
  - typingsJapgolly.heremaps.heremapsStrings.miter
*/
trait LineJoin extends js.Object

object LineJoin {
  @scala.inline
  def bevel: typingsJapgolly.heremaps.heremapsStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typingsJapgolly.heremaps.heremapsStrings.miter = this.cast("miter")
  @scala.inline
  def round: typingsJapgolly.heremaps.heremapsStrings.round = this.cast("round")
}

