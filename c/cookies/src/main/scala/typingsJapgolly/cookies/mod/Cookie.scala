package typingsJapgolly.cookies.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: String
  var expires: js.Date
  var httpOnly: Boolean
  var maxAge: Double
  /**
    * "maxage" is deprecated, use "maxAge" instead
    */
  var maxage: Double
  var name: String
  var overwrite: Boolean
  var path: String
  var sameSite: Boolean
  var secure: Boolean
  var value: String
  def toHeader(): String
}

object Cookie {
  @scala.inline
  def apply(
    domain: String,
    expires: js.Date,
    httpOnly: Boolean,
    maxAge: Double,
    maxage: Double,
    name: String,
    overwrite: Boolean,
    path: String,
    sameSite: Boolean,
    secure: Boolean,
    toHeader: CallbackTo[String],
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], maxage = maxage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("toHeader")(toHeader.toJsFn)
    __obj.asInstanceOf[Cookie]
  }
}

