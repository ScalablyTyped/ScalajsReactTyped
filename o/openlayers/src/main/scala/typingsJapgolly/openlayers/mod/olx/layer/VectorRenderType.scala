package typingsJapgolly.openlayers.mod.olx.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Render mode for vector layers:
  *  * `'image'`: Vector layers are rendered as images. Great performance, but
  *    point symbols and texts are always rotated with the view and pixels are
  *    scaled during zoom animations.
  *  * `'vector'`: Vector layers are rendered as vectors. Most accurate rendering
  *    even during animations, but slower performance.
  * Default is `vector`.
  * @api
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.image
  - typingsJapgolly.openlayers.openlayersStrings.vector
*/
trait VectorRenderType extends js.Object

object VectorRenderType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typingsJapgolly.openlayers.openlayersStrings.image = this.cast("image")
  @scala.inline
  def vector: typingsJapgolly.openlayers.openlayersStrings.vector = this.cast("vector")
}

