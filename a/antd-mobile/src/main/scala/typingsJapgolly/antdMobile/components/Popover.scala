package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.bottomLeft
import typingsJapgolly.antdMobile.antdMobileStrings.bottomRight
import typingsJapgolly.antdMobile.antdMobileStrings.left
import typingsJapgolly.antdMobile.antdMobileStrings.right
import typingsJapgolly.antdMobile.antdMobileStrings.top
import typingsJapgolly.antdMobile.antdMobileStrings.topLeft
import typingsJapgolly.antdMobile.antdMobileStrings.topRight
import typingsJapgolly.antdMobile.popoverMod.PopOverPropsType
import typingsJapgolly.antdMobile.popoverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    overlay: VdomNode = null,
    placement: left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight = null,
    prefixCls: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopOverPropsType, default, Unit, PopOverPropsType] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* node */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onSelect(t0, t1).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.rawNode.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.popoverMod.PopOverPropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.popoverMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.popoverMod.PopOverPropsType])(children: _*)
  }
  @JSImport("antd-mobile/lib/popover", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

