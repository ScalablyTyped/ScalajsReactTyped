package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerBucketTaskBoardTaskFormat extends Entity {
  // Hint used to order tasks in the Bucket view of the Task Board. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.undefined
}

object PlannerBucketTaskBoardTaskFormat {
  @scala.inline
  def apply(id: String = null, orderHint: String = null): PlannerBucketTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerBucketTaskBoardTaskFormat]
  }
}

