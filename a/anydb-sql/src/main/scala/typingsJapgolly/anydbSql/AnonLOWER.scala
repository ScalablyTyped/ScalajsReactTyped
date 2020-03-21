package typingsJapgolly.anydbSql

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.anydbSql.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLOWER extends js.Object {
  def LOWER(c: Column[String]): Column[String]
}

object AnonLOWER {
  @scala.inline
  def apply(LOWER: Column[String] => CallbackTo[Column[String]]): AnonLOWER = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOWER")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.Column[java.lang.String]) => LOWER(t0).runNow()))
    __obj.asInstanceOf[AnonLOWER]
  }
}

