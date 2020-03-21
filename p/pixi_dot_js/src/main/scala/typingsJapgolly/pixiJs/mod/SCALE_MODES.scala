package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scale modes that are supported by pixi.
  *
  * The {@link PIXI.settings.SCALE_MODE} scale mode affects the default scaling mode of future operations.
  * It can be re-assigned to either LINEAR or NEAREST, depending upon suitability.
  *
  * @memberof PIXI
  * @static
  * @name SCALE_MODES
  * @enum {number}
  * @property {number} LINEAR Smooth scaling
  * @property {number} NEAREST Pixelating scaling
  */
@JSImport("pixi.js", "SCALE_MODES")
@js.native
object SCALE_MODES extends js.Object {
  /* 0 */ val LINEAR: typingsJapgolly.pixiJs.PIXI.SCALE_MODES.LINEAR with Double = js.native
  /* 1 */ val NEAREST: typingsJapgolly.pixiJs.PIXI.SCALE_MODES.NEAREST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.SCALE_MODES with Double] = js.native
}

