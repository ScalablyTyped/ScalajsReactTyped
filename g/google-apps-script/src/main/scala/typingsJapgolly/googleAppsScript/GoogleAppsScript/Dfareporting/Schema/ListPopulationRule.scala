package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPopulationRule extends js.Object {
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  var floodlightActivityName: js.UndefOr[String] = js.undefined
  var listPopulationClauses: js.UndefOr[js.Array[ListPopulationClause]] = js.undefined
}

object ListPopulationRule {
  @scala.inline
  def apply(
    floodlightActivityId: String = null,
    floodlightActivityName: String = null,
    listPopulationClauses: js.Array[ListPopulationClause] = null
  ): ListPopulationRule = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (floodlightActivityName != null) __obj.updateDynamic("floodlightActivityName")(floodlightActivityName.asInstanceOf[js.Any])
    if (listPopulationClauses != null) __obj.updateDynamic("listPopulationClauses")(listPopulationClauses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPopulationRule]
  }
}

