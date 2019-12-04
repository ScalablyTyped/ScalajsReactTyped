package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButtonOptions
  extends /* attr */ StringDictionary[js.Any] {
  var click: js.UndefOr[js.Function1[/* eventObject */ JQueryEventObject, _]] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var showText: js.UndefOr[String | Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object DialogButtonOptions {
  @scala.inline
  def apply(
    StringDictionary: /* attr */ StringDictionary[js.Any] = null,
    click: /* eventObject */ JQueryEventObject => CallbackTo[js.Any] = null,
    icons: js.Any = null,
    showText: String | Boolean = null,
    text: String = null
  ): DialogButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* eventObject */ typingsJapgolly.jquery.JQueryEventObject) => click(t0).runNow()))
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (showText != null) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogButtonOptions]
  }
}

