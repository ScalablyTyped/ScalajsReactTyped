package typingsJapgolly.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies which properties to load on the `format.borders` object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesBorderLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `weight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Boolean] = js.undefined
}

object CellPropertiesBorderLoadOptions {
  @scala.inline
  def apply(
    color: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    tintAndShade: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Boolean] = js.undefined
  ): CellPropertiesBorderLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesBorderLoadOptions]
  }
}

