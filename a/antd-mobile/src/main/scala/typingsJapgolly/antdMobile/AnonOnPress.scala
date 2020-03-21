package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPress[T] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[T] = js.undefined
  var text: String
}

object AnonOnPress {
  @scala.inline
  def apply[T](
    text: String,
    className: String = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: T = null
  ): AnonOnPress[T] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnPress[T]]
  }
}

