package typingsJapgolly.reactTableFilter.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabfilterProps extends js.Object {
  var initialFilters: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
  var rowClass: js.UndefOr[String] = js.undefined
  var rows: String | js.Array[String] | StringDictionary[Boolean]
  def onFilterUpdate(filteredArray: js.Array[String], currentFilters: js.Array[_]): js.Array[_] | Unit
}

object TabfilterProps {
  @scala.inline
  def apply(
    onFilterUpdate: (js.Array[String], js.Array[js.Any]) => CallbackTo[js.Array[js.Any] | Unit],
    rows: String | js.Array[String] | StringDictionary[Boolean],
    initialFilters: String | js.Array[String] | StringDictionary[Boolean] = null,
    rowClass: String = null
  ): TabfilterProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Array[js.Any]) => onFilterUpdate(t0, t1).runNow()))
    if (initialFilters != null) __obj.updateDynamic("initialFilters")(initialFilters.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabfilterProps]
  }
}

