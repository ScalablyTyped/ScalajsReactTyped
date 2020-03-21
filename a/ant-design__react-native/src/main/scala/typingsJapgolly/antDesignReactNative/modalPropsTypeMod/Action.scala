package typingsJapgolly.antDesignReactNative.modalPropsTypeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  var onPress: js.UndefOr[js.Function0[Unit | js.Promise[_]]] = js.undefined
  var style: js.UndefOr[T | String] = js.undefined
  var text: String
}

object Action {
  @scala.inline
  def apply[T](
    text: String,
    onPress: js.UndefOr[CallbackTo[Unit | js.Promise[js.Any]]] = js.undefined,
    style: T | String = null
  ): Action[T] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
}

