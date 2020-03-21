package typingsJapgolly.ckeditor.CKEDITOR.dialog

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditor.CKEDITOR.dialog.definition.button
import typingsJapgolly.ckeditor.CKEDITOR.dialog.definition.content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogDefinition extends js.Object {
  var buttons: js.UndefOr[js.Array[button]] = js.undefined
  var contents: js.UndefOr[js.Array[content]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resizable: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IDialogDefinition {
  @scala.inline
  def apply(
    buttons: js.Array[button] = null,
    contents: js.Array[content] = null,
    height: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onOk: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    resizable: Int | Double = null,
    title: String = null,
    width: Int | Double = null
  ): IDialogDefinition = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    onOk.foreach(p => __obj.updateDynamic("onOk")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogDefinition]
  }
}

