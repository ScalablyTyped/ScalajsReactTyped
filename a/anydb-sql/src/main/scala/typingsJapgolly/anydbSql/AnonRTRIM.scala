package typingsJapgolly.anydbSql

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.anydbSql.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRTRIM extends js.Object {
  def LOWER(name: Column[String]): Column[String]
  def RTRIM(name: Column[String]): Column[String]
}

object AnonRTRIM {
  @scala.inline
  def apply(
    LOWER: Column[String] => CallbackTo[Column[String]],
    RTRIM: Column[String] => CallbackTo[Column[String]]
  ): AnonRTRIM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOWER")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.Column[java.lang.String]) => LOWER(t0).runNow()))
    __obj.updateDynamic("RTRIM")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.Column[java.lang.String]) => RTRIM(t0).runNow()))
    __obj.asInstanceOf[AnonRTRIM]
  }
}

