package typingsJapgolly.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.pixel
  - typingsJapgolly.openlayers.openlayersStrings.image
*/
trait RasterOperationType extends js.Object

object RasterOperationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typingsJapgolly.openlayers.openlayersStrings.image = this.cast("image")
  @scala.inline
  def pixel: typingsJapgolly.openlayers.openlayersStrings.pixel = this.cast("pixel")
}

