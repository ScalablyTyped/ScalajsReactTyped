package typingsJapgolly.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var ref: String
  var score: Double
}

object SearchResults {
  @scala.inline
  def apply(ref: String, score: Double): SearchResults = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResults]
  }
}

