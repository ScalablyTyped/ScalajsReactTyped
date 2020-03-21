package typingsJapgolly.pixiJs.mod

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
@JSImport("pixi.js", "TextureUvs")
@js.native
class TextureUvs ()
  extends typingsJapgolly.pixiJs.PIXI.TextureUvs

