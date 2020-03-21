package typingsJapgolly.virtualDom.VirtualDOM

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VHook extends js.Object {
  def hook(node: Element, propertyName: String): Unit
  def unhook(node: Element, propertyName: String): Unit
}

object VHook {
  @scala.inline
  def apply(hook: (Element, String) => Callback, unhook: (Element, String) => Callback): VHook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hook")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: java.lang.String) => hook(t0, t1).runNow()))
    __obj.updateDynamic("unhook")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: java.lang.String) => unhook(t0, t1).runNow()))
    __obj.asInstanceOf[VHook]
  }
}

