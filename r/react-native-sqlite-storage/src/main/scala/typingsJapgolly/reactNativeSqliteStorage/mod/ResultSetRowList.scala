package typingsJapgolly.reactNativeSqliteStorage.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetRowList extends js.Object {
  var length: Double
  def item(index: Double): js.Any
  def raw(): js.Array[_]
}

object ResultSetRowList {
  @scala.inline
  def apply(item: Double => CallbackTo[js.Any], length: Double, raw: CallbackTo[js.Array[js.Any]]): ResultSetRowList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.updateDynamic("raw")(raw.toJsFn)
    __obj.asInstanceOf[ResultSetRowList]
  }
}

