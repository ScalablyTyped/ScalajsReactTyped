package typingsJapgolly.winrtUwp

import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookiePairHeaderValue extends js.Object {
  /** The HttpCookiePairHeaderValue version of the string. */ var cookiePairHeaderValue: HttpCookiePairHeaderValue
  /** true if input is valid HttpCookiePairHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonCookiePairHeaderValue {
  @scala.inline
  def apply(cookiePairHeaderValue: HttpCookiePairHeaderValue, returnValue: Boolean): AnonCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(cookiePairHeaderValue = cookiePairHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCookiePairHeaderValue]
  }
}

