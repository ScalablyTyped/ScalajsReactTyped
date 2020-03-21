package typingsJapgolly.vsoNodeApi.workInterfacesMod

import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogColumn extends js.Object {
  var columnFieldReference: WorkItemFieldReference
  var width: Double
}

object BacklogColumn {
  @scala.inline
  def apply(columnFieldReference: WorkItemFieldReference, width: Double): BacklogColumn = {
    val __obj = js.Dynamic.literal(columnFieldReference = columnFieldReference.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BacklogColumn]
  }
}

