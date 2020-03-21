package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForTagOptionInput extends js.Object {
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * The resource type.    Portfolio     Product   
    */
  var ResourceType: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.ResourceType] = js.native
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typingsJapgolly.awsSdk.servicecatalogMod.TagOptionId = js.native
}

object ListResourcesForTagOptionInput {
  @scala.inline
  def apply(
    TagOptionId: TagOptionId,
    PageSize: Int | Double = null,
    PageToken: PageToken = null,
    ResourceType: ResourceType = null
  ): ListResourcesForTagOptionInput = {
    val __obj = js.Dynamic.literal(TagOptionId = TagOptionId.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForTagOptionInput]
  }
}

