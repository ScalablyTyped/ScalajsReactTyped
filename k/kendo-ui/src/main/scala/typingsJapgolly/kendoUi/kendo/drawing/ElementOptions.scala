package typingsJapgolly.kendoUi.kendo.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementOptions extends js.Object {
  var clip: js.UndefOr[Path] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var transform: js.UndefOr[Transformation] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ElementOptions {
  @scala.inline
  def apply(
    clip: Path = null,
    cursor: String = null,
    name: String = null,
    opacity: Int | Double = null,
    transform: Transformation = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ElementOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementOptions]
  }
}

