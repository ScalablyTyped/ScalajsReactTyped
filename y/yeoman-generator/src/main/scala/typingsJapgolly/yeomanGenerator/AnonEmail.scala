package typingsJapgolly.yeomanGenerator

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  /**
    * Retrieves user's email from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git email or undefined
    */
  def email(): String
  /**
    * Retrieves user's name from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git name or undefined
    */
  def name(): String
}

object AnonEmail {
  @scala.inline
  def apply(email: CallbackTo[String], name: CallbackTo[String]): AnonEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email.toJsFn)
    __obj.updateDynamic("name")(name.toJsFn)
    __obj.asInstanceOf[AnonEmail]
  }
}

