package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remediation extends js.Object {
  /**
    * A recommendation on the steps to take to remediate the issue identified by a finding.
    */
  var Recommendation: js.UndefOr[typingsJapgolly.awsSdk.securityhubMod.Recommendation] = js.native
}

object Remediation {
  @scala.inline
  def apply(Recommendation: Recommendation = null): Remediation = {
    val __obj = js.Dynamic.literal()
    if (Recommendation != null) __obj.updateDynamic("Recommendation")(Recommendation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remediation]
  }
}

