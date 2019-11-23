package typingsJapgolly.atEmotionCore.atEmotionCoreMod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.DomElement
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.atEmotionCore.atEmotionCoreStrings.input
import typingsJapgolly.react.reactMod.Attributes
import typingsJapgolly.react.reactMod.CElement
import typingsJapgolly.react.reactMod.ClassAttributes
import typingsJapgolly.react.reactMod.ClassType
import typingsJapgolly.react.reactMod.ClassicComponent
import typingsJapgolly.react.reactMod.ClassicComponentClass
import typingsJapgolly.react.reactMod.ComponentClass
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.DOMAttributes
import typingsJapgolly.react.reactMod.DetailedReactHTMLElement
import typingsJapgolly.react.reactMod.FunctionComponent
import typingsJapgolly.react.reactMod.FunctionComponentElement
import typingsJapgolly.react.reactMod.InputHTMLAttributes
import typingsJapgolly.react.reactMod.ReactNode
import typingsJapgolly.react.reactMod.ReactSVGElement
import typingsJapgolly.react.reactMod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/core", "jsx")
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
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P]): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: Node*): FunctionComponentElement[P] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: String, props: ClassAttributes[T] with P, children: Node*): DomElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    children: ReactNode*
  ): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: Node*
  ): ReactSVGElement = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: Node*): CElement[P, T] = js.native
}

