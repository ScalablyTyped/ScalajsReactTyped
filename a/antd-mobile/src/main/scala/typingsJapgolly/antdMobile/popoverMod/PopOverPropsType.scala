package typingsJapgolly.antdMobile.popoverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.bottomLeft
import typingsJapgolly.antdMobile.antdMobileStrings.bottomRight
import typingsJapgolly.antdMobile.antdMobileStrings.left
import typingsJapgolly.antdMobile.antdMobileStrings.right
import typingsJapgolly.antdMobile.antdMobileStrings.top
import typingsJapgolly.antdMobile.antdMobileStrings.topLeft
import typingsJapgolly.antdMobile.antdMobileStrings.topRight
import typingsJapgolly.antdMobile.popoverPropsTypeMod.PopoverPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverPropsType extends PopoverPropsType {
  var mask: js.UndefOr[Boolean] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var placement: js.UndefOr[left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PopOverPropsType {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    overlay: VdomNode = null,
    placement: left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight = null,
    prefixCls: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PopOverPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* node */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onSelect(t0, t1).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.rawNode.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopOverPropsType]
  }
}

