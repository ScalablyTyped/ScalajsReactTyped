package typingsJapgolly.protonNative.mod

import typingsJapgolly.protonNative.AnonH
import typingsJapgolly.protonNative.AnonX
import typingsJapgolly.protonNative.protonNativeStrings.bevel
import typingsJapgolly.protonNative.protonNativeStrings.flat
import typingsJapgolly.protonNative.protonNativeStrings.miter
import typingsJapgolly.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaBaseProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The fill color for the component.
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * The opacity of the fill (between 0 and 1). Gets multiplied with the fill colors alpha value.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The stroke (line) color for the component.
    */
  var stroke: js.UndefOr[String] = js.undefined
  var strokeLinecap: js.UndefOr[flat | round | bevel] = js.undefined
  var strokeLinejoin: js.UndefOr[miter | round | bevel] = js.undefined
  /**
    * How far to extend the stroke at a sharp corner when using `strokeLinejoin='miter'`
    * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-miterlimit
    * for a more detailed explanation.
    */
  var strokeMiterlimit: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the stroke (between 0 and 1). Gets multiplied with the stroke colors alpha value.
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * List of transformations to apply to the component (are quite similar to SVG transformations). Example for multiple transformations: `transform="translate(100, 100) rotate(90)"`.
    *
    * All x and y coordinates specified in a transformation are relative _to the component itself_, meaning that `translate(-50%, 0)` will translate the component by 50% of it's own width to left.
    */
  var transform: js.UndefOr[String] = js.undefined
}

object AreaBaseProps {
  @scala.inline
  def apply(
    align: AnonH = null,
    column: Int | Double = null,
    expand: AnonH = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    label: String = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeLinecap: flat | round | bevel = null,
    strokeLinejoin: miter | round | bevel = null,
    strokeMiterlimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    transform: String = null
  ): AreaBaseProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaBaseProps]
  }
}

