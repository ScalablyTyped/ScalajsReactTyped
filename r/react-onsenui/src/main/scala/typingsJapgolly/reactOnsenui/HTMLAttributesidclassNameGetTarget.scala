package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  getTarget ? :(): react.react.ReactInstance,   onCancel ? :(): void,   isOpen ? :boolean,   isCancelable ? :boolean,   isDisabled ? :boolean,   animation ? :'none' | 'default',   modifier ? :string,   maskColor ? :string,   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   onPreShow ? :(): void,   onPostShow ? :(): void,   onPreHide ? :(): void,   onPostHide ? :(): void} */
trait HTMLAttributesidclassNameGetTarget extends js.Object {
  var animation: js.UndefOr[none | default] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var getTarget: js.UndefOr[js.Function0[ReactInstance]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isCancelable: js.UndefOr[Boolean] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var maskColor: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameGetTarget {
  @scala.inline
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
    style: CSSProperties = null
  ): HTMLAttributesidclassNameGetTarget = {
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
    __obj.asInstanceOf[HTMLAttributesidclassNameGetTarget]
  }
}

