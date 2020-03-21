package typingsJapgolly.ckeditor.CKEDITOR.dialog.definition

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.CKEDITOR.plugins.widget
import typingsJapgolly.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiElement extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var commit: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[
    js.Function1[/* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement, Unit]
  ] = js.undefined
  var onLoad: js.UndefOr[
    js.Function1[/* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement, Unit]
  ] = js.undefined
  var onShow: js.UndefOr[
    js.Function1[/* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement, Unit]
  ] = js.undefined
  var requiredContent: js.UndefOr[String | StringDictionary[js.Any] | style] = js.undefined
  var setup: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object uiElement {
  @scala.inline
  def apply(
    align: String = null,
    className: String = null,
    commit: /* widget */ widget => Callback = null,
    id: String = null,
    label: String = null,
    onHide: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    onLoad: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    onShow: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement => Callback = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    setup: /* widget */ widget => Callback = null,
    style: String = null,
    title: String = null,
    `type`: String = null
  ): uiElement = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.ckeditor.CKEDITOR.plugins.widget) => commit(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onHide(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onLoad(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* elem */ typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.uiElement) => onShow(t0).runNow()))
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.ckeditor.CKEDITOR.plugins.widget) => setup(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[uiElement]
  }
}

