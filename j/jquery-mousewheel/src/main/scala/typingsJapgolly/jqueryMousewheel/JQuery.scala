package typingsJapgolly.jqueryMousewheel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryMousewheel.JQueryMousewheel.JQueryMousewheelEventObject
import typingsJapgolly.jqueryMousewheel.jqueryMousewheelStrings.mousewheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def mousewheel(handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]): JQuery
  @JSName("on")
  def on_mousewheel(
    event: mousewheel,
    handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]
  ): JQuery
  def unmousewheel(): JQuery
}

object JQuery {
  @scala.inline
  def apply(
    mousewheel: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any] => CallbackTo[JQuery],
    on: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, js.Any]) => CallbackTo[JQuery],
    unmousewheel: CallbackTo[JQuery]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mousewheel")(js.Any.fromFunction1((t0: js.Function2[
  /* eventObject */ typingsJapgolly.jqueryMousewheel.JQueryMousewheel.JQueryMousewheelEventObject, 
  /* repeated */ js.Any, 
  js.Any]) => mousewheel(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.jqueryMousewheel.jqueryMousewheelStrings.mousewheel, t1: js.Function2[
  /* eventObject */ typingsJapgolly.jqueryMousewheel.JQueryMousewheel.JQueryMousewheelEventObject, 
  /* repeated */ js.Any, 
  js.Any]) => on(t0, t1).runNow()))
    __obj.updateDynamic("unmousewheel")(unmousewheel.toJsFn)
    __obj.asInstanceOf[JQuery]
  }
}

