package typingsJapgolly.antdMobileRn.flexPropsTypeMod

import japgolly.scalajs.react.raw.React.Node
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[nowrap | typingsJapgolly.antdMobileRn.antdMobileRnStrings.wrap | `wrap-reverse`] = js.undefined
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

