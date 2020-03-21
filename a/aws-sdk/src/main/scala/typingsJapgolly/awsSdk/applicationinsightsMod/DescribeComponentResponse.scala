package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentResponse extends js.Object {
  var ApplicationComponent: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ApplicationComponent] = js.native
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ResourceList] = js.native
}

object DescribeComponentResponse {
  @scala.inline
  def apply(ApplicationComponent: ApplicationComponent = null, ResourceList: ResourceList = null): DescribeComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationComponent != null) __obj.updateDynamic("ApplicationComponent")(ApplicationComponent.asInstanceOf[js.Any])
    if (ResourceList != null) __obj.updateDynamic("ResourceList")(ResourceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentResponse]
  }
}

