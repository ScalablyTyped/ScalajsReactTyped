package typingsJapgolly.ckeditor.CKEDITOR.dialog.definition

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.CKEDITOR.plugins.widget
import typingsJapgolly.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vbox extends uiElement {
  var children: js.UndefOr[js.Array[typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement]] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var heights: js.UndefOr[js.Array[Double]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[js.Array[Double]] = js.undefined
}

object vbox {
  @scala.inline
  def apply(
    align: String = null,
    children: js.Array[typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement] = null,
    className: String = null,
    commit: /* widget */ widget => Callback = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    heights: js.Array[Double] = null,
    id: String = null,
    label: String = null,
    onHide: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    onLoad: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    onShow: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    padding: Int | Double = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    setup: /* widget */ widget => Callback = null,
    style: String = null,
    styles: String = null,
    title: String = null,
    `type`: String = null,
    width: js.Array[Double] = null
  ): vbox = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.ckeditor.CKEDITOR.plugins.widget) => commit(t0).runNow()))
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onHide(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onLoad(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onShow(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.ckeditor.CKEDITOR.plugins.widget) => setup(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[vbox]
  }
}

