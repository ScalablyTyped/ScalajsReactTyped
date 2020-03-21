package typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemRelationUpdates extends js.Object {
  /**
    * List of newly added relations.
    */
  var added: js.Array[WorkItemRelation]
  /**
    * List of removed relations.
    */
  var removed: js.Array[WorkItemRelation]
  /**
    * List of updated relations.
    */
  var updated: js.Array[WorkItemRelation]
}

object WorkItemRelationUpdates {
  @scala.inline
  def apply(
    added: js.Array[WorkItemRelation],
    removed: js.Array[WorkItemRelation],
    updated: js.Array[WorkItemRelation]
  ): WorkItemRelationUpdates = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemRelationUpdates]
  }
}

