package typingsJapgolly.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores a texture's frame in UV coordinates, in
  * which everything lies in the rectangle `[(0,0), (1,0),
  * (1,1), (0,1)]`.
  *
  * | Corner       | Coordinates |
  * |--------------|-------------|
  * | Top-Left     | `(x0,y0)`   |
  * | Top-Right    | `(x1,y1)`   |
  * | Bottom-Right | `(x2,y2)`   |
  * | Bottom-Left  | `(x3,y3)`   |
  *
  * @class
  * @protected
  * @memberof PIXI
  */
@JSGlobal("PIXI.TextureUvs")
@js.native
class TextureUvs () extends js.Object {
  /**
    * X-component of top-left corner `(x0,y0)`.
    *
    * @member {number} PIXI.TextureUvs#x0
    */
  var x0: Double = js.native
  /**
    * X-component of top-right corner `(x1,y1)`.
    *
    * @member {number} PIXI.TextureUvs#x1
    */
  var x1: Double = js.native
  /**
    * X-component of bottom-right corner `(x2,y2)`.
    *
    * @member {number} PIXI.TextureUvs#x2
    */
  var x2: Double = js.native
  /**
    * X-component of bottom-left corner `(x3,y3)`.
    *
    * @member {number} PIXI.TextureUvs#x3
    */
  var x3: Double = js.native
  /**
    * Y-component of top-left corner `(x0,y0)`.
    *
    * @member {number} PIXI.TextureUvs#y0
    */
  var y0: Double = js.native
  /**
    * Y-component of top-right corner `(x1,y1)`.
    *
    * @member {number} PIXI.TextureUvs#y1
    */
  var y1: Double = js.native
  /**
    * Y-component of bottom-right corner `(x2,y2)`.
    *
    * @member {number} PIXI.TextureUvs#y2
    */
  var y2: Double = js.native
  /**
    * Y-component of bottom-right corner `(x3,y3)`.
    *
    * @member {number} PIXI.TextureUvs#y3
    */
  var y3: Double = js.native
  /**
    * Sets the texture Uvs based on the given frame information.
    *
    * @protected
    * @param {PIXI.Rectangle} frame - The frame of the texture
    * @param {PIXI.Rectangle} baseFrame - The base frame of the texture
    * @param {number} rotate - Rotation of frame, see {@link PIXI.groupD8}
    */
  /* protected */ def set(frame: Rectangle, baseFrame: Rectangle, rotate: Double): Unit = js.native
}

