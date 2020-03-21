package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppResponse extends js.Object {
  /**
    * The app's Amazon Resource Name (ARN).
    */
  var AppArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.AppArn] = js.native
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.AppName] = js.native
  /**
    * The type of app.
    */
  var AppType: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.AppType] = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The timestamp of the last health check.
    */
  var LastHealthCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp of the last user's activity.
    */
  var LastUserActivityTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The instance type and quantity.
    */
  var ResourceSpec: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ResourceSpec] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.UserProfileName] = js.native
}

object DescribeAppResponse {
  @scala.inline
  def apply(
    AppArn: AppArn = null,
    AppName: AppName = null,
    AppType: AppType = null,
    CreationTime: js.Date = null,
    DomainId: DomainId = null,
    FailureReason: FailureReason = null,
    LastHealthCheckTimestamp: js.Date = null,
    LastUserActivityTimestamp: js.Date = null,
    ResourceSpec: ResourceSpec = null,
    Status: AppStatus = null,
    UserProfileName: UserProfileName = null
  ): DescribeAppResponse = {
    val __obj = js.Dynamic.literal()
    if (AppArn != null) __obj.updateDynamic("AppArn")(AppArn.asInstanceOf[js.Any])
    if (AppName != null) __obj.updateDynamic("AppName")(AppName.asInstanceOf[js.Any])
    if (AppType != null) __obj.updateDynamic("AppType")(AppType.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastHealthCheckTimestamp != null) __obj.updateDynamic("LastHealthCheckTimestamp")(LastHealthCheckTimestamp.asInstanceOf[js.Any])
    if (LastUserActivityTimestamp != null) __obj.updateDynamic("LastUserActivityTimestamp")(LastUserActivityTimestamp.asInstanceOf[js.Any])
    if (ResourceSpec != null) __obj.updateDynamic("ResourceSpec")(ResourceSpec.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserProfileName != null) __obj.updateDynamic("UserProfileName")(UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppResponse]
  }
}

