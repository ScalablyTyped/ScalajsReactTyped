package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLibrary extends js.Object {
  def enumerate(): js.Any
}

object ShapeLibrary {
  @scala.inline
  def apply(enumerate: CallbackTo[js.Any]): ShapeLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enumerate")(enumerate.toJsFn)
    __obj.asInstanceOf[ShapeLibrary]
  }
}

