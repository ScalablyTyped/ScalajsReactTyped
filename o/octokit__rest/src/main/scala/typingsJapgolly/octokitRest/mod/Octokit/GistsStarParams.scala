package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsStarParams extends js.Object {
  var gist_id: String
}

object GistsStarParams {
  @scala.inline
  def apply(gist_id: String): GistsStarParams = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsStarParams]
  }
}

