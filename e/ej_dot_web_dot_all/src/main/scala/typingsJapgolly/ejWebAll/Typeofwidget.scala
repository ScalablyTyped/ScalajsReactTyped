package typingsJapgolly.ejWebAll

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwidget extends js.Object {
  val autoInit: Boolean
  val registeredInstances: js.Array[_]
  val registeredWidgets: js.Array[_]
  def destroyAll(elements: Element): Unit
  def init(element: Element): Unit
  def register(pluginName: String, className: String, prototype: js.Any): Unit
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit
}

object Typeofwidget {
  @scala.inline
  def apply(
    autoInit: Boolean,
    destroyAll: Element => Callback,
    init: Element => Callback,
    register: (String, String, js.Any) => Callback,
    registerInstance: (Element, String, String, js.Any) => Callback,
    registeredInstances: js.Array[_],
    registeredWidgets: js.Array[_]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any], registeredInstances = registeredInstances.asInstanceOf[js.Any], registeredWidgets = registeredWidgets.asInstanceOf[js.Any])
    __obj.updateDynamic("destroyAll")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => destroyAll(t0).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => init(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Any) => register(t0, t1, t2).runNow()))
    __obj.updateDynamic("registerInstance")(js.Any.fromFunction4((t0: org.scalajs.dom.raw.Element, t1: java.lang.String, t2: java.lang.String, t3: js.Any) => registerInstance(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Typeofwidget]
  }
}

