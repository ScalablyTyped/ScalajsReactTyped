package typingsJapgolly.reactDom.mod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DOMElement
import typingsJapgolly.react.mod.ReactElement
import typingsJapgolly.react.mod.SFCElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def apply(element: js.Array[DOMElement[DOMAttributes[_], _]]): Element = js.native
  def apply(element: js.Array[DOMElement[DOMAttributes[_], _]], container: Null, callback: js.Function0[Unit]): Element = js.native
  def apply(element: js.Array[DOMElement[DOMAttributes[_], _]], container: typingsJapgolly.std.Element): Element = js.native
  def apply(
    element: js.Array[DOMElement[DOMAttributes[_], _]],
    container: typingsJapgolly.std.Element,
    callback: js.Function0[Unit]
  ): Element = js.native
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

