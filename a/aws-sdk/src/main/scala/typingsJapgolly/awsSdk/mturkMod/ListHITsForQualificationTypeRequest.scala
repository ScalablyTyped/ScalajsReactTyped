package typingsJapgolly.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHITsForQualificationTypeRequest extends js.Object {
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The ID of the Qualification type to use when querying HITs. 
    */
  var QualificationTypeId: EntityId = js.native
}

object ListHITsForQualificationTypeRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId, MaxResults: Int | Double = null, NextToken: PaginationToken = null): ListHITsForQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHITsForQualificationTypeRequest]
  }
}

