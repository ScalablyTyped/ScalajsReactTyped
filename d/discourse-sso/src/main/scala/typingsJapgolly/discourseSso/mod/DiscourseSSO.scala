package typingsJapgolly.discourseSso.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscourseSSO extends js.Object {
  def buildLoginString(params: UserParams): String
  def getNonce(payload: String): String
  def validate(payload: String, sig: String): Boolean
}

object DiscourseSSO {
  @scala.inline
  def apply(
    buildLoginString: UserParams => CallbackTo[String],
    getNonce: String => CallbackTo[String],
    validate: (String, String) => CallbackTo[Boolean]
  ): DiscourseSSO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildLoginString")(js.Any.fromFunction1((t0: typingsJapgolly.discourseSso.mod.UserParams) => buildLoginString(t0).runNow()))
    __obj.updateDynamic("getNonce")(js.Any.fromFunction1((t0: java.lang.String) => getNonce(t0).runNow()))
    __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => validate(t0, t1).runNow()))
    __obj.asInstanceOf[DiscourseSSO]
  }
}

