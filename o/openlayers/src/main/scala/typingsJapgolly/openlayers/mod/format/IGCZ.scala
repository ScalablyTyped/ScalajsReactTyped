package typingsJapgolly.openlayers.mod.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGC altitude/z. One of 'barometric', 'gps', 'none'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.barometric
  - typingsJapgolly.openlayers.openlayersStrings.gps
  - typingsJapgolly.openlayers.openlayersStrings.none
*/
trait IGCZ extends js.Object

object IGCZ {
  @scala.inline
  def barometric: typingsJapgolly.openlayers.openlayersStrings.barometric = this.cast("barometric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gps: typingsJapgolly.openlayers.openlayersStrings.gps = this.cast("gps")
  @scala.inline
  def none: typingsJapgolly.openlayers.openlayersStrings.none = this.cast("none")
}

