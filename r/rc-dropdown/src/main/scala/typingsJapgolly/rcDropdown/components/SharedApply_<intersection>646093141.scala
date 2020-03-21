package typingsJapgolly.rcDropdown.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcDropdown.dropdownMod.DropdownProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class `SharedApply_<intersection>646093141` () {
  val componentImport: js.Any
  def apply(
    getPopupContainer: js.Any,
    align: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any = null,
    alignPoint: js.UndefOr[Boolean] = js.undefined,
    animation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationType */ js.Any = null,
    hideAction: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ] = null,
    minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.undefined,
    onOverlayClick: /* e */ Event_ => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    openClassName: String = null,
    overlay: js.Function0[Element] | Element = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: String = null,
    placements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    prefixCls: String = null,
    showAction: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ] = null,
    transitionName: String = null,
    trigger: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any
  ): UnmountedWithRoot[
    DropdownProps with RefAttributes[js.Any], 
    Ref, 
    Unit, 
    DropdownProps with RefAttributes[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], getPopupContainer = getPopupContainer.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alignPoint)) __obj.updateDynamic("alignPoint")(alignPoint.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (hideAction != null) __obj.updateDynamic("hideAction")(hideAction.asInstanceOf[js.Any])
    if (!js.isUndefined(minOverlayWidthMatchTrigger)) __obj.updateDynamic("minOverlayWidthMatchTrigger")(minOverlayWidthMatchTrigger.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onOverlayClick(t0).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (placements != null) __obj.updateDynamic("placements")(placements.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcDropdown.dropdownMod.DropdownProps with typingsJapgolly.react.mod.RefAttributes[js.Any], 
  japgolly.scalajs.react.Children.None, 
  japgolly.scalajs.react.raw.React.Ref](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcDropdown.dropdownMod.DropdownProps with typingsJapgolly.react.mod.RefAttributes[js.Any]])
  }
}

