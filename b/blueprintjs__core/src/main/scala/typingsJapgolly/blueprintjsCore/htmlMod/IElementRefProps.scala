package typingsJapgolly.blueprintjsCore.htmlMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementRefProps[E /* <: HTMLElement */] extends js.Object {
  /** Ref handler to access the instance of the internal HTML element. */
  var elementRef: js.UndefOr[js.Function1[/* ref */ E | Null, Unit]] = js.undefined
}

object IElementRefProps {
  @scala.inline
  def apply[E /* <: HTMLElement */](elementRef: /* ref */ E | Null => Callback = null): IElementRefProps[E] = {
    val __obj = js.Dynamic.literal()
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1((t0: /* ref */ E | scala.Null) => elementRef(t0).runNow()))
    __obj.asInstanceOf[IElementRefProps[E]]
  }
}

