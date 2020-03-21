package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTagResponse extends js.Object {
  var message: String
  var node_id: String
  var `object`: GitGetTagResponseObject
  var sha: String
  var tag: String
  var tagger: GitGetTagResponseTagger
  var url: String
  var verification: GitGetTagResponseVerification
}

object GitGetTagResponse {
  @scala.inline
  def apply(
    message: String,
    node_id: String,
    `object`: GitGetTagResponseObject,
    sha: String,
    tag: String,
    tagger: GitGetTagResponseTagger,
    url: String,
    verification: GitGetTagResponseVerification
  ): GitGetTagResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTagResponse]
  }
}

