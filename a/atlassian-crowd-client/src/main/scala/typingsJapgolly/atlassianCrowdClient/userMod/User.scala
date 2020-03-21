package typingsJapgolly.atlassianCrowdClient.userMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  val active: Boolean
  val attributes: StringDictionary[js.Any]
  val displayname: String
  val email: String
  val firstname: String
  val lastname: String
  val password: js.UndefOr[String] = js.undefined
  val username: String
  def toCrowd(): UserObj
}

object User {
  @scala.inline
  def apply(
    active: Boolean,
    attributes: StringDictionary[js.Any],
    displayname: String,
    email: String,
    firstname: String,
    lastname: String,
    toCrowd: CallbackTo[UserObj],
    username: String,
    password: String = null
  ): User = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], displayname = displayname.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstname = firstname.asInstanceOf[js.Any], lastname = lastname.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("toCrowd")(toCrowd.toJsFn)
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

