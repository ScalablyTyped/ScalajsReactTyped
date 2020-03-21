package typingsJapgolly.rmcTrigger.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcTrigger.propsTypeMod.ITriggerProps
import typingsJapgolly.rmcTrigger.triggerMod.IProptypes
import typingsJapgolly.rmcTrigger.triggerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trigger {
  def apply(
    visible: Boolean,
    onClose: Callback,
    onTargetClick: Callback,
    afterPopupVisibleChange: js.Function = null,
    builtinPlacements: js.Any = null,
    defaultPopupVisible: js.UndefOr[Boolean] = js.undefined,
    destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined,
    getDocument: js.Function = null,
    getPopupClassNameFromAlign: js.Any = null,
    getPopupContainer: js.Function = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: String = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String | js.Object = null,
    onPopupAlign: js.Function = null,
    onPopupVisibleChange: js.Function = null,
    popup: Node | js.Function = null,
    popupAlign: js.Any = null,
    popupAnimation: js.Any = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupStyle: js.Any = null,
    popupTransitionName: String | js.Object = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    zIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ITriggerProps with IProptypes, default, Unit, ITriggerProps with IProptypes] = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onTargetClick")(onTargetClick.toJsFn)
    if (afterPopupVisibleChange != null) __obj.updateDynamic("afterPopupVisibleChange")(afterPopupVisibleChange.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPopupVisible)) __obj.updateDynamic("defaultPopupVisible")(defaultPopupVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPopupOnHide)) __obj.updateDynamic("destroyPopupOnHide")(destroyPopupOnHide.asInstanceOf[js.Any])
    if (getDocument != null) __obj.updateDynamic("getDocument")(getDocument.asInstanceOf[js.Any])
    if (getPopupClassNameFromAlign != null) __obj.updateDynamic("getPopupClassNameFromAlign")(getPopupClassNameFromAlign.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(onPopupAlign.asInstanceOf[js.Any])
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(onPopupVisibleChange.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupAlign != null) __obj.updateDynamic("popupAlign")(popupAlign.asInstanceOf[js.Any])
    if (popupAnimation != null) __obj.updateDynamic("popupAnimation")(popupAnimation.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcTrigger.propsTypeMod.ITriggerProps with typingsJapgolly.rmcTrigger.triggerMod.IProptypes, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcTrigger.triggerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcTrigger.propsTypeMod.ITriggerProps with typingsJapgolly.rmcTrigger.triggerMod.IProptypes])(children: _*)
  }
  @JSImport("rmc-trigger/lib/Trigger", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

