package typingsJapgolly.recompose

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[TInner] extends js.Object {
  def children(props: TInner): Element
}

object AnonChildren {
  @scala.inline
  def apply[TInner](children: TInner => CallbackTo[Element]): AnonChildren[TInner] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: TInner) => children(t0).runNow()))
    __obj.asInstanceOf[AnonChildren[TInner]]
  }
}

