package typingsJapgolly.jasmineJquery.jasmine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryEventSpy extends js.Object {
  var eventName: String
  var selector: String
  def handler(eventObject: JQueryEventObject): js.Any
  def reset(): js.Any
}

object JQueryEventSpy {
  @scala.inline
  def apply(
    eventName: String,
    handler: JQueryEventObject => CallbackTo[js.Any],
    reset: CallbackTo[js.Any],
    selector: String
  ): JQueryEventSpy = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("handler")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQueryEventObject) => handler(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[JQueryEventSpy]
  }
}

