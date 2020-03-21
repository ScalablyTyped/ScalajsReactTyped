package typingsJapgolly.jqueryElang

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces for jQuery.fn.__plugin
trait IFnNewInstance extends js.Object {
  def createInstance(el: HTMLElement, options: js.Any, pluginName: String): JQuery_[HTMLElement]
}

object IFnNewInstance {
  @scala.inline
  def apply(createInstance: (HTMLElement, js.Any, String) => CallbackTo[JQuery_[HTMLElement]]): IFnNewInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInstance")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Any, t2: java.lang.String) => createInstance(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IFnNewInstance]
  }
}

