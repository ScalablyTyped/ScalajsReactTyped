package typingsJapgolly.petitDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.AudioTrackList
import org.scalajs.dom.raw.Blob
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
import org.scalajs.dom.raw.MediaError
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TextTrack
import org.scalajs.dom.raw.TextTrackList
import org.scalajs.dom.raw.TimeRanges
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.petitDom.mod.PetitDom.Content
import typingsJapgolly.petitDom.mod.PetitDom.Key
import typingsJapgolly.petitDom.petitDomStrings.MSVideoFormatChanged
import typingsJapgolly.petitDom.petitDomStrings.a
import typingsJapgolly.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.std.Animation
import typingsJapgolly.std.CanPlayTypeResult
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
import typingsJapgolly.std.MSGraphicsTrust
import typingsJapgolly.std.MSMediaKeyNeededEvent
import typingsJapgolly.std.MSMediaKeys
import typingsJapgolly.std.MediaEncryptedEvent
import typingsJapgolly.std.MediaKeys
import typingsJapgolly.std.MediaSource
import typingsJapgolly.std.OnErrorEventHandler
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import typingsJapgolly.std.TextTrackKind
import typingsJapgolly.std.VideoPlaybackQuality
import typingsJapgolly.std.VideoTrackList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.HTMLVideoElement> & {  content ? :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content>} */
trait PropsHTMLVideoElementcont extends js.Object {
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
  var HAVE_CURRENT_DATA: js.UndefOr[Double] = js.undefined
  var HAVE_ENOUGH_DATA: js.UndefOr[Double] = js.undefined
  var HAVE_FUTURE_DATA: js.UndefOr[Double] = js.undefined
  var HAVE_METADATA: js.UndefOr[Double] = js.undefined
  var HAVE_NOTHING: js.UndefOr[Double] = js.undefined
  var NETWORK_EMPTY: js.UndefOr[Double] = js.undefined
  var NETWORK_IDLE: js.UndefOr[Double] = js.undefined
  var NETWORK_LOADING: js.UndefOr[Double] = js.undefined
  var NETWORK_NO_SOURCE: js.UndefOr[Double] = js.undefined
  var NOTATION_NODE: js.UndefOr[Double] = js.undefined
  var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.undefined
  var TEXT_NODE: js.UndefOr[Double] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var accessKeyLabel: js.UndefOr[String] = js.undefined
  var addEventListener: js.UndefOr[
    js.Function2[
      MSVideoFormatChanged, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
      Unit
    ]
  ] = js.undefined
  var addTextTrack: js.UndefOr[js.Function1[/* kind */ TextTrackKind, TextTrack]] = js.undefined
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var animate: js.UndefOr[js.Function1[/* keyframes */ js.Array[Keyframe], Animation]] = js.undefined
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  var assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
  var attributes: js.UndefOr[NamedNodeMap] = js.undefined
  var audioTracks: js.UndefOr[AudioTrackList] = js.undefined
  var autocapitalize: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var baseURI: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var buffered: js.UndefOr[TimeRanges] = js.undefined
  var canPlayType: js.UndefOr[js.Function1[/* type */ String, CanPlayTypeResult]] = js.undefined
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
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  var contentEditable: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var currentSrc: js.UndefOr[String] = js.undefined
  var currentTime: js.UndefOr[Double] = js.undefined
  var dataset: js.UndefOr[DOMStringMap] = js.undefined
  var defaultMuted: js.UndefOr[Boolean] = js.undefined
  var defaultPlaybackRate: js.UndefOr[Double] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event_, Boolean]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var ended: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[MediaError] = js.undefined
  var firstChild: js.UndefOr[ChildNode] = js.undefined
  var firstElementChild: js.UndefOr[Element] = js.undefined
  var focus: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  var getVideoPlaybackQuality: js.UndefOr[js.Function0[VideoPlaybackQuality]] = js.undefined
  var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.undefined
  var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
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
  var key: js.UndefOr[Key] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lastChild: js.UndefOr[ChildNode] = js.undefined
  var lastElementChild: js.UndefOr[Element] = js.undefined
  var load: js.UndefOr[js.Function0[Unit]] = js.undefined
  var localName: js.UndefOr[String] = js.undefined
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.undefined
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var mediaKeys: js.UndefOr[MediaKeys] = js.undefined
  var msAudioCategory: js.UndefOr[String] = js.undefined
  var msAudioDeviceType: js.UndefOr[String] = js.undefined
  var msClearEffects: js.UndefOr[js.Function0[Unit]] = js.undefined
  var msFrameStep: js.UndefOr[js.Function1[/* forward */ Boolean, Unit]] = js.undefined
  var msGetAsCastingSource: js.UndefOr[js.Function0[_]] = js.undefined
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.undefined
  var msGraphicsTrustStatus: js.UndefOr[MSGraphicsTrust] = js.undefined
  var msHorizontalMirror: js.UndefOr[Boolean] = js.undefined
  var msInsertAudioEffect: js.UndefOr[
    js.Function2[/* activatableClassId */ String, /* effectRequired */ Boolean, Unit]
  ] = js.undefined
  var msInsertVideoEffect: js.UndefOr[
    js.Function2[/* activatableClassId */ String, /* effectRequired */ Boolean, Unit]
  ] = js.undefined
  var msIsLayoutOptimalForPlayback: js.UndefOr[Boolean] = js.undefined
  var msIsStereo3D: js.UndefOr[Boolean] = js.undefined
  var msKeys: js.UndefOr[MSMediaKeys] = js.undefined
  var msPlayToDisabled: js.UndefOr[Boolean] = js.undefined
  var msPlayToPreferredSourceUri: js.UndefOr[String] = js.undefined
  var msPlayToPrimary: js.UndefOr[Boolean] = js.undefined
  var msPlayToSource: js.UndefOr[js.Any] = js.undefined
  var msRealTime: js.UndefOr[Boolean] = js.undefined
  var msSetMediaKeys: js.UndefOr[js.Function1[/* mediaKeys */ MSMediaKeys, Unit]] = js.undefined
  var msSetMediaProtectionManager: js.UndefOr[js.Function0[Unit]] = js.undefined
  var msSetVideoRectangle: js.UndefOr[
    js.Function4[/* left */ Double, /* top */ Double, /* right */ Double, /* bottom */ Double, Unit]
  ] = js.undefined
  var msStereo3DPackingMode: js.UndefOr[String] = js.undefined
  var msStereo3DRenderMode: js.UndefOr[String] = js.undefined
  var msZoom: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var namespaceURI: js.UndefOr[String] = js.undefined
  var networkState: js.UndefOr[Double] = js.undefined
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
  var onMSVideoFormatChanged: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onMSVideoFrameStepCompleted: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onMSVideoOptimalLayoutChanged: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
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
  var onencrypted: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]] = js.undefined
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
  var onmsneedkey: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MSMediaKeyNeededEvent, _]] = js.undefined
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
  var onwaitingforkey: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  var outerHTML: js.UndefOr[String] = js.undefined
  var ownerDocument: js.UndefOr[Document_] = js.undefined
  var parentElement: js.UndefOr[HTMLElement] = js.undefined
  var parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var play: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var played: js.UndefOr[TimeRanges] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var previousElementSibling: js.UndefOr[Element] = js.undefined
  var previousSibling: js.UndefOr[ChildNode] = js.undefined
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement with Node]]] = js.undefined
  var readyState: js.UndefOr[Double] = js.undefined
  var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.undefined
  var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.undefined
  var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.undefined
  var removeChild: js.UndefOr[js.Function1[/* oldChild */ Node, Node]] = js.undefined
  var removeEventListener: js.UndefOr[
    js.Function2[
      MSVideoFormatChanged, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
      Unit
    ]
  ] = js.undefined
  var replaceChild: js.UndefOr[js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]] = js.undefined
  var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollBy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollHeight: js.UndefOr[Double] = js.undefined
  var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
  var scrollWidth: js.UndefOr[Double] = js.undefined
  var seekable: js.UndefOr[TimeRanges] = js.undefined
  var seeking: js.UndefOr[Boolean] = js.undefined
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.undefined
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.undefined
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setMediaKeys: js.UndefOr[js.Function1[/* mediaKeys */ MediaKeys, js.Promise[Unit]]] = js.undefined
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcObject: js.UndefOr[MediaStream | MediaSource | Blob] = js.undefined
  var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var textTracks: js.UndefOr[TextTrackList] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var translate: js.UndefOr[Boolean] = js.undefined
  var videoHeight: js.UndefOr[Double] = js.undefined
  var videoTracks: js.UndefOr[VideoTrackList] = js.undefined
  var videoWidth: js.UndefOr[Double] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var webkitDisplayingFullscreen: js.UndefOr[Boolean] = js.undefined
  var webkitEnterFullScreen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var webkitEnterFullscreen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var webkitExitFullScreen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var webkitExitFullscreen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var webkitSupportsFullscreen: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PropsHTMLVideoElementcont {
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
    HAVE_CURRENT_DATA: Int | Double = null,
    HAVE_ENOUGH_DATA: Int | Double = null,
    HAVE_FUTURE_DATA: Int | Double = null,
    HAVE_METADATA: Int | Double = null,
    HAVE_NOTHING: Int | Double = null,
    NETWORK_EMPTY: Int | Double = null,
    NETWORK_IDLE: Int | Double = null,
    NETWORK_LOADING: Int | Double = null,
    NETWORK_NO_SOURCE: Int | Double = null,
    NOTATION_NODE: Int | Double = null,
    PROCESSING_INSTRUCTION_NODE: Int | Double = null,
    TEXT_NODE: Int | Double = null,
    accessKey: String = null,
    accessKeyLabel: String = null,
    addEventListener: (MSVideoFormatChanged, /* listener */ js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, js.Any]) => Callback = null,
    addTextTrack: /* kind */ TextTrackKind => CallbackTo[TextTrack] = null,
    after: /* repeated */ Node | String => Callback = null,
    animate: /* keyframes */ js.Array[Keyframe] => CallbackTo[Animation] = null,
    append: /* repeated */ Node | String => Callback = null,
    appendChild: /* newChild */ Node => CallbackTo[Node] = null,
    assignedSlot: HTMLSlotElement = null,
    attachShadow: /* init */ ShadowRootInit => CallbackTo[ShadowRoot] = null,
    attributes: NamedNodeMap = null,
    audioTracks: AudioTrackList = null,
    autocapitalize: String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    baseURI: String = null,
    before: /* repeated */ Node | String => Callback = null,
    blur: js.UndefOr[Callback] = js.undefined,
    buffered: TimeRanges = null,
    canPlayType: /* type */ String => CallbackTo[CanPlayTypeResult] = null,
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
    content: Content | js.Array[Content] = null,
    contentEditable: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String = null,
    currentSrc: String = null,
    currentTime: Int | Double = null,
    dataset: DOMStringMap = null,
    defaultMuted: js.UndefOr[Boolean] = js.undefined,
    defaultPlaybackRate: Int | Double = null,
    dir: String = null,
    dispatchEvent: /* event */ Event_ => CallbackTo[Boolean] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    ended: js.UndefOr[Boolean] = js.undefined,
    error: MediaError = null,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
    focus: js.UndefOr[Callback] = js.undefined,
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
    getVideoPlaybackQuality: js.UndefOr[CallbackTo[VideoPlaybackQuality]] = js.undefined,
    hasAttribute: /* qualifiedName */ String => CallbackTo[Boolean] = null,
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => CallbackTo[Boolean] = null,
    hasAttributes: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasChildNodes: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasPointerCapture: /* pointerId */ Double => CallbackTo[Boolean] = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
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
    key: Key = null,
    lang: String = null,
    lastChild: ChildNode = null,
    lastElementChild: Element = null,
    load: js.UndefOr[Callback] = js.undefined,
    localName: String = null,
    lookupNamespaceURI: /* prefix */ String => CallbackTo[String | Null] = null,
    lookupPrefix: /* namespace */ String => CallbackTo[String | Null] = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    matches: /* selectors */ String => CallbackTo[Boolean] = null,
    mediaKeys: MediaKeys = null,
    msAudioCategory: String = null,
    msAudioDeviceType: String = null,
    msClearEffects: js.UndefOr[Callback] = js.undefined,
    msFrameStep: /* forward */ Boolean => Callback = null,
    msGetAsCastingSource: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    msGetRegionContent: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    msGraphicsTrustStatus: MSGraphicsTrust = null,
    msHorizontalMirror: js.UndefOr[Boolean] = js.undefined,
    msInsertAudioEffect: (/* activatableClassId */ String, /* effectRequired */ Boolean) => Callback = null,
    msInsertVideoEffect: (/* activatableClassId */ String, /* effectRequired */ Boolean) => Callback = null,
    msIsLayoutOptimalForPlayback: js.UndefOr[Boolean] = js.undefined,
    msIsStereo3D: js.UndefOr[Boolean] = js.undefined,
    msKeys: MSMediaKeys = null,
    msPlayToDisabled: js.UndefOr[Boolean] = js.undefined,
    msPlayToPreferredSourceUri: String = null,
    msPlayToPrimary: js.UndefOr[Boolean] = js.undefined,
    msPlayToSource: js.Any = null,
    msRealTime: js.UndefOr[Boolean] = js.undefined,
    msSetMediaKeys: /* mediaKeys */ MSMediaKeys => Callback = null,
    msSetMediaProtectionManager: js.UndefOr[Callback] = js.undefined,
    msSetVideoRectangle: (/* left */ Double, /* top */ Double, /* right */ Double, /* bottom */ Double) => Callback = null,
    msStereo3DPackingMode: String = null,
    msStereo3DRenderMode: String = null,
    msZoom: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    namespaceURI: String = null,
    networkState: Int | Double = null,
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
    onMSVideoFormatChanged: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onMSVideoFrameStepCompleted: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onMSVideoOptimalLayoutChanged: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onabort: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    oncanplay: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    oncanplaythrough: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onchange: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onclick: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    oncontextmenu: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    oncopy: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    oncut: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    ondragleave: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onemptied: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onencrypted: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MediaEncryptedEvent, _] = null,
    onended: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onerror: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => CallbackTo[js.Any] = null,
    onfocus: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ FocusEvent, _] = null,
    onfullscreenchange: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    ongotpointercapture: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    oninvalid: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onkeydown: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onloadeddata: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onloadedmetadata: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onloadstart: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onlostpointercapture: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MouseEvent, _] = null,
    onmsneedkey: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ MSMediaKeyNeededEvent, _] = null,
    onpaste: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onplay: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onplaying: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onpointercancel: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ ProgressEvent, _] = null,
    onratechange: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onreset: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onresize: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onseeking: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onselect: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onselectionchange: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onselectstart: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onstalled: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onsubmit: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    onsuspend: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    ontimeupdate: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    ontoggle: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ Event_, _] = null,
    ontouchcancel: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[PropsHTMLVideoElementcont, /* ev */ TransitionEvent, _] = null
  ): PropsHTMLVideoElementcont = {
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
    if (HAVE_CURRENT_DATA != null) __obj.updateDynamic("HAVE_CURRENT_DATA")(HAVE_CURRENT_DATA.asInstanceOf[js.Any])
    if (HAVE_ENOUGH_DATA != null) __obj.updateDynamic("HAVE_ENOUGH_DATA")(HAVE_ENOUGH_DATA.asInstanceOf[js.Any])
    if (HAVE_FUTURE_DATA != null) __obj.updateDynamic("HAVE_FUTURE_DATA")(HAVE_FUTURE_DATA.asInstanceOf[js.Any])
    if (HAVE_METADATA != null) __obj.updateDynamic("HAVE_METADATA")(HAVE_METADATA.asInstanceOf[js.Any])
    if (HAVE_NOTHING != null) __obj.updateDynamic("HAVE_NOTHING")(HAVE_NOTHING.asInstanceOf[js.Any])
    if (NETWORK_EMPTY != null) __obj.updateDynamic("NETWORK_EMPTY")(NETWORK_EMPTY.asInstanceOf[js.Any])
    if (NETWORK_IDLE != null) __obj.updateDynamic("NETWORK_IDLE")(NETWORK_IDLE.asInstanceOf[js.Any])
    if (NETWORK_LOADING != null) __obj.updateDynamic("NETWORK_LOADING")(NETWORK_LOADING.asInstanceOf[js.Any])
    if (NETWORK_NO_SOURCE != null) __obj.updateDynamic("NETWORK_NO_SOURCE")(NETWORK_NO_SOURCE.asInstanceOf[js.Any])
    if (NOTATION_NODE != null) __obj.updateDynamic("NOTATION_NODE")(NOTATION_NODE.asInstanceOf[js.Any])
    if (PROCESSING_INSTRUCTION_NODE != null) __obj.updateDynamic("PROCESSING_INSTRUCTION_NODE")(PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any])
    if (TEXT_NODE != null) __obj.updateDynamic("TEXT_NODE")(TEXT_NODE.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (accessKeyLabel != null) __obj.updateDynamic("accessKeyLabel")(accessKeyLabel.asInstanceOf[js.Any])
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.petitDom.petitDomStrings.MSVideoFormatChanged, t1: /* listener */ js.ThisFunction1[
  typingsJapgolly.petitDom.PropsHTMLVideoElementcont, 
  /* ev */ typingsJapgolly.std.Event_, 
  js.Any]) => addEventListener(t0, t1).runNow()))
    if (addTextTrack != null) __obj.updateDynamic("addTextTrack")(js.Any.fromFunction1((t0: /* kind */ typingsJapgolly.std.TextTrackKind) => addTextTrack(t0).runNow()))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => after(t0).runNow()))
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1((t0: /* keyframes */ js.Array[typingsJapgolly.std.Keyframe]) => animate(t0).runNow()))
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => append(t0).runNow()))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: /* newChild */ org.scalajs.dom.raw.Node) => appendChild(t0).runNow()))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (attachShadow != null) __obj.updateDynamic("attachShadow")(js.Any.fromFunction1((t0: /* init */ typingsJapgolly.std.ShadowRootInit) => attachShadow(t0).runNow()))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (audioTracks != null) __obj.updateDynamic("audioTracks")(audioTracks.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => before(t0).runNow()))
    blur.foreach(p => __obj.updateDynamic("blur")(p.toJsFn))
    if (buffered != null) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (canPlayType != null) __obj.updateDynamic("canPlayType")(js.Any.fromFunction1((t0: /* type */ java.lang.String) => canPlayType(t0).runNow()))
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
    if (closest != null) __obj.updateDynamic("closest")(js.Any.fromFunction1((t0: typingsJapgolly.petitDom.petitDomStrings.a) => closest(t0).runNow()))
    if (compareDocumentPosition != null) __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => compareDocumentPosition(t0).runNow()))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => contains(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (currentSrc != null) __obj.updateDynamic("currentSrc")(currentSrc.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMuted)) __obj.updateDynamic("defaultMuted")(defaultMuted.asInstanceOf[js.Any])
    if (defaultPlaybackRate != null) __obj.updateDynamic("defaultPlaybackRate")(defaultPlaybackRate.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dispatchEvent != null) __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => dispatchEvent(t0).runNow()))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(ended)) __obj.updateDynamic("ended")(ended.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
    focus.foreach(p => __obj.updateDynamic("focus")(p.toJsFn))
    getAnimations.foreach(p => __obj.updateDynamic("getAnimations")(p.toJsFn))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => getAttribute(t0).runNow()))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => getAttributeNS(t0, t1).runNow()))
    getAttributeNames.foreach(p => __obj.updateDynamic("getAttributeNames")(p.toJsFn))
    if (getAttributeNode != null) __obj.updateDynamic("getAttributeNode")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => getAttributeNode(t0).runNow()))
    if (getAttributeNodeNS != null) __obj.updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2((t0: /* namespaceURI */ java.lang.String, t1: /* localName */ java.lang.String) => getAttributeNodeNS(t0, t1).runNow()))
    getBoundingClientRect.foreach(p => __obj.updateDynamic("getBoundingClientRect")(p.toJsFn))
    getClientRects.foreach(p => __obj.updateDynamic("getClientRects")(p.toJsFn))
    if (getElementsByClassName != null) __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1((t0: /* classNames */ java.lang.String) => getElementsByClassName(t0).runNow()))
    if (getElementsByTagName != null) __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: typingsJapgolly.petitDom.petitDomStrings.a) => getElementsByTagName(t0).runNow()))
    if (getElementsByTagNameNS != null) __obj.updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2((t0: typingsJapgolly.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, t1: /* localName */ java.lang.String) => getElementsByTagNameNS(t0, t1).runNow()))
    getRootNode.foreach(p => __obj.updateDynamic("getRootNode")(p.toJsFn))
    getVideoPlaybackQuality.foreach(p => __obj.updateDynamic("getVideoPlaybackQuality")(p.toJsFn))
    if (hasAttribute != null) __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => hasAttribute(t0).runNow()))
    if (hasAttributeNS != null) __obj.updateDynamic("hasAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => hasAttributeNS(t0, t1).runNow()))
    hasAttributes.foreach(p => __obj.updateDynamic("hasAttributes")(p.toJsFn))
    hasChildNodes.foreach(p => __obj.updateDynamic("hasChildNodes")(p.toJsFn))
    if (hasPointerCapture != null) __obj.updateDynamic("hasPointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => hasPointerCapture(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
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
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    load.foreach(p => __obj.updateDynamic("load")(p.toJsFn))
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (lookupNamespaceURI != null) __obj.updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1((t0: /* prefix */ java.lang.String) => lookupNamespaceURI(t0).runNow()))
    if (lookupPrefix != null) __obj.updateDynamic("lookupPrefix")(js.Any.fromFunction1((t0: /* namespace */ java.lang.String) => lookupPrefix(t0).runNow()))
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: /* selectors */ java.lang.String) => matches(t0).runNow()))
    if (mediaKeys != null) __obj.updateDynamic("mediaKeys")(mediaKeys.asInstanceOf[js.Any])
    if (msAudioCategory != null) __obj.updateDynamic("msAudioCategory")(msAudioCategory.asInstanceOf[js.Any])
    if (msAudioDeviceType != null) __obj.updateDynamic("msAudioDeviceType")(msAudioDeviceType.asInstanceOf[js.Any])
    msClearEffects.foreach(p => __obj.updateDynamic("msClearEffects")(p.toJsFn))
    if (msFrameStep != null) __obj.updateDynamic("msFrameStep")(js.Any.fromFunction1((t0: /* forward */ scala.Boolean) => msFrameStep(t0).runNow()))
    msGetAsCastingSource.foreach(p => __obj.updateDynamic("msGetAsCastingSource")(p.toJsFn))
    msGetRegionContent.foreach(p => __obj.updateDynamic("msGetRegionContent")(p.toJsFn))
    if (msGraphicsTrustStatus != null) __obj.updateDynamic("msGraphicsTrustStatus")(msGraphicsTrustStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(msHorizontalMirror)) __obj.updateDynamic("msHorizontalMirror")(msHorizontalMirror.asInstanceOf[js.Any])
    if (msInsertAudioEffect != null) __obj.updateDynamic("msInsertAudioEffect")(js.Any.fromFunction2((t0: /* activatableClassId */ java.lang.String, t1: /* effectRequired */ scala.Boolean) => msInsertAudioEffect(t0, t1).runNow()))
    if (msInsertVideoEffect != null) __obj.updateDynamic("msInsertVideoEffect")(js.Any.fromFunction2((t0: /* activatableClassId */ java.lang.String, t1: /* effectRequired */ scala.Boolean) => msInsertVideoEffect(t0, t1).runNow()))
    if (!js.isUndefined(msIsLayoutOptimalForPlayback)) __obj.updateDynamic("msIsLayoutOptimalForPlayback")(msIsLayoutOptimalForPlayback.asInstanceOf[js.Any])
    if (!js.isUndefined(msIsStereo3D)) __obj.updateDynamic("msIsStereo3D")(msIsStereo3D.asInstanceOf[js.Any])
    if (msKeys != null) __obj.updateDynamic("msKeys")(msKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(msPlayToDisabled)) __obj.updateDynamic("msPlayToDisabled")(msPlayToDisabled.asInstanceOf[js.Any])
    if (msPlayToPreferredSourceUri != null) __obj.updateDynamic("msPlayToPreferredSourceUri")(msPlayToPreferredSourceUri.asInstanceOf[js.Any])
    if (!js.isUndefined(msPlayToPrimary)) __obj.updateDynamic("msPlayToPrimary")(msPlayToPrimary.asInstanceOf[js.Any])
    if (msPlayToSource != null) __obj.updateDynamic("msPlayToSource")(msPlayToSource.asInstanceOf[js.Any])
    if (!js.isUndefined(msRealTime)) __obj.updateDynamic("msRealTime")(msRealTime.asInstanceOf[js.Any])
    if (msSetMediaKeys != null) __obj.updateDynamic("msSetMediaKeys")(js.Any.fromFunction1((t0: /* mediaKeys */ typingsJapgolly.std.MSMediaKeys) => msSetMediaKeys(t0).runNow()))
    msSetMediaProtectionManager.foreach(p => __obj.updateDynamic("msSetMediaProtectionManager")(p.toJsFn))
    if (msSetVideoRectangle != null) __obj.updateDynamic("msSetVideoRectangle")(js.Any.fromFunction4((t0: /* left */ scala.Double, t1: /* top */ scala.Double, t2: /* right */ scala.Double, t3: /* bottom */ scala.Double) => msSetVideoRectangle(t0, t1, t2, t3).runNow()))
    if (msStereo3DPackingMode != null) __obj.updateDynamic("msStereo3DPackingMode")(msStereo3DPackingMode.asInstanceOf[js.Any])
    if (msStereo3DRenderMode != null) __obj.updateDynamic("msStereo3DRenderMode")(msStereo3DRenderMode.asInstanceOf[js.Any])
    if (!js.isUndefined(msZoom)) __obj.updateDynamic("msZoom")(msZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (networkState != null) __obj.updateDynamic("networkState")(networkState.asInstanceOf[js.Any])
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
    if (onMSVideoFormatChanged != null) __obj.updateDynamic("onMSVideoFormatChanged")(onMSVideoFormatChanged.asInstanceOf[js.Any])
    if (onMSVideoFrameStepCompleted != null) __obj.updateDynamic("onMSVideoFrameStepCompleted")(onMSVideoFrameStepCompleted.asInstanceOf[js.Any])
    if (onMSVideoOptimalLayoutChanged != null) __obj.updateDynamic("onMSVideoOptimalLayoutChanged")(onMSVideoOptimalLayoutChanged.asInstanceOf[js.Any])
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
    if (onencrypted != null) __obj.updateDynamic("onencrypted")(onencrypted.asInstanceOf[js.Any])
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
    if (onmsneedkey != null) __obj.updateDynamic("onmsneedkey")(onmsneedkey.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[PropsHTMLVideoElementcont]
  }
}

