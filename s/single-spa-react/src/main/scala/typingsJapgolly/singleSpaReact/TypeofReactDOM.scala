package typingsJapgolly.singleSpaReact

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DOMElement
import typingsJapgolly.react.mod.ReactElement
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.reactDom.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactDOM extends js.Object {
  val hydrate: Renderer = js.native
  val render: Renderer = js.native
  val version: String = js.native
  def createPortal(children: Node, container: Element): ReactPortal = js.native
  def createPortal(children: Node, container: Element, key: String): ReactPortal = js.native
  def findDOMNode(): Element | Null | Text = js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
  def unstable_batchedUpdates(callback: js.Function0[_]): Unit = js.native
  def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
  def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[js.Object, js.Object],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[js.Object, js.Object],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P](parentComponent: Component[js.Object, js.Object], element: ReactElement, container: Element): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: Component[js.Object, js.Object],
    element: ReactElement,
    container: Element,
    callback: js.Function1[
      /* component */ js.UndefOr[
        (typingsJapgolly.react.mod.Component[P, ComponentState, _]) | typingsJapgolly.std.Element
      ], 
      _
    ]
  ): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P with js.Object, js.Object] */](parentComponent: Component[js.Object, js.Object], element: CElement[P, T], container: Element): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P with js.Object, js.Object] */](
    parentComponent: Component[js.Object, js.Object],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}

