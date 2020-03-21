package typingsJapgolly.rxLite

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetDisposable extends js.Object {
  def getDisposable(): IDisposable
}

object AnonGetDisposable {
  @scala.inline
  def apply(getDisposable: CallbackTo[IDisposable]): AnonGetDisposable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDisposable")(getDisposable.toJsFn)
    __obj.asInstanceOf[AnonGetDisposable]
  }
}

