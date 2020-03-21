package typingsJapgolly.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSamplingRuleResult extends js.Object {
  /**
    * The updated rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}

object UpdateSamplingRuleResult {
  @scala.inline
  def apply(SamplingRuleRecord: SamplingRuleRecord = null): UpdateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSamplingRuleResult]
  }
}

