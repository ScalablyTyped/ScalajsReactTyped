package typingsJapgolly.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForDomainResponse extends js.Object {
  /**
    * A list of the tags that are associated with the specified domain.
    */
  var TagList: typingsJapgolly.awsSdk.route53domainsMod.TagList = js.native
}

object ListTagsForDomainResponse {
  @scala.inline
  def apply(TagList: TagList): ListTagsForDomainResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForDomainResponse]
  }
}

