package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhoneNumberSettingsRequest extends js.Object {
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: typingsJapgolly.awsSdk.chimeMod.CallingName = js.native
}

object UpdatePhoneNumberSettingsRequest {
  @scala.inline
  def apply(CallingName: CallingName): UpdatePhoneNumberSettingsRequest = {
    val __obj = js.Dynamic.literal(CallingName = CallingName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePhoneNumberSettingsRequest]
  }
}

