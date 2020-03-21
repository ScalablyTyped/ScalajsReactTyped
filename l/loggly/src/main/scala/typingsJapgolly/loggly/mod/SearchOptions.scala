package typingsJapgolly.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.loggly.mod.SearchOptionsWithQ
  - typingsJapgolly.loggly.mod.SearchOptionsWithQuery
*/
trait SearchOptions extends js.Object

object SearchOptions {
  @scala.inline
  def SearchOptionsWithQ(
    q: String,
    from: String = null,
    rows: Int | Double = null,
    size: Int | Double = null,
    until: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  def SearchOptionsWithQuery(
    query: String,
    from: String = null,
    rows: Int | Double = null,
    size: Int | Double = null,
    until: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

