package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Various webgl draw modes. These can be used to specify which GL drawMode to use
  * under certain situations and renderers.
  *
  * @memberof PIXI
  * @static
  * @name DRAW_MODES
  * @enum {number}
  * @property {number} POINTS
  * @property {number} LINES
  * @property {number} LINE_LOOP
  * @property {number} LINE_STRIP
  * @property {number} TRIANGLES
  * @property {number} TRIANGLE_STRIP
  * @property {number} TRIANGLE_FAN
  */
@JSImport("pixi.js", "DRAW_MODES")
@js.native
object DRAW_MODES extends js.Object {
  /* 1 */ val LINES: typingsJapgolly.pixiJs.PIXI.DRAW_MODES.LINES with Double = js.native
  /* 2 */ val LINE_LOOP: typingsJapgolly.pixiJs.PIXI.DRAW_MODES.LINE_LOOP with Double = js.native
  /* 3 */ val LINE_STRIP: typingsJapgolly.pixiJs.PIXI.DRAW_MODES.LINE_STRIP with Double = js.native
  /* 0 */ val POINTS: typingsJapgolly.pixiJs.PIXI.DRAW_MODES.POINTS with Double = js.native
  /* 4 */ val TRIANGLES: typingsJapgolly.pixiJs.PIXI.DRAW_MODES.TRIANGLES with Double = js.native
  /* 6 */ val TRIANGLE_FAN: typingsJapgolly.pixiJs.PIXI.DRAW_MODES.TRIANGLE_FAN with Double = js.native
  /* 5 */ val TRIANGLE_STRIP: typingsJapgolly.pixiJs.PIXI.DRAW_MODES.TRIANGLE_STRIP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.DRAW_MODES with Double] = js.native
}

