package typingsJapgolly.reactFlatpickr.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FileList
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLabelElement
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
import org.scalajs.dom.raw.ValidityState
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.flatpickr.globalsMod._Global_.Date
import typingsJapgolly.flatpickr.instanceMod.Instance
import typingsJapgolly.flatpickr.mod.flatpickr.Options.Hook
import typingsJapgolly.flatpickr.mod.flatpickr.Options.Options
import typingsJapgolly.reactFlatpickr.OmitDateTimePickerPropsop
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.a
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.backward
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.forward
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.fullscreenchange
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.none
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

/* Inlined parent react-flatpickr.react-flatpickr.Omit<std.Partial<std.HTMLInputElement>, 'value'> */
trait DateTimePickerProps extends js.Object {
  var ATTRIBUTE_NODE: js.UndefOr[Double] = js.undefined
  var CDATA_SECTION_NODE: js.UndefOr[Double] = js.undefined
  var COMMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.undefined
  var DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.undefined
  var ELEMENT_NODE: js.UndefOr[Double] = js.undefined
  var ENTITY_NODE: js.UndefOr[Double] = js.undefined
  var ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.undefined
  var NOTATION_NODE: js.UndefOr[Double] = js.undefined
  var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.undefined
  var TEXT_NODE: js.UndefOr[Double] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var accessKeyLabel: js.UndefOr[String] = js.undefined
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
      Unit
    ]
  ] = js.undefined
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var align: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Function1[/* keyframes */ js.Array[Keyframe], Animation]] = js.undefined
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  var assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
  var attributes: js.UndefOr[NamedNodeMap] = js.undefined
  var autocapitalize: js.UndefOr[String] = js.undefined
  var autocomplete: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var baseURI: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var checkValidity: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var childElementCount: js.UndefOr[Double] = js.undefined
  var childNodes: js.UndefOr[NodeListOf[ChildNode with Node]] = js.undefined
  var children: js.UndefOr[HTMLCollection] = js.undefined
  var classList: js.UndefOr[DOMTokenList] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var clientHeight: js.UndefOr[Double] = js.undefined
  var clientLeft: js.UndefOr[Double] = js.undefined
  var clientTop: js.UndefOr[Double] = js.undefined
  var clientWidth: js.UndefOr[Double] = js.undefined
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.undefined
  var contentEditable: js.UndefOr[String] = js.undefined
  var dataset: js.UndefOr[DOMStringMap] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dirName: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event_, Boolean]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var files: js.UndefOr[FileList] = js.undefined
  var firstChild: js.UndefOr[ChildNode] = js.undefined
  var firstElementChild: js.UndefOr[Element] = js.undefined
  var focus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var form: js.UndefOr[HTMLFormElement] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEnctype: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.undefined
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.undefined
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.undefined
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
  var getAttributeNode: js.UndefOr[js.Function1[/* name */ String, Attr | Null]] = js.undefined
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]] = js.undefined
  var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
  var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.undefined
  var getElementsByClassName: js.UndefOr[js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]] = js.undefined
  var getElementsByTagName: js.UndefOr[js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]] = js.undefined
  var getElementsByTagNameNS: js.UndefOr[
    js.Function2[
      httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
      /* localName */ String, 
      HTMLCollectionOf[HTMLElement]
    ]
  ] = js.undefined
  var getRootNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.undefined
  var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var innerHTML: js.UndefOr[String] = js.undefined
  var innerText: js.UndefOr[String] = js.undefined
  var inputMode: js.UndefOr[String] = js.undefined
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.undefined
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.undefined
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.undefined
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.undefined
  var isConnected: js.UndefOr[Boolean] = js.undefined
  var isContentEditable: js.UndefOr[Boolean] = js.undefined
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.undefined
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var labels: js.UndefOr[NodeListOf[HTMLLabelElement with Node]] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lastChild: js.UndefOr[ChildNode] = js.undefined
  var lastElementChild: js.UndefOr[Element] = js.undefined
  var list: js.UndefOr[HTMLElement] = js.undefined
  var localName: js.UndefOr[String] = js.undefined
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.undefined
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.undefined
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespaceURI: js.UndefOr[String] = js.undefined
  var nextElementSibling: js.UndefOr[Element] = js.undefined
  var nextSibling: js.UndefOr[ChildNode] = js.undefined
  var nodeName: js.UndefOr[String] = js.undefined
  var nodeType: js.UndefOr[Double] = js.undefined
  var nodeValue: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var offsetHeight: js.UndefOr[Double] = js.undefined
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetParent: js.UndefOr[Element] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var offsetWidth: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[Hook] = js.undefined
  var onClose: js.UndefOr[Hook] = js.undefined
  var onDayCreate: js.UndefOr[Hook] = js.undefined
  var onMonthChange: js.UndefOr[Hook] = js.undefined
  var onOpen: js.UndefOr[Hook] = js.undefined
  var onReady: js.UndefOr[Hook] = js.undefined
  var onValueUpdate: js.UndefOr[Hook] = js.undefined
  var onYearChange: js.UndefOr[Hook] = js.undefined
  var onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
  var onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]] = js.undefined
  var onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.undefined
  var onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var outerHTML: js.UndefOr[String] = js.undefined
  var ownerDocument: js.UndefOr[Document_] = js.undefined
  var parentElement: js.UndefOr[HTMLElement] = js.undefined
  var parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var previousElementSibling: js.UndefOr[Element] = js.undefined
  var previousSibling: js.UndefOr[ChildNode] = js.undefined
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement with Node]]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.undefined
  var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.undefined
  var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.undefined
  var removeChild: js.UndefOr[js.Function1[/* oldChild */ Node, Node]] = js.undefined
  var removeEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
      Unit
    ]
  ] = js.undefined
  var render: js.UndefOr[
    js.Function2[
      /* props */ OmitDateTimePickerPropsop, 
      /* ref */ js.Function1[/* node */ HTMLInputElement, Unit], 
      japgolly.scalajs.react.raw.React.Element
    ]
  ] = js.undefined
  var replaceChild: js.UndefOr[js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]] = js.undefined
  var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var reportValidity: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollBy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollHeight: js.UndefOr[Double] = js.undefined
  var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
  var scrollWidth: js.UndefOr[Double] = js.undefined
  var select: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectionDirection: js.UndefOr[forward | backward | none] = js.undefined
  var selectionEnd: js.UndefOr[Double] = js.undefined
  var selectionStart: js.UndefOr[Double] = js.undefined
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.undefined
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.undefined
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setCustomValidity: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var setRangeText: js.UndefOr[js.Function1[/* replacement */ String, Unit]] = js.undefined
  var setSelectionRange: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[String] = js.undefined
  var stepDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stepUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var translate: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var validationMessage: js.UndefOr[String] = js.undefined
  var validity: js.UndefOr[ValidityState] = js.undefined
  var value: js.UndefOr[String | js.Date | Double | (js.Array[String | js.Date | Double])] = js.undefined
  var valueAsDate: js.UndefOr[js.Date] = js.undefined
  var valueAsNumber: js.UndefOr[Double] = js.undefined
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var willValidate: js.UndefOr[Boolean] = js.undefined
}

