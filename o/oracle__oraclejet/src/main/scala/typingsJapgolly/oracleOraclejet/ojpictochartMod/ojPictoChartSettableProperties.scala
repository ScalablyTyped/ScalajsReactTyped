package typingsJapgolly.oracleOraclejet.ojpictochartMod

import typingsJapgolly.oracleOraclejet.Anon14
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottomEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottomStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.popIn
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.topEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.topStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPictoChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | popIn | alphaFade | zoom | none
  var as: String
  var columnCount: Double | Null
  var columnWidth: Double | Null
  var data: (DataProvider[K, D]) | Null
  var drilling: on | off
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverBehaviorDelay: Double
  var layout: vertical | horizontal
  var layoutOrigin: topEnd | bottomStart | bottomEnd | topStart
  var rowCount: Double | Null
  var rowHeight: Double | Null
  var selection: js.Array[K]
  var selectionMode: single | multiple | none
  var tooltip: Anon14[K]
  @JSName("translations")
  var translations_ojPictoChartSettableProperties: AnonLabelAndValue
}

object ojPictoChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | popIn | alphaFade | zoom | none,
    as: String,
    drilling: on | off,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    layout: vertical | horizontal,
    layoutOrigin: topEnd | bottomStart | bottomEnd | topStart,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    tooltip: Anon14[K],
    trackResize: on | off,
    translations: AnonLabelAndValue,
    animationDuration: Int | Double = null,
    columnCount: Int | Double = null,
    columnWidth: Int | Double = null,
    data: DataProvider[K, D] = null,
    rowCount: Int | Double = null,
    rowHeight: Int | Double = null
  ): ojPictoChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], layoutOrigin = layoutOrigin.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartSettableProperties[K, D]]
  }
}

