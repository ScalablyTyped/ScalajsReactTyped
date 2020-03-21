package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon15 extends js.Object {
  def attached(param0: String): Unit
}

object Anon15 {
  @scala.inline
  def apply(attached: String => Callback): Anon15 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attached")(js.Any.fromFunction1((t0: java.lang.String) => attached(t0).runNow()))
    __obj.asInstanceOf[Anon15]
  }
}

