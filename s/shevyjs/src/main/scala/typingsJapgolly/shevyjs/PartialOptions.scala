package typingsJapgolly.shevyjs

import typingsJapgolly.shevyjs.shevyjsStrings.augmentedFourth
import typingsJapgolly.shevyjs.shevyjsStrings.majorSecond
import typingsJapgolly.shevyjs.shevyjsStrings.majorThird
import typingsJapgolly.shevyjs.shevyjsStrings.minorThird
import typingsJapgolly.shevyjs.shevyjsStrings.perfectFourth
import typingsJapgolly.shevyjs.typesMod.Factor
import typingsJapgolly.shevyjs.typesMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<shevyjs.shevyjs/types.Options> */
trait PartialOptions extends js.Object {
  var addMarginBottom: js.UndefOr[Boolean] = js.undefined
  var baseFontScale: js.UndefOr[Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth] = js.undefined
  var baseFontSize: js.UndefOr[String] = js.undefined
  var baseLineHeight: js.UndefOr[Double] = js.undefined
  var proximity: js.UndefOr[Boolean] = js.undefined
  var proximityFactor: js.UndefOr[Factor] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    addMarginBottom: js.UndefOr[Boolean] = js.undefined,
    baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth = null,
    baseFontSize: String = null,
    baseLineHeight: Int | Double = null,
    proximity: js.UndefOr[Boolean] = js.undefined,
    proximityFactor: Int | Double = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addMarginBottom)) __obj.updateDynamic("addMarginBottom")(addMarginBottom.asInstanceOf[js.Any])
    if (baseFontScale != null) __obj.updateDynamic("baseFontScale")(baseFontScale.asInstanceOf[js.Any])
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (baseLineHeight != null) __obj.updateDynamic("baseLineHeight")(baseLineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(proximity)) __obj.updateDynamic("proximity")(proximity.asInstanceOf[js.Any])
    if (proximityFactor != null) __obj.updateDynamic("proximityFactor")(proximityFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

