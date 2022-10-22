package typingsJapgolly.reachUtils

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.BeforeUnloadEvent
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DeviceMotionEvent
import org.scalajs.dom.DeviceOrientationEvent
import org.scalajs.dom.Document
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.GamepadEvent
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLAreaElement
import org.scalajs.dom.HTMLAudioElement
import org.scalajs.dom.HTMLBRElement
import org.scalajs.dom.HTMLBaseElement
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLDListElement
import org.scalajs.dom.HTMLDataListElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLEmbedElement
import org.scalajs.dom.HTMLFieldSetElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLHRElement
import org.scalajs.dom.HTMLHeadElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLHtmlElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.HTMLLegendElement
import org.scalajs.dom.HTMLLinkElement
import org.scalajs.dom.HTMLMapElement
import org.scalajs.dom.HTMLMenuElement
import org.scalajs.dom.HTMLMetaElement
import org.scalajs.dom.HTMLModElement
import org.scalajs.dom.HTMLOListElement
import org.scalajs.dom.HTMLObjectElement
import org.scalajs.dom.HTMLOptGroupElement
import org.scalajs.dom.HTMLOptionElement
import org.scalajs.dom.HTMLParagraphElement
import org.scalajs.dom.HTMLPreElement
import org.scalajs.dom.HTMLProgressElement
import org.scalajs.dom.HTMLQuoteElement
import org.scalajs.dom.HTMLScriptElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLSourceElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.HTMLStyleElement
import org.scalajs.dom.HTMLTableCaptionElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.HTMLTableColElement
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableSectionElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalajs.dom.HTMLTitleElement
import org.scalajs.dom.HTMLTrackElement
import org.scalajs.dom.HTMLUListElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.HashChangeEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.PopStateEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.SVGCircleElement
import org.scalajs.dom.SVGClipPathElement
import org.scalajs.dom.SVGDefsElement
import org.scalajs.dom.SVGDescElement
import org.scalajs.dom.SVGEllipseElement
import org.scalajs.dom.SVGFEBlendElement
import org.scalajs.dom.SVGFEColorMatrixElement
import org.scalajs.dom.SVGFEComponentTransferElement
import org.scalajs.dom.SVGFECompositeElement
import org.scalajs.dom.SVGFEConvolveMatrixElement
import org.scalajs.dom.SVGFEDiffuseLightingElement
import org.scalajs.dom.SVGFEDisplacementMapElement
import org.scalajs.dom.SVGFEDistantLightElement
import org.scalajs.dom.SVGFEFloodElement
import org.scalajs.dom.SVGFEFuncAElement
import org.scalajs.dom.SVGFEFuncBElement
import org.scalajs.dom.SVGFEFuncGElement
import org.scalajs.dom.SVGFEFuncRElement
import org.scalajs.dom.SVGFEGaussianBlurElement
import org.scalajs.dom.SVGFEImageElement
import org.scalajs.dom.SVGFEMergeElement
import org.scalajs.dom.SVGFEMergeNodeElement
import org.scalajs.dom.SVGFEMorphologyElement
import org.scalajs.dom.SVGFEOffsetElement
import org.scalajs.dom.SVGFEPointLightElement
import org.scalajs.dom.SVGFESpecularLightingElement
import org.scalajs.dom.SVGFESpotLightElement
import org.scalajs.dom.SVGFETileElement
import org.scalajs.dom.SVGFETurbulenceElement
import org.scalajs.dom.SVGFilterElement
import org.scalajs.dom.SVGGElement
import org.scalajs.dom.SVGImageElement
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGLinearGradientElement
import org.scalajs.dom.SVGMarkerElement
import org.scalajs.dom.SVGMaskElement
import org.scalajs.dom.SVGMetadataElement
import org.scalajs.dom.SVGPathElement
import org.scalajs.dom.SVGPatternElement
import org.scalajs.dom.SVGPolygonElement
import org.scalajs.dom.SVGPolylineElement
import org.scalajs.dom.SVGRadialGradientElement
import org.scalajs.dom.SVGRectElement
import org.scalajs.dom.SVGSVGElement
import org.scalajs.dom.SVGStopElement
import org.scalajs.dom.SVGSwitchElement
import org.scalajs.dom.SVGSymbolElement
import org.scalajs.dom.SVGTSpanElement
import org.scalajs.dom.SVGTextElement
import org.scalajs.dom.SVGTextPathElement
import org.scalajs.dom.SVGUseElement
import org.scalajs.dom.SVGViewElement
import org.scalajs.dom.StorageEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import org.scalajs.dom.Window
import typingsJapgolly.reachUtils.anon.CalledFrom
import typingsJapgolly.reachUtils.anon.Height
import typingsJapgolly.reachUtils.anon.ScrollX
import typingsJapgolly.reachUtils.reachUtilsStrings.DOMContentLoaded
import typingsJapgolly.reachUtils.reachUtilsStrings.abort
import typingsJapgolly.reachUtils.reachUtilsStrings.afterprint
import typingsJapgolly.reachUtils.reachUtilsStrings.animationcancel
import typingsJapgolly.reachUtils.reachUtilsStrings.animationend
import typingsJapgolly.reachUtils.reachUtilsStrings.animationiteration
import typingsJapgolly.reachUtils.reachUtilsStrings.animationstart
import typingsJapgolly.reachUtils.reachUtilsStrings.auxclick
import typingsJapgolly.reachUtils.reachUtilsStrings.beforeinput
import typingsJapgolly.reachUtils.reachUtilsStrings.beforeprint
import typingsJapgolly.reachUtils.reachUtilsStrings.beforeunload
import typingsJapgolly.reachUtils.reachUtilsStrings.blur
import typingsJapgolly.reachUtils.reachUtilsStrings.canplay
import typingsJapgolly.reachUtils.reachUtilsStrings.canplaythrough
import typingsJapgolly.reachUtils.reachUtilsStrings.change
import typingsJapgolly.reachUtils.reachUtilsStrings.click
import typingsJapgolly.reachUtils.reachUtilsStrings.close
import typingsJapgolly.reachUtils.reachUtilsStrings.compositionend
import typingsJapgolly.reachUtils.reachUtilsStrings.compositionstart
import typingsJapgolly.reachUtils.reachUtilsStrings.compositionupdate
import typingsJapgolly.reachUtils.reachUtilsStrings.contextmenu
import typingsJapgolly.reachUtils.reachUtilsStrings.cuechange
import typingsJapgolly.reachUtils.reachUtilsStrings.dblclick
import typingsJapgolly.reachUtils.reachUtilsStrings.devicemotion
import typingsJapgolly.reachUtils.reachUtilsStrings.deviceorientation
import typingsJapgolly.reachUtils.reachUtilsStrings.drag
import typingsJapgolly.reachUtils.reachUtilsStrings.dragend
import typingsJapgolly.reachUtils.reachUtilsStrings.dragenter
import typingsJapgolly.reachUtils.reachUtilsStrings.dragleave
import typingsJapgolly.reachUtils.reachUtilsStrings.dragover
import typingsJapgolly.reachUtils.reachUtilsStrings.dragstart
import typingsJapgolly.reachUtils.reachUtilsStrings.drop
import typingsJapgolly.reachUtils.reachUtilsStrings.durationchange
import typingsJapgolly.reachUtils.reachUtilsStrings.emptied
import typingsJapgolly.reachUtils.reachUtilsStrings.ended
import typingsJapgolly.reachUtils.reachUtilsStrings.error
import typingsJapgolly.reachUtils.reachUtilsStrings.focus
import typingsJapgolly.reachUtils.reachUtilsStrings.focusin
import typingsJapgolly.reachUtils.reachUtilsStrings.focusout
import typingsJapgolly.reachUtils.reachUtilsStrings.formdata
import typingsJapgolly.reachUtils.reachUtilsStrings.gamepadconnected
import typingsJapgolly.reachUtils.reachUtilsStrings.gamepaddisconnected
import typingsJapgolly.reachUtils.reachUtilsStrings.gotpointercapture
import typingsJapgolly.reachUtils.reachUtilsStrings.hashchange
import typingsJapgolly.reachUtils.reachUtilsStrings.input
import typingsJapgolly.reachUtils.reachUtilsStrings.invalid
import typingsJapgolly.reachUtils.reachUtilsStrings.keydown
import typingsJapgolly.reachUtils.reachUtilsStrings.keypress
import typingsJapgolly.reachUtils.reachUtilsStrings.keyup
import typingsJapgolly.reachUtils.reachUtilsStrings.languagechange
import typingsJapgolly.reachUtils.reachUtilsStrings.load
import typingsJapgolly.reachUtils.reachUtilsStrings.loadeddata
import typingsJapgolly.reachUtils.reachUtilsStrings.loadedmetadata
import typingsJapgolly.reachUtils.reachUtilsStrings.loadstart
import typingsJapgolly.reachUtils.reachUtilsStrings.lostpointercapture
import typingsJapgolly.reachUtils.reachUtilsStrings.message
import typingsJapgolly.reachUtils.reachUtilsStrings.messageerror
import typingsJapgolly.reachUtils.reachUtilsStrings.mousedown
import typingsJapgolly.reachUtils.reachUtilsStrings.mouseenter
import typingsJapgolly.reachUtils.reachUtilsStrings.mouseleave
import typingsJapgolly.reachUtils.reachUtilsStrings.mousemove
import typingsJapgolly.reachUtils.reachUtilsStrings.mouseout
import typingsJapgolly.reachUtils.reachUtilsStrings.mouseover
import typingsJapgolly.reachUtils.reachUtilsStrings.mouseup
import typingsJapgolly.reachUtils.reachUtilsStrings.offline
import typingsJapgolly.reachUtils.reachUtilsStrings.online
import typingsJapgolly.reachUtils.reachUtilsStrings.orientationchange
import typingsJapgolly.reachUtils.reachUtilsStrings.pagehide
import typingsJapgolly.reachUtils.reachUtilsStrings.pageshow
import typingsJapgolly.reachUtils.reachUtilsStrings.pause
import typingsJapgolly.reachUtils.reachUtilsStrings.play
import typingsJapgolly.reachUtils.reachUtilsStrings.playing
import typingsJapgolly.reachUtils.reachUtilsStrings.pointercancel
import typingsJapgolly.reachUtils.reachUtilsStrings.pointerdown
import typingsJapgolly.reachUtils.reachUtilsStrings.pointerenter
import typingsJapgolly.reachUtils.reachUtilsStrings.pointerleave
import typingsJapgolly.reachUtils.reachUtilsStrings.pointermove
import typingsJapgolly.reachUtils.reachUtilsStrings.pointerout
import typingsJapgolly.reachUtils.reachUtilsStrings.pointerover
import typingsJapgolly.reachUtils.reachUtilsStrings.pointerup
import typingsJapgolly.reachUtils.reachUtilsStrings.popstate
import typingsJapgolly.reachUtils.reachUtilsStrings.progress
import typingsJapgolly.reachUtils.reachUtilsStrings.ratechange
import typingsJapgolly.reachUtils.reachUtilsStrings.rejectionhandled
import typingsJapgolly.reachUtils.reachUtilsStrings.reset
import typingsJapgolly.reachUtils.reachUtilsStrings.resize
import typingsJapgolly.reachUtils.reachUtilsStrings.scroll
import typingsJapgolly.reachUtils.reachUtilsStrings.securitypolicyviolation
import typingsJapgolly.reachUtils.reachUtilsStrings.seeked
import typingsJapgolly.reachUtils.reachUtilsStrings.seeking
import typingsJapgolly.reachUtils.reachUtilsStrings.select
import typingsJapgolly.reachUtils.reachUtilsStrings.selectionchange
import typingsJapgolly.reachUtils.reachUtilsStrings.selectstart
import typingsJapgolly.reachUtils.reachUtilsStrings.slotchange
import typingsJapgolly.reachUtils.reachUtilsStrings.stalled
import typingsJapgolly.reachUtils.reachUtilsStrings.storage
import typingsJapgolly.reachUtils.reachUtilsStrings.submit
import typingsJapgolly.reachUtils.reachUtilsStrings.suspend
import typingsJapgolly.reachUtils.reachUtilsStrings.timeupdate
import typingsJapgolly.reachUtils.reachUtilsStrings.toggle
import typingsJapgolly.reachUtils.reachUtilsStrings.touchcancel
import typingsJapgolly.reachUtils.reachUtilsStrings.touchend
import typingsJapgolly.reachUtils.reachUtilsStrings.touchmove
import typingsJapgolly.reachUtils.reachUtilsStrings.touchstart
import typingsJapgolly.reachUtils.reachUtilsStrings.transitioncancel
import typingsJapgolly.reachUtils.reachUtilsStrings.transitionend
import typingsJapgolly.reachUtils.reachUtilsStrings.transitionrun
import typingsJapgolly.reachUtils.reachUtilsStrings.transitionstart
import typingsJapgolly.reachUtils.reachUtilsStrings.unhandledrejection
import typingsJapgolly.reachUtils.reachUtilsStrings.unload
import typingsJapgolly.reachUtils.reachUtilsStrings.volumechange
import typingsJapgolly.reachUtils.reachUtilsStrings.waiting
import typingsJapgolly.reachUtils.reachUtilsStrings.webkitanimationend
import typingsJapgolly.reachUtils.reachUtilsStrings.webkitanimationiteration
import typingsJapgolly.reachUtils.reachUtilsStrings.webkitanimationstart
import typingsJapgolly.reachUtils.reachUtilsStrings.webkittransitionend
import typingsJapgolly.reachUtils.reachUtilsStrings.wheel
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.HTMLDataElement
import typingsJapgolly.std.HTMLDetailsElement
import typingsJapgolly.std.HTMLDialogElement
import typingsJapgolly.std.HTMLMeterElement
import typingsJapgolly.std.HTMLOutputElement
import typingsJapgolly.std.HTMLPictureElement
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.HTMLTemplateElement
import typingsJapgolly.std.HTMLTimeElement
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.PageTransitionEvent
import typingsJapgolly.std.Partial
import typingsJapgolly.std.PromiseRejectionEvent
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.SVGAnimateElement
import typingsJapgolly.std.SVGAnimateMotionElement
import typingsJapgolly.std.SVGAnimateTransformElement
import typingsJapgolly.std.SVGFEDropShadowElement
import typingsJapgolly.std.SVGForeignObjectElement
import typingsJapgolly.std.SVGMPathElement
import typingsJapgolly.std.SVGSetElement
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignRef[RefValueType](ref: Null, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assignRef[RefValueType](ref: Unit, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Passes or assigns an arbitrary value to a ref function or object.
    *
    * @param ref
    * @param value
    */
  inline def assignRef[RefValueType](ref: AssignableRef[RefValueType], value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def canUseDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDOM")().asInstanceOf[Boolean]
  
  /**
    * Type-safe clone element
    *
    * @param element
    * @param props
    * @param children
    */
  inline def cloneValidElement[Props](element: Element, props: Partial[Props] & Attributes, children: Node*): Element | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneValidElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element | Node]
  inline def cloneValidElement[Props](element: Element, props: Unit, children: Node*): Element | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneValidElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element | Node]
  inline def cloneValidElement[Props](element: Node, props: Partial[Props] & Attributes, children: Node*): Element | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneValidElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element | Node]
  inline def cloneValidElement[Props](element: Node, props: Unit, children: Node*): Element | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneValidElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element | Node]
  
  /**
    * Wraps a lib-defined event handler and a user-defined event handler, returning
    * a single handler that allows a user to prevent lib-defined handlers from
    * firing.
    *
    * @param theirHandler User-supplied event handler
    * @param ourHandler Library-supplied event handler
    */
  inline def composeEventHandlers[EventType /* <: ReactEventFrom[org.scalajs.dom.Element] | Event */](
    theirHandler: js.Function1[/* event */ EventType, Any],
    ourHandler: js.Function1[/* event */ EventType, Any]
  ): js.Function1[/* event */ EventType, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeEventHandlers")(theirHandler.asInstanceOf[js.Any], ourHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ EventType, Any]]
  inline def composeEventHandlers[EventType /* <: ReactEventFrom[org.scalajs.dom.Element] | Event */](theirHandler: Unit, ourHandler: js.Function1[/* event */ EventType, Any]): js.Function1[/* event */ EventType, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeEventHandlers")(theirHandler.asInstanceOf[js.Any], ourHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ EventType, Any]]
  
  inline def createContext[ContextValueType /* <: js.Object | Null */](rootComponentName: String): js.Tuple2[
    ContextProvider[ContextValueType], 
    js.Function1[/* callerComponentName */ String, ContextValueType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(rootComponentName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    ContextProvider[ContextValueType], 
    js.Function1[/* callerComponentName */ String, ContextValueType]
  ]]
  inline def createContext[ContextValueType /* <: js.Object | Null */](rootComponentName: String, defaultContext: ContextValueType): js.Tuple2[
    ContextProvider[ContextValueType], 
    js.Function1[/* callerComponentName */ String, ContextValueType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(rootComponentName.asInstanceOf[js.Any], defaultContext.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    ContextProvider[ContextValueType], 
    js.Function1[/* callerComponentName */ String, ContextValueType]
  ]]
  
  /** @deprecated */
  inline def createNamedContext[ContextValueType](name: String, defaultValue: ContextValueType): Context[ContextValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNamedContext")(name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Context[ContextValueType]]
  
  /**
    * Get a computed style value by property.
    *
    * @param element
    * @param styleProp
    */
  inline def getComputedStyle(element: org.scalajs.dom.Element, styleProp: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(element.asInstanceOf[js.Any], styleProp.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  /**
    * Get computed style properties of a DOM element.
    *
    * @param element
    */
  inline def getComputedStyles(element: org.scalajs.dom.Element): CSSStyleDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyles")(element.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration | Null]
  
  /**
    * Get the size of the working document minus the scrollbar offset.
    *
    * @param element
    */
  inline def getDocumentDimensions(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentDimensions")().asInstanceOf[Height]
  inline def getDocumentDimensions(element: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  /**
    * Get an element's owner document. Useful when components are used in iframes
    * or other environments like dev tools.
    *
    * @param element
    */
  inline def getOwnerDocument[T /* <: org.scalajs.dom.Element */](): Document | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnerDocument")().asInstanceOf[Document | Null]
  inline def getOwnerDocument[T /* <: org.scalajs.dom.Element */](element: T): Document | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnerDocument")(element.asInstanceOf[js.Any]).asInstanceOf[Document | Null]
  
  /**
    * TODO: Remove in 1.0
    */
  inline def getOwnerWindow[T /* <: org.scalajs.dom.Element */](): (Window & (/* globalThis */ Any)) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnerWindow")().asInstanceOf[(Window & (/* globalThis */ Any)) | Null]
  inline def getOwnerWindow[T /* <: org.scalajs.dom.Element */](element: T): (Window & (/* globalThis */ Any)) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnerWindow")(element.asInstanceOf[js.Any]).asInstanceOf[(Window & (/* globalThis */ Any)) | Null]
  
  /**
    * Get the scoll position of the global window object relative to a given node.
    *
    * @param element
    */
  inline def getScrollPosition(): ScrollX = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPosition")().asInstanceOf[ScrollX]
  inline def getScrollPosition(element: HTMLElement): ScrollX = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPosition")(element.asInstanceOf[js.Any]).asInstanceOf[ScrollX]
  
  /**
    * Get the scrollbar offset distance.
    *
    * TODO: Remove in 1.0 (we used this in public examples)
    */
  inline def getScrollbarOffset(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarOffset")().asInstanceOf[Double]
  
  /**
    * Checks whether or not a value is a boolean.
    *
    * @param value
    */
  inline def isBoolean(value: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  /**
    * Checks whether or not a value is a function.
    *
    * @param value
    */
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  /**
    * Checks whether or not a value is a number.
    *
    * @param value
    */
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  /**
    * Detects right clicks
    *
    * @param nativeEvent
    */
  inline def isRightClick(nativeEvent: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRightClick")(nativeEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isRightClick(nativeEvent: PointerEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRightClick")(nativeEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isRightClick(nativeEvent: TouchEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRightClick")(nativeEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Checks whether or not a value is a string.
    *
    * @param value
    */
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  /**
    * Joins strings to format IDs for compound components.
    *
    * @param args
    */
  inline def makeId(args: (js.UndefOr[String | Double | Null])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeId")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  /**
    * Passes or assigns a value to multiple refs (typically a DOM node). Useful for
    * dealing with components that need an explicit ref for DOM calculations but
    * also forwards refs assigned by an app.
    *
    * @param refs Refs to fork
    */
  inline def useComposedRefs[RefValueType](refs: (js.UndefOr[AssignableRef[RefValueType] | Null])*): js.Function1[/* node */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComposedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* node */ Any, Unit]]
  
  /**
    * React hook for creating a value exactly once.
    * @see https://github.com/Andarist/use-constant
    */
  inline def useConstant[ValueType](fn: js.Function0[ValueType]): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("useConstant")(fn.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  
  /**
    * Check if a component is controlled or uncontrolled and return the correct
    * state value and setter accordingly. If the component state is controlled by
    * the app, the setter is a noop.
    *
    * @param controlledValue
    * @param defaultValue
    */
  inline def useControlledState[T](hasControlledValueDefaultValueCalledFrom: CalledFrom[T]): js.Tuple2[T, Dispatch[SetStateAction[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(hasControlledValueDefaultValueCalledFrom.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
  
  /**
    * Logs a warning in dev mode when a component switches from controlled to
    * uncontrolled, or vice versa
    *
    * A single prop should typically be used to determine whether or not a
    * component is controlled or not.
    *
    * @param controlledValue
    * @param controlledPropName
    * @param componentName
    */
  inline def useControlledSwitchWarning(controlledValue: Any, controlledPropName: String, componentName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledSwitchWarning")(controlledValue.asInstanceOf[js.Any], controlledPropName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds a DOM event listener
    *
    * @param eventName
    * @param listener
    * @param element
    */
  inline def useEventListener_DOMContentLoaded(eventName: DOMContentLoaded, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded(eventName: DOMContentLoaded, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded(eventName: DOMContentLoaded, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded(eventName: DOMContentLoaded, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded(eventName: DOMContentLoaded, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_abort(eventName: abort, listener: js.Function1[/* event */ UIEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, listener: js.Function1[/* event */ UIEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, listener: js.Function1[/* event */ UIEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, listener: js.Function1[/* event */ UIEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, listener: js.Function1[/* event */ UIEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_afterprint(eventName: afterprint, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(eventName: afterprint, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(eventName: afterprint, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(eventName: afterprint, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(eventName: afterprint, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationcancel(eventName: animationcancel, listener: js.Function1[/* event */ AnimationEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationend(eventName: animationend, listener: js.Function1[/* event */ AnimationEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(
    eventName: animationend,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(
    eventName: animationend,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(
    eventName: animationend,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(eventName: animationend, listener: js.Function1[/* event */ AnimationEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationiteration(eventName: animationiteration, listener: js.Function1[/* event */ AnimationEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationstart(eventName: animationstart, listener: js.Function1[/* event */ AnimationEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    listener: js.Function1[/* event */ AnimationEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_auxclick(eventName: auxclick, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeinput(eventName: beforeinput, listener: js.Function1[/* event */ InputEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput(eventName: beforeinput, listener: js.Function1[/* event */ InputEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput(eventName: beforeinput, listener: js.Function1[/* event */ InputEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput(eventName: beforeinput, listener: js.Function1[/* event */ InputEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput(eventName: beforeinput, listener: js.Function1[/* event */ InputEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeprint(eventName: beforeprint, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(eventName: beforeprint, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(eventName: beforeprint, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(eventName: beforeprint, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(eventName: beforeprint, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeunload(eventName: beforeunload, listener: js.Function1[/* event */ BeforeUnloadEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(
    eventName: beforeunload,
    listener: js.Function1[/* event */ BeforeUnloadEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(
    eventName: beforeunload,
    listener: js.Function1[/* event */ BeforeUnloadEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(
    eventName: beforeunload,
    listener: js.Function1[/* event */ BeforeUnloadEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(
    eventName: beforeunload,
    listener: js.Function1[/* event */ BeforeUnloadEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_blur(eventName: blur, listener: js.Function1[/* event */ FocusEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, listener: js.Function1[/* event */ FocusEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, listener: js.Function1[/* event */ FocusEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, listener: js.Function1[/* event */ FocusEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, listener: js.Function1[/* event */ FocusEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplay(eventName: canplay, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplaythrough(eventName: canplaythrough, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_change(eventName: change, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_click(eventName: click, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_close(eventName: close, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionend(eventName: compositionend, listener: js.Function1[/* event */ CompositionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend(
    eventName: compositionend,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend(
    eventName: compositionend,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend(
    eventName: compositionend,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend(
    eventName: compositionend,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionstart(eventName: compositionstart, listener: js.Function1[/* event */ CompositionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart(
    eventName: compositionstart,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart(
    eventName: compositionstart,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart(
    eventName: compositionstart,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart(
    eventName: compositionstart,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionupdate(eventName: compositionupdate, listener: js.Function1[/* event */ CompositionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate(
    eventName: compositionupdate,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate(
    eventName: compositionupdate,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate(
    eventName: compositionupdate,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate(
    eventName: compositionupdate,
    listener: js.Function1[/* event */ CompositionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_contextmenu(eventName: contextmenu, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cuechange(eventName: cuechange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dblclick(eventName: dblclick, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_devicemotion(eventName: devicemotion, listener: js.Function1[/* event */ DeviceMotionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(
    eventName: devicemotion,
    listener: js.Function1[/* event */ DeviceMotionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(
    eventName: devicemotion,
    listener: js.Function1[/* event */ DeviceMotionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(
    eventName: devicemotion,
    listener: js.Function1[/* event */ DeviceMotionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(
    eventName: devicemotion,
    listener: js.Function1[/* event */ DeviceMotionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_deviceorientation(eventName: deviceorientation, listener: js.Function1[/* event */ DeviceOrientationEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(
    eventName: deviceorientation,
    listener: js.Function1[/* event */ DeviceOrientationEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(
    eventName: deviceorientation,
    listener: js.Function1[/* event */ DeviceOrientationEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(
    eventName: deviceorientation,
    listener: js.Function1[/* event */ DeviceOrientationEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(
    eventName: deviceorientation,
    listener: js.Function1[/* event */ DeviceOrientationEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drag(eventName: drag, listener: js.Function1[/* event */ DragEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, listener: js.Function1[/* event */ DragEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, listener: js.Function1[/* event */ DragEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, listener: js.Function1[/* event */ DragEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, listener: js.Function1[/* event */ DragEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragend(eventName: dragend, listener: js.Function1[/* event */ DragEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, listener: js.Function1[/* event */ DragEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, listener: js.Function1[/* event */ DragEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, listener: js.Function1[/* event */ DragEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, listener: js.Function1[/* event */ DragEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragenter(eventName: dragenter, listener: js.Function1[/* event */ DragEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, listener: js.Function1[/* event */ DragEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, listener: js.Function1[/* event */ DragEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, listener: js.Function1[/* event */ DragEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, listener: js.Function1[/* event */ DragEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragleave(eventName: dragleave, listener: js.Function1[/* event */ DragEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, listener: js.Function1[/* event */ DragEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, listener: js.Function1[/* event */ DragEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, listener: js.Function1[/* event */ DragEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, listener: js.Function1[/* event */ DragEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragover(eventName: dragover, listener: js.Function1[/* event */ DragEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, listener: js.Function1[/* event */ DragEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, listener: js.Function1[/* event */ DragEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, listener: js.Function1[/* event */ DragEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, listener: js.Function1[/* event */ DragEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragstart(eventName: dragstart, listener: js.Function1[/* event */ DragEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, listener: js.Function1[/* event */ DragEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, listener: js.Function1[/* event */ DragEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, listener: js.Function1[/* event */ DragEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, listener: js.Function1[/* event */ DragEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drop(eventName: drop, listener: js.Function1[/* event */ DragEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, listener: js.Function1[/* event */ DragEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, listener: js.Function1[/* event */ DragEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, listener: js.Function1[/* event */ DragEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, listener: js.Function1[/* event */ DragEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_durationchange(eventName: durationchange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_emptied(eventName: emptied, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ended(eventName: ended, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_error(eventName: error, listener: js.Function1[/* event */ ErrorEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, listener: js.Function1[/* event */ ErrorEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, listener: js.Function1[/* event */ ErrorEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, listener: js.Function1[/* event */ ErrorEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, listener: js.Function1[/* event */ ErrorEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focus(eventName: focus, listener: js.Function1[/* event */ FocusEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, listener: js.Function1[/* event */ FocusEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, listener: js.Function1[/* event */ FocusEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, listener: js.Function1[/* event */ FocusEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, listener: js.Function1[/* event */ FocusEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusin(eventName: focusin, listener: js.Function1[/* event */ FocusEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, listener: js.Function1[/* event */ FocusEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, listener: js.Function1[/* event */ FocusEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, listener: js.Function1[/* event */ FocusEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, listener: js.Function1[/* event */ FocusEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusout(eventName: focusout, listener: js.Function1[/* event */ FocusEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, listener: js.Function1[/* event */ FocusEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, listener: js.Function1[/* event */ FocusEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, listener: js.Function1[/* event */ FocusEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, listener: js.Function1[/* event */ FocusEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_formdata(eventName: formdata, listener: js.Function1[/* event */ FormDataEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata(eventName: formdata, listener: js.Function1[/* event */ FormDataEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata(eventName: formdata, listener: js.Function1[/* event */ FormDataEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata(eventName: formdata, listener: js.Function1[/* event */ FormDataEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata(eventName: formdata, listener: js.Function1[/* event */ FormDataEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gamepadconnected(eventName: gamepadconnected, listener: js.Function1[/* event */ GamepadEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepadconnected(
    eventName: gamepadconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepadconnected(
    eventName: gamepadconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepadconnected(
    eventName: gamepadconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepadconnected(
    eventName: gamepadconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gamepaddisconnected(eventName: gamepaddisconnected, listener: js.Function1[/* event */ GamepadEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepaddisconnected(
    eventName: gamepaddisconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepaddisconnected(
    eventName: gamepaddisconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepaddisconnected(
    eventName: gamepaddisconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepaddisconnected(
    eventName: gamepaddisconnected,
    listener: js.Function1[/* event */ GamepadEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_hashchange(eventName: hashchange, listener: js.Function1[/* event */ HashChangeEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(eventName: hashchange, listener: js.Function1[/* event */ HashChangeEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(
    eventName: hashchange,
    listener: js.Function1[/* event */ HashChangeEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(
    eventName: hashchange,
    listener: js.Function1[/* event */ HashChangeEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(eventName: hashchange, listener: js.Function1[/* event */ HashChangeEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_input(eventName: input, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_invalid(eventName: invalid, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keydown(eventName: keydown, listener: js.Function1[/* event */ KeyboardEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, listener: js.Function1[/* event */ KeyboardEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, listener: js.Function1[/* event */ KeyboardEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, listener: js.Function1[/* event */ KeyboardEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, listener: js.Function1[/* event */ KeyboardEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keypress(eventName: keypress, listener: js.Function1[/* event */ KeyboardEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, listener: js.Function1[/* event */ KeyboardEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, listener: js.Function1[/* event */ KeyboardEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, listener: js.Function1[/* event */ KeyboardEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, listener: js.Function1[/* event */ KeyboardEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keyup(eventName: keyup, listener: js.Function1[/* event */ KeyboardEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, listener: js.Function1[/* event */ KeyboardEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, listener: js.Function1[/* event */ KeyboardEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, listener: js.Function1[/* event */ KeyboardEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, listener: js.Function1[/* event */ KeyboardEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_languagechange(eventName: languagechange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(eventName: languagechange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(eventName: languagechange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(eventName: languagechange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(eventName: languagechange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_load(eventName: load, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadeddata(eventName: loadeddata, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadstart(eventName: loadstart, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_message(eventName: message, listener: js.Function1[/* event */ MessageEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(eventName: message, listener: js.Function1[/* event */ MessageEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(eventName: message, listener: js.Function1[/* event */ MessageEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(eventName: message, listener: js.Function1[/* event */ MessageEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(eventName: message, listener: js.Function1[/* event */ MessageEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_messageerror(eventName: messageerror, listener: js.Function1[/* event */ MessageEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(eventName: messageerror, listener: js.Function1[/* event */ MessageEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(
    eventName: messageerror,
    listener: js.Function1[/* event */ MessageEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(
    eventName: messageerror,
    listener: js.Function1[/* event */ MessageEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(eventName: messageerror, listener: js.Function1[/* event */ MessageEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousedown(eventName: mousedown, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseenter(eventName: mouseenter, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseleave(eventName: mouseleave, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousemove(eventName: mousemove, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseout(eventName: mouseout, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseover(eventName: mouseover, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseup(eventName: mouseup, listener: js.Function1[/* event */ MouseEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, listener: js.Function1[/* event */ MouseEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, listener: js.Function1[/* event */ MouseEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, listener: js.Function1[/* event */ MouseEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, listener: js.Function1[/* event */ MouseEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_offline(eventName: offline, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(eventName: offline, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(eventName: offline, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(eventName: offline, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(eventName: offline, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_online(eventName: online, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(eventName: online, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(eventName: online, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(eventName: online, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(eventName: online, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_orientationchange(eventName: orientationchange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(eventName: orientationchange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(eventName: orientationchange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(eventName: orientationchange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(eventName: orientationchange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pagehide(eventName: pagehide, listener: js.Function1[/* event */ PageTransitionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(
    eventName: pagehide,
    listener: js.Function1[/* event */ PageTransitionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(
    eventName: pagehide,
    listener: js.Function1[/* event */ PageTransitionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(
    eventName: pagehide,
    listener: js.Function1[/* event */ PageTransitionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(eventName: pagehide, listener: js.Function1[/* event */ PageTransitionEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pageshow(eventName: pageshow, listener: js.Function1[/* event */ PageTransitionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(
    eventName: pageshow,
    listener: js.Function1[/* event */ PageTransitionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(
    eventName: pageshow,
    listener: js.Function1[/* event */ PageTransitionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(
    eventName: pageshow,
    listener: js.Function1[/* event */ PageTransitionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(eventName: pageshow, listener: js.Function1[/* event */ PageTransitionEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pause(eventName: pause, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_play(eventName: play, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_playing(eventName: playing, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointercancel(eventName: pointercancel, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(eventName: pointercancel, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(
    eventName: pointercancel,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(
    eventName: pointercancel,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(eventName: pointercancel, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerdown(eventName: pointerdown, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(eventName: pointerdown, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(
    eventName: pointerdown,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(
    eventName: pointerdown,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(eventName: pointerdown, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerenter(eventName: pointerenter, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(eventName: pointerenter, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(
    eventName: pointerenter,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(
    eventName: pointerenter,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(eventName: pointerenter, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerleave(eventName: pointerleave, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(eventName: pointerleave, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(
    eventName: pointerleave,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(
    eventName: pointerleave,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(eventName: pointerleave, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointermove(eventName: pointermove, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(eventName: pointermove, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(
    eventName: pointermove,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(
    eventName: pointermove,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(eventName: pointermove, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerout(eventName: pointerout, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, listener: js.Function1[/* event */ PointerEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, listener: js.Function1[/* event */ PointerEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerover(eventName: pointerover, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(eventName: pointerover, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(
    eventName: pointerover,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(
    eventName: pointerover,
    listener: js.Function1[/* event */ PointerEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(eventName: pointerover, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerup(eventName: pointerup, listener: js.Function1[/* event */ PointerEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, listener: js.Function1[/* event */ PointerEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, listener: js.Function1[/* event */ PointerEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, listener: js.Function1[/* event */ PointerEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, listener: js.Function1[/* event */ PointerEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_popstate(eventName: popstate, listener: js.Function1[/* event */ PopStateEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(eventName: popstate, listener: js.Function1[/* event */ PopStateEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(eventName: popstate, listener: js.Function1[/* event */ PopStateEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(eventName: popstate, listener: js.Function1[/* event */ PopStateEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(eventName: popstate, listener: js.Function1[/* event */ PopStateEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_progress(eventName: progress, listener: js.Function1[/* event */ ProgressEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, listener: js.Function1[/* event */ ProgressEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, listener: js.Function1[/* event */ ProgressEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, listener: js.Function1[/* event */ ProgressEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, listener: js.Function1[/* event */ ProgressEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ratechange(eventName: ratechange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_rejectionhandled(eventName: rejectionhandled, listener: js.Function1[/* event */ PromiseRejectionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(
    eventName: rejectionhandled,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(
    eventName: rejectionhandled,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(
    eventName: rejectionhandled,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(
    eventName: rejectionhandled,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_reset(eventName: reset, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_resize(eventName: resize, listener: js.Function1[/* event */ UIEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, listener: js.Function1[/* event */ UIEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, listener: js.Function1[/* event */ UIEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, listener: js.Function1[/* event */ UIEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, listener: js.Function1[/* event */ UIEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_scroll(eventName: scroll, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    listener: js.Function1[/* event */ SecurityPolicyViolationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    listener: js.Function1[/* event */ SecurityPolicyViolationEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    listener: js.Function1[/* event */ SecurityPolicyViolationEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    listener: js.Function1[/* event */ SecurityPolicyViolationEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    listener: js.Function1[/* event */ SecurityPolicyViolationEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeked(eventName: seeked, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeking(eventName: seeking, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_select(eventName: select, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectionchange(eventName: selectionchange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectstart(eventName: selectstart, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_slotchange(eventName: slotchange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange(eventName: slotchange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange(eventName: slotchange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange(eventName: slotchange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange(eventName: slotchange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_stalled(eventName: stalled, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_storage(eventName: storage, listener: js.Function1[/* event */ StorageEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(eventName: storage, listener: js.Function1[/* event */ StorageEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(eventName: storage, listener: js.Function1[/* event */ StorageEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(eventName: storage, listener: js.Function1[/* event */ StorageEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(eventName: storage, listener: js.Function1[/* event */ StorageEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_submit(eventName: submit, listener: js.Function1[/* event */ SubmitEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, listener: js.Function1[/* event */ SubmitEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, listener: js.Function1[/* event */ SubmitEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, listener: js.Function1[/* event */ SubmitEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, listener: js.Function1[/* event */ SubmitEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_suspend(eventName: suspend, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_timeupdate(eventName: timeupdate, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_toggle(eventName: toggle, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchcancel(eventName: touchcancel, listener: js.Function1[/* event */ TouchEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, listener: js.Function1[/* event */ TouchEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, listener: js.Function1[/* event */ TouchEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, listener: js.Function1[/* event */ TouchEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, listener: js.Function1[/* event */ TouchEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchend(eventName: touchend, listener: js.Function1[/* event */ TouchEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, listener: js.Function1[/* event */ TouchEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, listener: js.Function1[/* event */ TouchEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, listener: js.Function1[/* event */ TouchEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, listener: js.Function1[/* event */ TouchEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchmove(eventName: touchmove, listener: js.Function1[/* event */ TouchEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, listener: js.Function1[/* event */ TouchEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, listener: js.Function1[/* event */ TouchEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, listener: js.Function1[/* event */ TouchEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, listener: js.Function1[/* event */ TouchEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchstart(eventName: touchstart, listener: js.Function1[/* event */ TouchEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, listener: js.Function1[/* event */ TouchEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, listener: js.Function1[/* event */ TouchEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, listener: js.Function1[/* event */ TouchEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, listener: js.Function1[/* event */ TouchEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitioncancel(eventName: transitioncancel, listener: js.Function1[/* event */ TransitionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionend(eventName: transitionend, listener: js.Function1[/* event */ TransitionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionrun(eventName: transitionrun, listener: js.Function1[/* event */ TransitionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionstart(eventName: transitionstart, listener: js.Function1[/* event */ TransitionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    listener: js.Function1[/* event */ TransitionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_unhandledrejection(eventName: unhandledrejection, listener: js.Function1[/* event */ PromiseRejectionEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(
    eventName: unhandledrejection,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(
    eventName: unhandledrejection,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(
    eventName: unhandledrejection,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(
    eventName: unhandledrejection,
    listener: js.Function1[/* event */ PromiseRejectionEvent, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_unload(eventName: unload, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(eventName: unload, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(eventName: unload, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(eventName: unload, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(eventName: unload, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_volumechange(eventName: volumechange, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_waiting(eventName: waiting, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, listener: js.Function1[/* event */ Event, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, listener: js.Function1[/* event */ Event, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationend(eventName: webkitanimationend, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend(eventName: webkitanimationend, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend(
    eventName: webkitanimationend,
    listener: js.Function1[/* event */ Event, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend(
    eventName: webkitanimationend,
    listener: js.Function1[/* event */ Event, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend(eventName: webkitanimationend, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationiteration(eventName: webkitanimationiteration, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration(
    eventName: webkitanimationiteration,
    listener: js.Function1[/* event */ Event, Any],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration(
    eventName: webkitanimationiteration,
    listener: js.Function1[/* event */ Event, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration(
    eventName: webkitanimationiteration,
    listener: js.Function1[/* event */ Event, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration(
    eventName: webkitanimationiteration,
    listener: js.Function1[/* event */ Event, Any],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationstart(eventName: webkitanimationstart, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart(eventName: webkitanimationstart, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart(
    eventName: webkitanimationstart,
    listener: js.Function1[/* event */ Event, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart(
    eventName: webkitanimationstart,
    listener: js.Function1[/* event */ Event, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart(eventName: webkitanimationstart, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkittransitionend(eventName: webkittransitionend, listener: js.Function1[/* event */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend(eventName: webkittransitionend, listener: js.Function1[/* event */ Event, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend(
    eventName: webkittransitionend,
    listener: js.Function1[/* event */ Event, Any],
    element: EventTarget
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend(
    eventName: webkittransitionend,
    listener: js.Function1[/* event */ Event, Any],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend(eventName: webkittransitionend, listener: js.Function1[/* event */ Event, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_wheel(eventName: wheel, listener: js.Function1[/* event */ WheelEvent, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, listener: js.Function1[/* event */ WheelEvent, Any], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, listener: js.Function1[/* event */ WheelEvent, Any], element: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, listener: js.Function1[/* event */ WheelEvent, Any], element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, listener: js.Function1[/* event */ WheelEvent, Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Detect when focus changes in our document.
    *
    * @param handleChange
    * @param when
    * @param ownerDocument
    */
  inline def useFocusChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")().asInstanceOf[Unit]
  inline def useFocusChange(
    handleChange: js.Function3[
      /* activeElement */ org.scalajs.dom.Element | Null, 
      /* previousActiveElement */ org.scalajs.dom.Element | Null, 
      /* event */ js.UndefOr[FocusEvent], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")(handleChange.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useFocusChange(
    handleChange: js.Function3[
      /* activeElement */ org.scalajs.dom.Element | Null, 
      /* previousActiveElement */ org.scalajs.dom.Element | Null, 
      /* event */ js.UndefOr[FocusEvent], 
      Unit
    ],
    when: focus | blur
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")(handleChange.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusChange(
    handleChange: js.Function3[
      /* activeElement */ org.scalajs.dom.Element | Null, 
      /* previousActiveElement */ org.scalajs.dom.Element | Null, 
      /* event */ js.UndefOr[FocusEvent], 
      Unit
    ],
    when: focus | blur,
    ownerDocument: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")(handleChange.asInstanceOf[js.Any], when.asInstanceOf[js.Any], ownerDocument.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusChange(
    handleChange: js.Function3[
      /* activeElement */ org.scalajs.dom.Element | Null, 
      /* previousActiveElement */ org.scalajs.dom.Element | Null, 
      /* event */ js.UndefOr[FocusEvent], 
      Unit
    ],
    when: Unit,
    ownerDocument: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")(handleChange.asInstanceOf[js.Any], when.asInstanceOf[js.Any], ownerDocument.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusChange(handleChange: Unit, when: focus | blur): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")(handleChange.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusChange(handleChange: Unit, when: focus | blur, ownerDocument: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")(handleChange.asInstanceOf[js.Any], when.asInstanceOf[js.Any], ownerDocument.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusChange(handleChange: Unit, when: Unit, ownerDocument: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusChange")(handleChange.asInstanceOf[js.Any], when.asInstanceOf[js.Any], ownerDocument.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Forces a re-render, similar to `forceUpdate` in class components.
    */
  inline def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useLazyRef[F /* <: js.Function1[/* repeated */ Any, Any] */](fn: F): MutableRefObject[ReturnType[F]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLazyRef")(fn.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[ReturnType[F]]]
  
  /**
    * Returns the previous value of a reference after a component update.
    *
    * @param value
    */
  inline def usePrevious[ValueType](value: ValueType): ValueType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[ValueType | Null]
  
  /**
    * Converts a callback to a ref to avoid triggering re-renders when passed as a
    * prop and exposed as a stable function to avoid executing effects when passed
    * as a dependency.
    */
  inline def useStableCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useStableCallback")().asInstanceOf[T]
  inline def useStableCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useStableCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Converts a callback to a ref to avoid triggering re-renders when passed as a
    * prop and exposed as a stable function to avoid executing effects when passed
    * as a dependency.
    *
    * Use this over `useStableCallback` when you want the callback to be cached in
    * `useLayoutEffect` instead of `useEffect` to deal with timing issues only when
    * needed.
    */
  inline def useStableLayoutCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useStableLayoutCallback")().asInstanceOf[T]
  inline def useStableLayoutCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useStableLayoutCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useStatefulRefValue[V](ref: RefHandle[V], initialState: V): js.Tuple2[V, js.Function1[/* refValue */ Exclude[V, Null], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStatefulRefValue")(ref.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[V, js.Function1[/* refValue */ Exclude[V, Null], Unit]]]
  
  /**
    * Call an effect after a component update, skipping the initial mount.
    *
    * @param effect Effect to call
    * @param deps Effect dependency list
    */
  inline def useUpdateEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useUpdateEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * React.Ref uses the readonly type `React.RefObject` instead of
    * `React.MutableRefObject`, We pretty much always assume ref objects are
    * mutable (at least when we create them), so this type is a workaround so some
    * of the weird mechanics of using refs with TS.
    */
  type AssignableRef[ValueType] = (js.Function1[/* instance */ ValueType | Null, Unit]) | (MutableRefObject[ValueType | Null])
  
  type ContextProvider[T] = FC[PropsWithChildren[T]]
  
  /**
    * The built-in utility type `Omit` does not distribute over unions. So if you
    * have:
    *
    *    type A = { a: 'whatever' }
    *
    * and you want to do a union with:
    *
    *    type B = A & { b: number } | { b: string; c: number }
    *
    * you might expect `Omit<B, 'a'>` to give you:
    *
    *    type B =
    *      | Omit<{ a: "whatever"; b: number }, "a">
    | Omit<{ a: "whatever"; b: string; c: number }, "a">;
    *
    * This is not the case, unfortunately, so we need to create our own version of
    * `Omit` that distributes over unions with a distributive conditional type. If
    * you have a generic type parameter `T`, then the construct
    * `T extends any ? F<T> : never` will end up distributing the `F<>` operation
    * over `T` when `T` is a union type.
    *
    * @link https://stackoverflow.com/a/59796484/1792019
    * @link http://www.typescriptlang.org/docs/handbook/advanced-types.html#distributive-conditional-types
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    BaseType extends any ? std.Omit<BaseType, Key> : never
    }}}
    */
  @js.native
  trait DistributiveOmit[BaseType, Key /* <: PropertyKey */] extends StObject
  
  /* Inlined std.HTMLElementTagNameMap & std.Pick<std.SVGElementTagNameMap, std.Exclude<keyof std.SVGElementTagNameMap, keyof std.HTMLElementTagNameMap>> */
  trait ElementTagNameMap extends StObject {
    
    /* standard dom */
    var a: HTMLAnchorElement
    
    /* standard dom */
    var abbr: HTMLElement
    
    /* standard dom */
    var address: HTMLElement
    
    var animate: SVGAnimateElement
    
    var animateMotion: SVGAnimateMotionElement
    
    var animateTransform: SVGAnimateTransformElement
    
    /* standard dom */
    var area: HTMLAreaElement
    
    /* standard dom */
    var article: HTMLElement
    
    /* standard dom */
    var aside: HTMLElement
    
    /* standard dom */
    var audio: HTMLAudioElement
    
    /* standard dom */
    var b: HTMLElement
    
    /* standard dom */
    var base: HTMLBaseElement
    
    /* standard dom */
    var bdi: HTMLElement
    
    /* standard dom */
    var bdo: HTMLElement
    
    /* standard dom */
    var blockquote: HTMLQuoteElement
    
    /* standard dom */
    var body: HTMLBodyElement
    
    /* standard dom */
    var br: HTMLBRElement
    
    /* standard dom */
    var button: HTMLButtonElement
    
    /* standard dom */
    var canvas: HTMLCanvasElement
    
    /* standard dom */
    var caption: HTMLTableCaptionElement
    
    var circle: SVGCircleElement
    
    /* standard dom */
    var cite: HTMLElement
    
    var clipPath: SVGClipPathElement
    
    /* standard dom */
    var code: HTMLElement
    
    /* standard dom */
    var col: HTMLTableColElement
    
    /* standard dom */
    var colgroup: HTMLTableColElement
    
    /* standard dom */
    var data: HTMLDataElement
    
    /* standard dom */
    var datalist: HTMLDataListElement
    
    /* standard dom */
    var dd: HTMLElement
    
    var defs: SVGDefsElement
    
    /* standard dom */
    var del: HTMLModElement
    
    var desc: SVGDescElement
    
    /* standard dom */
    var details: HTMLDetailsElement
    
    /* standard dom */
    var dfn: HTMLElement
    
    /* standard dom */
    var dialog: HTMLDialogElement
    
    /* standard dom */
    var div: HTMLDivElement
    
    /* standard dom */
    var dl: HTMLDListElement
    
    /* standard dom */
    var dt: HTMLElement
    
    var ellipse: SVGEllipseElement
    
    /* standard dom */
    var em: HTMLElement
    
    /* standard dom */
    var embed: HTMLEmbedElement
    
    var feBlend: SVGFEBlendElement
    
    var feColorMatrix: SVGFEColorMatrixElement
    
    var feComponentTransfer: SVGFEComponentTransferElement
    
    var feComposite: SVGFECompositeElement
    
    var feConvolveMatrix: SVGFEConvolveMatrixElement
    
    var feDiffuseLighting: SVGFEDiffuseLightingElement
    
    var feDisplacementMap: SVGFEDisplacementMapElement
    
    var feDistantLight: SVGFEDistantLightElement
    
    var feDropShadow: SVGFEDropShadowElement
    
    var feFlood: SVGFEFloodElement
    
    var feFuncA: SVGFEFuncAElement
    
    var feFuncB: SVGFEFuncBElement
    
    var feFuncG: SVGFEFuncGElement
    
    var feFuncR: SVGFEFuncRElement
    
    var feGaussianBlur: SVGFEGaussianBlurElement
    
    var feImage: SVGFEImageElement
    
    var feMerge: SVGFEMergeElement
    
    var feMergeNode: SVGFEMergeNodeElement
    
    var feMorphology: SVGFEMorphologyElement
    
    var feOffset: SVGFEOffsetElement
    
    var fePointLight: SVGFEPointLightElement
    
    var feSpecularLighting: SVGFESpecularLightingElement
    
    var feSpotLight: SVGFESpotLightElement
    
    var feTile: SVGFETileElement
    
    var feTurbulence: SVGFETurbulenceElement
    
    /* standard dom */
    var fieldset: HTMLFieldSetElement
    
    /* standard dom */
    var figcaption: HTMLElement
    
    /* standard dom */
    var figure: HTMLElement
    
    var filter: SVGFilterElement
    
    /* standard dom */
    var footer: HTMLElement
    
    var foreignObject: SVGForeignObjectElement
    
    /* standard dom */
    var form: HTMLFormElement
    
    var g: SVGGElement
    
    /* standard dom */
    var h1: HTMLHeadingElement
    
    /* standard dom */
    var h2: HTMLHeadingElement
    
    /* standard dom */
    var h3: HTMLHeadingElement
    
    /* standard dom */
    var h4: HTMLHeadingElement
    
    /* standard dom */
    var h5: HTMLHeadingElement
    
    /* standard dom */
    var h6: HTMLHeadingElement
    
    /* standard dom */
    var head: HTMLHeadElement
    
    /* standard dom */
    var header: HTMLElement
    
    /* standard dom */
    var hgroup: HTMLElement
    
    /* standard dom */
    var hr: HTMLHRElement
    
    /* standard dom */
    var html: HTMLHtmlElement
    
    /* standard dom */
    var i: HTMLElement
    
    /* standard dom */
    var iframe: HTMLIFrameElement
    
    var image: SVGImageElement
    
    /* standard dom */
    var img: HTMLImageElement
    
    /* standard dom */
    var input: HTMLInputElement
    
    /* standard dom */
    var ins: HTMLModElement
    
    /* standard dom */
    var kbd: HTMLElement
    
    /* standard dom */
    var label: HTMLLabelElement
    
    /* standard dom */
    var legend: HTMLLegendElement
    
    /* standard dom */
    var li: HTMLLIElement
    
    var line: SVGLineElement
    
    var linearGradient: SVGLinearGradientElement
    
    /* standard dom */
    var link: HTMLLinkElement
    
    /* standard dom */
    var main: HTMLElement
    
    /* standard dom */
    var map: HTMLMapElement
    
    /* standard dom */
    var mark: HTMLElement
    
    var marker: SVGMarkerElement
    
    var mask: SVGMaskElement
    
    /* standard dom */
    var menu: HTMLMenuElement
    
    /* standard dom */
    var meta: HTMLMetaElement
    
    var metadata: SVGMetadataElement
    
    /* standard dom */
    var meter: HTMLMeterElement
    
    var mpath: SVGMPathElement
    
    /* standard dom */
    var nav: HTMLElement
    
    /* standard dom */
    var noscript: HTMLElement
    
    /* standard dom */
    var `object`: HTMLObjectElement
    
    /* standard dom */
    var ol: HTMLOListElement
    
    /* standard dom */
    var optgroup: HTMLOptGroupElement
    
    /* standard dom */
    var option: HTMLOptionElement
    
    /* standard dom */
    var output: HTMLOutputElement
    
    /* standard dom */
    var p: HTMLParagraphElement
    
    var path: SVGPathElement
    
    var pattern: SVGPatternElement
    
    /* standard dom */
    var picture: HTMLPictureElement
    
    var polygon: SVGPolygonElement
    
    var polyline: SVGPolylineElement
    
    /* standard dom */
    var pre: HTMLPreElement
    
    /* standard dom */
    var progress: HTMLProgressElement
    
    /* standard dom */
    var q: HTMLQuoteElement
    
    var radialGradient: SVGRadialGradientElement
    
    var rect: SVGRectElement
    
    /* standard dom */
    var rp: HTMLElement
    
    /* standard dom */
    var rt: HTMLElement
    
    /* standard dom */
    var ruby: HTMLElement
    
    /* standard dom */
    var s: HTMLElement
    
    /* standard dom */
    var samp: HTMLElement
    
    /* standard dom */
    var script: HTMLScriptElement
    
    /* standard dom */
    var section: HTMLElement
    
    /* standard dom */
    var select: HTMLSelectElement
    
    var set: SVGSetElement
    
    /* standard dom */
    var slot: HTMLSlotElement
    
    /* standard dom */
    var small: HTMLElement
    
    /* standard dom */
    var source: HTMLSourceElement
    
    /* standard dom */
    var span: HTMLSpanElement
    
    var stop: SVGStopElement
    
    /* standard dom */
    var strong: HTMLElement
    
    /* standard dom */
    var style: HTMLStyleElement
    
    /* standard dom */
    var sub: HTMLElement
    
    /* standard dom */
    var summary: HTMLElement
    
    /* standard dom */
    var sup: HTMLElement
    
    var svg: SVGSVGElement
    
    var switch: SVGSwitchElement
    
    var symbol: SVGSymbolElement
    
    /* standard dom */
    var table: HTMLTableElement
    
    /* standard dom */
    var tbody: HTMLTableSectionElement
    
    /* standard dom */
    var td: HTMLTableCellElement
    
    /* standard dom */
    var template: HTMLTemplateElement
    
    var text: SVGTextElement
    
    var textPath: SVGTextPathElement
    
    /* standard dom */
    var textarea: HTMLTextAreaElement
    
    /* standard dom */
    var tfoot: HTMLTableSectionElement
    
    /* standard dom */
    var th: HTMLTableCellElement
    
    /* standard dom */
    var thead: HTMLTableSectionElement
    
    /* standard dom */
    var time: HTMLTimeElement
    
    /* standard dom */
    var title: HTMLTitleElement
    
    /* standard dom */
    var tr: HTMLTableRowElement
    
    /* standard dom */
    var track: HTMLTrackElement
    
    var tspan: SVGTSpanElement
    
    /* standard dom */
    var u: HTMLElement
    
    /* standard dom */
    var ul: HTMLUListElement
    
    var use: SVGUseElement
    
    /* standard dom */
    var `var`: HTMLElement
    
    /* standard dom */
    var video: HTMLVideoElement
    
    var view: SVGViewElement
    
    /* standard dom */
    var wbr: HTMLElement
  }
  object ElementTagNameMap {
    
    inline def apply(
      a: HTMLAnchorElement,
      abbr: HTMLElement,
      address: HTMLElement,
      animate: SVGAnimateElement,
      animateMotion: SVGAnimateMotionElement,
      animateTransform: SVGAnimateTransformElement,
      area: HTMLAreaElement,
      article: HTMLElement,
      aside: HTMLElement,
      audio: HTMLAudioElement,
      b: HTMLElement,
      base: HTMLBaseElement,
      bdi: HTMLElement,
      bdo: HTMLElement,
      blockquote: HTMLQuoteElement,
      body: HTMLBodyElement,
      br: HTMLBRElement,
      button: HTMLButtonElement,
      canvas: HTMLCanvasElement,
      caption: HTMLTableCaptionElement,
      circle: SVGCircleElement,
      cite: HTMLElement,
      clipPath: SVGClipPathElement,
      code: HTMLElement,
      col: HTMLTableColElement,
      colgroup: HTMLTableColElement,
      data: HTMLDataElement,
      datalist: HTMLDataListElement,
      dd: HTMLElement,
      defs: SVGDefsElement,
      del: HTMLModElement,
      desc: SVGDescElement,
      details: HTMLDetailsElement,
      dfn: HTMLElement,
      dialog: HTMLDialogElement,
      div: HTMLDivElement,
      dl: HTMLDListElement,
      dt: HTMLElement,
      ellipse: SVGEllipseElement,
      em: HTMLElement,
      embed: HTMLEmbedElement,
      feBlend: SVGFEBlendElement,
      feColorMatrix: SVGFEColorMatrixElement,
      feComponentTransfer: SVGFEComponentTransferElement,
      feComposite: SVGFECompositeElement,
      feConvolveMatrix: SVGFEConvolveMatrixElement,
      feDiffuseLighting: SVGFEDiffuseLightingElement,
      feDisplacementMap: SVGFEDisplacementMapElement,
      feDistantLight: SVGFEDistantLightElement,
      feDropShadow: SVGFEDropShadowElement,
      feFlood: SVGFEFloodElement,
      feFuncA: SVGFEFuncAElement,
      feFuncB: SVGFEFuncBElement,
      feFuncG: SVGFEFuncGElement,
      feFuncR: SVGFEFuncRElement,
      feGaussianBlur: SVGFEGaussianBlurElement,
      feImage: SVGFEImageElement,
      feMerge: SVGFEMergeElement,
      feMergeNode: SVGFEMergeNodeElement,
      feMorphology: SVGFEMorphologyElement,
      feOffset: SVGFEOffsetElement,
      fePointLight: SVGFEPointLightElement,
      feSpecularLighting: SVGFESpecularLightingElement,
      feSpotLight: SVGFESpotLightElement,
      feTile: SVGFETileElement,
      feTurbulence: SVGFETurbulenceElement,
      fieldset: HTMLFieldSetElement,
      figcaption: HTMLElement,
      figure: HTMLElement,
      filter: SVGFilterElement,
      footer: HTMLElement,
      foreignObject: SVGForeignObjectElement,
      form: HTMLFormElement,
      g: SVGGElement,
      h1: HTMLHeadingElement,
      h2: HTMLHeadingElement,
      h3: HTMLHeadingElement,
      h4: HTMLHeadingElement,
      h5: HTMLHeadingElement,
      h6: HTMLHeadingElement,
      head: HTMLHeadElement,
      header: HTMLElement,
      hgroup: HTMLElement,
      hr: HTMLHRElement,
      html: HTMLHtmlElement,
      i: HTMLElement,
      iframe: HTMLIFrameElement,
      image: SVGImageElement,
      img: HTMLImageElement,
      input: HTMLInputElement,
      ins: HTMLModElement,
      kbd: HTMLElement,
      label: HTMLLabelElement,
      legend: HTMLLegendElement,
      li: HTMLLIElement,
      line: SVGLineElement,
      linearGradient: SVGLinearGradientElement,
      link: HTMLLinkElement,
      main: HTMLElement,
      map: HTMLMapElement,
      mark: HTMLElement,
      marker: SVGMarkerElement,
      mask: SVGMaskElement,
      menu: HTMLMenuElement,
      meta: HTMLMetaElement,
      metadata: SVGMetadataElement,
      meter: HTMLMeterElement,
      mpath: SVGMPathElement,
      nav: HTMLElement,
      noscript: HTMLElement,
      `object`: HTMLObjectElement,
      ol: HTMLOListElement,
      optgroup: HTMLOptGroupElement,
      option: HTMLOptionElement,
      output: HTMLOutputElement,
      p: HTMLParagraphElement,
      path: SVGPathElement,
      pattern: SVGPatternElement,
      picture: HTMLPictureElement,
      polygon: SVGPolygonElement,
      polyline: SVGPolylineElement,
      pre: HTMLPreElement,
      progress: HTMLProgressElement,
      q: HTMLQuoteElement,
      radialGradient: SVGRadialGradientElement,
      rect: SVGRectElement,
      rp: HTMLElement,
      rt: HTMLElement,
      ruby: HTMLElement,
      s: HTMLElement,
      samp: HTMLElement,
      script: HTMLScriptElement,
      section: HTMLElement,
      select: HTMLSelectElement,
      set: SVGSetElement,
      slot: HTMLSlotElement,
      small: HTMLElement,
      source: HTMLSourceElement,
      span: HTMLSpanElement,
      stop: SVGStopElement,
      strong: HTMLElement,
      style: HTMLStyleElement,
      sub: HTMLElement,
      summary: HTMLElement,
      sup: HTMLElement,
      svg: SVGSVGElement,
      switch: SVGSwitchElement,
      symbol: SVGSymbolElement,
      table: HTMLTableElement,
      tbody: HTMLTableSectionElement,
      td: HTMLTableCellElement,
      template: HTMLTemplateElement,
      text: SVGTextElement,
      textPath: SVGTextPathElement,
      textarea: HTMLTextAreaElement,
      tfoot: HTMLTableSectionElement,
      th: HTMLTableCellElement,
      thead: HTMLTableSectionElement,
      time: HTMLTimeElement,
      title: HTMLTitleElement,
      tr: HTMLTableRowElement,
      track: HTMLTrackElement,
      tspan: SVGTSpanElement,
      u: HTMLElement,
      ul: HTMLUListElement,
      use: SVGUseElement,
      `var`: HTMLElement,
      video: HTMLVideoElement,
      view: SVGViewElement,
      wbr: HTMLElement
    ): ElementTagNameMap = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementTagNameMap]
    }
    
    extension [Self <: ElementTagNameMap](x: Self) {
      
      inline def setA(value: HTMLAnchorElement): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAbbr(value: HTMLElement): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setAddress(value: HTMLElement): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: SVGAnimateElement): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateMotion(value: SVGAnimateMotionElement): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
      
      inline def setAnimateTransform(value: SVGAnimateTransformElement): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
      
      inline def setArea(value: HTMLAreaElement): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setArticle(value: HTMLElement): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      inline def setAside(value: HTMLElement): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
      
      inline def setAudio(value: HTMLAudioElement): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setB(value: HTMLElement): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBase(value: HTMLBaseElement): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBdi(value: HTMLElement): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
      
      inline def setBdo(value: HTMLElement): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
      
      inline def setBlockquote(value: HTMLQuoteElement): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBody(value: HTMLBodyElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBr(value: HTMLBRElement): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setButton(value: HTMLButtonElement): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: HTMLTableCaptionElement): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCircle(value: SVGCircleElement): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCite(value: HTMLElement): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setClipPath(value: SVGClipPathElement): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setCode(value: HTMLElement): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCol(value: HTMLTableColElement): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColgroup(value: HTMLTableColElement): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
      
      inline def setData(value: HTMLDataElement): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDatalist(value: HTMLDataListElement): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
      
      inline def setDd(value: HTMLElement): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      inline def setDefs(value: SVGDefsElement): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDel(value: HTMLModElement): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDesc(value: SVGDescElement): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: HTMLDetailsElement): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDfn(value: HTMLElement): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: HTMLDialogElement): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDl(value: HTMLDListElement): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
      
      inline def setDt(value: HTMLElement): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      inline def setEllipse(value: SVGEllipseElement): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
      
      inline def setEm(value: HTMLElement): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmbed(value: HTMLEmbedElement): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      inline def setFeBlend(value: SVGFEBlendElement): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
      
      inline def setFeColorMatrix(value: SVGFEColorMatrixElement): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
      
      inline def setFeComponentTransfer(value: SVGFEComponentTransferElement): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
      
      inline def setFeComposite(value: SVGFECompositeElement): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
      
      inline def setFeConvolveMatrix(value: SVGFEConvolveMatrixElement): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
      
      inline def setFeDiffuseLighting(value: SVGFEDiffuseLightingElement): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
      
      inline def setFeDisplacementMap(value: SVGFEDisplacementMapElement): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
      
      inline def setFeDistantLight(value: SVGFEDistantLightElement): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
      
      inline def setFeDropShadow(value: SVGFEDropShadowElement): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
      
      inline def setFeFlood(value: SVGFEFloodElement): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
      
      inline def setFeFuncA(value: SVGFEFuncAElement): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
      
      inline def setFeFuncB(value: SVGFEFuncBElement): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
      
      inline def setFeFuncG(value: SVGFEFuncGElement): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
      
      inline def setFeFuncR(value: SVGFEFuncRElement): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
      
      inline def setFeGaussianBlur(value: SVGFEGaussianBlurElement): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
      
      inline def setFeImage(value: SVGFEImageElement): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
      
      inline def setFeMerge(value: SVGFEMergeElement): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
      
      inline def setFeMergeNode(value: SVGFEMergeNodeElement): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
      
      inline def setFeMorphology(value: SVGFEMorphologyElement): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
      
      inline def setFeOffset(value: SVGFEOffsetElement): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
      
      inline def setFePointLight(value: SVGFEPointLightElement): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
      
      inline def setFeSpecularLighting(value: SVGFESpecularLightingElement): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
      
      inline def setFeSpotLight(value: SVGFESpotLightElement): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
      
      inline def setFeTile(value: SVGFETileElement): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
      
      inline def setFeTurbulence(value: SVGFETurbulenceElement): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
      
      inline def setFieldset(value: HTMLFieldSetElement): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
      
      inline def setFigcaption(value: HTMLElement): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
      
      inline def setFigure(value: HTMLElement): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: SVGFilterElement): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: HTMLElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setForeignObject(value: SVGForeignObjectElement): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
      
      inline def setForm(value: HTMLFormElement): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setG(value: SVGGElement): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setH1(value: HTMLHeadingElement): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: HTMLHeadingElement): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: HTMLHeadingElement): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: HTMLHeadingElement): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: HTMLHeadingElement): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: HTMLHeadingElement): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setHead(value: HTMLHeadElement): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: HTMLElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHgroup(value: HTMLElement): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
      
      inline def setHr(value: HTMLHRElement): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: HTMLHtmlElement): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setI(value: HTMLElement): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIframe(value: HTMLIFrameElement): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setImage(value: SVGImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImg(value: HTMLImageElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setIns(value: HTMLModElement): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setKbd(value: HTMLElement): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: HTMLLabelElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLegend(value: HTMLLegendElement): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLi(value: HTMLLIElement): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLine(value: SVGLineElement): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLinearGradient(value: SVGLinearGradientElement): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
      
      inline def setLink(value: HTMLLinkElement): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setMain(value: HTMLElement): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMap(value: HTMLMapElement): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMark(value: HTMLElement): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: SVGMarkerElement): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMask(value: SVGMaskElement): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: HTMLMenuElement): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: HTMLMetaElement): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: SVGMetadataElement): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMeter(value: HTMLMeterElement): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
      
      inline def setMpath(value: SVGMPathElement): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
      
      inline def setNav(value: HTMLElement): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNoscript(value: HTMLElement): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setObject(value: HTMLObjectElement): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOl(value: HTMLOListElement): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOptgroup(value: HTMLOptGroupElement): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
      
      inline def setOption(value: HTMLOptionElement): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: HTMLOutputElement): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setP(value: HTMLParagraphElement): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPath(value: SVGPathElement): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: SVGPatternElement): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: HTMLPictureElement): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPolygon(value: SVGPolygonElement): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolyline(value: SVGPolylineElement): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setPre(value: HTMLPreElement): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: HTMLProgressElement): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setQ(value: HTMLQuoteElement): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setRadialGradient(value: SVGRadialGradientElement): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
      
      inline def setRect(value: SVGRectElement): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRp(value: HTMLElement): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
      
      inline def setRt(value: HTMLElement): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
      
      inline def setRuby(value: HTMLElement): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
      
      inline def setS(value: HTMLElement): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSamp(value: HTMLElement): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
      
      inline def setScript(value: HTMLScriptElement): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setSection(value: HTMLElement): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: HTMLSelectElement): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SVGSetElement): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSlot(value: HTMLSlotElement): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: HTMLElement): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSource(value: HTMLSourceElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: HTMLSpanElement): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStop(value: SVGStopElement): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: HTMLElement): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: HTMLStyleElement): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setSub(value: HTMLElement): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: HTMLElement): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSup(value: HTMLElement): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: SVGSVGElement): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSwitch(value: SVGSwitchElement): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: SVGSymbolElement): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setTable(value: HTMLTableElement): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTbody(value: HTMLTableSectionElement): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
      
      inline def setTd(value: HTMLTableCellElement): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: HTMLTemplateElement): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setText(value: SVGTextElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextPath(value: SVGTextPathElement): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      inline def setTextarea(value: HTMLTextAreaElement): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTfoot(value: HTMLTableSectionElement): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
      
      inline def setTh(value: HTMLTableCellElement): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThead(value: HTMLTableSectionElement): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
      
      inline def setTime(value: HTMLTimeElement): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: HTMLTitleElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTr(value: HTMLTableRowElement): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: HTMLTrackElement): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTspan(value: SVGTSpanElement): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
      
      inline def setU(value: HTMLElement): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUl(value: HTMLUListElement): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUse(value: SVGUseElement): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setVar(value: HTMLElement): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setView(value: SVGViewElement): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setWbr(value: HTMLElement): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Type can be either a single `ValueType` or an array of `ValueType`
    */
  type SingleOrArray[ValueType] = js.Array[ValueType] | ValueType
}
