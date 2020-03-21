package typingsJapgolly.instagramPrivateApi.tagRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagRepositorySearchResponseRootObject extends js.Object {
  var has_more: Boolean
  var rank_token: String
  var results: js.Array[TagRepositorySearchResponseResultsItem]
  var status: String
}

object TagRepositorySearchResponseRootObject {
  @scala.inline
  def apply(
    has_more: Boolean,
    rank_token: String,
    results: js.Array[TagRepositorySearchResponseResultsItem],
    status: String
  ): TagRepositorySearchResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagRepositorySearchResponseRootObject]
  }
}

