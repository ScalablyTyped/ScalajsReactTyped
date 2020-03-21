package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortedQuery extends IFinalizable {
  /** Specifies next order field (ascending) */
  def ThenBy(fieldInternalName: String): js.Any
  /** Specifies next order field (descending) */
  def ThenByDesc(fieldInternalName: String): js.Any
}

object ISortedQuery {
  @scala.inline
  def apply(
    ThenBy: String => CallbackTo[js.Any],
    ThenByDesc: String => CallbackTo[js.Any],
    ToCamlQuery: CallbackTo[js.Any],
    ToString: CallbackTo[String]
  ): ISortedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ThenBy")(js.Any.fromFunction1((t0: java.lang.String) => ThenBy(t0).runNow()))
    __obj.updateDynamic("ThenByDesc")(js.Any.fromFunction1((t0: java.lang.String) => ThenByDesc(t0).runNow()))
    __obj.updateDynamic("ToCamlQuery")(ToCamlQuery.toJsFn)
    __obj.updateDynamic("ToString")(ToString.toJsFn)
    __obj.asInstanceOf[ISortedQuery]
  }
}

