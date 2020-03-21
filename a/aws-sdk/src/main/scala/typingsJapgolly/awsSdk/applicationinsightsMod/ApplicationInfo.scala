package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInfo extends js.Object {
  /**
    * The lifecycle of the application. 
    */
  var LifeCycle: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.LifeCycle] = js.native
  /**
    *  Indicates whether Application Insights will create opsItems for any problem detected by Application Insights for an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.OpsCenterEnabled] = js.native
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItems to receive SNS notifications for opsItem updates. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.OpsItemSNSTopicArn] = js.native
  /**
    * The issues on the user side that block Application Insights from successfully monitoring an application. Example remarks include:   “Configuring application, detected 1 Errors, 3 Warnings”   “Configuring application, detected 1 Unconfigured Components”  
    */
  var Remarks: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.Remarks] = js.native
  /**
    * The name of the resource group used for the application.
    */
  var ResourceGroupName: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object ApplicationInfo {
  @scala.inline
  def apply(
    LifeCycle: LifeCycle = null,
    OpsCenterEnabled: js.UndefOr[Boolean] = js.undefined,
    OpsItemSNSTopicArn: OpsItemSNSTopicArn = null,
    Remarks: Remarks = null,
    ResourceGroupName: ResourceGroupName = null
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    if (LifeCycle != null) __obj.updateDynamic("LifeCycle")(LifeCycle.asInstanceOf[js.Any])
    if (!js.isUndefined(OpsCenterEnabled)) __obj.updateDynamic("OpsCenterEnabled")(OpsCenterEnabled.asInstanceOf[js.Any])
    if (OpsItemSNSTopicArn != null) __obj.updateDynamic("OpsItemSNSTopicArn")(OpsItemSNSTopicArn.asInstanceOf[js.Any])
    if (Remarks != null) __obj.updateDynamic("Remarks")(Remarks.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
}

