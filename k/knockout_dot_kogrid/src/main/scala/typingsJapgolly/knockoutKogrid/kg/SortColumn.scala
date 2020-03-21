package typingsJapgolly.knockoutKogrid.kg

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortColumn extends js.Object {
  /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
  var field: String
  /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
  var sortingAlgorithm: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
}

object SortColumn {
  @scala.inline
  def apply(field: String, sortingAlgorithm: (/* a */ js.Any, /* b */ js.Any) => CallbackTo[Double] = null): SortColumn = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (sortingAlgorithm != null) __obj.updateDynamic("sortingAlgorithm")(js.Any.fromFunction2((t0: /* a */ js.Any, t1: /* b */ js.Any) => sortingAlgorithm(t0, t1).runNow()))
    __obj.asInstanceOf[SortColumn]
  }
}

