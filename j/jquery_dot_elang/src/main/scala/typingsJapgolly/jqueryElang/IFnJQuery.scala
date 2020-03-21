package typingsJapgolly.jqueryElang

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFnJQuery extends js.Object {
  def fnPlugin(
    context: JQuery_[HTMLElement],
    options: js.Any,
    command: String,
    pluginName: String,
    pluginDataAttribute: String
  ): JQuery_[HTMLElement]
}

object IFnJQuery {
  @scala.inline
  def apply(
    fnPlugin: (JQuery_[HTMLElement], js.Any, String, String, String) => CallbackTo[JQuery_[HTMLElement]]
  ): IFnJQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fnPlugin")(js.Any.fromFunction5((t0: typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement], t1: js.Any, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => fnPlugin(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IFnJQuery]
  }
}

