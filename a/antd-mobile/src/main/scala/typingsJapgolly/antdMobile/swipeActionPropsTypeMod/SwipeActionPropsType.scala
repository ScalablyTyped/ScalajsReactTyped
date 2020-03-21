package typingsJapgolly.antdMobile.swipeActionPropsTypeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.AnonOnPress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeActionPropsType[T] extends js.Object {
  /** whether button is disabled*/
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[js.Array[AnonOnPress[T]]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var right: js.UndefOr[js.Array[AnonOnPress[T]]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SwipeActionPropsType {
  @scala.inline
  def apply[T](
    autoClose: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    left: js.Array[AnonOnPress[T]] = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    right: js.Array[AnonOnPress[T]] = null,
    title: String = null
  ): SwipeActionPropsType[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeActionPropsType[T]]
  }
}

