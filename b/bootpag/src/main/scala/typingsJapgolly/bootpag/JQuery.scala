package typingsJapgolly.bootpag

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bootpag.JqueryBootpag.Options
import typingsJapgolly.bootpag.JqueryBootpag.PageEventHandler
import typingsJapgolly.bootpag.bootpagStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /**
    * jQuery Bootpag plugin main method
    */
  def bootpag(options: Options): JQuery
  /**
    * jQuery Bootpag "page" event occurring on page click.
    * @param eventName : always "page"
    * @param handler : A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_page(eventName: page, handler: PageEventHandler): JQuery
}

object JQuery {
  @scala.inline
  def apply(bootpag: Options => CallbackTo[JQuery], on: (page, PageEventHandler) => CallbackTo[JQuery]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootpag")(js.Any.fromFunction1((t0: typingsJapgolly.bootpag.JqueryBootpag.Options) => bootpag(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.bootpag.bootpagStrings.page, t1: typingsJapgolly.bootpag.JqueryBootpag.PageEventHandler) => on(t0, t1).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

