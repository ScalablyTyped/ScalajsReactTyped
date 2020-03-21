package typingsJapgolly.oracleOraclejet.ojtreemapMod

import typingsJapgolly.oracleOraclejet.Anon26
import typingsJapgolly.oracleOraclejet.Anon27
import typingsJapgolly.oracleOraclejet.AnonGroupLabelDisplay
import typingsJapgolly.oracleOraclejet.AnonLabelDataVisualization
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bevels
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gaps
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceHorizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceVertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.squarified
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTreemapSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var animationUpdateColor: String
  var as: String
  var colorLabel: String
  var data: (DataProvider[K, D]) | Null
  var displayLevels: Double
  var drilling: on | off
  var groupGaps: all | none | outer
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverBehaviorDelay: Double
  var isolatedNode: js.Any
  var layout: sliceAndDiceHorizontal | sliceAndDiceVertical | squarified
  var nodeContent: Anon26[K, D]
  var nodeDefaults: AnonGroupLabelDisplay
  var nodeSeparators: bevels | gaps
  var rootNode: js.Any
  var selection: js.Array[_]
  var selectionMode: none | single | multiple
  var sizeLabel: String
  var sorting: on | off
  var tooltip: Anon27[K, D]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojTreemapSettableProperties: AnonLabelDataVisualization
}

object ojTreemapSettableProperties {
  @scala.inline
  def apply[K, D](
    animationDuration: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    animationUpdateColor: String,
    as: String,
    colorLabel: String,
    displayLevels: Double,
    drilling: on | off,
    groupGaps: all | none | outer,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    isolatedNode: js.Any,
    layout: sliceAndDiceHorizontal | sliceAndDiceVertical | squarified,
    nodeContent: Anon26[K, D],
    nodeDefaults: AnonGroupLabelDisplay,
    nodeSeparators: bevels | gaps,
    rootNode: js.Any,
    selection: js.Array[_],
    selectionMode: none | single | multiple,
    sizeLabel: String,
    sorting: on | off,
    tooltip: Anon27[K, D],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonLabelDataVisualization,
    data: DataProvider[K, D] = null
  ): ojTreemapSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], colorLabel = colorLabel.asInstanceOf[js.Any], displayLevels = displayLevels.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], groupGaps = groupGaps.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], isolatedNode = isolatedNode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodeContent = nodeContent.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodeSeparators = nodeSeparators.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTreemapSettableProperties[K, D]]
  }
}

