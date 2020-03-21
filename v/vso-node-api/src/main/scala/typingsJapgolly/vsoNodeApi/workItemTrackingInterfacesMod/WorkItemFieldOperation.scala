package typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemFieldOperation extends js.Object {
  /**
    * Name of the operation.
    */
  var name: String
  /**
    * Reference name of the operation.
    */
  var referenceName: String
}

object WorkItemFieldOperation {
  @scala.inline
  def apply(name: String, referenceName: String): WorkItemFieldOperation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemFieldOperation]
  }
}

