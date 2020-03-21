package typingsJapgolly.yeomanGenerator

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUsername extends js.Object {
  /**
    * Retrieves GitHub's username from the GitHub API
    * @return Resolved with the GitHub username or rejected if unable to
    *         get the information
    */
  def username(): js.Promise[String]
}

object AnonUsername {
  @scala.inline
  def apply(username: CallbackTo[js.Promise[String]]): AnonUsername = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("username")(username.toJsFn)
    __obj.asInstanceOf[AnonUsername]
  }
}

