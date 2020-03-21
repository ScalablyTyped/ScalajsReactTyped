package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLogPatternResponse extends js.Object {
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.LogPattern] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object UpdateLogPatternResponse {
  @scala.inline
  def apply(LogPattern: LogPattern = null, ResourceGroupName: ResourceGroupName = null): UpdateLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    if (LogPattern != null) __obj.updateDynamic("LogPattern")(LogPattern.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLogPatternResponse]
  }
}

