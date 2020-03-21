package typingsJapgolly.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.nodeOsUtils.driveMod.DriveUsedInfo because var conflicts: totalGb. Inlined usedGb, usedPercentage */ trait DriveInfo extends DriveFreeInfo {
  var usedGb: Double
  var usedPercentage: Double
}

object DriveInfo {
  @scala.inline
  def apply(freeGb: Double, freePercentage: Double, totalGb: Double, usedGb: Double, usedPercentage: Double): DriveInfo = {
    val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DriveInfo]
  }
}

