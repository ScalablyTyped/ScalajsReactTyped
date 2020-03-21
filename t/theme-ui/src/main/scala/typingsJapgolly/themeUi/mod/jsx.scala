package typingsJapgolly.themeUi.mod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.DomElement
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.ReactNode
import typingsJapgolly.themeUi.themeUiStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theme-ui", "jsx")
@js.native
object jsx extends js.Object {
  def apply(`type`: input): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(`type`: input, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(
    `type`: input,
    props: InputHTMLAttributes[typingsJapgolly.std.HTMLInputElement] with ClassAttributes[typingsJapgolly.std.HTMLInputElement],
    children: Node*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply[P /* <: js.Object */](`type`: String): Element = js.native
  def apply[P /* <: js.Object */](`type`: String, children: ReactNode*): Element = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: Node*): Element = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState]): Element = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], children: ReactNode*): Element = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: Node*): Element = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P]): Element = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], children: ReactNode*): Element = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: Node*): Element = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: String, props: ClassAttributes[T] with P, children: Node*): DomElement = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any): DetailedReactHTMLElement[P, T] = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any,
    props: ClassAttributes[T] with P,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: Node*): CElement[P, T] = js.native
}

