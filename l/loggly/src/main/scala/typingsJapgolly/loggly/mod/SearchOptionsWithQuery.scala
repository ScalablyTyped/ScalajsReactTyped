package typingsJapgolly.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptionsWithQuery
  extends SharedSearchOptions
     with SearchOptions {
  var query: String
}

object SearchOptionsWithQuery {
  @scala.inline
  def apply(
    query: String,
    from: String = null,
    rows: Int | Double = null,
    size: Int | Double = null,
    until: String = null
  ): SearchOptionsWithQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsWithQuery]
  }
}

