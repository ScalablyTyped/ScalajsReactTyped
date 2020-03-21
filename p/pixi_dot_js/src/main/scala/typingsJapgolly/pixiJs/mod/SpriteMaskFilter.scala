package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This handles a Sprite acting as a mask, as opposed to a Graphic.
  *
  * WebGL only.
  *
  * @class
  * @extends PIXI.Filter
  * @memberof PIXI
  */
@JSImport("pixi.js", "SpriteMaskFilter")
@js.native
class SpriteMaskFilter protected ()
  extends typingsJapgolly.pixiJs.PIXI.SpriteMaskFilter {
  def this(sprite: typingsJapgolly.pixiJs.PIXI.Sprite) = this()
}

