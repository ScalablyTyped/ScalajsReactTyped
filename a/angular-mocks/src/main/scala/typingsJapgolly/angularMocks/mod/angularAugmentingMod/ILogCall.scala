package typingsJapgolly.angularMocks.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogCall extends js.Object {
  var logs: js.Array[String]
}

object ILogCall {
  @scala.inline
  def apply(logs: js.Array[String]): ILogCall = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILogCall]
  }
}

