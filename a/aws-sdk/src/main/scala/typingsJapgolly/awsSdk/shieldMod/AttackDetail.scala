package typingsJapgolly.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackDetail extends js.Object {
  /**
    * List of counters that describe the attack for the specified time period.
    */
  var AttackCounters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[typingsJapgolly.awsSdk.shieldMod.AttackId] = js.native
  /**
    * The array of AttackProperty objects.
    */
  var AttackProperties: js.UndefOr[typingsJapgolly.awsSdk.shieldMod.AttackProperties] = js.native
  /**
    * The time the attack ended, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * List of mitigation actions taken for the attack.
    */
  var Mitigations: js.UndefOr[MitigationList] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[typingsJapgolly.awsSdk.shieldMod.ResourceArn] = js.native
  /**
    * The time the attack started, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
    */
  var SubResources: js.UndefOr[SubResourceSummaryList] = js.native
}

object AttackDetail {
  @scala.inline
  def apply(
    AttackCounters: SummarizedCounterList = null,
    AttackId: AttackId = null,
    AttackProperties: AttackProperties = null,
    EndTime: js.Date = null,
    Mitigations: MitigationList = null,
    ResourceArn: ResourceArn = null,
    StartTime: js.Date = null,
    SubResources: SubResourceSummaryList = null
  ): AttackDetail = {
    val __obj = js.Dynamic.literal()
    if (AttackCounters != null) __obj.updateDynamic("AttackCounters")(AttackCounters.asInstanceOf[js.Any])
    if (AttackId != null) __obj.updateDynamic("AttackId")(AttackId.asInstanceOf[js.Any])
    if (AttackProperties != null) __obj.updateDynamic("AttackProperties")(AttackProperties.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Mitigations != null) __obj.updateDynamic("Mitigations")(Mitigations.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (SubResources != null) __obj.updateDynamic("SubResources")(SubResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackDetail]
  }
}

