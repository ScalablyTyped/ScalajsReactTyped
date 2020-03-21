package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The wrap modes that are supported by pixi.
  *
  * The {@link PIXI.settings.WRAP_MODE} wrap mode affects the default wrapping mode of future operations.
  * It can be re-assigned to either CLAMP or REPEAT, depending upon suitability.
  * If the texture is non power of two then clamp will be used regardless as WebGL can
  * only use REPEAT if the texture is po2.
  *
  * This property only affects WebGL.
  *
  * @name WRAP_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} CLAMP - The textures uvs are clamped
  * @property {number} REPEAT - The texture uvs tile and repeat
  * @property {number} MIRRORED_REPEAT - The texture uvs tile and repeat with mirroring
  */
@JSImport("pixi.js", "WRAP_MODES")
@js.native
object WRAP_MODES extends js.Object {
  /* 0 */ val CLAMP: typingsJapgolly.pixiJs.PIXI.WRAP_MODES.CLAMP with Double = js.native
  /* 2 */ val MIRRORED_REPEAT: typingsJapgolly.pixiJs.PIXI.WRAP_MODES.MIRRORED_REPEAT with Double = js.native
  /* 1 */ val REPEAT: typingsJapgolly.pixiJs.PIXI.WRAP_MODES.REPEAT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.WRAP_MODES with Double] = js.native
}

