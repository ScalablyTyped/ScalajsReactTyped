package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenArray extends js.Object {
  var childrenArray: js.Array[Element]
  var columnIdToIndex: StringDictionary[Double]
  var columnWidths: js.Array[Double]
  var focusedCell: IFocusedCellCoordinates
  var numFrozenColumnsClamped: Double
  var numFrozenRowsClamped: Double
  var rowHeights: js.Array[Double]
  var selectedRegions: js.Array[IRegion]
}

object AnonChildrenArray {
  @scala.inline
  def apply(
    childrenArray: js.Array[Element],
    columnIdToIndex: StringDictionary[Double],
    columnWidths: js.Array[Double],
    focusedCell: IFocusedCellCoordinates,
    numFrozenColumnsClamped: Double,
    numFrozenRowsClamped: Double,
    rowHeights: js.Array[Double],
    selectedRegions: js.Array[IRegion]
  ): AnonChildrenArray = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], focusedCell = focusedCell.asInstanceOf[js.Any], numFrozenColumnsClamped = numFrozenColumnsClamped.asInstanceOf[js.Any], numFrozenRowsClamped = numFrozenRowsClamped.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildrenArray]
  }
}

