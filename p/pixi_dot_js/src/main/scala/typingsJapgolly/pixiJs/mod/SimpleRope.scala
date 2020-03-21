package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rope allows you to draw a texture across several points and then manipulate these points
  *
  *```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * let rope = new PIXI.SimpleRope(PIXI.Texture.from("snake.png"), points);
  *  ```
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  *
  */
@JSImport("pixi.js", "SimpleRope")
@js.native
class SimpleRope protected ()
  extends typingsJapgolly.pixiJs.PIXI.SimpleRope {
  def this(texture: typingsJapgolly.pixiJs.PIXI.Texture, points: js.Array[typingsJapgolly.pixiJs.PIXI.Point]) = this()
  def this(
    texture: typingsJapgolly.pixiJs.PIXI.Texture,
    points: js.Array[typingsJapgolly.pixiJs.PIXI.Point],
    textureScale: Double
  ) = this()
}

