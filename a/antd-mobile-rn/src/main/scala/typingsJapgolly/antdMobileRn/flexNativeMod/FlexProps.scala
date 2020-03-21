package typingsJapgolly.antdMobileRn.flexNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.around
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.baseline
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.between
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.center
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.column
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.end
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.nowrap
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.row
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.start
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.stretch
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.wrap
import typingsJapgolly.antdMobileRn.flexPropsTypeMod.FlexPropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps extends FlexPropsType {
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    children: VdomNode = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onPressIn: js.UndefOr[Callback] = js.undefined,
    onPressOut: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    onPressIn.foreach(p => __obj.updateDynamic("onPressIn")(p.toJsFn))
    onPressOut.foreach(p => __obj.updateDynamic("onPressOut")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

