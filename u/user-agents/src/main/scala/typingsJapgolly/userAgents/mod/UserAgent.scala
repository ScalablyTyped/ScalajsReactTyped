package typingsJapgolly.userAgents.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgent extends js.Object {
  /**
    *  The value of data.appName
    */
  var appName: String
  /**
    * Get a fingerprint for the UserAgent instance
    */
  var data: Data
  /**
    * Generates a new UserAgent instance using the same filters that were used to construct userAgent
    */
  def random(): UserAgent
}

object UserAgent {
  @scala.inline
  def apply(appName: String, data: Data, random: CallbackTo[UserAgent]): UserAgent = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("random")(random.toJsFn)
    __obj.asInstanceOf[UserAgent]
  }
}

