package typingsJapgolly.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileOptions extends js.Object {
  /** Tile angle of rotation, must be a multiple of 90. (optional, default 0) */
  var angle: js.UndefOr[Double] = js.undefined
  /** background colour, parsed by the color module, defaults to white without transparency. (optional, default {r:255,g:255,b:255,alpha:1}) */
  var background: js.UndefOr[String | RGBA] = js.undefined
  /** Tile container, with value fs (filesystem) or zip (compressed file). (optional, default 'fs') */
  var container: js.UndefOr[String] = js.undefined
  /** How deep to make the pyramid, possible values are "onepixel", "onetile" or "one" (default based on layout) */
  var depth: js.UndefOr[String] = js.undefined
  /** Filesystem layout, possible values are dz, zoomify or google. (optional, default 'dz') */
  var layout: js.UndefOr[TileLayout] = js.undefined
  /** Tile overlap in pixels, a value between 0 and 8192. (optional, default 0) */
  var overlap: js.UndefOr[Double] = js.undefined
  /** Tile size in pixels, a value between 1 and 8192. (optional, default 256) */
  var size: js.UndefOr[Double] = js.undefined
  /** Threshold to skip tile generation, a value 0 - 255 for 8-bit images or 0 - 65535 for 16-bit images */
  var skipBlanks: js.UndefOr[Double] = js.undefined
}

object TileOptions {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    background: String | RGBA = null,
    container: String = null,
    depth: String = null,
    layout: TileLayout = null,
    overlap: Int | Double = null,
    size: Int | Double = null,
    skipBlanks: Int | Double = null
  ): TileOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (overlap != null) __obj.updateDynamic("overlap")(overlap.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skipBlanks != null) __obj.updateDynamic("skipBlanks")(skipBlanks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOptions]
  }
}

