package typingsJapgolly.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitItemRequestData extends js.Object {
  /**
    * Whether to include metadata for all items
    */
  var includeContentMetadata: Boolean
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  /**
    * Collection of items to fetch, including path, version, and recursion level
    */
  var itemDescriptors: js.Array[GitItemDescriptor]
  /**
    * Whether to include shallow ref to commit that last changed each item
    */
  var latestProcessedChange: Boolean
}

object GitItemRequestData {
  @scala.inline
  def apply(
    includeContentMetadata: Boolean,
    includeLinks: Boolean,
    itemDescriptors: js.Array[GitItemDescriptor],
    latestProcessedChange: Boolean
  ): GitItemRequestData = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], itemDescriptors = itemDescriptors.asInstanceOf[js.Any], latestProcessedChange = latestProcessedChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitItemRequestData]
  }
}

