package typingsJapgolly.ckeditor.CKEDITOR.plugins.widget

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.CKEDITOR.eventInfo
import typingsJapgolly.ckeditor.CKEDITOR.feature
import typingsJapgolly.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsJapgolly.ckeditor.CKEDITOR.htmlParser.element
import typingsJapgolly.ckeditor.CKEDITOR.style
import typingsJapgolly.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends feature {
  var button: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var defaults: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var dialog: js.UndefOr[String] = js.undefined
  var downcast: js.UndefOr[String | (js.Function1[/* element */ element, Unit])] = js.undefined
  var downcasts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var edit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var editables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var insert: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var parts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var pathName: js.UndefOr[String] = js.undefined
  var styleToAllowedContentRules: js.UndefOr[js.Function1[/* style */ style, allowedContentRules]] = js.undefined
  var styleableElements: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | typingsJapgolly.ckeditor.CKEDITOR.template] = js.undefined
  var upcast: js.UndefOr[String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])] = js.undefined
  var upcastPriority: js.UndefOr[Double] = js.undefined
  var upcasts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object definition {
  @scala.inline
  def apply(
    allowedContent: allowedContentRules = null,
    button: String = null,
    contentForms: js.Any = null,
    contentTransformations: js.Any = null,
    data: /* evt */ eventInfo => Callback = null,
    defaults: StringDictionary[js.Any] = null,
    dialog: String = null,
    downcast: String | (js.Function1[/* element */ element, Unit]) = null,
    downcasts: StringDictionary[js.Any] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    edit: js.UndefOr[Callback] = js.undefined,
    editables: StringDictionary[js.Any] = null,
    getLabel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    init: js.UndefOr[Callback] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    insert: js.UndefOr[Callback] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    parts: StringDictionary[js.Any] = null,
    pathName: String = null,
    requiredContent: String | style = null,
    styleToAllowedContentRules: /* style */ style => CallbackTo[allowedContentRules] = null,
    styleableElements: String = null,
    template: String | template = null,
    toFeature: js.UndefOr[CallbackTo[feature]] = js.undefined,
    upcast: String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean]) = null,
    upcastPriority: Int | Double = null,
    upcasts: StringDictionary[js.Any] = null
  ): definition = {
    val __obj = js.Dynamic.literal()
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (contentForms != null) __obj.updateDynamic("contentForms")(contentForms.asInstanceOf[js.Any])
    if (contentTransformations != null) __obj.updateDynamic("contentTransformations")(contentTransformations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => data(t0).runNow()))
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (dialog != null) __obj.updateDynamic("dialog")(dialog.asInstanceOf[js.Any])
    if (downcast != null) __obj.updateDynamic("downcast")(downcast.asInstanceOf[js.Any])
    if (downcasts != null) __obj.updateDynamic("downcasts")(downcasts.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    edit.foreach(p => __obj.updateDynamic("edit")(p.toJsFn))
    if (editables != null) __obj.updateDynamic("editables")(editables.asInstanceOf[js.Any])
    getLabel.foreach(p => __obj.updateDynamic("getLabel")(p.toJsFn))
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    insert.foreach(p => __obj.updateDynamic("insert")(p.toJsFn))
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (pathName != null) __obj.updateDynamic("pathName")(pathName.asInstanceOf[js.Any])
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (styleToAllowedContentRules != null) __obj.updateDynamic("styleToAllowedContentRules")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.ckeditor.CKEDITOR.style) => styleToAllowedContentRules(t0).runNow()))
    if (styleableElements != null) __obj.updateDynamic("styleableElements")(styleableElements.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    toFeature.foreach(p => __obj.updateDynamic("toFeature")(p.toJsFn))
    if (upcast != null) __obj.updateDynamic("upcast")(upcast.asInstanceOf[js.Any])
    if (upcastPriority != null) __obj.updateDynamic("upcastPriority")(upcastPriority.asInstanceOf[js.Any])
    if (upcasts != null) __obj.updateDynamic("upcasts")(upcasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[definition]
  }
}

