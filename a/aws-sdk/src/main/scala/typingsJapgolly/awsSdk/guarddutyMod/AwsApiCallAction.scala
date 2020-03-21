package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsApiCallAction extends js.Object {
  /**
    * AWS API name.
    */
  var Api: js.UndefOr[String] = js.native
  /**
    * AWS API caller type.
    */
  var CallerType: js.UndefOr[String] = js.native
  /**
    * Domain information for the AWS API call.
    */
  var DomainDetails: js.UndefOr[typingsJapgolly.awsSdk.guarddutyMod.DomainDetails] = js.native
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typingsJapgolly.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  /**
    * AWS service name whose API was invoked.
    */
  var ServiceName: js.UndefOr[String] = js.native
}

object AwsApiCallAction {
  @scala.inline
  def apply(
    Api: String = null,
    CallerType: String = null,
    DomainDetails: DomainDetails = null,
    RemoteIpDetails: RemoteIpDetails = null,
    ServiceName: String = null
  ): AwsApiCallAction = {
    val __obj = js.Dynamic.literal()
    if (Api != null) __obj.updateDynamic("Api")(Api.asInstanceOf[js.Any])
    if (CallerType != null) __obj.updateDynamic("CallerType")(CallerType.asInstanceOf[js.Any])
    if (DomainDetails != null) __obj.updateDynamic("DomainDetails")(DomainDetails.asInstanceOf[js.Any])
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsApiCallAction]
  }
}

