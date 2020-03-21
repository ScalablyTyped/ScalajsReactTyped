package typingsJapgolly.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListXssMatchSetsRequest extends js.Object {
  /**
    * Specifies the number of XssMatchSet objects that you want AWS WAF to return for this request. If you have more XssMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * If you specify a value for Limit and you have more XssMatchSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of XssMatchSets. For the second and subsequent ListXssMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of XssMatchSets.
    */
  var NextMarker: js.UndefOr[typingsJapgolly.awsSdk.wafMod.NextMarker] = js.native
}

object ListXssMatchSetsRequest {
  @scala.inline
  def apply(Limit: Int | Double = null, NextMarker: NextMarker = null): ListXssMatchSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListXssMatchSetsRequest]
  }
}

