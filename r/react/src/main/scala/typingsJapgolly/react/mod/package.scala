package typingsJapgolly.react.mod

import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.DomElement
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.anon.Default
import typingsJapgolly.react.anon.UNDEFINEDVOIDONLY
import typingsJapgolly.react.mod.^
import typingsJapgolly.react.reactStrings.input
import typingsJapgolly.react.reactStrings.mount
import typingsJapgolly.react.reactStrings.update
import typingsJapgolly.scheduler.tracingMod.Interaction
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Fragment: ExoticComponent[typingsJapgolly.react.anon.Children] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[ExoticComponent[typingsJapgolly.react.anon.Children]]

inline def Profiler: ExoticComponent[ProfilerProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Profiler").asInstanceOf[ExoticComponent[ProfilerProps]]

inline def StrictMode: ExoticComponent[typingsJapgolly.react.anon.Children] = ^.asInstanceOf[js.Dynamic].selectDynamic("StrictMode").asInstanceOf[ExoticComponent[typingsJapgolly.react.anon.Children]]

inline def Suspense: ExoticComponent[SuspenseProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Suspense").asInstanceOf[ExoticComponent[SuspenseProps]]

inline def SuspenseList: ExoticComponent[typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SuspenseList").asInstanceOf[ExoticComponent[typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListProps]]

inline def cloneElement[P](element: Element, props: Partial[P] & Attributes, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def cloneElement[P](element: Element, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
// Custom components
inline def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
// DOM Element (has to be the last, because type checking stops at first overload that fits)
inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: DOMAttributes[T] & P, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: Unit, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
inline def cloneElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def cloneElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Unit, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
// DOM Elements
// ReactHTMLElement
inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: Node*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: Node*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
// SVGElement
inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: Node*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: Node*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

// ReactHTMLElement, less specific
inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: Node*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: Node*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]

inline def createContext[T](
  // If you thought this should be optional, see
// https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
defaultValue: T
): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]

inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
  props: (ClassAttributes[ClassicComponent[P, js.Object]]) & P,
  children: Node*
): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
  props: Null,
  children: Node*
): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
  props: Unit,
  children: Node*
): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.react.reactStrings.a_, typingsJapgolly.react.reactStrings.abbr, typingsJapgolly.react.reactStrings.address */ Any,
  props: ClassAttributes[T] & P,
  children: Node*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.react.reactStrings.a_, typingsJapgolly.react.reactStrings.abbr, typingsJapgolly.react.reactStrings.address */ Any,
  props: Null,
  children: Node*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.react.reactStrings.a_, typingsJapgolly.react.reactStrings.abbr, typingsJapgolly.react.reactStrings.address */ Any,
  props: Unit,
  children: Node*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]

inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Null, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Unit, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]

inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: ClassAttributes[T] & P, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Null, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Unit, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]

inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.react.reactStrings.animate, typingsJapgolly.react.reactStrings.circle, typingsJapgolly.react.reactStrings.clipPath */ Any,
  props: ClassAttributes[T] & P,
  children: Node*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.react.reactStrings.animate, typingsJapgolly.react.reactStrings.circle, typingsJapgolly.react.reactStrings.clipPath */ Any,
  props: Null,
  children: Node*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.react.reactStrings.animate, typingsJapgolly.react.reactStrings.circle, typingsJapgolly.react.reactStrings.clipPath */ Any,
  props: Unit,
  children: Node*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

// Custom components
inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]

// DOM Elements
// TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
inline def createElement_input(
  `type`: input,
  props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: Node*
): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Null, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Unit, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]

