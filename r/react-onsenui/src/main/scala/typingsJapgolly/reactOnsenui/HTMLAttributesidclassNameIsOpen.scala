package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.fade
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.lift
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  animation ? :'fade' | 'lift' | 'none',   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   onPreShow ? :(): void,   onPostShow ? :(): void,   onPreHide ? :(): void,   onPostHide ? :(): void,   isOpen ? :boolean,   onDeviceBackButton ? :(): void} */
trait HTMLAttributesidclassNameIsOpen extends js.Object {
  var animation: js.UndefOr[fade | lift | none] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameIsOpen {
  @scala.inline
  def apply(
    animation: fade | lift | none = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    id: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onDeviceBackButton: js.UndefOr[Callback] = js.undefined,
    onPostHide: js.UndefOr[Callback] = js.undefined,
    onPostShow: js.UndefOr[Callback] = js.undefined,
    onPreHide: js.UndefOr[Callback] = js.undefined,
    onPreShow: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameIsOpen = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    onDeviceBackButton.foreach(p => __obj.updateDynamic("onDeviceBackButton")(p.toJsFn))
    onPostHide.foreach(p => __obj.updateDynamic("onPostHide")(p.toJsFn))
    onPostShow.foreach(p => __obj.updateDynamic("onPostShow")(p.toJsFn))
    onPreHide.foreach(p => __obj.updateDynamic("onPreHide")(p.toJsFn))
    onPreShow.foreach(p => __obj.updateDynamic("onPreShow")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameIsOpen]
  }
}

