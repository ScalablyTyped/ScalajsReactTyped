package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  /**
    * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
    */
  var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.native
  /**
    * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.  
    */
  var ProjectionType: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ProjectionType] = js.native
}

object Projection {
  @scala.inline
  def apply(NonKeyAttributes: NonKeyAttributeNameList = null, ProjectionType: ProjectionType = null): Projection = {
    val __obj = js.Dynamic.literal()
    if (NonKeyAttributes != null) __obj.updateDynamic("NonKeyAttributes")(NonKeyAttributes.asInstanceOf[js.Any])
    if (ProjectionType != null) __obj.updateDynamic("ProjectionType")(ProjectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

