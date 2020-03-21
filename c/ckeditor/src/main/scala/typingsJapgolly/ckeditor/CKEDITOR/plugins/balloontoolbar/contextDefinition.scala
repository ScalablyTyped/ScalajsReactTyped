package typingsJapgolly.ckeditor.CKEDITOR.plugins.balloontoolbar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditor.CKEDITOR.dom.element
import typingsJapgolly.ckeditor.CKEDITOR.dom.elementPath
import typingsJapgolly.ckeditor.CKEDITOR.dom.selection
import typingsJapgolly.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait contextDefinition extends js.Object {
  var cssSelector: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var refresh: js.UndefOr[
    js.Function3[/* editor */ editor, /* path */ elementPath, /* selection */ selection, element]
  ] = js.undefined
  var widgets: js.UndefOr[js.Array[String] | String] = js.undefined
}

object contextDefinition {
  @scala.inline
  def apply(
    cssSelector: String = null,
    priority: Int | Double = null,
    refresh: (/* editor */ editor, /* path */ elementPath, /* selection */ selection) => CallbackTo[element] = null,
    widgets: js.Array[String] | String = null
  ): contextDefinition = {
    val __obj = js.Dynamic.literal()
    if (cssSelector != null) __obj.updateDynamic("cssSelector")(cssSelector.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction3((t0: /* editor */ typingsJapgolly.ckeditor.CKEDITOR.editor, t1: /* path */ typingsJapgolly.ckeditor.CKEDITOR.dom.elementPath, t2: /* selection */ typingsJapgolly.ckeditor.CKEDITOR.dom.selection) => refresh(t0, t1, t2).runNow()))
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[contextDefinition]
  }
}

