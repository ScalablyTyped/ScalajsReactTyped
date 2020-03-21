package typingsJapgolly.elasticApmNode

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.elasticApmNode.mod.Connect.ErrorHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnect extends js.Object {
  def connect(): ErrorHandleFunction
}

object AnonConnect {
  @scala.inline
  def apply(connect: CallbackTo[ErrorHandleFunction]): AnonConnect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.asInstanceOf[AnonConnect]
  }
}

