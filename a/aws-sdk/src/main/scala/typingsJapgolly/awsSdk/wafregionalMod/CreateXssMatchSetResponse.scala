package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateXssMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.ChangeToken] = js.native
  /**
    * An XssMatchSet.
    */
  var XssMatchSet: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.XssMatchSet] = js.native
}

object CreateXssMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, XssMatchSet: XssMatchSet = null): CreateXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (XssMatchSet != null) __obj.updateDynamic("XssMatchSet")(XssMatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateXssMatchSetResponse]
  }
}

