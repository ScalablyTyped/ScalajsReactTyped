package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerGroup extends Entity {
  // Read-only. Nullable. Returns the plannerPlans owned by the group.
  var plans: js.UndefOr[js.Array[PlannerPlan]] = js.undefined
}

object PlannerGroup {
  @scala.inline
  def apply(id: String = null, plans: js.Array[PlannerPlan] = null): PlannerGroup = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (plans != null) __obj.updateDynamic("plans")(plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerGroup]
  }
}

