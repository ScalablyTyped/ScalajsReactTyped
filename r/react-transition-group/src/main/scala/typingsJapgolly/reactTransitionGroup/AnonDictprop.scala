package typingsJapgolly.reactTransitionGroup

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictprop
  extends /* prop */ StringDictionary[js.Any] {
  var childFactory: js.UndefOr[js.Function1[/* child */ Element, Element]] = js.undefined
  var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
}

object AnonDictprop {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    childFactory: /* child */ Element => CallbackTo[Element] = null,
    children: Element | js.Array[Element] = null
  ): AnonDictprop = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1((t0: /* child */ japgolly.scalajs.react.raw.React.Element) => childFactory(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictprop]
  }
}

