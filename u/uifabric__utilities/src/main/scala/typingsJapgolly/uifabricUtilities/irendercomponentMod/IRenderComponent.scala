package typingsJapgolly.uifabricUtilities.irendercomponentMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderComponent[TProps] extends js.Object {
  /**
    * JSX.Element to return in this component's render() function.
    */
  def children(props: TProps): Element
}

object IRenderComponent {
  @scala.inline
  def apply[TProps](children: TProps => CallbackTo[Element]): IRenderComponent[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: TProps) => children(t0).runNow()))
    __obj.asInstanceOf[IRenderComponent[TProps]]
  }
}

