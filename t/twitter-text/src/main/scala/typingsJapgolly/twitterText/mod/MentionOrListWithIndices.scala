package typingsJapgolly.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionOrListWithIndices extends EntityWithIndices {
  var indices: js.Tuple2[Double, Double]
  var listSlug: String
  var screenName: String
}

object MentionOrListWithIndices {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], listSlug: String, screenName: String): MentionOrListWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], listSlug = listSlug.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MentionOrListWithIndices]
  }
}

