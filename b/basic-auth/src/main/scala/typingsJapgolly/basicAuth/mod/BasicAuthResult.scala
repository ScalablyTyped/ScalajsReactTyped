package typingsJapgolly.basicAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthResult extends js.Object {
  var name: String
  var pass: String
}

object BasicAuthResult {
  @scala.inline
  def apply(name: String, pass: String): BasicAuthResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BasicAuthResult]
  }
}

