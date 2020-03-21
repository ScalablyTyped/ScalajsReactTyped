package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  contentStyle ? :any,   modifier ? :string,   renderModal ? :(): void,   renderToolbar ? :(): void,   renderBottomToolbar ? :(): void,   renderFixed ? :(): void,   onInit ? :(): void,   onShow ? :(): void,   onHide ? :(): void} */
trait HTMLAttributesidclassNameContentStyle extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderBottomToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameContentStyle {
  @scala.inline
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
    style: CSSProperties = null
  ): HTMLAttributesidclassNameContentStyle = {
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
    __obj.asInstanceOf[HTMLAttributesidclassNameContentStyle]
  }
}

