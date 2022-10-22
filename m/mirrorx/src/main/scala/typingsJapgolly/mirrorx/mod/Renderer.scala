package typingsJapgolly.mirrorx.mod

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.DomElement
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.FunctionComponentElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  def apply(element: js.Array[DomElement]): Element = js.native
  def apply(element: js.Array[DomElement], container: Element): Element = js.native
  def apply(element: js.Array[DomElement], container: Element, callback: js.Function0[Unit]): Element = js.native
  def apply(element: js.Array[DomElement], container: Null, callback: js.Function0[Unit]): Element = js.native
  def apply(element: FunctionComponentElement[Any]): Unit = js.native
  def apply(element: FunctionComponentElement[Any], container: Element): Unit = js.native
  def apply(element: FunctionComponentElement[Any], container: Element, callback: js.Function0[Unit]): Unit = js.native
  def apply(element: FunctionComponentElement[Any], container: Null, callback: js.Function0[Unit]): Unit = js.native
  def apply(
    parentComponent: Component[Any & js.Object, js.Object],
    element: FunctionComponentElement[Any],
    container: Element
  ): Unit = js.native
  def apply(
    parentComponent: Component[Any & js.Object, js.Object],
    element: FunctionComponentElement[Any],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply(
    parentComponent: js.Array[Component[Any & js.Object, js.Object]],
    element: FunctionComponentElement[Any],
    container: Element
  ): Unit = js.native
  def apply(
    parentComponent: js.Array[Component[Any & js.Object, js.Object]],
    element: FunctionComponentElement[Any],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply[T /* <: Element */](element: DomElement): T = js.native
  def apply[T /* <: Element */](element: DomElement, container: Element): T = js.native
  def apply[T /* <: Element */](element: DomElement, container: Element, callback: js.Function0[Unit]): T = js.native
  def apply[T /* <: Element */](element: DomElement, container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[P](element: japgolly.scalajs.react.facade.React.Element): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](element: japgolly.scalajs.react.facade.React.Element, container: Element): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](
    element: japgolly.scalajs.react.facade.React.Element,
    container: Element,
    callback: js.Function0[Unit]
  ): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
  def apply[P](
    element: japgolly.scalajs.react.facade.React.Element,
    container: Null,
    callback: js.Function0[Unit]
  ): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T]): T = js.native
  def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
  def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
}
