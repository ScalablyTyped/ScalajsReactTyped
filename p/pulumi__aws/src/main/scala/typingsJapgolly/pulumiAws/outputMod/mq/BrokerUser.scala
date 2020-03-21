package typingsJapgolly.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerUser extends js.Object {
  /**
    * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
    */
  var consoleAccess: js.UndefOr[Boolean] = js.native
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
    */
  var password: String = js.native
  /**
    * The username of the user.
    */
  var username: String = js.native
}

object BrokerUser {
  @scala.inline
  def apply(
    password: String,
    username: String,
    consoleAccess: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null
  ): BrokerUser = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(consoleAccess)) __obj.updateDynamic("consoleAccess")(consoleAccess.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerUser]
  }
}

