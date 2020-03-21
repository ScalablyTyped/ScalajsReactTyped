package typingsJapgolly.phonegap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLTransaction extends js.Object {
  def executeSql(sql: String): SQLResultSet
}

object SQLTransaction {
  @scala.inline
  def apply(executeSql: String => CallbackTo[SQLResultSet]): SQLTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executeSql")(js.Any.fromFunction1((t0: java.lang.String) => executeSql(t0).runNow()))
    __obj.asInstanceOf[SQLTransaction]
  }
}

