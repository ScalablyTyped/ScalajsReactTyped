package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingStatistics extends js.Object {
  /**
    * Represents a map of severity to count statistic for a set of findings
    */
  var CountBySeverity: js.UndefOr[typingsJapgolly.awsSdk.guarddutyMod.CountBySeverity] = js.native
}

object FindingStatistics {
  @scala.inline
  def apply(CountBySeverity: CountBySeverity = null): FindingStatistics = {
    val __obj = js.Dynamic.literal()
    if (CountBySeverity != null) __obj.updateDynamic("CountBySeverity")(CountBySeverity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingStatistics]
  }
}

