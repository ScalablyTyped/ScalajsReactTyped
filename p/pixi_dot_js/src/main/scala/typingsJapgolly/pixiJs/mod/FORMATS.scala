package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Various GL texture/resources formats.
  *
  * @memberof PIXI
  * @static
  * @name FORMATS
  * @enum {number}
  * @property {number} RGBA=6408
  * @property {number} RGB=6407
  * @property {number} ALPHA=6406
  * @property {number} LUMINANCE=6409
  * @property {number} LUMINANCE_ALPHA=6410
  * @property {number} DEPTH_COMPONENT=6402
  * @property {number} DEPTH_STENCIL=34041
  */
@JSImport("pixi.js", "FORMATS")
@js.native
object FORMATS extends js.Object {
  /* 2 */ val ALPHA: typingsJapgolly.pixiJs.PIXI.FORMATS.ALPHA with Double = js.native
  /* 5 */ val DEPTH_COMPONENT: typingsJapgolly.pixiJs.PIXI.FORMATS.DEPTH_COMPONENT with Double = js.native
  /* 6 */ val DEPTH_STENCIL: typingsJapgolly.pixiJs.PIXI.FORMATS.DEPTH_STENCIL with Double = js.native
  /* 3 */ val LUMINANCE: typingsJapgolly.pixiJs.PIXI.FORMATS.LUMINANCE with Double = js.native
  /* 4 */ val LUMINANCE_ALPHA: typingsJapgolly.pixiJs.PIXI.FORMATS.LUMINANCE_ALPHA with Double = js.native
  /* 1 */ val RGB: typingsJapgolly.pixiJs.PIXI.FORMATS.RGB with Double = js.native
  /* 0 */ val RGBA: typingsJapgolly.pixiJs.PIXI.FORMATS.RGBA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.FORMATS with Double] = js.native
}

