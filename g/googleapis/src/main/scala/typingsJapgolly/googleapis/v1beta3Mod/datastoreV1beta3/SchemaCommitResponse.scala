package typingsJapgolly.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.Commit.
  */
@js.native
trait SchemaCommitResponse extends js.Object {
  /**
    * The number of index entries updated during the commit, or zero if none
    * were updated.
    */
  var indexUpdates: js.UndefOr[Double] = js.native
  /**
    * The result of performing the mutations. The i-th mutation result
    * corresponds to the i-th mutation in the request.
    */
  var mutationResults: js.UndefOr[js.Array[SchemaMutationResult]] = js.native
}

object SchemaCommitResponse {
  @scala.inline
  def apply(indexUpdates: Int | Double = null, mutationResults: js.Array[SchemaMutationResult] = null): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    if (indexUpdates != null) __obj.updateDynamic("indexUpdates")(indexUpdates.asInstanceOf[js.Any])
    if (mutationResults != null) __obj.updateDynamic("mutationResults")(mutationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommitResponse]
  }
}

