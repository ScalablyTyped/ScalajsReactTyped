package typingsJapgolly.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageNormalizedUnits extends js.Object {
  /**
    * The percentage of your used instance normalized units that a reservation covers.
    */
  var CoverageNormalizedUnitsPercentage: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.CoverageNormalizedUnitsPercentage] = js.native
  /**
    * The number of normalized units that are covered by On-Demand Instances instead of a reservation.
    */
  var OnDemandNormalizedUnits: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.OnDemandNormalizedUnits] = js.native
  /**
    * The number of normalized units that a reservation covers.
    */
  var ReservedNormalizedUnits: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.ReservedNormalizedUnits] = js.native
  /**
    * The total number of normalized units that you used.
    */
  var TotalRunningNormalizedUnits: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.TotalRunningNormalizedUnits] = js.native
}

object CoverageNormalizedUnits {
  @scala.inline
  def apply(
    CoverageNormalizedUnitsPercentage: CoverageNormalizedUnitsPercentage = null,
    OnDemandNormalizedUnits: OnDemandNormalizedUnits = null,
    ReservedNormalizedUnits: ReservedNormalizedUnits = null,
    TotalRunningNormalizedUnits: TotalRunningNormalizedUnits = null
  ): CoverageNormalizedUnits = {
    val __obj = js.Dynamic.literal()
    if (CoverageNormalizedUnitsPercentage != null) __obj.updateDynamic("CoverageNormalizedUnitsPercentage")(CoverageNormalizedUnitsPercentage.asInstanceOf[js.Any])
    if (OnDemandNormalizedUnits != null) __obj.updateDynamic("OnDemandNormalizedUnits")(OnDemandNormalizedUnits.asInstanceOf[js.Any])
    if (ReservedNormalizedUnits != null) __obj.updateDynamic("ReservedNormalizedUnits")(ReservedNormalizedUnits.asInstanceOf[js.Any])
    if (TotalRunningNormalizedUnits != null) __obj.updateDynamic("TotalRunningNormalizedUnits")(TotalRunningNormalizedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageNormalizedUnits]
  }
}

