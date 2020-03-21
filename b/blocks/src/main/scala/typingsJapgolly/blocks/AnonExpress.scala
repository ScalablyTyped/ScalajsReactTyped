package typingsJapgolly.blocks

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpress extends js.Object {
  def express(): js.Any
}

object AnonExpress {
  @scala.inline
  def apply(express: CallbackTo[js.Any]): AnonExpress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("express")(express.toJsFn)
    __obj.asInstanceOf[AnonExpress]
  }
}

