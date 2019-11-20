package typingsJapgolly.reactDashDom.reactDashDomMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.CElement
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.DOMAttributes
import typingsJapgolly.react.reactMod.DOMElement
import typingsJapgolly.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
@js.native
object unstable_renderSubtreeIntoContainer extends js.Object {
  def apply[T /* <: Element */](
    parentComponent: Component[js.Object, js.Object],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  def apply[T /* <: Element */](
    parentComponent: Component[js.Object, js.Object],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def apply[P](parentComponent: Component[js.Object, js.Object], element: ReactElement, container: Element): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](
    parentComponent: Component[js.Object, js.Object],
    element: ReactElement,
    container: Element,
    callback: js.Function1[
      /* component */ js.UndefOr[
        (typingsJapgolly.react.reactMod.Component[P, ComponentState, _]) | typingsJapgolly.std.Element
      ], 
      _
    ]
  ): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P with js.Object, js.Object] */](parentComponent: Component[js.Object, js.Object], element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: Component[P with js.Object, js.Object] */](
    parentComponent: Component[js.Object, js.Object],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}

