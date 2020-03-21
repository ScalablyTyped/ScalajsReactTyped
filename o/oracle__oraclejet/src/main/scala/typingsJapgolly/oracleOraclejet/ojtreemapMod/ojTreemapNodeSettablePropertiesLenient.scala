package typingsJapgolly.oracleOraclejet.ojtreemapMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonIsolate
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.header
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.node
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemapNodeSettableProperties> */
trait ojTreemapNodeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var groupLabelDisplay: js.UndefOr[node | off | header] = js.undefined
  var header: js.UndefOr[AnonIsolate] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelDisplay: js.UndefOr[off | node] = js.undefined
  var labelHalign: js.UndefOr[start | end | center] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var labelValign: js.UndefOr[top | bottom | center] = js.undefined
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.undefined
  var selectable: js.UndefOr[off | auto] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ojTreemapNodeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    categories: js.Array[String] = null,
    color: String = null,
    drilling: on | off | inherit = null,
    groupLabelDisplay: node | off | header = null,
    header: AnonIsolate = null,
    label: String = null,
    labelDisplay: off | node = null,
    labelHalign: start | end | center = null,
    labelStyle: js.Object = null,
    labelValign: top | bottom | center = null,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none = null,
    selectable: off | auto = null,
    shortDesc: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    value: Int | Double = null
  ): ojTreemapNodeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (groupLabelDisplay != null) __obj.updateDynamic("groupLabelDisplay")(groupLabelDisplay.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelDisplay != null) __obj.updateDynamic("labelDisplay")(labelDisplay.asInstanceOf[js.Any])
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (labelValign != null) __obj.updateDynamic("labelValign")(labelValign.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTreemapNodeSettablePropertiesLenient]
  }
}

