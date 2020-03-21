package typingsJapgolly.chocolatechipjs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtend extends js.Object {
  /**
    * This method adds the provided object to the Array prototype to make it available to all arrays of HTML elements.
    *
    * @param object And object to add to element arrays.
    * @return The extended array of elements.
    */
  def extend(`object`: js.Object): js.Array[HTMLElement]
}

object AnonExtend {
  @scala.inline
  def apply(extend: js.Object => CallbackTo[js.Array[HTMLElement]]): AnonExtend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extend")(js.Any.fromFunction1((t0: js.Object) => extend(t0).runNow()))
    __obj.asInstanceOf[AnonExtend]
  }
}

