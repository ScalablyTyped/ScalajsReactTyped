package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFacetAttributesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The name of the facet whose attributes will be retrieved.
    */
  var Name: FacetName = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The ARN of the schema where the facet resides.
    */
  var SchemaArn: Arn = js.native
}

object ListFacetAttributesRequest {
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListFacetAttributesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFacetAttributesRequest]
  }
}

