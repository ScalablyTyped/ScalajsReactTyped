package typingsJapgolly.ol.disposableMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  def dispose(): Unit
  /* protected */ def disposeInternal(): Unit
}

object Disposable {
  @scala.inline
  def apply(dispose: Callback, disposeInternal: Callback): Disposable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("disposeInternal")(disposeInternal.toJsFn)
    __obj.asInstanceOf[Disposable]
  }
}

