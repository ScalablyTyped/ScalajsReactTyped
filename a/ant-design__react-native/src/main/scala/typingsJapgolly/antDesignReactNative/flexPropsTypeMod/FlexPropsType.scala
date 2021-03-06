package typingsJapgolly.antDesignReactNative.flexPropsTypeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.around
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.baseline
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.between
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.center
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.column
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.end
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.row
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.start
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.stretch
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[
    nowrap | typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
  ] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    children: VdomNode = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

