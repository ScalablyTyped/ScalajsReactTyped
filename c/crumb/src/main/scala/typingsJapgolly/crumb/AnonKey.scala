package typingsJapgolly.crumb

import typingsJapgolly.crumb.crumbStrings.payload
import typingsJapgolly.crumb.crumbStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  /**
    * The name of the cookie to store the CSRF crumb into.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Override for the server's 'restful' setting
    */
  var restful: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies how the crumb will be sent in requests.
    *
    * @default 'payload'
    */
  var source: js.UndefOr[payload | query] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(key: String = null, restful: js.UndefOr[Boolean] = js.undefined, source: payload | query = null): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(restful)) __obj.updateDynamic("restful")(restful.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

