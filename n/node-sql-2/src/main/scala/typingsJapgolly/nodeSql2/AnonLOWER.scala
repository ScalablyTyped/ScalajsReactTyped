package typingsJapgolly.nodeSql2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeSql2.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLOWER extends js.Object {
  def LOWER[Name](c: Column[Name, String]): Column[Name, String]
}

object AnonLOWER {
  @scala.inline
  def apply(LOWER: Column[js.Any, String] => CallbackTo[Column[js.Any, String]]): AnonLOWER = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOWER")(js.Any.fromFunction1((t0: typingsJapgolly.nodeSql2.mod.Column[js.Any, java.lang.String]) => LOWER(t0).runNow()))
    __obj.asInstanceOf[AnonLOWER]
  }
}

