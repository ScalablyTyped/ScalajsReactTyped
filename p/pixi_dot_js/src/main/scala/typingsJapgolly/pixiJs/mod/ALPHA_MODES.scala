package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How to treat textures with premultiplied alpha
  *
  * @name ALPHA_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} NO_PREMULTIPLIED_ALPHA - Source is not premultiplied, leave it like that.
  *  Option for compressed and data textures that are created from typed arrays.
  * @property {number} PREMULTIPLY_ON_UPLOAD - Source is not premultiplied, premultiply on upload.
  *  Default option, used for all loaded images.
  * @property {number} PREMULTIPLIED_ALPHA - Source is already premultiplied
  *  Example: spine atlases with `_pma` suffix.
  * @property {number} NPM - Alias for NO_PREMULTIPLIED_ALPHA.
  * @property {number} UNPACK - Default option, alias for PREMULTIPLY_ON_UPLOAD.
  * @property {number} PMA - Alias for PREMULTIPLIED_ALPHA.
  */
@JSImport("pixi.js", "ALPHA_MODES")
@js.native
object ALPHA_MODES extends js.Object {
  /* 0 */ val NO_PREMULTIPLIED_ALPHA: typingsJapgolly.pixiJs.PIXI.ALPHA_MODES.NO_PREMULTIPLIED_ALPHA with Double = js.native
  /* 3 */ val NPM: typingsJapgolly.pixiJs.PIXI.ALPHA_MODES.NPM with Double = js.native
  /* 5 */ val PMA: typingsJapgolly.pixiJs.PIXI.ALPHA_MODES.PMA with Double = js.native
  /* 2 */ val PREMULTIPLIED_ALPHA: typingsJapgolly.pixiJs.PIXI.ALPHA_MODES.PREMULTIPLIED_ALPHA with Double = js.native
  /* 1 */ val PREMULTIPLY_ON_UPLOAD: typingsJapgolly.pixiJs.PIXI.ALPHA_MODES.PREMULTIPLY_ON_UPLOAD with Double = js.native
  /* 4 */ val UNPACK: typingsJapgolly.pixiJs.PIXI.ALPHA_MODES.UNPACK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.ALPHA_MODES with Double] = js.native
}

