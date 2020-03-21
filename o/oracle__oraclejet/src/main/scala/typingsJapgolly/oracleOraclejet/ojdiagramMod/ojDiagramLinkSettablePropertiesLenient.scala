package typingsJapgolly.oracleOraclejet.ojdiagramMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLinkSettableProperties> */
trait ojDiagramLinkSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var endConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.undefined
  var endNode: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var selectable: js.UndefOr[auto | off] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var startConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.undefined
  var startNode: js.UndefOr[js.Any] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ojDiagramLinkSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    categories: js.Array[String] = null,
    color: String = null,
    endConnectorType: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded = null,
    endNode: js.Any = null,
    label: String = null,
    labelStyle: js.Object = null,
    selectable: auto | off = null,
    shortDesc: String = null,
    startConnectorType: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded = null,
    startNode: js.Any = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    width: Int | Double = null
  ): ojDiagramLinkSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endConnectorType != null) __obj.updateDynamic("endConnectorType")(endConnectorType.asInstanceOf[js.Any])
    if (endNode != null) __obj.updateDynamic("endNode")(endNode.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (startConnectorType != null) __obj.updateDynamic("startConnectorType")(startConnectorType.asInstanceOf[js.Any])
    if (startNode != null) __obj.updateDynamic("startNode")(startNode.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramLinkSettablePropertiesLenient]
  }
}

