package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.`line-center`
import typingsJapgolly.mapboxGl.mapboxGlStrings.`viewport-y`
import typingsJapgolly.mapboxGl.mapboxGlStrings.auto
import typingsJapgolly.mapboxGl.mapboxGlStrings.both
import typingsJapgolly.mapboxGl.mapboxGlStrings.center
import typingsJapgolly.mapboxGl.mapboxGlStrings.height
import typingsJapgolly.mapboxGl.mapboxGlStrings.left
import typingsJapgolly.mapboxGl.mapboxGlStrings.line
import typingsJapgolly.mapboxGl.mapboxGlStrings.lowercase
import typingsJapgolly.mapboxGl.mapboxGlStrings.map
import typingsJapgolly.mapboxGl.mapboxGlStrings.none
import typingsJapgolly.mapboxGl.mapboxGlStrings.point
import typingsJapgolly.mapboxGl.mapboxGlStrings.right
import typingsJapgolly.mapboxGl.mapboxGlStrings.source_
import typingsJapgolly.mapboxGl.mapboxGlStrings.uppercase
import typingsJapgolly.mapboxGl.mapboxGlStrings.viewport
import typingsJapgolly.mapboxGl.mapboxGlStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolLayout
  extends Layout
     with _AnyLayout {
  var `icon-allow-overlap`: js.UndefOr[Boolean | StyleFunction | Expression] = js.undefined
  var `icon-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.undefined
  var `icon-ignore-placement`: js.UndefOr[Boolean] = js.undefined
  var `icon-image`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `icon-keep-upright`: js.UndefOr[Boolean] = js.undefined
  var `icon-offset`: js.UndefOr[js.Array[Double] | StyleFunction | Expression] = js.undefined
  var `icon-optional`: js.UndefOr[Boolean] = js.undefined
  var `icon-padding`: js.UndefOr[Double | Expression] = js.undefined
  var `icon-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  var `icon-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `icon-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  var `icon-size`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `icon-text-fit`: js.UndefOr[none | both | width | height] = js.undefined
  var `icon-text-fit-padding`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  var `symbol-avoid-edges`: js.UndefOr[Boolean] = js.undefined
  var `symbol-placement`: js.UndefOr[point | line | `line-center`] = js.undefined
  var `symbol-spacing`: js.UndefOr[Double | Expression] = js.undefined
  var `symbol-z-order`: js.UndefOr[`viewport-y` | source_] = js.undefined
  var `text-allow-overlap`: js.UndefOr[Boolean] = js.undefined
  var `text-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.undefined
  var `text-field`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `text-font`: js.UndefOr[String | js.Array[String] | Expression] = js.undefined
  var `text-ignore-placement`: js.UndefOr[Boolean] = js.undefined
  var `text-justify`: js.UndefOr[left | center | right | Expression] = js.undefined
  var `text-keep-upright`: js.UndefOr[Boolean] = js.undefined
  var `text-letter-spacing`: js.UndefOr[Double | Expression] = js.undefined
  var `text-line-height`: js.UndefOr[Double | Expression] = js.undefined
  var `text-max-angle`: js.UndefOr[Double | Expression] = js.undefined
  var `text-max-width`: js.UndefOr[Double | Expression] = js.undefined
  var `text-offset`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  var `text-optional`: js.UndefOr[Boolean] = js.undefined
  var `text-padding`: js.UndefOr[Double | Expression] = js.undefined
  var `text-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  var `text-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `text-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  var `text-size`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `text-transform`: js.UndefOr[none | uppercase | lowercase | StyleFunction | Expression] = js.undefined
}

