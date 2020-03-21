package typingsJapgolly.phonegap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLResultSetRowList extends js.Object {
  var length: Double
  def item(index: Double): js.Any
}

object SQLResultSetRowList {
  @scala.inline
  def apply(item: Double => CallbackTo[js.Any], length: Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.asInstanceOf[SQLResultSetRowList]
  }
}

