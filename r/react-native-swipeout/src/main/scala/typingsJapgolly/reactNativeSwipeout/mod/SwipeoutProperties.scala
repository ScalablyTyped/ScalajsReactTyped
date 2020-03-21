package typingsJapgolly.reactNativeSwipeout.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutProperties extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var buttonWidth: js.UndefOr[Double] = js.undefined
  var close: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var onClose: js.UndefOr[
    js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
  ] = js.undefined
  var onOpen: js.UndefOr[
    js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
  ] = js.undefined
  var openLeft: js.UndefOr[Boolean] = js.undefined
  var openRight: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var rowId: js.UndefOr[Double] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ Boolean, Unit]] = js.undefined
  var sectionId: js.UndefOr[Double] = js.undefined
  var sensitivity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object SwipeoutProperties {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    buttonWidth: Int | Double = null,
    close: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    left: js.Array[SwipeoutButtonProperties] = null,
    onClose: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback = null,
    onOpen: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback = null,
    openLeft: js.UndefOr[Boolean] = js.undefined,
    openRight: js.UndefOr[Boolean] = js.undefined,
    right: js.Array[SwipeoutButtonProperties] = null,
    rowId: Int | Double = null,
    scroll: /* scrollEnabled */ Boolean => Callback = null,
    sectionId: Int | Double = null,
    sensitivity: Int | Double = null,
    style: js.Object = null
  ): SwipeoutProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (buttonWidth != null) __obj.updateDynamic("buttonWidth")(buttonWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction3((t0: /* sectionId */ scala.Double, t1: /* rowId */ scala.Double, t2: /* direction */ java.lang.String) => onClose(t0, t1, t2).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction3((t0: /* sectionId */ scala.Double, t1: /* rowId */ scala.Double, t2: /* direction */ java.lang.String) => onOpen(t0, t1, t2).runNow()))
    if (!js.isUndefined(openLeft)) __obj.updateDynamic("openLeft")(openLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(openRight)) __obj.updateDynamic("openRight")(openRight.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1((t0: /* scrollEnabled */ scala.Boolean) => scroll(t0).runNow()))
    if (sectionId != null) __obj.updateDynamic("sectionId")(sectionId.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeoutProperties]
  }
}

