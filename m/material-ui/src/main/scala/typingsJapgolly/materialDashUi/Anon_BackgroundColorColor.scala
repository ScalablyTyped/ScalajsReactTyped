package typingsJapgolly.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColorColor {
  @scala.inline
  def apply(backgroundColor: String = null, color: String = null): Anon_BackgroundColorColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorColor]
  }
}

