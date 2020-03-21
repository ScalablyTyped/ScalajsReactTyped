package typingsJapgolly.uiGrid.mod.treeBase

import typingsJapgolly.uiGrid.AnonAVG_
import typingsJapgolly.uiGrid.mod.ISharedTreeConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridTreeBaseConstants extends ISharedTreeConstants {
  var featureName: String
}

object IUiGridTreeBaseConstants {
  @scala.inline
  def apply(
    COLLAPSED: String,
    EXPANDED: String,
    aggregation: AnonAVG_,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridTreeBaseConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUiGridTreeBaseConstants]
  }
}

