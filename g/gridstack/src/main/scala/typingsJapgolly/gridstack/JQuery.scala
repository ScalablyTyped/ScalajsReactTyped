package typingsJapgolly.gridstack

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  @JSName("data")
  def data_gridstack(key: typingsJapgolly.gridstack.gridstackStrings.gridstack): GridStack
  def gridstack(options: GridstackOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(
    data: typingsJapgolly.gridstack.gridstackStrings.gridstack => CallbackTo[GridStack],
    gridstack: GridstackOptions => CallbackTo[JQuery]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(js.Any.fromFunction1((t0: typingsJapgolly.gridstack.gridstackStrings.gridstack) => data(t0).runNow()))
    __obj.updateDynamic("gridstack")(js.Any.fromFunction1((t0: typingsJapgolly.gridstack.GridstackOptions) => gridstack(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

