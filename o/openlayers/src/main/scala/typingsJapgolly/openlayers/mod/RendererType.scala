package typingsJapgolly.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.canvas
  - typingsJapgolly.openlayers.openlayersStrings.dom
  - typingsJapgolly.openlayers.openlayersStrings.webgl
*/
trait RendererType extends js.Object

object RendererType {
  @scala.inline
  def canvas: typingsJapgolly.openlayers.openlayersStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dom: typingsJapgolly.openlayers.openlayersStrings.dom = this.cast("dom")
  @scala.inline
  def webgl: typingsJapgolly.openlayers.openlayersStrings.webgl = this.cast("webgl")
}