object DateTimePickerProps {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Int | Double = null,
    CDATA_SECTION_NODE: Int | Double = null,
    COMMENT_NODE: Int | Double = null,
    DOCUMENT_FRAGMENT_NODE: Int | Double = null,
    DOCUMENT_NODE: Int | Double = null,
    DOCUMENT_POSITION_CONTAINED_BY: Int | Double = null,
    DOCUMENT_POSITION_CONTAINS: Int | Double = null,
    DOCUMENT_POSITION_DISCONNECTED: Int | Double = null,
    DOCUMENT_POSITION_FOLLOWING: Int | Double = null,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Int | Double = null,
    DOCUMENT_POSITION_PRECEDING: Int | Double = null,
    DOCUMENT_TYPE_NODE: Int | Double = null,
    ELEMENT_NODE: Int | Double = null,
    ENTITY_NODE: Int | Double = null,
    ENTITY_REFERENCE_NODE: Int | Double = null,
    NOTATION_NODE: Int | Double = null,
    PROCESSING_INSTRUCTION_NODE: Int | Double = null,
    TEXT_NODE: Int | Double = null,
    accept: String = null,
    accessKey: String = null,
    accessKeyLabel: String = null,
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, js.Any]) => Callback = null,
    after: /* repeated */ Node | String => Callback = null,
    align: String = null,
    alt: String = null,
    animate: /* keyframes */ js.Array[Keyframe] => CallbackTo[Animation] = null,
    append: /* repeated */ Node | String => Callback = null,
    appendChild: /* newChild */ Node => CallbackTo[Node] = null,
    assignedSlot: HTMLSlotElement = null,
    attachShadow: /* init */ ShadowRootInit => CallbackTo[ShadowRoot] = null,
    attributes: NamedNodeMap = null,
    autocapitalize: String = null,
    autocomplete: String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    baseURI: String = null,
    before: /* repeated */ Node | String => Callback = null,
    blur: js.UndefOr[Callback] = js.undefined,
    checkValidity: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    childElementCount: Int | Double = null,
    childNodes: NodeListOf[ChildNode with Node] = null,
    children: HTMLCollection = null,
    classList: DOMTokenList = null,
    className: String = null,
    click: js.UndefOr[Callback] = js.undefined,
    clientHeight: Int | Double = null,
    clientLeft: Int | Double = null,
    clientTop: Int | Double = null,
    clientWidth: Int | Double = null,
    cloneNode: js.UndefOr[CallbackTo[Node]] = js.undefined,
    closest: a => CallbackTo[HTMLAnchorElement | Null] = null,
    compareDocumentPosition: /* other */ Node => CallbackTo[Double] = null,
    contains: /* other */ Node => CallbackTo[Boolean] = null,
    contentEditable: String = null,
    dataset: DOMStringMap = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    dir: String = null,
    dirName: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dispatchEvent: /* event */ Event_ => CallbackTo[Boolean] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    files: FileList = null,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
    focus: js.UndefOr[Callback] = js.undefined,
    form: HTMLFormElement = null,
    formAction: String = null,
    formEnctype: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    getAnimations: js.UndefOr[CallbackTo[js.Array[Animation]]] = js.undefined,
    getAttribute: /* qualifiedName */ String => CallbackTo[String | Null] = null,
    getAttributeNS: (/* namespace */ String, /* localName */ String) => CallbackTo[String | Null] = null,
    getAttributeNames: js.UndefOr[CallbackTo[js.Array[String]]] = js.undefined,
    getAttributeNode: /* name */ String => CallbackTo[Attr | Null] = null,
    getAttributeNodeNS: (/* namespaceURI */ String, /* localName */ String) => CallbackTo[Attr | Null] = null,
    getBoundingClientRect: js.UndefOr[CallbackTo[DOMRect]] = js.undefined,
    getClientRects: js.UndefOr[CallbackTo[DOMRectList]] = js.undefined,
    getElementsByClassName: /* classNames */ String => CallbackTo[HTMLCollectionOf[Element]] = null,
    getElementsByTagName: a => CallbackTo[HTMLCollectionOf[HTMLAnchorElement]] = null,
    getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => CallbackTo[HTMLCollectionOf[HTMLElement]] = null,
    getRootNode: js.UndefOr[CallbackTo[Node]] = js.undefined,
    hasAttribute: /* qualifiedName */ String => CallbackTo[Boolean] = null,
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => CallbackTo[Boolean] = null,
    hasAttributes: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasChildNodes: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasPointerCapture: /* pointerId */ Double => CallbackTo[Boolean] = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    innerHTML: String = null,
    innerText: String = null,
    inputMode: String = null,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => CallbackTo[Element | Null] = null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Callback = null,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Callback = null,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => CallbackTo[Node] = null,
    isConnected: js.UndefOr[Boolean] = js.undefined,
    isContentEditable: js.UndefOr[Boolean] = js.undefined,
    isDefaultNamespace: /* namespace */ String => CallbackTo[Boolean] = null,
    isEqualNode: /* otherNode */ Node => CallbackTo[Boolean] = null,
    isSameNode: /* otherNode */ Node => CallbackTo[Boolean] = null,
    labels: NodeListOf[HTMLLabelElement with Node] = null,
    lang: String = null,
    lastChild: ChildNode = null,
    lastElementChild: Element = null,
    list: HTMLElement = null,
    localName: String = null,
    lookupNamespaceURI: /* prefix */ String => CallbackTo[String | Null] = null,
    lookupPrefix: /* namespace */ String => CallbackTo[String | Null] = null,
    matches: /* selectors */ String => CallbackTo[Boolean] = null,
    max: String = null,
    maxLength: Int | Double = null,
    min: String = null,
    minLength: Int | Double = null,
    msGetRegionContent: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespaceURI: String = null,
    nextElementSibling: Element = null,
    nextSibling: ChildNode = null,
    nodeName: String = null,
    nodeType: Int | Double = null,
    nodeValue: String = null,
    nonce: String = null,
    normalize: js.UndefOr[Callback] = js.undefined,
    offsetHeight: Int | Double = null,
    offsetLeft: Int | Double = null,
    offsetParent: Element = null,
    offsetTop: Int | Double = null,
    offsetWidth: Int | Double = null,
    onChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onClose: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onDayCreate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onMonthChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onOpen: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onReady: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onValueUpdate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onYearChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Callback = null,
    onabort: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncanplay: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncanplaythrough: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onclick: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncontextmenu: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    oncopy: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oncut: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ondragleave: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onemptied: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onended: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onerror: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => CallbackTo[js.Any] = null,
    onfocus: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, _] = null,
    onfullscreenchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ongotpointercapture: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    oninvalid: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onkeydown: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onloadeddata: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onloadedmetadata: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onloadstart: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onlostpointercapture: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, _] = null,
    onpaste: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onplay: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onplaying: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onpointercancel: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[DateTimePickerProps, /* ev */ ProgressEvent, _] = null,
    onratechange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onreset: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onresize: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[DateTimePickerProps, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onseeking: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onselect: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onselectionchange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onselectstart: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onstalled: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onsubmit: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onsuspend: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ontimeupdate: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ontoggle: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    ontouchcancel: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, _] = null,
    onvolumechange: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onwaiting: js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, _] = null,
    onwheel: js.ThisFunction1[DateTimePickerProps, /* ev */ WheelEvent, _] = null,
    options: Options = null,
    outerHTML: String = null,
    ownerDocument: Document_ = null,
    parentElement: HTMLElement = null,
    parentNode: Node with ParentNode = null,
    pattern: String = null,
    placeholder: String = null,
    prefix: String = null,
    prepend: /* repeated */ Node | String => Callback = null,
    previousElementSibling: Element = null,
    previousSibling: ChildNode = null,
    querySelector: a => CallbackTo[HTMLAnchorElement | Null] = null,
    querySelectorAll: a => CallbackTo[NodeListOf[HTMLAnchorElement with Node]] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    releasePointerCapture: /* pointerId */ Double => Callback = null,
    remove: js.UndefOr[Callback] = js.undefined,
    removeAttribute: /* qualifiedName */ String => Callback = null,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Callback = null,
    removeAttributeNode: /* attr */ Attr => CallbackTo[Attr] = null,
    removeChild: /* oldChild */ Node => CallbackTo[Node] = null,
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event_, js.Any]) => Callback = null,
    render: (/* props */ OmitDateTimePickerPropsop, /* ref */ js.Function1[/* node */ HTMLInputElement, Unit]) => CallbackTo[japgolly.scalajs.react.raw.React.Element] = null
  ): DateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (ATTRIBUTE_NODE != null) __obj.updateDynamic("ATTRIBUTE_NODE")(ATTRIBUTE_NODE.asInstanceOf[js.Any])
    if (CDATA_SECTION_NODE != null) __obj.updateDynamic("CDATA_SECTION_NODE")(CDATA_SECTION_NODE.asInstanceOf[js.Any])
    if (COMMENT_NODE != null) __obj.updateDynamic("COMMENT_NODE")(COMMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_FRAGMENT_NODE != null) __obj.updateDynamic("DOCUMENT_FRAGMENT_NODE")(DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_NODE != null) __obj.updateDynamic("DOCUMENT_NODE")(DOCUMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINED_BY != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINS != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINS")(DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_DISCONNECTED != null) __obj.updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_FOLLOWING != null) __obj.updateDynamic("DOCUMENT_POSITION_FOLLOWING")(DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC != null) __obj.updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_PRECEDING != null) __obj.updateDynamic("DOCUMENT_POSITION_PRECEDING")(DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any])
    if (DOCUMENT_TYPE_NODE != null) __obj.updateDynamic("DOCUMENT_TYPE_NODE")(DOCUMENT_TYPE_NODE.asInstanceOf[js.Any])
    if (ELEMENT_NODE != null) __obj.updateDynamic("ELEMENT_NODE")(ELEMENT_NODE.asInstanceOf[js.Any])
    if (ENTITY_NODE != null) __obj.updateDynamic("ENTITY_NODE")(ENTITY_NODE.asInstanceOf[js.Any])
    if (ENTITY_REFERENCE_NODE != null) __obj.updateDynamic("ENTITY_REFERENCE_NODE")(ENTITY_REFERENCE_NODE.asInstanceOf[js.Any])
    if (NOTATION_NODE != null) __obj.updateDynamic("NOTATION_NODE")(NOTATION_NODE.asInstanceOf[js.Any])
    if (PROCESSING_INSTRUCTION_NODE != null) __obj.updateDynamic("PROCESSING_INSTRUCTION_NODE")(PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any])
    if (TEXT_NODE != null) __obj.updateDynamic("TEXT_NODE")(TEXT_NODE.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (accessKeyLabel != null) __obj.updateDynamic("accessKeyLabel")(accessKeyLabel.asInstanceOf[js.Any])
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.fullscreenchange, t1: /* listener */ js.ThisFunction1[
  typingsJapgolly.reactFlatpickr.mod.DateTimePickerProps, 
  /* ev */ typingsJapgolly.std.Event_, 
  js.Any]) => addEventListener(t0, t1).runNow()))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => after(t0).runNow()))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1((t0: /* keyframes */ js.Array[typingsJapgolly.std.Keyframe]) => animate(t0).runNow()))
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => append(t0).runNow()))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: /* newChild */ org.scalajs.dom.raw.Node) => appendChild(t0).runNow()))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (attachShadow != null) __obj.updateDynamic("attachShadow")(js.Any.fromFunction1((t0: /* init */ typingsJapgolly.std.ShadowRootInit) => attachShadow(t0).runNow()))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => before(t0).runNow()))
    blur.foreach(p => __obj.updateDynamic("blur")(p.toJsFn))
    checkValidity.foreach(p => __obj.updateDynamic("checkValidity")(p.toJsFn))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (childElementCount != null) __obj.updateDynamic("childElementCount")(childElementCount.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classList != null) __obj.updateDynamic("classList")(classList.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    click.foreach(p => __obj.updateDynamic("click")(p.toJsFn))
    if (clientHeight != null) __obj.updateDynamic("clientHeight")(clientHeight.asInstanceOf[js.Any])
    if (clientLeft != null) __obj.updateDynamic("clientLeft")(clientLeft.asInstanceOf[js.Any])
    if (clientTop != null) __obj.updateDynamic("clientTop")(clientTop.asInstanceOf[js.Any])
    if (clientWidth != null) __obj.updateDynamic("clientWidth")(clientWidth.asInstanceOf[js.Any])
    cloneNode.foreach(p => __obj.updateDynamic("cloneNode")(p.toJsFn))
    if (closest != null) __obj.updateDynamic("closest")(js.Any.fromFunction1((t0: typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.a) => closest(t0).runNow()))
    if (compareDocumentPosition != null) __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => compareDocumentPosition(t0).runNow()))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => contains(t0).runNow()))
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dirName != null) __obj.updateDynamic("dirName")(dirName.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dispatchEvent != null) __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => dispatchEvent(t0).runNow()))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
    focus.foreach(p => __obj.updateDynamic("focus")(p.toJsFn))
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEnctype != null) __obj.updateDynamic("formEnctype")(formEnctype.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    getAnimations.foreach(p => __obj.updateDynamic("getAnimations")(p.toJsFn))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => getAttribute(t0).runNow()))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => getAttributeNS(t0, t1).runNow()))
    getAttributeNames.foreach(p => __obj.updateDynamic("getAttributeNames")(p.toJsFn))
    if (getAttributeNode != null) __obj.updateDynamic("getAttributeNode")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => getAttributeNode(t0).runNow()))
    if (getAttributeNodeNS != null) __obj.updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2((t0: /* namespaceURI */ java.lang.String, t1: /* localName */ java.lang.String) => getAttributeNodeNS(t0, t1).runNow()))
    getBoundingClientRect.foreach(p => __obj.updateDynamic("getBoundingClientRect")(p.toJsFn))
    getClientRects.foreach(p => __obj.updateDynamic("getClientRects")(p.toJsFn))
    if (getElementsByClassName != null) __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1((t0: /* classNames */ java.lang.String) => getElementsByClassName(t0).runNow()))
    if (getElementsByTagName != null) __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.a) => getElementsByTagName(t0).runNow()))
    if (getElementsByTagNameNS != null) __obj.updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2((t0: typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, t1: /* localName */ java.lang.String) => getElementsByTagNameNS(t0, t1).runNow()))
    getRootNode.foreach(p => __obj.updateDynamic("getRootNode")(p.toJsFn))
    if (hasAttribute != null) __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => hasAttribute(t0).runNow()))
    if (hasAttributeNS != null) __obj.updateDynamic("hasAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => hasAttributeNS(t0, t1).runNow()))
    hasAttributes.foreach(p => __obj.updateDynamic("hasAttributes")(p.toJsFn))
    hasChildNodes.foreach(p => __obj.updateDynamic("hasChildNodes")(p.toJsFn))
    if (hasPointerCapture != null) __obj.updateDynamic("hasPointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => hasPointerCapture(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (innerText != null) __obj.updateDynamic("innerText")(innerText.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (insertAdjacentElement != null) __obj.updateDynamic("insertAdjacentElement")(js.Any.fromFunction2((t0: /* position */ typingsJapgolly.std.InsertPosition, t1: /* insertedElement */ org.scalajs.dom.raw.Element) => insertAdjacentElement(t0, t1).runNow()))
    if (insertAdjacentHTML != null) __obj.updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2((t0: /* where */ typingsJapgolly.std.InsertPosition, t1: /* html */ java.lang.String) => insertAdjacentHTML(t0, t1).runNow()))
    if (insertAdjacentText != null) __obj.updateDynamic("insertAdjacentText")(js.Any.fromFunction2((t0: /* where */ typingsJapgolly.std.InsertPosition, t1: /* text */ java.lang.String) => insertAdjacentText(t0, t1).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: /* newChild */ org.scalajs.dom.raw.Node, t1: /* refChild */ org.scalajs.dom.raw.Node) => insertBefore(t0, t1).runNow()))
    if (!js.isUndefined(isConnected)) __obj.updateDynamic("isConnected")(isConnected.asInstanceOf[js.Any])
    if (!js.isUndefined(isContentEditable)) __obj.updateDynamic("isContentEditable")(isContentEditable.asInstanceOf[js.Any])
    if (isDefaultNamespace != null) __obj.updateDynamic("isDefaultNamespace")(js.Any.fromFunction1((t0: /* namespace */ java.lang.String) => isDefaultNamespace(t0).runNow()))
    if (isEqualNode != null) __obj.updateDynamic("isEqualNode")(js.Any.fromFunction1((t0: /* otherNode */ org.scalajs.dom.raw.Node) => isEqualNode(t0).runNow()))
    if (isSameNode != null) __obj.updateDynamic("isSameNode")(js.Any.fromFunction1((t0: /* otherNode */ org.scalajs.dom.raw.Node) => isSameNode(t0).runNow()))
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (lookupNamespaceURI != null) __obj.updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1((t0: /* prefix */ java.lang.String) => lookupNamespaceURI(t0).runNow()))
    if (lookupPrefix != null) __obj.updateDynamic("lookupPrefix")(js.Any.fromFunction1((t0: /* namespace */ java.lang.String) => lookupPrefix(t0).runNow()))
    if (matches != null) __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: /* selectors */ java.lang.String) => matches(t0).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    msGetRegionContent.foreach(p => __obj.updateDynamic("msGetRegionContent")(p.toJsFn))
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    normalize.foreach(p => __obj.updateDynamic("normalize")(p.toJsFn))
    if (offsetHeight != null) __obj.updateDynamic("offsetHeight")(offsetHeight.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (offsetWidth != null) __obj.updateDynamic("offsetWidth")(offsetWidth.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onChange(t0, t1, t2, t3).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onClose(t0, t1, t2, t3).runNow()))
    if (onDayCreate != null) __obj.updateDynamic("onDayCreate")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onDayCreate(t0, t1, t2, t3).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onMonthChange(t0, t1, t2, t3).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onOpen(t0, t1, t2, t3).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onReady(t0, t1, t2, t3).runNow()))
    if (onValueUpdate != null) __obj.updateDynamic("onValueUpdate")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onValueUpdate(t0, t1, t2, t3).runNow()))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction4((t0: /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], t1: /* currentDateString */ java.lang.String, t2: /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, t3: /* data */ js.UndefOr[js.Any]) => onYearChange(t0, t1, t2, t3).runNow()))
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
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (outerHTML != null) __obj.updateDynamic("outerHTML")(outerHTML.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => prepend(t0).runNow()))
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (querySelector != null) __obj.updateDynamic("querySelector")(js.Any.fromFunction1((t0: typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.a) => querySelector(t0).runNow()))
    if (querySelectorAll != null) __obj.updateDynamic("querySelectorAll")(js.Any.fromFunction1((t0: typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.a) => querySelectorAll(t0).runNow()))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (releasePointerCapture != null) __obj.updateDynamic("releasePointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => releasePointerCapture(t0).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    if (removeAttribute != null) __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => removeAttribute(t0).runNow()))
    if (removeAttributeNS != null) __obj.updateDynamic("removeAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => removeAttributeNS(t0, t1).runNow()))
    if (removeAttributeNode != null) __obj.updateDynamic("removeAttributeNode")(js.Any.fromFunction1((t0: /* attr */ org.scalajs.dom.raw.Attr) => removeAttributeNode(t0).runNow()))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: /* oldChild */ org.scalajs.dom.raw.Node) => removeChild(t0).runNow()))
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.fullscreenchange, t1: /* listener */ js.ThisFunction1[
  typingsJapgolly.reactFlatpickr.mod.DateTimePickerProps, 
  /* ev */ typingsJapgolly.std.Event_, 
  js.Any]) => removeEventListener(t0, t1).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.reactFlatpickr.OmitDateTimePickerPropsop, t1: /* ref */ js.Function1[/* node */ org.scalajs.dom.raw.HTMLInputElement, scala.Unit]) => render(t0, t1).runNow()))
    __obj.asInstanceOf[DateTimePickerProps]
  }
}

