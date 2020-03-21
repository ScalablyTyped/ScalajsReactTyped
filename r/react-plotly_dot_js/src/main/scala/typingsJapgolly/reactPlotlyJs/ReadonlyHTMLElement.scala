package typingsJapgolly.reactPlotlyJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.a
import typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.fullscreenchange
import typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.std.Animation
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRect
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.DOMStringMap
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Event_
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.Keyframe
import typingsJapgolly.std.OnErrorEventHandler
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.HTMLElement> */
trait ReadonlyHTMLElement extends js.Object {
  val ATTRIBUTE_NODE: Double
  val CDATA_SECTION_NODE: Double
  val COMMENT_NODE: Double
  val DOCUMENT_FRAGMENT_NODE: Double
  val DOCUMENT_NODE: Double
  val DOCUMENT_POSITION_CONTAINED_BY: Double
  val DOCUMENT_POSITION_CONTAINS: Double
  val DOCUMENT_POSITION_DISCONNECTED: Double
  val DOCUMENT_POSITION_FOLLOWING: Double
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double
  val DOCUMENT_POSITION_PRECEDING: Double
  val DOCUMENT_TYPE_NODE: Double
  val ELEMENT_NODE: Double
  val ENTITY_NODE: Double
  val ENTITY_REFERENCE_NODE: Double
  val NOTATION_NODE: Double
  val PROCESSING_INSTRUCTION_NODE: Double
  val TEXT_NODE: Double
  val accessKey: String
  val accessKeyLabel: String
  val addEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
    Unit
  ]
  val after: js.Function1[/* repeated */ Node | String, Unit]
  val animate: js.Function1[/* keyframes */ js.Array[Keyframe], Animation]
  val append: js.Function1[/* repeated */ Node | String, Unit]
  val appendChild: js.Function1[/* newChild */ Node, Node]
  val assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  val attachShadow: js.Function1[/* init */ ShadowRootInit, ShadowRoot]
  val attributes: NamedNodeMap
  val autocapitalize: String
  val autofocus: Boolean
  val baseURI: String
  val before: js.Function1[/* repeated */ Node | String, Unit]
  val blur: js.Function0[Unit]
  val childElementCount: Double
  val childNodes: NodeListOf[ChildNode with Node]
  val children: HTMLCollection
  val classList: DOMTokenList
  val className: String
  val click: js.Function0[Unit]
  val clientHeight: Double
  val clientLeft: Double
  val clientTop: Double
  val clientWidth: Double
  val cloneNode: js.Function0[Node]
  val closest: js.Function1[a, HTMLAnchorElement | Null]
  val compareDocumentPosition: js.Function1[/* other */ Node, Double]
  val contains: js.Function1[/* other */ Node, Boolean]
  val contentEditable: String
  val dataset: DOMStringMap
  val dir: String
  val dispatchEvent: js.Function1[/* event */ Event_, Boolean]
  val draggable: Boolean
  val firstChild: js.UndefOr[ChildNode] = js.undefined
  val firstElementChild: js.UndefOr[Element] = js.undefined
  val focus: js.Function0[Unit]
  val getAnimations: js.Function0[js.Array[Animation]]
  val getAttribute: js.Function1[/* qualifiedName */ String, String | Null]
  val getAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, String | Null]
  val getAttributeNames: js.Function0[js.Array[String]]
  val getAttributeNode: js.Function1[/* name */ String, Attr | Null]
  val getAttributeNodeNS: js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]
  val getBoundingClientRect: js.Function0[DOMRect]
  val getClientRects: js.Function0[DOMRectList]
  val getElementsByClassName: js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]
  val getElementsByTagName: js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]
  val getElementsByTagNameNS: js.Function2[
    httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
    /* localName */ String, 
    HTMLCollectionOf[HTMLElement]
  ]
  val getRootNode: js.Function0[Node]
  val hasAttribute: js.Function1[/* qualifiedName */ String, Boolean]
  val hasAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Boolean]
  val hasAttributes: js.Function0[Boolean]
  val hasChildNodes: js.Function0[Boolean]
  val hasPointerCapture: js.Function1[/* pointerId */ Double, Boolean]
  val hidden: Boolean
  val id: String
  val innerHTML: String
  val innerText: String
  val inputMode: String
  val insertAdjacentElement: js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  val insertAdjacentHTML: js.Function2[/* where */ InsertPosition, /* html */ String, Unit]
  val insertAdjacentText: js.Function2[/* where */ InsertPosition, /* text */ String, Unit]
  val insertBefore: js.Function2[/* newChild */ Node, /* refChild */ Node, Node]
  val isConnected: Boolean
  val isContentEditable: Boolean
  val isDefaultNamespace: js.Function1[/* namespace */ String, Boolean]
  val isEqualNode: js.Function1[/* otherNode */ Node, Boolean]
  val isSameNode: js.Function1[/* otherNode */ Node, Boolean]
  val lang: String
  val lastChild: js.UndefOr[ChildNode] = js.undefined
  val lastElementChild: js.UndefOr[Element] = js.undefined
  val localName: String
  val lookupNamespaceURI: js.Function1[/* prefix */ String, String | Null]
  val lookupPrefix: js.Function1[/* namespace */ String, String | Null]
  val matches: js.Function1[/* selectors */ String, Boolean]
  val msGetRegionContent: js.Function0[_]
  val namespaceURI: js.UndefOr[String] = js.undefined
  val nextElementSibling: js.UndefOr[Element] = js.undefined
  val nextSibling: js.UndefOr[ChildNode] = js.undefined
  val nodeName: String
  val nodeType: Double
  val nodeValue: js.UndefOr[String] = js.undefined
  val nonce: js.UndefOr[String] = js.undefined
  val normalize: js.Function0[Unit]
  val offsetHeight: Double
  val offsetLeft: Double
  val offsetParent: js.UndefOr[Element] = js.undefined
  val offsetTop: Double
  val offsetWidth: Double
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  val onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  val oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onerror: OnErrorEventHandler
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  val onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  val onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]] = js.undefined
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.undefined
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  val outerHTML: String
  val ownerDocument: js.UndefOr[Document_] = js.undefined
  val parentElement: js.UndefOr[HTMLElement] = js.undefined
  val parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  val prefix: js.UndefOr[String] = js.undefined
  val prepend: js.Function1[/* repeated */ Node | String, Unit]
  val previousElementSibling: js.UndefOr[Element] = js.undefined
  val previousSibling: js.UndefOr[ChildNode] = js.undefined
  val querySelector: js.Function1[a, HTMLAnchorElement | Null]
  val querySelectorAll: js.Function1[a, NodeListOf[HTMLAnchorElement with Node]]
  val releasePointerCapture: js.Function1[/* pointerId */ Double, Unit]
  val remove: js.Function0[Unit]
  val removeAttribute: js.Function1[/* qualifiedName */ String, Unit]
  val removeAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Unit]
  val removeAttributeNode: js.Function1[/* attr */ Attr, Attr]
  val removeChild: js.Function1[/* oldChild */ Node, Node]
  val removeEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
    Unit
  ]
  val replaceChild: js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]
  val replaceWith: js.Function1[/* repeated */ Node | String, Unit]
  val requestFullscreen: js.Function0[js.Promise[Unit]]
  val requestPointerLock: js.Function0[Unit]
  val scroll: js.Function0[Unit]
  val scrollBy: js.Function0[Unit]
  val scrollHeight: Double
  val scrollIntoView: js.Function0[Unit]
  val scrollLeft: Double
  val scrollTo: js.Function0[Unit]
  val scrollTop: Double
  val scrollWidth: Double
  val setAttribute: js.Function2[/* qualifiedName */ String, /* value */ String, Unit]
  val setAttributeNS: js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  val setAttributeNode: js.Function1[/* attr */ Attr, Attr | Null]
  val setAttributeNodeNS: js.Function1[/* attr */ Attr, Attr | Null]
  val setPointerCapture: js.Function1[/* pointerId */ Double, Unit]
  val shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  val slot: String
  val spellcheck: Boolean
  val style: CSSStyleDeclaration
  val tabIndex: Double
  val tagName: String
  val textContent: js.UndefOr[String] = js.undefined
  val title: String
  val toggleAttribute: js.Function1[/* qualifiedName */ String, Boolean]
  val translate: Boolean
  val webkitMatchesSelector: js.Function1[/* selectors */ String, Boolean]
}

