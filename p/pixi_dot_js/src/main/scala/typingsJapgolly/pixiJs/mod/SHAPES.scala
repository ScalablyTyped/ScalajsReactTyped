package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants that identify shapes, mainly to prevent `instanceof` calls.
  *
  * @static
  * @constant
  * @name SHAPES
  * @memberof PIXI
  * @type {enum}
  * @property {number} POLY Polygon
  * @property {number} RECT Rectangle
  * @property {number} CIRC Circle
  * @property {number} ELIP Ellipse
  * @property {number} RREC Rounded Rectangle
  * @enum {number}
  */
@JSImport("pixi.js", "SHAPES")
@js.native
object SHAPES extends js.Object {
  /* 2 */ val CIRC: typingsJapgolly.pixiJs.PIXI.SHAPES.CIRC with Double = js.native
  /* 3 */ val ELIP: typingsJapgolly.pixiJs.PIXI.SHAPES.ELIP with Double = js.native
  /* 0 */ val POLY: typingsJapgolly.pixiJs.PIXI.SHAPES.POLY with Double = js.native
  /* 1 */ val RECT: typingsJapgolly.pixiJs.PIXI.SHAPES.RECT with Double = js.native
  /* 4 */ val RREC: typingsJapgolly.pixiJs.PIXI.SHAPES.RREC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.SHAPES with Double] = js.native
}

