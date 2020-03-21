package typingsJapgolly.oracleOraclejet.ojformlayoutMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.column
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.row
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.truncate
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojformlayout.ojFormLayoutSettableProperties> */
trait ojFormLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var direction: js.UndefOr[column | row] = js.undefined
  var labelEdge: js.UndefOr[start | top] = js.undefined
  var labelWidth: js.UndefOr[String] = js.undefined
  var labelWrapping: js.UndefOr[truncate | wrap] = js.undefined
  var maxColumns: js.UndefOr[Double] = js.undefined
}

object ojFormLayoutSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    direction: column | row = null,
    labelEdge: start | top = null,
    labelWidth: String = null,
    labelWrapping: truncate | wrap = null,
    maxColumns: Int | Double = null
  ): ojFormLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (labelEdge != null) __obj.updateDynamic("labelEdge")(labelEdge.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (labelWrapping != null) __obj.updateDynamic("labelWrapping")(labelWrapping.asInstanceOf[js.Any])
    if (maxColumns != null) __obj.updateDynamic("maxColumns")(maxColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFormLayoutSettablePropertiesLenient]
  }
}

