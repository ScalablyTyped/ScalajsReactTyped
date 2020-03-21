package typingsJapgolly.jasmineJquery.jasmine

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineJQuery extends js.Object {
  var events: JasmineJQueryEvents
  var matchersClass: js.Any
  def browserTagCaseIndependentHtml(html: String): String
  def elementToString(element: JQuery_[HTMLElement]): String
}

object JasmineJQuery {
  @scala.inline
  def apply(
    browserTagCaseIndependentHtml: String => CallbackTo[String],
    elementToString: JQuery_[HTMLElement] => CallbackTo[String],
    events: JasmineJQueryEvents,
    matchersClass: js.Any
  ): JasmineJQuery = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], matchersClass = matchersClass.asInstanceOf[js.Any])
    __obj.updateDynamic("browserTagCaseIndependentHtml")(js.Any.fromFunction1((t0: java.lang.String) => browserTagCaseIndependentHtml(t0).runNow()))
    __obj.updateDynamic("elementToString")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement]) => elementToString(t0).runNow()))
    __obj.asInstanceOf[JasmineJQuery]
  }
}

