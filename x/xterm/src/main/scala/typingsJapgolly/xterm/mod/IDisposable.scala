package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisposable extends js.Object {
  def dispose(): Unit
}

object IDisposable {
  @scala.inline
  def apply(dispose: Callback): IDisposable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[IDisposable]
  }
}

