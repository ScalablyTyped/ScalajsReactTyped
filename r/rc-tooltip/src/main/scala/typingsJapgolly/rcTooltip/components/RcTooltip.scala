package typingsJapgolly.rcTooltip.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.rcTooltip.mod.RCTooltip.Placement
import typingsJapgolly.rcTooltip.mod.RCTooltip.Props
import typingsJapgolly.rcTooltip.mod.RCTooltip.Trigger
import typingsJapgolly.rcTooltip.mod.default
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcTooltip {
  def apply(
    overlay: js.Function0[ReactChild] | ReactChild | ReactFragment | ReactPortal,
    afterVisibleChange: /* visible */ js.UndefOr[Boolean] => Callback = null,
    align: js.Object = null,
    arrowContent: VdomNode = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getTooltipContainer: js.UndefOr[CallbackTo[Element]] = js.undefined,
    id: String = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onPopupAlign: (/* popupDomNode */ Element, /* align */ js.Object) => Callback = null,
    onVisibleChange: /* visible */ js.UndefOr[Boolean] => Callback = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: Placement | js.Object = null,
    prefixCls: String = null,
    transitionName: String = null,
    trigger: js.Array[Trigger] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
  
      if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1((t0: /* visible */ js.UndefOr[scala.Boolean]) => afterVisibleChange(t0).runNow()))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrowContent != null) __obj.updateDynamic("arrowContent")(arrowContent.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.asInstanceOf[js.Any])
    getTooltipContainer.foreach(p => __obj.updateDynamic("getTooltipContainer")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(js.Any.fromFunction2((t0: /* popupDomNode */ org.scalajs.dom.raw.Element, t1: /* align */ js.Object) => onPopupAlign(t0, t1).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ js.UndefOr[scala.Boolean]) => onVisibleChange(t0).runNow()))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcTooltip.mod.RCTooltip.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcTooltip.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTooltip.mod.RCTooltip.Props])(children: _*)
  }
  @JSImport("rc-tooltip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

