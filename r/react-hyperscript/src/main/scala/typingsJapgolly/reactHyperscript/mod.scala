package typingsJapgolly.reactHyperscript

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentElement
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.reactHyperscript.reactHyperscriptStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Element = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Element]
  inline def apply(children: Children): Element = ^.asInstanceOf[js.Dynamic].apply(children.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply(
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHyperscript.reactHyperscriptStrings.animate, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.circle, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    children: Children
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  // dom elements with attributes
  // dom elements without attributes
  inline def apply(tag: input): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = ^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any]).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(tag: input, attributes: ClassAttributes[HTMLInputElement] & InputHTMLAttributes[HTMLInputElement]): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(
    tag: input,
    attributes: ClassAttributes[HTMLInputElement] & InputHTMLAttributes[HTMLInputElement],
    children: Children
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(tag: input, attributes: Unit, children: Children): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(tag: input, children: Children): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply[P /* <: js.Object */](component: ComponentClassP[P & js.Object]): Element = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: ComponentClassP[P & js.Object], props: P & Attributes, children: Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: ComponentClassP[P & js.Object], props: (P & Attributes) | Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: ComponentClassP[P & js.Object], props: Unit, children: Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: String): Element = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: String, props: P & Attributes, children: Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: String, props: (P & Attributes) | Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: String, props: Unit, children: Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]]): ComponentElement[P, ClassicComponent[P, js.Object]] = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[ComponentElement[P, ClassicComponent[P, js.Object]]]
  inline def apply[P /* <: js.Object */](
    component: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: P & (ClassAttributes[ClassicComponent[P, js.Object]]),
    children: Children
  ): ComponentElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ComponentElement[P, ClassicComponent[P, js.Object]]]
  inline def apply[P /* <: js.Object */](
    component: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: (P & (ClassAttributes[ClassicComponent[P, js.Object]])) | Children
  ): ComponentElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ComponentElement[P, ClassicComponent[P, js.Object]]]
  inline def apply[P /* <: js.Object */](
    component: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: Unit,
    children: Children
  ): ComponentElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ComponentElement[P, ClassicComponent[P, js.Object]]]
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P]): Element = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P], props: P & Attributes, children: Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P], props: (P & Attributes) | Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P], props: Unit, children: Children): Element = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply[T /* <: SVGElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHyperscript.reactHyperscriptStrings.animate, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.circle, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    attributes: ClassAttributes[T] & SVGAttributes[T]
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def apply[T /* <: SVGElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHyperscript.reactHyperscriptStrings.animate, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.circle, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    attributes: ClassAttributes[T] & SVGAttributes[T],
    children: Children
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def apply[T /* <: SVGElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHyperscript.reactHyperscriptStrings.animate, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.circle, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    attributes: Unit,
    children: Children
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def apply[T /* <: HTMLElement */, P /* <: HTMLAttributes[T] */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.reactHyperscript.reactHyperscriptStrings.a, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.abbr, typingsJapgolly.reactHyperscript.reactHyperscriptStrings.address */ Any,
    attributes: ClassAttributes[T] & P,
    children: Children
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  @JSImport("react-hyperscript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Children = js.Array[Node] | Double | String
}