object ReadonlyHTMLElement {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Double,
    CDATA_SECTION_NODE: Double,
    COMMENT_NODE: Double,
    DOCUMENT_FRAGMENT_NODE: Double,
    DOCUMENT_NODE: Double,
    DOCUMENT_POSITION_CONTAINED_BY: Double,
    DOCUMENT_POSITION_CONTAINS: Double,
    DOCUMENT_POSITION_DISCONNECTED: Double,
    DOCUMENT_POSITION_FOLLOWING: Double,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double,
    DOCUMENT_POSITION_PRECEDING: Double,
    DOCUMENT_TYPE_NODE: Double,
    ELEMENT_NODE: Double,
    ENTITY_NODE: Double,
    ENTITY_REFERENCE_NODE: Double,
    NOTATION_NODE: Double,
    PROCESSING_INSTRUCTION_NODE: Double,
    TEXT_NODE: Double,
    accessKey: String,
    accessKeyLabel: String,
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, js.Any]) => Callback,
    after: /* repeated */ Node | String => Callback,
    animate: /* keyframes */ js.Array[Keyframe] => CallbackTo[Animation],
    append: /* repeated */ Node | String => Callback,
    appendChild: /* newChild */ Node => CallbackTo[Node],
    attachShadow: /* init */ ShadowRootInit => CallbackTo[ShadowRoot],
    attributes: NamedNodeMap,
    autocapitalize: String,
    autofocus: Boolean,
    baseURI: String,
    before: /* repeated */ Node | String => Callback,
    blur: Callback,
    childElementCount: Double,
    childNodes: NodeListOf[ChildNode with Node],
    children: HTMLCollection,
    classList: DOMTokenList,
    className: String,
    click: Callback,
    clientHeight: Double,
    clientLeft: Double,
    clientTop: Double,
    clientWidth: Double,
    cloneNode: CallbackTo[Node],
    closest: a => CallbackTo[HTMLAnchorElement | Null],
    compareDocumentPosition: /* other */ Node => CallbackTo[Double],
    contains: /* other */ Node => CallbackTo[Boolean],
    contentEditable: String,
    dataset: DOMStringMap,
    dir: String,
    dispatchEvent: /* event */ Event_ => CallbackTo[Boolean],
    draggable: Boolean,
    focus: Callback,
    getAnimations: CallbackTo[js.Array[Animation]],
    getAttribute: /* qualifiedName */ String => CallbackTo[String | Null],
    getAttributeNS: (/* namespace */ String, /* localName */ String) => CallbackTo[String | Null],
    getAttributeNames: CallbackTo[js.Array[String]],
    getAttributeNode: /* name */ String => CallbackTo[Attr | Null],
    getAttributeNodeNS: (/* namespaceURI */ String, /* localName */ String) => CallbackTo[Attr | Null],
    getBoundingClientRect: CallbackTo[DOMRect],
    getClientRects: CallbackTo[DOMRectList],
    getElementsByClassName: /* classNames */ String => CallbackTo[HTMLCollectionOf[Element]],
    getElementsByTagName: a => CallbackTo[HTMLCollectionOf[HTMLAnchorElement]],
    getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => CallbackTo[HTMLCollectionOf[HTMLElement]],
    getRootNode: CallbackTo[Node],
    hasAttribute: /* qualifiedName */ String => CallbackTo[Boolean],
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => CallbackTo[Boolean],
    hasAttributes: CallbackTo[Boolean],
    hasChildNodes: CallbackTo[Boolean],
    hasPointerCapture: /* pointerId */ Double => CallbackTo[Boolean],
    hidden: Boolean,
    id: String,
    innerHTML: String,
    innerText: String,
    inputMode: String,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => CallbackTo[Element | Null],
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Callback,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Callback,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => CallbackTo[Node],
    isConnected: Boolean,
    isContentEditable: Boolean,
    isDefaultNamespace: /* namespace */ String => CallbackTo[Boolean],
    isEqualNode: /* otherNode */ Node => CallbackTo[Boolean],
    isSameNode: /* otherNode */ Node => CallbackTo[Boolean],
    lang: String,
    localName: String,
    lookupNamespaceURI: /* prefix */ String => CallbackTo[String | Null],
    lookupPrefix: /* namespace */ String => CallbackTo[String | Null],
    matches: /* selectors */ String => CallbackTo[Boolean],
    msGetRegionContent: CallbackTo[js.Any],
    nodeName: String,
    nodeType: Double,
    normalize: Callback,
    offsetHeight: Double,
    offsetLeft: Double,
    offsetTop: Double,
    offsetWidth: Double,
    outerHTML: String,
    prepend: /* repeated */ Node | String => Callback,
    querySelector: a => CallbackTo[HTMLAnchorElement | Null],
    querySelectorAll: a => CallbackTo[NodeListOf[HTMLAnchorElement with Node]],
    releasePointerCapture: /* pointerId */ Double => Callback,
    remove: Callback,
    removeAttribute: /* qualifiedName */ String => Callback,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Callback,
    removeAttributeNode: /* attr */ Attr => CallbackTo[Attr],
    removeChild: /* oldChild */ Node => CallbackTo[Node],
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, js.Any]) => Callback,
    replaceChild: (/* newChild */ Node, /* oldChild */ Node) => CallbackTo[Node],
    replaceWith: /* repeated */ Node | String => Callback,
    requestFullscreen: CallbackTo[js.Promise[Unit]],
    requestPointerLock: Callback,
    scroll: Callback,
    scrollBy: Callback,
    scrollHeight: Double,
    scrollIntoView: Callback,
    scrollLeft: Double,
    scrollTo: Callback,
    scrollTop: Double,
    scrollWidth: Double,
    setAttribute: (/* qualifiedName */ String, /* value */ String) => Callback,
    setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Callback,
    setAttributeNode: /* attr */ Attr => CallbackTo[Attr | Null],
    setAttributeNodeNS: /* attr */ Attr => CallbackTo[Attr | Null],
    setPointerCapture: /* pointerId */ Double => Callback,
    slot: String,
    spellcheck: Boolean,
    style: CSSStyleDeclaration,
    tabIndex: Double,
    tagName: String,
    title: String,
    toggleAttribute: /* qualifiedName */ String => CallbackTo[Boolean],
    translate: Boolean,
    webkitMatchesSelector: /* selectors */ String => CallbackTo[Boolean],
    assignedSlot: HTMLSlotElement = null,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
    lastChild: ChildNode = null,
    lastElementChild: Element = null,
    namespaceURI: String = null,
    nextElementSibling: Element = null,
    nextSibling: ChildNode = null,
    nodeValue: String = null,
    nonce: String = null,
    offsetParent: Element = null,
    onabort: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncanplay: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncanplaythrough: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onclick: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncontextmenu: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    oncopy: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncut: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ondragleave: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onemptied: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onended: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onerror: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => CallbackTo[js.Any] = null,
    onfocus: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _] = null,
    onfullscreenchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ongotpointercapture: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oninvalid: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onkeydown: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onloadeddata: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onloadedmetadata: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onloadstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onlostpointercapture: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onpaste: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onplay: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onplaying: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onpointercancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ProgressEvent, _] = null,
    onratechange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onreset: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onresize: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onseeking: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onselect: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onselectionchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onselectstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onstalled: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onsubmit: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onsuspend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ontimeupdate: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ontoggle: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ontouchcancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    onvolumechange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onwaiting: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onwheel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ WheelEvent, _] = null,
    ownerDocument: Document_ = null,
    parentElement: HTMLElement = null,
    parentNode: Node with ParentNode = null,
    prefix: String = null,
    previousElementSibling: Element = null,
    previousSibling: ChildNode = null,
    shadowRoot: ShadowRoot = null,
    textContent: String = null
  ): ReadonlyHTMLElement = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINED_BY = DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINS = DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any], DOCUMENT_POSITION_DISCONNECTED = DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any], DOCUMENT_POSITION_FOLLOWING = DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any], DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any], DOCUMENT_POSITION_PRECEDING = DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], accessKey = accessKey.asInstanceOf[js.Any], accessKeyLabel = accessKeyLabel.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], baseURI = baseURI.asInstanceOf[js.Any], childElementCount = childElementCount.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clientHeight = clientHeight.asInstanceOf[js.Any], clientLeft = clientLeft.asInstanceOf[js.Any], clientTop = clientTop.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], spellcheck = spellcheck.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.fullscreenchange, t1: /* listener */ js.ThisFunction1[
  typingsJapgolly.reactPlotlyJs.ReadonlyHTMLElement, 
  /* ev */ typingsJapgolly.std.Event_, 
  js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => after(t0).runNow()))
    __obj.updateDynamic("animate")(js.Any.fromFunction1((t0: /* keyframes */ js.Array[typingsJapgolly.std.Keyframe]) => animate(t0).runNow()))
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => append(t0).runNow()))
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: /* newChild */ org.scalajs.dom.raw.Node) => appendChild(t0).runNow()))
    __obj.updateDynamic("attachShadow")(js.Any.fromFunction1((t0: /* init */ typingsJapgolly.std.ShadowRootInit) => attachShadow(t0).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => before(t0).runNow()))
    __obj.updateDynamic("blur")(blur.toJsFn)
    __obj.updateDynamic("click")(click.toJsFn)
    __obj.updateDynamic("cloneNode")(cloneNode.toJsFn)
    __obj.updateDynamic("closest")(js.Any.fromFunction1((t0: typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.a) => closest(t0).runNow()))
    __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => compareDocumentPosition(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => contains(t0).runNow()))
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => dispatchEvent(t0).runNow()))
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("getAnimations")(getAnimations.toJsFn)
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => getAttributeNS(t0, t1).runNow()))
    __obj.updateDynamic("getAttributeNames")(getAttributeNames.toJsFn)
    __obj.updateDynamic("getAttributeNode")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => getAttributeNode(t0).runNow()))
    __obj.updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2((t0: /* namespaceURI */ java.lang.String, t1: /* localName */ java.lang.String) => getAttributeNodeNS(t0, t1).runNow()))
    __obj.updateDynamic("getBoundingClientRect")(getBoundingClientRect.toJsFn)
    __obj.updateDynamic("getClientRects")(getClientRects.toJsFn)
    __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1((t0: /* classNames */ java.lang.String) => getElementsByClassName(t0).runNow()))
    __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.a) => getElementsByTagName(t0).runNow()))
    __obj.updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2((t0: typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, t1: /* localName */ java.lang.String) => getElementsByTagNameNS(t0, t1).runNow()))
    __obj.updateDynamic("getRootNode")(getRootNode.toJsFn)
    __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => hasAttribute(t0).runNow()))
    __obj.updateDynamic("hasAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => hasAttributeNS(t0, t1).runNow()))
    __obj.updateDynamic("hasAttributes")(hasAttributes.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
    __obj.updateDynamic("hasPointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => hasPointerCapture(t0).runNow()))
    __obj.updateDynamic("insertAdjacentElement")(js.Any.fromFunction2((t0: /* position */ typingsJapgolly.std.InsertPosition, t1: /* insertedElement */ org.scalajs.dom.raw.Element) => insertAdjacentElement(t0, t1).runNow()))
    __obj.updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2((t0: /* where */ typingsJapgolly.std.InsertPosition, t1: /* html */ java.lang.String) => insertAdjacentHTML(t0, t1).runNow()))
    __obj.updateDynamic("insertAdjacentText")(js.Any.fromFunction2((t0: /* where */ typingsJapgolly.std.InsertPosition, t1: /* text */ java.lang.String) => insertAdjacentText(t0, t1).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: /* newChild */ org.scalajs.dom.raw.Node, t1: /* refChild */ org.scalajs.dom.raw.Node) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("isDefaultNamespace")(js.Any.fromFunction1((t0: /* namespace */ java.lang.String) => isDefaultNamespace(t0).runNow()))
    __obj.updateDynamic("isEqualNode")(js.Any.fromFunction1((t0: /* otherNode */ org.scalajs.dom.raw.Node) => isEqualNode(t0).runNow()))
    __obj.updateDynamic("isSameNode")(js.Any.fromFunction1((t0: /* otherNode */ org.scalajs.dom.raw.Node) => isSameNode(t0).runNow()))
    __obj.updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1((t0: /* prefix */ java.lang.String) => lookupNamespaceURI(t0).runNow()))
    __obj.updateDynamic("lookupPrefix")(js.Any.fromFunction1((t0: /* namespace */ java.lang.String) => lookupPrefix(t0).runNow()))
    __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: /* selectors */ java.lang.String) => matches(t0).runNow()))
    __obj.updateDynamic("msGetRegionContent")(msGetRegionContent.toJsFn)
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("prepend")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => prepend(t0).runNow()))
    __obj.updateDynamic("querySelector")(js.Any.fromFunction1((t0: typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.a) => querySelector(t0).runNow()))
    __obj.updateDynamic("querySelectorAll")(js.Any.fromFunction1((t0: typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.a) => querySelectorAll(t0).runNow()))
    __obj.updateDynamic("releasePointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => releasePointerCapture(t0).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => removeAttribute(t0).runNow()))
    __obj.updateDynamic("removeAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => removeAttributeNS(t0, t1).runNow()))
    __obj.updateDynamic("removeAttributeNode")(js.Any.fromFunction1((t0: /* attr */ org.scalajs.dom.raw.Attr) => removeAttributeNode(t0).runNow()))
    __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: /* oldChild */ org.scalajs.dom.raw.Node) => removeChild(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactPlotlyJs.reactPlotlyJsStrings.fullscreenchange, t1: /* listener */ js.ThisFunction1[
  typingsJapgolly.reactPlotlyJs.ReadonlyHTMLElement, 
  /* ev */ typingsJapgolly.std.Event_, 
  js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: /* newChild */ org.scalajs.dom.raw.Node, t1: /* oldChild */ org.scalajs.dom.raw.Node) => replaceChild(t0, t1).runNow()))
    __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => replaceWith(t0).runNow()))
    __obj.updateDynamic("requestFullscreen")(requestFullscreen.toJsFn)
    __obj.updateDynamic("requestPointerLock")(requestPointerLock.toJsFn)
    __obj.updateDynamic("scroll")(scroll.toJsFn)
    __obj.updateDynamic("scrollBy")(scrollBy.toJsFn)
    __obj.updateDynamic("scrollIntoView")(scrollIntoView.toJsFn)
    __obj.updateDynamic("scrollTo")(scrollTo.toJsFn)
    __obj.updateDynamic("setAttribute")(js.Any.fromFunction2((t0: /* qualifiedName */ java.lang.String, t1: /* value */ java.lang.String) => setAttribute(t0, t1).runNow()))
    __obj.updateDynamic("setAttributeNS")(js.Any.fromFunction3((t0: /* namespace */ java.lang.String, t1: /* qualifiedName */ java.lang.String, t2: /* value */ java.lang.String) => setAttributeNS(t0, t1, t2).runNow()))
    __obj.updateDynamic("setAttributeNode")(js.Any.fromFunction1((t0: /* attr */ org.scalajs.dom.raw.Attr) => setAttributeNode(t0).runNow()))
    __obj.updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1((t0: /* attr */ org.scalajs.dom.raw.Attr) => setAttributeNodeNS(t0).runNow()))
    __obj.updateDynamic("setPointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => setPointerCapture(t0).runNow()))
    __obj.updateDynamic("toggleAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => toggleAttribute(t0).runNow()))
    __obj.updateDynamic("webkitMatchesSelector")(js.Any.fromFunction1((t0: /* selectors */ java.lang.String) => webkitMatchesSelector(t0).runNow()))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onanimationcancel != null) __obj.updateDynamic("onanimationcancel")(onanimationcancel.asInstanceOf[js.Any])
    if (onanimationend != null) __obj.updateDynamic("onanimationend")(onanimationend.asInstanceOf[js.Any])
    if (onanimationiteration != null) __obj.updateDynamic("onanimationiteration")(onanimationiteration.asInstanceOf[js.Any])
    if (onanimationstart != null) __obj.updateDynamic("onanimationstart")(onanimationstart.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncancel != null) __obj.updateDynamic("oncancel")(oncancel.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncopy != null) __obj.updateDynamic("oncopy")(oncopy.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
    if (oncut != null) __obj.updateDynamic("oncut")(oncut.asInstanceOf[js.Any])
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick.asInstanceOf[js.Any])
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag.asInstanceOf[js.Any])
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend.asInstanceOf[js.Any])
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter.asInstanceOf[js.Any])
    if (ondragexit != null) __obj.updateDynamic("ondragexit")(ondragexit.asInstanceOf[js.Any])
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave.asInstanceOf[js.Any])
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover.asInstanceOf[js.Any])
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart.asInstanceOf[js.Any])
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop.asInstanceOf[js.Any])
    if (ondurationchange != null) __obj.updateDynamic("ondurationchange")(ondurationchange.asInstanceOf[js.Any])
    if (onemptied != null) __obj.updateDynamic("onemptied")(onemptied.asInstanceOf[js.Any])
    if (onended != null) __obj.updateDynamic("onended")(onended.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction5((t0: /* event */ typingsJapgolly.std.Event_ | java.lang.String, t1: /* source */ js.UndefOr[java.lang.String], t2: /* lineno */ js.UndefOr[scala.Double], t3: /* colno */ js.UndefOr[scala.Double], t4: /* error */ js.UndefOr[js.Error]) => onerror(t0, t1, t2, t3, t4).runNow()))
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (onfullscreenchange != null) __obj.updateDynamic("onfullscreenchange")(onfullscreenchange.asInstanceOf[js.Any])
    if (onfullscreenerror != null) __obj.updateDynamic("onfullscreenerror")(onfullscreenerror.asInstanceOf[js.Any])
    if (ongotpointercapture != null) __obj.updateDynamic("ongotpointercapture")(ongotpointercapture.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onlostpointercapture != null) __obj.updateDynamic("onlostpointercapture")(onlostpointercapture.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onpause != null) __obj.updateDynamic("onpause")(onpause.asInstanceOf[js.Any])
    if (onplay != null) __obj.updateDynamic("onplay")(onplay.asInstanceOf[js.Any])
    if (onplaying != null) __obj.updateDynamic("onplaying")(onplaying.asInstanceOf[js.Any])
    if (onpointercancel != null) __obj.updateDynamic("onpointercancel")(onpointercancel.asInstanceOf[js.Any])
    if (onpointerdown != null) __obj.updateDynamic("onpointerdown")(onpointerdown.asInstanceOf[js.Any])
    if (onpointerenter != null) __obj.updateDynamic("onpointerenter")(onpointerenter.asInstanceOf[js.Any])
    if (onpointerleave != null) __obj.updateDynamic("onpointerleave")(onpointerleave.asInstanceOf[js.Any])
    if (onpointermove != null) __obj.updateDynamic("onpointermove")(onpointermove.asInstanceOf[js.Any])
    if (onpointerout != null) __obj.updateDynamic("onpointerout")(onpointerout.asInstanceOf[js.Any])
    if (onpointerover != null) __obj.updateDynamic("onpointerover")(onpointerover.asInstanceOf[js.Any])
    if (onpointerup != null) __obj.updateDynamic("onpointerup")(onpointerup.asInstanceOf[js.Any])
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    if (onratechange != null) __obj.updateDynamic("onratechange")(onratechange.asInstanceOf[js.Any])
    if (onreset != null) __obj.updateDynamic("onreset")(onreset.asInstanceOf[js.Any])
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onsecuritypolicyviolation != null) __obj.updateDynamic("onsecuritypolicyviolation")(onsecuritypolicyviolation.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectionchange != null) __obj.updateDynamic("onselectionchange")(onselectionchange.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (ontoggle != null) __obj.updateDynamic("ontoggle")(ontoggle.asInstanceOf[js.Any])
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(ontouchcancel.asInstanceOf[js.Any])
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(ontouchend.asInstanceOf[js.Any])
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(ontouchmove.asInstanceOf[js.Any])
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(ontouchstart.asInstanceOf[js.Any])
    if (ontransitioncancel != null) __obj.updateDynamic("ontransitioncancel")(ontransitioncancel.asInstanceOf[js.Any])
    if (ontransitionend != null) __obj.updateDynamic("ontransitionend")(ontransitionend.asInstanceOf[js.Any])
    if (ontransitionrun != null) __obj.updateDynamic("ontransitionrun")(ontransitionrun.asInstanceOf[js.Any])
    if (ontransitionstart != null) __obj.updateDynamic("ontransitionstart")(ontransitionstart.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    if (onwheel != null) __obj.updateDynamic("onwheel")(onwheel.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHTMLElement]
  }
}

