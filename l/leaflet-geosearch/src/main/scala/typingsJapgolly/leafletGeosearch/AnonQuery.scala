package typingsJapgolly.leafletGeosearch

import typingsJapgolly.leafletGeosearch.mod.SearchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var query: String
  var result: SearchResult[js.Object]
}

object AnonQuery {
  @scala.inline
  def apply(query: String, result: SearchResult[js.Object]): AnonQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuery]
  }
}

