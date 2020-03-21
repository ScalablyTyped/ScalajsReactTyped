package typingsJapgolly.antdMobile.flexPropsTypeMod

import typingsJapgolly.antdMobile.antdMobileStrings.`column-reverse`
import typingsJapgolly.antdMobile.antdMobileStrings.`row-reverse`
import typingsJapgolly.antdMobile.antdMobileStrings.`wrap-reverse`
import typingsJapgolly.antdMobile.antdMobileStrings.around
import typingsJapgolly.antdMobile.antdMobileStrings.baseline
import typingsJapgolly.antdMobile.antdMobileStrings.between
import typingsJapgolly.antdMobile.antdMobileStrings.center
import typingsJapgolly.antdMobile.antdMobileStrings.column
import typingsJapgolly.antdMobile.antdMobileStrings.end
import typingsJapgolly.antdMobile.antdMobileStrings.nowrap
import typingsJapgolly.antdMobile.antdMobileStrings.row
import typingsJapgolly.antdMobile.antdMobileStrings.start
import typingsJapgolly.antdMobile.antdMobileStrings.stretch
import typingsJapgolly.antdMobile.antdMobileStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[nowrap | typingsJapgolly.antdMobile.antdMobileStrings.wrap | `wrap-reverse`] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

