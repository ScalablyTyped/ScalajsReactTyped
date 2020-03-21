package typingsJapgolly.jqueryNotify

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryNotifyInstance extends js.Object {
  var element: JQuery
  var isOpen: Boolean
  var options: JQueryNotifyOptions
  def close(): Unit
  def open(): Unit
}

object JQueryNotifyInstance {
  @scala.inline
  def apply(close: Callback, element: JQuery, isOpen: Boolean, open: Callback, options: JQueryNotifyOptions): JQueryNotifyInstance = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.asInstanceOf[JQueryNotifyInstance]
  }
}

