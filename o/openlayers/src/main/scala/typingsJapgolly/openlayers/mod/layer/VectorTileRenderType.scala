package typingsJapgolly.openlayers.mod.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Render mode for vector tiles:
  *  * `'image'`: Vector tiles are rendered as images. Great performance, but
  *    point symbols and texts are always rotated with the view and pixels are
  *    scaled during zoom animations.
  *  * `'hybrid'`: Polygon and line elements are rendered as images, so pixels
  *    are scaled during zoom animations. Point symbols and texts are accurately
  *    rendered as vectors and can stay upright on rotated views.
  *  * `'vector'`: Vector tiles are rendered as vectors. Most accurate rendering
  *    even during animations, but slower performance than the other options.
  * @api
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.image
  - typingsJapgolly.openlayers.openlayersStrings.hybrid
  - typingsJapgolly.openlayers.openlayersStrings.vector
*/
trait VectorTileRenderType extends js.Object

object VectorTileRenderType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hybrid: typingsJapgolly.openlayers.openlayersStrings.hybrid = this.cast("hybrid")
  @scala.inline
  def image: typingsJapgolly.openlayers.openlayersStrings.image = this.cast("image")
  @scala.inline
  def vector: typingsJapgolly.openlayers.openlayersStrings.vector = this.cast("vector")
}

