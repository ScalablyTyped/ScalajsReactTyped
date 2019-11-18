package typingsJapgolly.reactDashDom.reactDashDomMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.CElement
import typingsJapgolly.react.reactMod.DOMAttributes
import typingsJapgolly.react.reactMod.DOMElement
import typingsJapgolly.react.reactMod.ReactElement
import typingsJapgolly.react.reactMod.SFCElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def apply(element: js.Array[ReactElement]): (Component[js.Object, js.Object]) | Element | Unit = js.native
  def apply(element: js.Array[ReactElement], container: Null, callback: js.Function0[Unit]): (Component[js.Object, js.Object]) | Element | Unit = js.native
  def apply(element: js.Array[ReactElement], container: typingsJapgolly.std.Element): (Component[js.Object, js.Object]) | Element | Unit = js.native
  def apply(
    element: js.Array[ReactElement],
    container: typingsJapgolly.std.Element,
    callback: js.Function0[Unit]
  ): (Component[js.Object, js.Object]) | Element | Unit = js.native
  def apply(element: SFCElement[_]): Unit = js.native
  def apply(element: SFCElement[_], container: Null, callback: js.Function0[Unit]): Unit = js.native
  def apply(element: SFCElement[_], container: typingsJapgolly.std.Element): Unit = js.native
  def apply(element: SFCElement[_], container: typingsJapgolly.std.Element, callback: js.Function0[Unit]): Unit = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
  // Deprecated(render): The return value is deprecated.
  // In future releases the render function's return type will be void.
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: typingsJapgolly.std.Element): T = js.native
  def apply[T /* <: Element */](
    element: DOMElement[DOMAttributes[T], T],
    container: typingsJapgolly.std.Element,
    callback: js.Function0[Unit]
  ): T = js.native
  def apply[P](element: ReactElement): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: typingsJapgolly.std.Element): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: typingsJapgolly.std.Element, callback: js.Function0[Unit]): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T]): T = js.native
  def apply[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T], container: typingsJapgolly.std.Element): T = js.native
  def apply[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T], container: typingsJapgolly.std.Element, callback: js.Function0[Unit]): T = js.native
}

