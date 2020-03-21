package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPopulationRule extends js.Object {
  /** Floodlight activity ID associated with this rule. This field can be left blank. */
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  /** Name of floodlight activity associated with this rule. This is a read-only, auto-generated field. */
  var floodlightActivityName: js.UndefOr[String] = js.undefined
  /**
    * Clauses that make up this list population rule. Clauses are joined by ANDs, and the clauses themselves are made up of list population terms which are
    * joined by ORs.
    */
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

