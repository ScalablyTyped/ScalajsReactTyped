package typingsJapgolly.clipboard.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.clipboard.clipboardStrings.copy
import typingsJapgolly.clipboard.clipboardStrings.cut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Overwrites default command ('cut' or 'copy').
    * @param elem Current element
    */
  var action: js.UndefOr[js.Function1[/* elem */ Element, cut | copy]] = js.undefined
  /**
    * For use in Bootstrap Modals or with any
    * other library that changes the focus
    * you'll want to set the focused element
    * as the container value.
    */
  var container: js.UndefOr[Element] = js.undefined
  /**
    * Overwrites default target input element.
    * @param elem Current element
    * @returns <input> element to use.
    */
  var target: js.UndefOr[js.Function1[/* elem */ Element, Element]] = js.undefined
  /**
    * Returns the explicit text to copy.
    * @param elem Current element
    * @returns Text to be copied.
    */
  var text: js.UndefOr[js.Function1[/* elem */ Element, String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    action: /* elem */ Element => CallbackTo[cut | copy] = null,
    container: Element = null,
    target: /* elem */ Element => CallbackTo[Element] = null,
    text: /* elem */ Element => CallbackTo[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1((t0: /* elem */ org.scalajs.dom.raw.Element) => action(t0).runNow()))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction1((t0: /* elem */ org.scalajs.dom.raw.Element) => target(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction1((t0: /* elem */ org.scalajs.dom.raw.Element) => text(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

