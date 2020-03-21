package typingsJapgolly.reactCloneReferencedElement

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.DomElement
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DOMElement
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ReactElement
import typingsJapgolly.react.mod.ReactHTMLElement
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-clone-referenced-element", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // Custom components
  def default[P](element: FunctionComponentElement[P]): FunctionComponentElement[P] = js.native
  def default[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: Node*): FunctionComponentElement[P] = js.native
  def default[P](element: ReactElement): Element = js.native
  def default[P](element: ReactElement, props: Partial[P] with Attributes, children: Node*): Element = js.native
  def default[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T]): CElement[P, T] = js.native
  def default[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: Node*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def default[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[P, T]): DomElement = js.native
  def default[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: Node*): DomElement = js.native
  // DOM Elements
  // ReactHTMLElement
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T]): DetailedReactHTMLElement[P, T] = js.native
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: Node*): DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement): ReactSVGElement = js.native
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: Node*): ReactSVGElement = js.native
  // ReactHTMLElement, less specific
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T]): ReactHTMLElement[T] = js.native
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: Node*): ReactHTMLElement[T] = js.native
}

