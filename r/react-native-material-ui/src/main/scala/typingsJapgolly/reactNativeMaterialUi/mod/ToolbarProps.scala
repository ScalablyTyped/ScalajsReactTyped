package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarProps extends js.Object {
  var centerElement: js.UndefOr[Element | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var isSearchActive: js.UndefOr[Boolean] = js.undefined
  var leftElement: js.UndefOr[Element | String] = js.undefined
  var onLeftElementPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRightElementPress: js.UndefOr[js.Function1[/* e */ RightElementPressEvent, Unit]] = js.undefined
  var rightElement: js.UndefOr[Element | String | js.Array[String] | ToolBarRightElement] = js.undefined
  var searchable: js.UndefOr[Searchable] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[ToolbarStyle] = js.undefined
}

object ToolbarProps {
  @scala.inline
  def apply(
    centerElement: Element | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isSearchActive: js.UndefOr[Boolean] = js.undefined,
    leftElement: Element | String = null,
    onLeftElementPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onRightElementPress: /* e */ RightElementPressEvent => Callback = null,
    rightElement: Element | String | js.Array[String] | ToolBarRightElement = null,
    searchable: Searchable = null,
    size: Int | Double = null,
    style: ToolbarStyle = null
  ): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    if (centerElement != null) __obj.updateDynamic("centerElement")(centerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchActive)) __obj.updateDynamic("isSearchActive")(isSearchActive.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    onLeftElementPress.foreach(p => __obj.updateDynamic("onLeftElementPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (onRightElementPress != null) __obj.updateDynamic("onRightElementPress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactNativeMaterialUi.mod.RightElementPressEvent) => onRightElementPress(t0).runNow()))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (searchable != null) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarProps]
  }
}

