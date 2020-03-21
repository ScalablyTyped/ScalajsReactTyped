package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.connectMod.InstanceId = js.native
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.native
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.connectMod.NextToken] = js.native
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCodes: js.UndefOr[typingsJapgolly.awsSdk.connectMod.PhoneNumberCountryCodes] = js.native
  /**
    * The type of phone number.
    */
  var PhoneNumberTypes: js.UndefOr[typingsJapgolly.awsSdk.connectMod.PhoneNumberTypes] = js.native
}

object ListPhoneNumbersRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    PhoneNumberCountryCodes: PhoneNumberCountryCodes = null,
    PhoneNumberTypes: PhoneNumberTypes = null
  ): ListPhoneNumbersRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PhoneNumberCountryCodes != null) __obj.updateDynamic("PhoneNumberCountryCodes")(PhoneNumberCountryCodes.asInstanceOf[js.Any])
    if (PhoneNumberTypes != null) __obj.updateDynamic("PhoneNumberTypes")(PhoneNumberTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersRequest]
  }
}

