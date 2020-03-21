package typingsJapgolly.bgiframe.BgiFrame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBgiframe extends js.Object {
  var s: ISettings
  def createIframe(): HTMLElement
  def fire(element: HTMLElement): Unit
  def getIframe(element: HTMLElement): HTMLElement
  def prop(n: js.Any): String
}

object IBgiframe {
  @scala.inline
  def apply(
    createIframe: CallbackTo[HTMLElement],
    fire: HTMLElement => Callback,
    getIframe: HTMLElement => CallbackTo[HTMLElement],
    prop: js.Any => CallbackTo[String],
    s: ISettings
  ): IBgiframe = {
    val __obj = js.Dynamic.literal(s = s.asInstanceOf[js.Any])
    __obj.updateDynamic("createIframe")(createIframe.toJsFn)
    __obj.updateDynamic("fire")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => fire(t0).runNow()))
    __obj.updateDynamic("getIframe")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getIframe(t0).runNow()))
    __obj.updateDynamic("prop")(js.Any.fromFunction1((t0: js.Any) => prop(t0).runNow()))
    __obj.asInstanceOf[IBgiframe]
  }
}

