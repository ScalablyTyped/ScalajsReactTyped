package typingsJapgolly.reactHelmetWithVisor.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLBodyElement
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLBodyDatum extends js.Object {
  def toComponent(): HTMLAttributes[HTMLBodyElement]
}

object HelmetHTMLBodyDatum {
  @scala.inline
  def apply(toComponent: CallbackTo[HTMLAttributes[HTMLBodyElement]]): HelmetHTMLBodyDatum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toComponent")(toComponent.toJsFn)
    __obj.asInstanceOf[HelmetHTMLBodyDatum]
  }
}

