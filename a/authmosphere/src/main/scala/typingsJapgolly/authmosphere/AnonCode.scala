package typingsJapgolly.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var redirectUri: String
}

object AnonCode {
  @scala.inline
  def apply(code: String, redirectUri: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

