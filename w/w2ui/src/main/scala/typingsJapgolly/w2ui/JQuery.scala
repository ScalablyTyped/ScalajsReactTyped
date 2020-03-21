package typingsJapgolly.w2ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.w2ui.W2UI_.W2Form
import typingsJapgolly.w2ui.W2UI_.W2Grid
import typingsJapgolly.w2ui.W2UI_.W2Layout
import typingsJapgolly.w2ui.W2UI_.W2Popup
import typingsJapgolly.w2ui.W2UI_.W2Sidebar
import typingsJapgolly.w2ui.W2UI_.W2Tabs
import typingsJapgolly.w2ui.W2UI_.W2Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def w2form(options: js.Object): W2Form
  def w2grid(options: js.Object): W2Grid
  def w2layout(options: js.Object): W2Layout
  def w2popup(options: js.Object): W2Popup
  def w2sidebar(options: js.Object): W2Sidebar
  def w2tabs(options: js.Object): W2Tabs
  def w2toolbar(options: js.Object): W2Toolbar
}

object JQuery {
  @scala.inline
  def apply(
    w2form: js.Object => CallbackTo[W2Form],
    w2grid: js.Object => CallbackTo[W2Grid],
    w2layout: js.Object => CallbackTo[W2Layout],
    w2popup: js.Object => CallbackTo[W2Popup],
    w2sidebar: js.Object => CallbackTo[W2Sidebar],
    w2tabs: js.Object => CallbackTo[W2Tabs],
    w2toolbar: js.Object => CallbackTo[W2Toolbar]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w2form")(js.Any.fromFunction1((t0: js.Object) => w2form(t0).runNow()))
    __obj.updateDynamic("w2grid")(js.Any.fromFunction1((t0: js.Object) => w2grid(t0).runNow()))
    __obj.updateDynamic("w2layout")(js.Any.fromFunction1((t0: js.Object) => w2layout(t0).runNow()))
    __obj.updateDynamic("w2popup")(js.Any.fromFunction1((t0: js.Object) => w2popup(t0).runNow()))
    __obj.updateDynamic("w2sidebar")(js.Any.fromFunction1((t0: js.Object) => w2sidebar(t0).runNow()))
    __obj.updateDynamic("w2tabs")(js.Any.fromFunction1((t0: js.Object) => w2tabs(t0).runNow()))
    __obj.updateDynamic("w2toolbar")(js.Any.fromFunction1((t0: js.Object) => w2toolbar(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

