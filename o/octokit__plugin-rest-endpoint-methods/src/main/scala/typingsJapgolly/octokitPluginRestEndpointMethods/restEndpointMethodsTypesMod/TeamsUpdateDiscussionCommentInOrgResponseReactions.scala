package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionCommentInOrgResponseReactions extends js.Object {
  var `-1`: Double
  @JSName("+1")
  var Plussign1: Double
  var confused: Double
  var heart: Double
  var hooray: Double
  var laugh: Double
  var total_count: Double
  var url: String
}

object TeamsUpdateDiscussionCommentInOrgResponseReactions {
  @scala.inline
  def apply(
    `-1`: Double,
    Plussign1: Double,
    confused: Double,
    heart: Double,
    hooray: Double,
    laugh: Double,
    total_count: Double,
    url: String
  ): TeamsUpdateDiscussionCommentInOrgResponseReactions = {
    val __obj = js.Dynamic.literal(confused = confused.asInstanceOf[js.Any], heart = heart.asInstanceOf[js.Any], hooray = hooray.asInstanceOf[js.Any], laugh = laugh.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("-1")(`-1`.asInstanceOf[js.Any])
    __obj.updateDynamic("+1")(Plussign1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentInOrgResponseReactions]
  }
}

