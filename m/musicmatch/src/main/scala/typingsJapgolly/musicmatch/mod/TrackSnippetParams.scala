package typingsJapgolly.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSnippetParams extends js.Object {
  var track_id: Double
}

object TrackSnippetParams {
  @scala.inline
  def apply(track_id: Double): TrackSnippetParams = {
    val __obj = js.Dynamic.literal(track_id = track_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackSnippetParams]
  }
}

