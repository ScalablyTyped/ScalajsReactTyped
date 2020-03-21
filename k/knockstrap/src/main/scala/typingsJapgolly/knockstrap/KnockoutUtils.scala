package typingsJapgolly.knockstrap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutUtils extends js.Object {
  def uniqueId(prefix: String): String
  def unwrapProperties(wrappedProperies: js.Any): js.Any
}

object KnockoutUtils {
  @scala.inline
  def apply(uniqueId: String => CallbackTo[String], unwrapProperties: js.Any => CallbackTo[js.Any]): KnockoutUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uniqueId")(js.Any.fromFunction1((t0: java.lang.String) => uniqueId(t0).runNow()))
    __obj.updateDynamic("unwrapProperties")(js.Any.fromFunction1((t0: js.Any) => unwrapProperties(t0).runNow()))
    __obj.asInstanceOf[KnockoutUtils]
  }
}

