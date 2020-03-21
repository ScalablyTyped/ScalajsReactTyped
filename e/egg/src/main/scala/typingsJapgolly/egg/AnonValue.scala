package typingsJapgolly.egg

import typingsJapgolly.egg.eggStrings.DENY
import typingsJapgolly.egg.eggStrings.SAMEORIGIN
import typingsJapgolly.egg.eggStrings.`ALLOW-FROM`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var enable: Boolean
  var value: SAMEORIGIN | DENY | `ALLOW-FROM`
}

object AnonValue {
  @scala.inline
  def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): AnonValue = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

