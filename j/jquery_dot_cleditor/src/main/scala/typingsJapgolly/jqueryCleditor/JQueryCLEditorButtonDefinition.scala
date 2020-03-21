package typingsJapgolly.jqueryCleditor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorButtonDefinition extends js.Object {
  var buttonClick: js.UndefOr[
    js.Function2[/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.undefined
  var command: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.undefined
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var name: String
  var popupClick: js.UndefOr[
    js.Function2[/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.undefined
  var popupContent: js.UndefOr[String] = js.undefined
  var popupName: js.UndefOr[String] = js.undefined
  var stripIndex: js.UndefOr[Double] = js.undefined
  var title: String
}

object JQueryCLEditorButtonDefinition {
  @scala.inline
  def apply(
    name: String,
    title: String,
    buttonClick: (/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData) => CallbackTo[Boolean] = null,
    command: String = null,
    css: js.Any = null,
    getEnabled: /* data */ JQueryCLEditorButtonDefinitionEventData => CallbackTo[Boolean] = null,
    getPressed: /* data */ JQueryCLEditorButtonDefinitionEventData => CallbackTo[Boolean] = null,
    image: String = null,
    popupClick: (/* event */ Event_, /* data */ JQueryCLEditorButtonDefinitionEventData) => CallbackTo[Boolean] = null,
    popupContent: String = null,
    popupName: String = null,
    stripIndex: Int | Double = null
  ): JQueryCLEditorButtonDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (buttonClick != null) __obj.updateDynamic("buttonClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* data */ typingsJapgolly.jqueryCleditor.JQueryCLEditorButtonDefinitionEventData) => buttonClick(t0, t1).runNow()))
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.jqueryCleditor.JQueryCLEditorButtonDefinitionEventData) => getEnabled(t0).runNow()))
    if (getPressed != null) __obj.updateDynamic("getPressed")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.jqueryCleditor.JQueryCLEditorButtonDefinitionEventData) => getPressed(t0).runNow()))
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (popupClick != null) __obj.updateDynamic("popupClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* data */ typingsJapgolly.jqueryCleditor.JQueryCLEditorButtonDefinitionEventData) => popupClick(t0, t1).runNow()))
    if (popupContent != null) __obj.updateDynamic("popupContent")(popupContent.asInstanceOf[js.Any])
    if (popupName != null) __obj.updateDynamic("popupName")(popupName.asInstanceOf[js.Any])
    if (stripIndex != null) __obj.updateDynamic("stripIndex")(stripIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinition]
  }
}

