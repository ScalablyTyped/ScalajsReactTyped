package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteHitsProvided[THit] extends js.Object {
  /** indicates if there are more pages to load */
  var hasMore: Boolean
  var hasPrevious: Boolean
  /** the records that matched the search */
  var hits: js.Array[THit]
  def refineNext(args: js.Any*): js.Any
  def refinePrevious(args: js.Any*): js.Any
}

object InfiniteHitsProvided {
  @scala.inline
  def apply[THit](
    hasMore: Boolean,
    hasPrevious: Boolean,
    hits: js.Array[THit],
    refineNext: /* repeated */ js.Any => CallbackTo[js.Any],
    refinePrevious: /* repeated */ js.Any => CallbackTo[js.Any]
  ): InfiniteHitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any])
    __obj.updateDynamic("refineNext")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => refineNext(t0).runNow()))
    __obj.updateDynamic("refinePrevious")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => refinePrevious(t0).runNow()))
    __obj.asInstanceOf[InfiniteHitsProvided[THit]]
  }
}

