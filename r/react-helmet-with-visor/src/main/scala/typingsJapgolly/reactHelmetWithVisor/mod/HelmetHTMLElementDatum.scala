package typingsJapgolly.reactHelmetWithVisor.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLHtmlElement
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLElementDatum extends js.Object {
  def toComponent(): HTMLAttributes[HTMLHtmlElement]
}

object HelmetHTMLElementDatum {
  @scala.inline
  def apply(toComponent: CallbackTo[HTMLAttributes[HTMLHtmlElement]]): HelmetHTMLElementDatum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toComponent")(toComponent.toJsFn)
    __obj.asInstanceOf[HelmetHTMLElementDatum]
  }
}

