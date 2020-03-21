package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnDeviceBackButton
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.ascend
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.fade
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.fall
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.lift
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toast {
  def apply(
    isOpen: Boolean,
    animation: default | ascend | lift | fall | fade | none = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    id: String = null,
    modifier: String = null,
    onDeviceBackButton: js.UndefOr[Callback] = js.undefined,
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
    HTMLAttributesidclassNameOnDeviceBackButton, 
    typingsJapgolly.reactOnsenui.mod.Toast, 
    Unit, 
    HTMLAttributesidclassNameOnDeviceBackButton
  ] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
  
      if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    onDeviceBackButton.foreach(p => __obj.updateDynamic("onDeviceBackButton")(p.toJsFn))
    onPostHide.foreach(p => __obj.updateDynamic("onPostHide")(p.toJsFn))
    onPostShow.foreach(p => __obj.updateDynamic("onPostShow")(p.toJsFn))
    onPreHide.foreach(p => __obj.updateDynamic("onPreHide")(p.toJsFn))
    onPreShow.foreach(p => __obj.updateDynamic("onPreShow")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnDeviceBackButton, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Toast](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnDeviceBackButton])(children: _*)
  }
  @JSImport("react-onsenui", "Toast")
  @js.native
  object componentImport extends js.Object
  
}

