package typingsJapgolly.ldclientJsCommon

import typingsJapgolly.ldclientJsCommon.mod.LDFlagValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: LDFlagValue
  var previous: LDFlagValue
}

object AnonCurrent {
  @scala.inline
  def apply(current: LDFlagValue, previous: LDFlagValue): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrent]
  }
}

