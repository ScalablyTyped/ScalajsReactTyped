package typingsJapgolly.reactDashDom.reactDashDomMod

import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.CElement
import typingsJapgolly.react.reactMod.Component
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
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: typingsJapgolly.std.Element
  ): T = js.native
  def apply[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: typingsJapgolly.std.Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def apply[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: typingsJapgolly.std.Element
  ): (japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: typingsJapgolly.std.Element,
    callback: js.Function1[
      /* component */ js.UndefOr[(Component[P, ComponentState, _]) | typingsJapgolly.std.Element], 
      _
    ]
  ): (japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P, T /* <: japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: typingsJapgolly.std.Element
  ): T = js.native
  def apply[P, T /* <: japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: typingsJapgolly.std.Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}

