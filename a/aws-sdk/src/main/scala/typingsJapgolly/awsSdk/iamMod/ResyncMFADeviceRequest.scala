package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResyncMFADeviceRequest extends js.Object {
  /**
    * An authentication code emitted by the device. The format for this parameter is a sequence of six digits.
    */
  var AuthenticationCode1: authenticationCodeType = js.native
  /**
    * A subsequent authentication code emitted by the device. The format for this parameter is a sequence of six digits.
    */
  var AuthenticationCode2: authenticationCodeType = js.native
  /**
    * Serial number that uniquely identifies the MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var SerialNumber: serialNumberType = js.native
  /**
    * The name of the user whose MFA device you want to resynchronize. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType = js.native
}

object ResyncMFADeviceRequest {
  @scala.inline
  def apply(
    AuthenticationCode1: authenticationCodeType,
    AuthenticationCode2: authenticationCodeType,
    SerialNumber: serialNumberType,
    UserName: existingUserNameType
  ): ResyncMFADeviceRequest = {
    val __obj = js.Dynamic.literal(AuthenticationCode1 = AuthenticationCode1.asInstanceOf[js.Any], AuthenticationCode2 = AuthenticationCode2.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResyncMFADeviceRequest]
  }
}

