package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiJs.AnonAutoDensity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The AbstractRenderer is the base for a PixiJS Renderer. It is extended by the {@link PIXI.CanvasRenderer}
  * and {@link PIXI.Renderer} which can be used for rendering a PixiJS scene.
  *
  * @abstract
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSImport("pixi.js", "AbstractRenderer")
@js.native
class AbstractRenderer protected ()
  extends typingsJapgolly.pixiJs.PIXI.AbstractRenderer {
  def this(system: String) = this()
  def this(system: String, options: AnonAutoDensity) = this()
}

