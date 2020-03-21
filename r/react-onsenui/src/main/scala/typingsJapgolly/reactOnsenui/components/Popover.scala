package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameGetTarget
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    animation: none | default = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    getTarget: js.UndefOr[CallbackTo[ReactInstance]] = js.undefined,
    id: String = null,
    isCancelable: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    maskColor: String = null,
    modifier: String = null,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onPostHide: js.UndefOr[Callback] = js.undefined,
    onPostShow: js.UndefOr[Callback] = js.undefined,
    onPreHide: js.UndefOr[Callback] = js.undefined,
    onPreShow: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameGetTarget, 
    typingsJapgolly.reactOnsenui.mod.Popover, 
    Unit, 
    HTMLAttributesidclassNameGetTarget
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    getTarget.foreach(p => __obj.updateDynamic("getTarget")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isCancelable)) __obj.updateDynamic("isCancelable")(isCancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    onPostHide.foreach(p => __obj.updateDynamic("onPostHide")(p.toJsFn))
    onPostShow.foreach(p => __obj.updateDynamic("onPostShow")(p.toJsFn))
    onPreHide.foreach(p => __obj.updateDynamic("onPreHide")(p.toJsFn))
    onPreShow.foreach(p => __obj.updateDynamic("onPreShow")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameGetTarget, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Popover](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameGetTarget])(children: _*)
  }
  @JSImport("react-onsenui", "Popover")
  @js.native
  object componentImport extends js.Object
  
}

