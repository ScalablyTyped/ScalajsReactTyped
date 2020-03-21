package typingsJapgolly.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryViewData extends PlanViewData {
  /**
    * Work item child id to parenet id map
    */
  var childIdToParentIdMap: NumberDictionary[Double]
  /**
    * Filter criteria status of the timeline
    */
  var criteriaStatus: TimelineCriteriaStatus
  /**
    * The end date of the delivery view data
    */
  var endDate: js.Date
  /**
    * The start date for the delivery view data
    */
  var startDate: js.Date
  /**
    * All the team data
    */
  var teams: js.Array[TimelineTeamData]
}

object DeliveryViewData {
  @scala.inline
  def apply(
    childIdToParentIdMap: NumberDictionary[Double],
    criteriaStatus: TimelineCriteriaStatus,
    endDate: js.Date,
    id: String,
    revision: Double,
    startDate: js.Date,
    teams: js.Array[TimelineTeamData]
  ): DeliveryViewData = {
    val __obj = js.Dynamic.literal(childIdToParentIdMap = childIdToParentIdMap.asInstanceOf[js.Any], criteriaStatus = criteriaStatus.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeliveryViewData]
  }
}

