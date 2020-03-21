package typingsJapgolly.ckeditor.CKEDITOR.dialog.definition

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.CKEDITOR.plugins.widget
import typingsJapgolly.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textarea extends labeledElement {
  var bidi: js.UndefOr[Boolean] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object textarea {
  @scala.inline
  def apply(
    align: String = null,
    bidi: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cols: Int | Double = null,
    commit: /* widget */ widget => Callback = null,
    controlStyle: String = null,
    default: String = null,
    id: String = null,
    inputStyle: String = null,
    label: String = null,
    labelLayout: String = null,
    labelStyle: String = null,
    onHide: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    onLoad: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    onShow: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    rows: Int | Double = null,
    setup: /* widget */ widget => Callback = null,
    style: String = null,
    title: String = null,
    `type`: String = null,
    validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    widths: js.Array[Double] = null
  ): textarea = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(bidi)) __obj.updateDynamic("bidi")(bidi.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.ckeditor.CKEDITOR.plugins.widget) => commit(t0).runNow()))
    if (controlStyle != null) __obj.updateDynamic("controlStyle")(controlStyle.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLayout != null) __obj.updateDynamic("labelLayout")(labelLayout.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onHide(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onLoad(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onShow(t0).runNow()))
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.ckeditor.CKEDITOR.plugins.widget) => setup(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[textarea]
  }
}

