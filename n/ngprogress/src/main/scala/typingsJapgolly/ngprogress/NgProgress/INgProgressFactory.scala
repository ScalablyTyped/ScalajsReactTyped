package typingsJapgolly.ngprogress.NgProgress

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgProgressFactory extends js.Object {
  def createInstance(): INgProgress
}

object INgProgressFactory {
  @scala.inline
  def apply(createInstance: CallbackTo[INgProgress]): INgProgressFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInstance")(createInstance.toJsFn)
    __obj.asInstanceOf[INgProgressFactory]
  }
}

