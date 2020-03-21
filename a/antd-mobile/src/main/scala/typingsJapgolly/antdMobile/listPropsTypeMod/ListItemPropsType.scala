package typingsJapgolly.antdMobile.listPropsTypeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings._empty
import typingsJapgolly.antdMobile.antdMobileStrings.android
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.down
import typingsJapgolly.antdMobile.antdMobileStrings.empty
import typingsJapgolly.antdMobile.antdMobileStrings.horizontal
import typingsJapgolly.antdMobile.antdMobileStrings.ios
import typingsJapgolly.antdMobile.antdMobileStrings.middle
import typingsJapgolly.antdMobile.antdMobileStrings.top
import typingsJapgolly.antdMobile.antdMobileStrings.up
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemPropsType extends js.Object {
  var activeStyle: js.UndefOr[CSSProperties] = js.undefined
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[android | ios] = js.undefined
  var thumb: js.UndefOr[Node | Null] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object ListItemPropsType {
  @scala.inline
  def apply(
    activeStyle: CSSProperties = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: VdomNode = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    platform: android | ios = null,
    thumb: VdomNode = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ListItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemPropsType]
  }
}

