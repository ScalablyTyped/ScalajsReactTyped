package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameContentStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Page {
  def apply(
    className: String = null,
    contentStyle: js.Any = null,
    id: String = null,
    modifier: String = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onInit: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    renderBottomToolbar: js.UndefOr[Callback] = js.undefined,
    renderFixed: js.UndefOr[Callback] = js.undefined,
    renderModal: js.UndefOr[Callback] = js.undefined,
    renderToolbar: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameContentStyle, 
    typingsJapgolly.reactOnsenui.mod.Page, 
    Unit, 
    HTMLAttributesidclassNameContentStyle
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    onInit.foreach(p => __obj.updateDynamic("onInit")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    renderBottomToolbar.foreach(p => __obj.updateDynamic("renderBottomToolbar")(p.toJsFn))
    renderFixed.foreach(p => __obj.updateDynamic("renderFixed")(p.toJsFn))
    renderModal.foreach(p => __obj.updateDynamic("renderModal")(p.toJsFn))
    renderToolbar.foreach(p => __obj.updateDynamic("renderToolbar")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameContentStyle, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Page](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameContentStyle])(children: _*)
  }
  @JSImport("react-onsenui", "Page")
  @js.native
  object componentImport extends js.Object
  
}

