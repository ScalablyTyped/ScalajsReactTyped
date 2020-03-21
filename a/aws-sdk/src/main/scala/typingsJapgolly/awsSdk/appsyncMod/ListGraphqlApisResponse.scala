package typingsJapgolly.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGraphqlApisResponse extends js.Object {
  /**
    * The GraphqlApi objects.
    */
  var graphqlApis: js.UndefOr[GraphqlApis] = js.native
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListGraphqlApisResponse {
  @scala.inline
  def apply(graphqlApis: GraphqlApis = null, nextToken: PaginationToken = null): ListGraphqlApisResponse = {
    val __obj = js.Dynamic.literal()
    if (graphqlApis != null) __obj.updateDynamic("graphqlApis")(graphqlApis.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGraphqlApisResponse]
  }
}

