package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListAttachedIndices extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * A reference to the object that has indices attached.
    */
  var TargetReference: ObjectReference = js.native
}

object BatchListAttachedIndices {
  @scala.inline
  def apply(TargetReference: ObjectReference, MaxResults: Int | Double = null, NextToken: NextToken = null): BatchListAttachedIndices = {
    val __obj = js.Dynamic.literal(TargetReference = TargetReference.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListAttachedIndices]
  }
}

