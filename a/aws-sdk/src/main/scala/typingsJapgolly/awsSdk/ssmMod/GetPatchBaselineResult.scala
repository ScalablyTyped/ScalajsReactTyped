package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineResult extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  /**
    * A list of explicitly approved patches for the baseline.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * Returns the specified compliance severity level for approved patches in the patch baseline.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the retrieved patch baseline.
    */
  var BaselineId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The date the patch baseline was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the patch baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.native
  /**
    * A set of global filters used to exclude patches from the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.native
  /**
    * The date the patch baseline was last modified.
    */
  var ModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the patch baseline.
    */
  var Name: js.UndefOr[BaselineName] = js.native
  /**
    * Returns the operating system specified for the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.OperatingSystem] = js.native
  /**
    * Patch groups included in the patch baseline.
    */
  var PatchGroups: js.UndefOr[PatchGroupList] = js.native
  /**
    * A list of explicitly rejected patches for the baseline.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
}

object GetPatchBaselineResult {
  @scala.inline
  def apply(
    ApprovalRules: PatchRuleGroup = null,
    ApprovedPatches: PatchIdList = null,
    ApprovedPatchesComplianceLevel: PatchComplianceLevel = null,
    ApprovedPatchesEnableNonSecurity: js.UndefOr[scala.Boolean] = js.undefined,
    BaselineId: BaselineId = null,
    CreatedDate: js.Date = null,
    Description: BaselineDescription = null,
    GlobalFilters: PatchFilterGroup = null,
    ModifiedDate: js.Date = null,
    Name: BaselineName = null,
    OperatingSystem: OperatingSystem = null,
    PatchGroups: PatchGroupList = null,
    RejectedPatches: PatchIdList = null,
    RejectedPatchesAction: PatchAction = null,
    Sources: PatchSourceList = null
  ): GetPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (ApprovalRules != null) __obj.updateDynamic("ApprovalRules")(ApprovalRules.asInstanceOf[js.Any])
    if (ApprovedPatches != null) __obj.updateDynamic("ApprovedPatches")(ApprovedPatches.asInstanceOf[js.Any])
    if (ApprovedPatchesComplianceLevel != null) __obj.updateDynamic("ApprovedPatchesComplianceLevel")(ApprovedPatchesComplianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(ApprovedPatchesEnableNonSecurity)) __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(ApprovedPatchesEnableNonSecurity.asInstanceOf[js.Any])
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlobalFilters != null) __obj.updateDynamic("GlobalFilters")(GlobalFilters.asInstanceOf[js.Any])
    if (ModifiedDate != null) __obj.updateDynamic("ModifiedDate")(ModifiedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (PatchGroups != null) __obj.updateDynamic("PatchGroups")(PatchGroups.asInstanceOf[js.Any])
    if (RejectedPatches != null) __obj.updateDynamic("RejectedPatches")(RejectedPatches.asInstanceOf[js.Any])
    if (RejectedPatchesAction != null) __obj.updateDynamic("RejectedPatchesAction")(RejectedPatchesAction.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineResult]
  }
}