inline def createFactory(
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.react.reactStrings.animate, typingsJapgolly.react.reactStrings.circle, typingsJapgolly.react.reactStrings.clipPath */ Any
): SVGFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGFactory]
inline def createFactory[P](`type`: ComponentClassP[P & js.Object]): Factory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Factory[P]]
inline def createFactory[P](`type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, ClassicComponent[P, js.Object]]]
// Custom components
inline def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentFactory[P]]
inline def createFactory[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String): DOMFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DOMFactory[P, T]]

inline def createFactory_PTC_CFactory[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C]): CFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, T]]

//
// Top Level API
// ----------------------------------------------------------------------
// DOM Elements
inline def createFactory_T_HTMLFactory[T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.react.reactStrings.a_, typingsJapgolly.react.reactStrings.abbr, typingsJapgolly.react.reactStrings.address */ Any
): HTMLFactory[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[HTMLFactory[T]]

inline def createRef[T](): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefHandle[T]]

inline def experimentalUse[T](usable: typingsJapgolly.react.experimentalMod.reactAugmentingMod.Usable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]

inline def experimentalUseEvent[T /* <: js.Function */](event: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]

inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]

inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]

inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]

inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
inline def memo[T /* <: ComponentType[Any] */](
  Component: T,
  propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
inline def memo[P /* <: js.Object */](Component: FunctionComponent[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
inline def memo[P /* <: js.Object */](
  Component: FunctionComponent[P],
  propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]

inline def startTransition(scope: TransitionFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]

// I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
// useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
/**
  * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
  * has changed.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usecallback
  */
// A specific function type would not trigger implicit any.
// See https://github.com/DefinitelyTyped/DefinitelyTyped/issues/52873#issuecomment-845806435 for a comparison between `Function` and more specific types.
// tslint:disable-next-line ban-types
inline def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

// This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
/**
  * Accepts a context object (the value returned from `React.createContext`) and returns the current
  * context value, as given by the nearest context provider for the given context.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usecontext
  */
inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
  *
  * NOTE: We don’t recommend adding debug values to every custom hook.
  * It’s most valuable for custom hooks that are part of shared libraries.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
  */
// the name of the custom hook is itself derived from the function name at runtime:
// it's just the function name without the "use" prefix.
inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useeffect
  */
inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]

inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
// NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
/**
  * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
  * `ref`. As always, imperative code using refs should be avoided in most cases.
  *
  * `useImperativeHandle` should be used with `React.forwardRef`.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
  */
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useInsertionEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
  * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
  * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
  *
  * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
  *
  * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
  * `componentDidMount` and `componentDidUpdate`.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
  */
inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usememo
  */
// allow undefined, but don't make it optional as that is very likely a mistake
inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
// The Flow types do have an overload for 3-ary invocation with undefined initializer.
// NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
// supertype between the reducer's return type and the initialState (or the initializer's return type),
// which would prevent autocompletion from ever working.
// TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
// in older versions, or a regression in newer versions of the typescript completion service.
inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// overload where dispatch could accept 0 arguments.
inline def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// overload where dispatch could accept 0 arguments.
// overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
// If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
// the last overload effectively behaves as if the identity function (x => x) is the initializer.
// overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
inline def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
  reducer: R,
  initializerArg: (I & ReducerState[R]) | I,
  initializer: js.Function1[
  (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
  ReducerState[R] | ReducerStateWithoutAction[R]
]
): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]

// convenience overload for refs given as a ref prop as they typically start with a null value
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
  * of the generic argument.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
inline def useRef[T](): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefHandle[T]]
inline def useRef[T](initialValue: T): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefHandle[T]]

// convenience overload for potentially undefined initialValue / call with 0 arguments
// has a default to stop it from defaulting to {} instead
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
inline def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
inline def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]

// convenience overload when first argument is omitted
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usestate
  */
inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usestate
  */
inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def useSyncExternalStore[Snapshot](
  subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
  getSnapshot: js.Function0[Snapshot]
): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
inline def useSyncExternalStore[Snapshot](
  subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
  getSnapshot: js.Function0[Snapshot],
  getServerSnapshot: js.Function0[Snapshot]
): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]

inline def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[Boolean, TransitionStartFunction]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AnimationEventHandler[T] = EventHandler[ReactAnimationEventFrom[T & org.scalajs.dom.Element]]

// All the WAI-ARIA 1.1 role attribute values from https://www.w3.org/TR/wai-aria-1.1/#role_definitions
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.reactStrings.alert
  - typingsJapgolly.react.reactStrings.alertdialog
  - typingsJapgolly.react.reactStrings.application
  - typingsJapgolly.react.reactStrings.article
  - typingsJapgolly.react.reactStrings.banner
  - typingsJapgolly.react.reactStrings.button
  - typingsJapgolly.react.reactStrings.cell
  - typingsJapgolly.react.reactStrings.checkbox
  - typingsJapgolly.react.reactStrings.columnheader
  - typingsJapgolly.react.reactStrings.combobox
  - typingsJapgolly.react.reactStrings.complementary
  - typingsJapgolly.react.reactStrings.contentinfo
  - typingsJapgolly.react.reactStrings.definition
  - typingsJapgolly.react.reactStrings.dialog
  - typingsJapgolly.react.reactStrings.directory
  - typingsJapgolly.react.reactStrings.document
  - typingsJapgolly.react.reactStrings.feed
  - typingsJapgolly.react.reactStrings.figure
  - typingsJapgolly.react.reactStrings.form
  - typingsJapgolly.react.reactStrings.grid
  - typingsJapgolly.react.reactStrings.gridcell
  - typingsJapgolly.react.reactStrings.group
  - typingsJapgolly.react.reactStrings.heading
  - typingsJapgolly.react.reactStrings.img
  - typingsJapgolly.react.reactStrings.link
  - typingsJapgolly.react.reactStrings.list
  - typingsJapgolly.react.reactStrings.listbox
  - typingsJapgolly.react.reactStrings.listitem
  - typingsJapgolly.react.reactStrings.log
  - typingsJapgolly.react.reactStrings.main
  - typingsJapgolly.react.reactStrings.marquee
  - typingsJapgolly.react.reactStrings.math
  - typingsJapgolly.react.reactStrings.menu
  - typingsJapgolly.react.reactStrings.menubar
  - typingsJapgolly.react.reactStrings.menuitem
  - typingsJapgolly.react.reactStrings.menuitemcheckbox
  - typingsJapgolly.react.reactStrings.menuitemradio
  - typingsJapgolly.react.reactStrings.navigation
  - typingsJapgolly.react.reactStrings.none
  - typingsJapgolly.react.reactStrings.note
  - typingsJapgolly.react.reactStrings.option
  - typingsJapgolly.react.reactStrings.presentation
  - typingsJapgolly.react.reactStrings.progressbar
  - typingsJapgolly.react.reactStrings.radio
  - typingsJapgolly.react.reactStrings.radiogroup
  - typingsJapgolly.react.reactStrings.region
  - typingsJapgolly.react.reactStrings.row
  - typingsJapgolly.react.reactStrings.rowgroup
  - typingsJapgolly.react.reactStrings.rowheader
  - typingsJapgolly.react.reactStrings.scrollbar
  - typingsJapgolly.react.reactStrings.search
  - typingsJapgolly.react.reactStrings.searchbox
  - typingsJapgolly.react.reactStrings.separator
  - typingsJapgolly.react.reactStrings.slider
  - typingsJapgolly.react.reactStrings.spinbutton
  - typingsJapgolly.react.reactStrings.status
  - typingsJapgolly.react.reactStrings.switch
  - typingsJapgolly.react.reactStrings.tab
  - typingsJapgolly.react.reactStrings.table
  - typingsJapgolly.react.reactStrings.tablist
  - typingsJapgolly.react.reactStrings.tabpanel
  - typingsJapgolly.react.reactStrings.term
  - typingsJapgolly.react.reactStrings.textbox
  - typingsJapgolly.react.reactStrings.timer
  - typingsJapgolly.react.reactStrings.toolbar
  - typingsJapgolly.react.reactStrings.tooltip
  - typingsJapgolly.react.reactStrings.tree
  - typingsJapgolly.react.reactStrings.treegrid
  - typingsJapgolly.react.reactStrings.treeitem
  - java.lang.String
*/
type AriaRole = _AriaRole | String

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type Booleanish = Boolean

type CElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */] = ComponentElement[P, T]

type CFactory[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */] = ComponentFactory[P, T]

type ChangeEventHandler[T] = EventHandler[ReactEventFrom[T & org.scalajs.dom.Element]]

/**
  * We use an intersection type to infer multiple type parameters from
  * a single argument, which is useful for many top-level API defs.
  * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
  */
type ClassType[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */] = C & (Instantiable2[/* props */ P, /* context */ js.UndefOr[Any], T])

type ClassicElement[P] = CElement[P, ClassicComponent[P, js.Object]]

type ClassicFactory[P] = CFactory[P, ClassicComponent[P, js.Object]]

type ClipboardEventHandler[T] = EventHandler[ReactClipboardEventFrom[T & org.scalajs.dom.Element]]

type ComponentPropsWithoutRef[T /* <: japgolly.scalajs.react.facade.React.ElementType */] = PropsWithoutRef[ComponentProps[T]]

type ComponentState = Any

type ComponentType[P] = (ComponentClassP[P & js.Object]) | FunctionComponent[P]

type CompositionEventHandler[T] = EventHandler[ReactCompositionEventFrom[T & org.scalajs.dom.Element]]

type Consumer[T] = ExoticComponent[ConsumerProps[T]]

type DependencyList = js.Array[Any]

// Destructors are only allowed to return void.
type Destructor = js.Function0[Unit | UNDEFINEDVOIDONLY]

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

// this technically does accept a second argument, but it's already under a deprecation warning
// and it's not even released so probably better to not define it.
type Dispatch[A] = js.Function1[/* value */ A, Unit]

// Since action _can_ be undefined, dispatch may be called without any parameters.
type DispatchWithoutAction = js.Function0[Unit]

type DragEventHandler[T] = EventHandler[ReactDragEventFrom[T & org.scalajs.dom.Element]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
type EffectCallback = js.Function0[Unit | Destructor]

//
// React Elements
// ----------------------------------------------------------------------
type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: P extends react.react.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'] */ js.Any) | ComponentType[P]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: ReactEventFrom[Any & org.scalajs.dom.Element] */] = js.Function1[/* event */ E, Unit]

type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any

//
// Class Interfaces
// ----------------------------------------------------------------------
type FC[P] = FunctionComponent[P]

type FocusEventHandler[T] = EventHandler[ReactFocusEventFrom[T & org.scalajs.dom.Element]]

type FormEvent[T] = ReactEventFrom[T & org.scalajs.dom.Element]

type FormEventHandler[T] = EventHandler[ReactEventFrom[T & org.scalajs.dom.Element]]

type ForwardedRef[T] = (js.Function1[/* instance */ T | Null, Unit]) | (MutableRefObject[T | Null]) | Null

type GetDerivedStateFromError[P, S] = /**
  * This lifecycle is invoked after an error has been thrown by a descendant component.
  * It receives the error that was thrown as a parameter and should return a value to update state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function1[/* error */ Any, Partial[S] | Null]

type GetDerivedStateFromProps[P, S] = /**
  * Returns an update to a component's state based on its new props and old state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function2[/* nextProps */ P, /* prevState */ S, Partial[S] | Null]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.reactStrings._self
  - typingsJapgolly.react.reactStrings._blank
  - typingsJapgolly.react.reactStrings._parent
  - typingsJapgolly.react.reactStrings._top
  - java.lang.String
*/
type HTMLAttributeAnchorTarget = _HTMLAttributeAnchorTarget | String

type HTMLFactory[T /* <: HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.reactStrings.button
  - typingsJapgolly.react.reactStrings.checkbox
  - typingsJapgolly.react.reactStrings.color
  - typingsJapgolly.react.reactStrings.date
  - typingsJapgolly.react.reactStrings.`datetime-local`
  - typingsJapgolly.react.reactStrings.email
  - typingsJapgolly.react.reactStrings.file
  - typingsJapgolly.react.reactStrings.hidden
  - typingsJapgolly.react.reactStrings.image
  - typingsJapgolly.react.reactStrings.month
  - typingsJapgolly.react.reactStrings.number
  - typingsJapgolly.react.reactStrings.password
  - typingsJapgolly.react.reactStrings.radio
  - typingsJapgolly.react.reactStrings.range
  - typingsJapgolly.react.reactStrings.reset
  - typingsJapgolly.react.reactStrings.search
  - typingsJapgolly.react.reactStrings.submit
  - typingsJapgolly.react.reactStrings.tel
  - typingsJapgolly.react.reactStrings.text
  - typingsJapgolly.react.reactStrings.time
  - typingsJapgolly.react.reactStrings.url
  - typingsJapgolly.react.reactStrings.week
  - java.lang.String
*/
type HTMLInputTypeAttribute = _HTMLInputTypeAttribute | String

type JSXElementConstructor[P] = (js.Function1[/* props */ P, Element | Null]) | (Instantiable1[
/* props */ P, 
japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]])

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[ReactKeyboardEventFrom[T & org.scalajs.dom.Element]]

type LegacyRef[T] = String | Ref[T]

type MouseEventHandler[T] = EventHandler[ReactMouseEventFrom[T & org.scalajs.dom.Element]]

type NativeAnimationEvent = org.scalajs.dom.AnimationEvent

type NativeClipboardEvent = org.scalajs.dom.ClipboardEvent

type NativeCompositionEvent = org.scalajs.dom.CompositionEvent

type NativeDragEvent = org.scalajs.dom.DragEvent

type NativeFocusEvent = org.scalajs.dom.FocusEvent

type NativeKeyboardEvent = org.scalajs.dom.KeyboardEvent

type NativeMouseEvent = org.scalajs.dom.MouseEvent

type NativePointerEvent = org.scalajs.dom.PointerEvent

type NativeTouchEvent = org.scalajs.dom.TouchEvent

type NativeTransitionEvent = org.scalajs.dom.TransitionEvent

type NativeUIEvent = org.scalajs.dom.UIEvent

type NativeWheelEvent = org.scalajs.dom.WheelEvent

type NotExactlyAnyPropertyKeys[T] = Exclude[/* keyof T */ String, ExactlyAnyPropertyKeys[T]]

type PointerEventHandler[T] = EventHandler[ReactPointerEventFrom[T & org.scalajs.dom.Element]]

/**
  * {@link https://reactjs.org/docs/profiler.html#onrender-callback Profiler API}
  */
type ProfilerOnRenderCallback = js.Function7[
/* id */ String, 
/* phase */ mount | update, 
/* actualDuration */ Double, 
/* baseDuration */ Double, 
/* startTime */ Double, 
/* commitTime */ Double, 
/* interactions */ Set[Interaction], 
Unit]

type PropsWithChildren[P] = P & typingsJapgolly.react.anon.Children

// NOTE: only the Context object itself can get a displayName
// https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
type Provider[T] = ProviderExoticComponent[ProviderProps[T]]

/**
  * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
  */
type ReactChild = Element | String | Double

type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.react.reactStrings.a_, typingsJapgolly.react.reactStrings.abbr, typingsJapgolly.react.reactStrings.address */ Any */, P] = Element

type ReactEventHandler[T] = EventHandler[ReactEventFrom[T & org.scalajs.dom.Element]]

type ReactFragment = js.Iterable[Node]

// ReactHTML for ReactHTMLElement
type ReactHTMLElement[T /* <: HTMLElement */] = DetailedReactHTMLElement[AllHTMLAttributes[T], T]

//
// Component API
// ----------------------------------------------------------------------
type ReactInstance = (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | org.scalajs.dom.Element

type ReactNode = js.UndefOr[Element | String | Double | Any | ReactPortal | Boolean]

/**
  * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
  */
type ReactText = String | Double

// Unlike redux, the actions _can_ be anything
type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]

// If useReducer accepts a reducer without action, dispatch may be called without any parameters.
type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]

type Ref[T] = RefFn[T] | RefHandle[T] | Null

// Bivariance hack for consistent unsoundness with RefObject
type RefCallback[T] = js.Function1[/* instance */ T | Null, Unit]

type Requireable[T] = typingsJapgolly.propTypes.mod.Requireable[T]

/**
  * @deprecated Please use `FunctionComponentFactory`
  */
type SFCFactory[P] = FunctionComponentFactory[P]

//
// React Hooks
// ----------------------------------------------------------------------
// based on the code in https://github.com/facebook/react/pull/13968
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

/**
  * currentTarget - a reference to the element on which the event listener is registered.
  *
  * target - a reference to the element from which the event was originally dispatched.
  * This might be a child element to the element on which the event listener is registered.
  * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/issues/11508#issuecomment-256045682
  */
type SyntheticEvent[T, E] = ReactEventFrom[EventTarget & T & org.scalajs.dom.Element]

type TouchEventHandler[T] = EventHandler[ReactTouchEventFrom[T & org.scalajs.dom.Element]]

type TransitionEventHandler[T] = EventHandler[ReactTransitionEventFrom[T & org.scalajs.dom.Element]]

type TransitionFunction = js.Function0[VoidOrUndefinedOnly]

type TransitionStartFunction = js.Function1[/* callback */ TransitionFunction, Unit]

type UIEventHandler[T] = EventHandler[ReactUIEventFrom[T & org.scalajs.dom.Element]]

/**
  * @deprecated - Equivalent with `React.FC`.
  */
type VFC[P] = VoidFunctionComponent[P]

type ValidationMap[T] = typingsJapgolly.propTypes.mod.ValidationMap[T]

//
// React.PropTypes
// ----------------------------------------------------------------------
type Validator[T] = typingsJapgolly.propTypes.mod.Validator[T]

type VoidOrUndefinedOnly = Unit | UNDEFINEDVOIDONLY

type WheelEventHandler[T] = EventHandler[ReactWheelEventFrom[T & org.scalajs.dom.Element]]
