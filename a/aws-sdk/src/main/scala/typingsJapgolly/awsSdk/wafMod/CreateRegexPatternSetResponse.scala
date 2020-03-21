package typingsJapgolly.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexPatternSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.wafMod.ChangeToken] = js.native
  /**
    * A RegexPatternSet that contains no objects.
    */
  var RegexPatternSet: js.UndefOr[typingsJapgolly.awsSdk.wafMod.RegexPatternSet] = js.native
}

object CreateRegexPatternSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, RegexPatternSet: RegexPatternSet = null): CreateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (RegexPatternSet != null) __obj.updateDynamic("RegexPatternSet")(RegexPatternSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegexPatternSetResponse]
  }
}

