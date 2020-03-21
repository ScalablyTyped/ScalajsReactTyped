package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociatePhoneNumbersFromVoiceConnectorResponse extends js.Object {
  /**
    * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.native
}

object DisassociatePhoneNumbersFromVoiceConnectorResponse {
  @scala.inline
  def apply(PhoneNumberErrors: PhoneNumberErrorList = null): DisassociatePhoneNumbersFromVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumberErrors != null) __obj.updateDynamic("PhoneNumberErrors")(PhoneNumberErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorResponse]
  }
}

