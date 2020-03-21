package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A border along a cell.
  */
@js.native
trait SchemaBorder extends js.Object {
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  /**
    * The style of the border.
    */
  var style: js.UndefOr[String] = js.native
  /**
    * The width of the border, in pixels. Deprecated; the width is determined
    * by the &quot;style&quot; field.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaBorder {
  @scala.inline
  def apply(color: SchemaColor = null, style: String = null, width: Int | Double = null): SchemaBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBorder]
  }
}