object SymbolLayout {
  @scala.inline
  def apply(
    `icon-allow-overlap`: Boolean | StyleFunction | Expression = null,
    `icon-anchor`: Anchor | StyleFunction | Expression = null,
    `icon-ignore-placement`: js.UndefOr[Boolean] = js.undefined,
    `icon-image`: String | StyleFunction | Expression = null,
    `icon-keep-upright`: js.UndefOr[Boolean] = js.undefined,
    `icon-offset`: js.Array[Double] | StyleFunction | Expression = null,
    `icon-optional`: js.UndefOr[Boolean] = js.undefined,
    `icon-padding`: Double | Expression = null,
    `icon-pitch-alignment`: map | viewport | auto = null,
    `icon-rotate`: Double | StyleFunction | Expression = null,
    `icon-rotation-alignment`: map | viewport | auto = null,
    `icon-size`: Double | StyleFunction | Expression = null,
    `icon-text-fit`: none | both | width | height = null,
    `icon-text-fit-padding`: js.Array[Double] | Expression = null,
    `symbol-avoid-edges`: js.UndefOr[Boolean] = js.undefined,
    `symbol-placement`: point | line | `line-center` = null,
    `symbol-spacing`: Double | Expression = null,
    `symbol-z-order`: `viewport-y` | source_ = null,
    `text-allow-overlap`: js.UndefOr[Boolean] = js.undefined,
    `text-anchor`: Anchor | StyleFunction | Expression = null,
    `text-field`: String | StyleFunction | Expression = null,
    `text-font`: String | js.Array[String] | Expression = null,
    `text-ignore-placement`: js.UndefOr[Boolean] = js.undefined,
    `text-justify`: left | center | right | Expression = null,
    `text-keep-upright`: js.UndefOr[Boolean] = js.undefined,
    `text-letter-spacing`: Double | Expression = null,
    `text-line-height`: Double | Expression = null,
    `text-max-angle`: Double | Expression = null,
    `text-max-width`: Double | Expression = null,
    `text-offset`: js.Array[Double] | Expression = null,
    `text-optional`: js.UndefOr[Boolean] = js.undefined,
    `text-padding`: Double | Expression = null,
    `text-pitch-alignment`: map | viewport | auto = null,
    `text-rotate`: Double | StyleFunction | Expression = null,
    `text-rotation-alignment`: map | viewport | auto = null,
    `text-size`: Double | StyleFunction | Expression = null,
    `text-transform`: none | uppercase | lowercase | StyleFunction | Expression = null,
    visibility: Visibility = null
  ): SymbolLayout = {
    val __obj = js.Dynamic.literal()
    if (`icon-allow-overlap` != null) __obj.updateDynamic("icon-allow-overlap")(`icon-allow-overlap`.asInstanceOf[js.Any])
    if (`icon-anchor` != null) __obj.updateDynamic("icon-anchor")(`icon-anchor`.asInstanceOf[js.Any])
    if (!js.isUndefined(`icon-ignore-placement`)) __obj.updateDynamic("icon-ignore-placement")(`icon-ignore-placement`.asInstanceOf[js.Any])
    if (`icon-image` != null) __obj.updateDynamic("icon-image")(`icon-image`.asInstanceOf[js.Any])
    if (!js.isUndefined(`icon-keep-upright`)) __obj.updateDynamic("icon-keep-upright")(`icon-keep-upright`.asInstanceOf[js.Any])
    if (`icon-offset` != null) __obj.updateDynamic("icon-offset")(`icon-offset`.asInstanceOf[js.Any])
    if (!js.isUndefined(`icon-optional`)) __obj.updateDynamic("icon-optional")(`icon-optional`.asInstanceOf[js.Any])
    if (`icon-padding` != null) __obj.updateDynamic("icon-padding")(`icon-padding`.asInstanceOf[js.Any])
    if (`icon-pitch-alignment` != null) __obj.updateDynamic("icon-pitch-alignment")(`icon-pitch-alignment`.asInstanceOf[js.Any])
    if (`icon-rotate` != null) __obj.updateDynamic("icon-rotate")(`icon-rotate`.asInstanceOf[js.Any])
    if (`icon-rotation-alignment` != null) __obj.updateDynamic("icon-rotation-alignment")(`icon-rotation-alignment`.asInstanceOf[js.Any])
    if (`icon-size` != null) __obj.updateDynamic("icon-size")(`icon-size`.asInstanceOf[js.Any])
    if (`icon-text-fit` != null) __obj.updateDynamic("icon-text-fit")(`icon-text-fit`.asInstanceOf[js.Any])
    if (`icon-text-fit-padding` != null) __obj.updateDynamic("icon-text-fit-padding")(`icon-text-fit-padding`.asInstanceOf[js.Any])
    if (!js.isUndefined(`symbol-avoid-edges`)) __obj.updateDynamic("symbol-avoid-edges")(`symbol-avoid-edges`.asInstanceOf[js.Any])
    if (`symbol-placement` != null) __obj.updateDynamic("symbol-placement")(`symbol-placement`.asInstanceOf[js.Any])
    if (`symbol-spacing` != null) __obj.updateDynamic("symbol-spacing")(`symbol-spacing`.asInstanceOf[js.Any])
    if (`symbol-z-order` != null) __obj.updateDynamic("symbol-z-order")(`symbol-z-order`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-allow-overlap`)) __obj.updateDynamic("text-allow-overlap")(`text-allow-overlap`.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    if (`text-field` != null) __obj.updateDynamic("text-field")(`text-field`.asInstanceOf[js.Any])
    if (`text-font` != null) __obj.updateDynamic("text-font")(`text-font`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-ignore-placement`)) __obj.updateDynamic("text-ignore-placement")(`text-ignore-placement`.asInstanceOf[js.Any])
    if (`text-justify` != null) __obj.updateDynamic("text-justify")(`text-justify`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-keep-upright`)) __obj.updateDynamic("text-keep-upright")(`text-keep-upright`.asInstanceOf[js.Any])
    if (`text-letter-spacing` != null) __obj.updateDynamic("text-letter-spacing")(`text-letter-spacing`.asInstanceOf[js.Any])
    if (`text-line-height` != null) __obj.updateDynamic("text-line-height")(`text-line-height`.asInstanceOf[js.Any])
    if (`text-max-angle` != null) __obj.updateDynamic("text-max-angle")(`text-max-angle`.asInstanceOf[js.Any])
    if (`text-max-width` != null) __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    if (`text-offset` != null) __obj.updateDynamic("text-offset")(`text-offset`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-optional`)) __obj.updateDynamic("text-optional")(`text-optional`.asInstanceOf[js.Any])
    if (`text-padding` != null) __obj.updateDynamic("text-padding")(`text-padding`.asInstanceOf[js.Any])
    if (`text-pitch-alignment` != null) __obj.updateDynamic("text-pitch-alignment")(`text-pitch-alignment`.asInstanceOf[js.Any])
    if (`text-rotate` != null) __obj.updateDynamic("text-rotate")(`text-rotate`.asInstanceOf[js.Any])
    if (`text-rotation-alignment` != null) __obj.updateDynamic("text-rotation-alignment")(`text-rotation-alignment`.asInstanceOf[js.Any])
    if (`text-size` != null) __obj.updateDynamic("text-size")(`text-size`.asInstanceOf[js.Any])
    if (`text-transform` != null) __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolLayout]
  }
}

