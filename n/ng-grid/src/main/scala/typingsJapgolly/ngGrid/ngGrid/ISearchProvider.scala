package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchProvider extends js.Object {
  var extFilter: Boolean
  var fieldMap: js.Any
  def evalFilter(): Unit
}

object ISearchProvider {
  @scala.inline
  def apply(evalFilter: Callback, extFilter: Boolean, fieldMap: js.Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(extFilter = extFilter.asInstanceOf[js.Any], fieldMap = fieldMap.asInstanceOf[js.Any])
    __obj.updateDynamic("evalFilter")(evalFilter.toJsFn)
    __obj.asInstanceOf[ISearchProvider]
  }
}

