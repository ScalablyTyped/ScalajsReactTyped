package typingsJapgolly.jqueryWindow.JQueryWindow

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button definition
trait Button extends js.Object {
  /**
    **/
  var clazz: js.UndefOr[String] = js.undefined
  /**
    **/
  var id: String
  /**
    **/
  var image: String
  /**
    **/
  var style: js.UndefOr[String] = js.undefined
  /**
    **/
  var title: js.UndefOr[String] = js.undefined
  /**
    **/
  def callback(btn: Button, wnd: Window): Unit
}

object Button {
  @scala.inline
  def apply(
    callback: (Button, Window) => Callback,
    id: String,
    image: String,
    clazz: String = null,
    style: String = null,
    title: String = null
  ): Button = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: typingsJapgolly.jqueryWindow.JQueryWindow.Button, t1: typingsJapgolly.jqueryWindow.JQueryWindow.Window) => callback(t0, t1).runNow()))
    if (clazz != null) __obj.updateDynamic("clazz")(clazz.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

