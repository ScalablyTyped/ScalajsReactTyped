package typingsJapgolly.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * The maximum number of tag results returned by ListTagsForResource in
    paginated output. When this parameter is used, ListTagsForResource returns
    only limit results in a single page along with a nextToken
    response element. You can see the remaining results of the initial request by sending
    another ListTagsForResource request with the returned nextToken
    value. This value can be between 1 and 100. If you don't use
    this parameter, ListTagsForResource returns up to 100
    results and a nextToken value if applicable.
    */
  var limit: js.UndefOr[TagsLimit] = js.native
  /**
    * The nextToken value returned from a previous paginated
    ListTagsForResource request where limit was used and the
    results exceeded the value of that parameter. Pagination continues from the end of the
    previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
    */
  var resourceArn: Arn = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, limit: Int | Double = null, nextToken: String = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

