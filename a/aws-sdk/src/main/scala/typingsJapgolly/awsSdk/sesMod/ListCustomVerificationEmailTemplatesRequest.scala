package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCustomVerificationEmailTemplatesRequest extends js.Object {
  /**
    * The maximum number of custom verification email templates to return. This value must be at least 1 and less than or equal to 50. If you do not specify a value, or if you specify a value less than 1 or greater than 50, the operation will return up to 50 results.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.sesMod.MaxResults] = js.native
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sesMod.NextToken] = js.native
}

object ListCustomVerificationEmailTemplatesRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): ListCustomVerificationEmailTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesRequest]
  }
}

