package typingsJapgolly.ixJs.Ix

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  def dispose(): Unit
}

object Disposable {
  @scala.inline
  def apply(dispose: Callback): Disposable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[Disposable]
  }
}

