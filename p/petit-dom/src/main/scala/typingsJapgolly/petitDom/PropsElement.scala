package typingsJapgolly.petitDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import typingsJapgolly.petitDom.mod.PetitDom.Content
import typingsJapgolly.petitDom.mod.PetitDom.Key
import typingsJapgolly.petitDom.petitDomStrings.a
import typingsJapgolly.petitDom.petitDomStrings.fullscreenchange
import typingsJapgolly.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.std.Animation
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRect
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Event_
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.Keyframe
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.Element> */
trait PropsElement extends js.Object {
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
  var addEventListener: js.UndefOr[
    js.Function2[
      fullscreenchange, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
      Unit
    ]
  ] = js.undefined
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var animate: js.UndefOr[js.Function1[/* keyframes */ js.Array[Keyframe], Animation]] = js.undefined
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  var assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
  var attributes: js.UndefOr[NamedNodeMap] = js.undefined
  var baseURI: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var childElementCount: js.UndefOr[Double] = js.undefined
  var childNodes: js.UndefOr[NodeListOf[ChildNode with Node]] = js.undefined
  var children: js.UndefOr[HTMLCollection] = js.undefined
  var classList: js.UndefOr[DOMTokenList] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clientHeight: js.UndefOr[Double] = js.undefined
  var clientLeft: js.UndefOr[Double] = js.undefined
  var clientTop: js.UndefOr[Double] = js.undefined
  var clientWidth: js.UndefOr[Double] = js.undefined
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.undefined
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event_, Boolean]] = js.undefined
  var firstChild: js.UndefOr[ChildNode] = js.undefined
  var firstElementChild: js.UndefOr[Element] = js.undefined
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
  var id: js.UndefOr[String] = js.undefined
  var innerHTML: js.UndefOr[String] = js.undefined
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.undefined
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.undefined
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.undefined
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.undefined
  var isConnected: js.UndefOr[Boolean] = js.undefined
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.undefined
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var lastChild: js.UndefOr[ChildNode] = js.undefined
  var lastElementChild: js.UndefOr[Element] = js.undefined
  var localName: js.UndefOr[String] = js.undefined
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.undefined
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.undefined
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.undefined
  var namespaceURI: js.UndefOr[String] = js.undefined
  var nextElementSibling: js.UndefOr[Element] = js.undefined
  var nextSibling: js.UndefOr[ChildNode] = js.undefined
  var nodeName: js.UndefOr[String] = js.undefined
  var nodeType: js.UndefOr[Double] = js.undefined
  var nodeValue: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var outerHTML: js.UndefOr[String] = js.undefined
  var ownerDocument: js.UndefOr[Document_] = js.undefined
  var parentElement: js.UndefOr[HTMLElement] = js.undefined
  var parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var previousElementSibling: js.UndefOr[Element] = js.undefined
  var previousSibling: js.UndefOr[ChildNode] = js.undefined
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement with Node]]] = js.undefined
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
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.undefined
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.undefined
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
}

object PropsElement {
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
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event_, js.Any]) => Callback = null,
    after: /* repeated */ Node | String => Callback = null,
    animate: /* keyframes */ js.Array[Keyframe] => CallbackTo[Animation] = null,
    append: /* repeated */ Node | String => Callback = null,
    appendChild: /* newChild */ Node => CallbackTo[Node] = null,
    assignedSlot: HTMLSlotElement = null,
    attachShadow: /* init */ ShadowRootInit => CallbackTo[ShadowRoot] = null,
    attributes: NamedNodeMap = null,
    baseURI: String = null,
    before: /* repeated */ Node | String => Callback = null,
    childElementCount: Int | Double = null,
    childNodes: NodeListOf[ChildNode with Node] = null,
    children: HTMLCollection = null,
    classList: DOMTokenList = null,
    className: String = null,
    clientHeight: Int | Double = null,
    clientLeft: Int | Double = null,
    clientTop: Int | Double = null,
    clientWidth: Int | Double = null,
    cloneNode: js.UndefOr[CallbackTo[Node]] = js.undefined,
    closest: a => CallbackTo[HTMLAnchorElement | Null] = null,
    compareDocumentPosition: /* other */ Node => CallbackTo[Double] = null,
    contains: /* other */ Node => CallbackTo[Boolean] = null,
    content: Content | js.Array[Content] = null,
    dispatchEvent: /* event */ Event_ => CallbackTo[Boolean] = null,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
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
    id: String = null,
    innerHTML: String = null,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => CallbackTo[Element | Null] = null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Callback = null,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Callback = null,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => CallbackTo[Node] = null,
    isConnected: js.UndefOr[Boolean] = js.undefined,
    isDefaultNamespace: /* namespace */ String => CallbackTo[Boolean] = null,
    isEqualNode: /* otherNode */ Node => CallbackTo[Boolean] = null,
    isSameNode: /* otherNode */ Node => CallbackTo[Boolean] = null,
    key: Key = null,
    lastChild: ChildNode = null,
    lastElementChild: Element = null,
    localName: String = null,
    lookupNamespaceURI: /* prefix */ String => CallbackTo[String | Null] = null,
    lookupPrefix: /* namespace */ String => CallbackTo[String | Null] = null,
    matches: /* selectors */ String => CallbackTo[Boolean] = null,
    msGetRegionContent: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    namespaceURI: String = null,
    nextElementSibling: Element = null,
    nextSibling: ChildNode = null,
    nodeName: String = null,
    nodeType: Int | Double = null,
    nodeValue: String = null,
    normalize: js.UndefOr[Callback] = js.undefined,
    onfullscreenchange: js.ThisFunction1[PropsElement, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[PropsElement, /* ev */ Event_, _] = null,
    outerHTML: String = null,
    ownerDocument: Document_ = null,
    parentElement: HTMLElement = null,
    parentNode: Node with ParentNode = null,
    prefix: String = null,
    prepend: /* repeated */ Node | String => Callback = null,
    previousElementSibling: Element = null,
    previousSibling: ChildNode = null,
    querySelector: a => CallbackTo[HTMLAnchorElement | Null] = null,
    querySelectorAll: a => CallbackTo[NodeListOf[HTMLAnchorElement with Node]] = null,
    releasePointerCapture: /* pointerId */ Double => Callback = null,
    remove: js.UndefOr[Callback] = js.undefined,
    removeAttribute: /* qualifiedName */ String => Callback = null,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Callback = null,
    removeAttributeNode: /* attr */ Attr => CallbackTo[Attr] = null,
    removeChild: /* oldChild */ Node => CallbackTo[Node] = null,
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[PropsElement, /* ev */ Event_, js.Any]) => Callback = null,
    replaceChild: (/* newChild */ Node, /* oldChild */ Node) => CallbackTo[Node] = null,
    replaceWith: /* repeated */ Node | String => Callback = null,
    requestFullscreen: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    requestPointerLock: js.UndefOr[Callback] = js.undefined,
    scroll: js.UndefOr[Callback] = js.undefined,
    scrollBy: js.UndefOr[Callback] = js.undefined,
    scrollHeight: Int | Double = null,
    scrollIntoView: js.UndefOr[Callback] = js.undefined,
    scrollLeft: Int | Double = null,
    scrollTo: js.UndefOr[Callback] = js.undefined,
    scrollTop: Int | Double = null,
    scrollWidth: Int | Double = null,
    setAttribute: (/* qualifiedName */ String, /* value */ String) => Callback = null,
    setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Callback = null,
    setAttributeNode: /* attr */ Attr => CallbackTo[Attr | Null] = null,
    setAttributeNodeNS: /* attr */ Attr => CallbackTo[Attr | Null] = null,
    setPointerCapture: /* pointerId */ Double => Callback = null,
    shadowRoot: ShadowRoot = null,
    slot: String = null,
    tagName: String = null,
    textContent: String = null,
    toggleAttribute: /* qualifiedName */ String => CallbackTo[Boolean] = null,
    webkitMatchesSelector: /* selectors */ String => CallbackTo[Boolean] = null
  ): PropsElement = {
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
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.petitDom.petitDomStrings.fullscreenchange, t1: /* listener */ js.ThisFunction1[typingsJapgolly.petitDom.PropsElement, /* ev */ typingsJapgolly.std.Event_, js.Any]) => addEventListener(t0, t1).runNow()))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => after(t0).runNow()))
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1((t0: /* keyframes */ js.Array[typingsJapgolly.std.Keyframe]) => animate(t0).runNow()))
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => append(t0).runNow()))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: /* newChild */ org.scalajs.dom.raw.Node) => appendChild(t0).runNow()))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (attachShadow != null) __obj.updateDynamic("attachShadow")(js.Any.fromFunction1((t0: /* init */ typingsJapgolly.std.ShadowRootInit) => attachShadow(t0).runNow()))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => before(t0).runNow()))
    if (childElementCount != null) __obj.updateDynamic("childElementCount")(childElementCount.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classList != null) __obj.updateDynamic("classList")(classList.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clientHeight != null) __obj.updateDynamic("clientHeight")(clientHeight.asInstanceOf[js.Any])
    if (clientLeft != null) __obj.updateDynamic("clientLeft")(clientLeft.asInstanceOf[js.Any])
    if (clientTop != null) __obj.updateDynamic("clientTop")(clientTop.asInstanceOf[js.Any])
    if (clientWidth != null) __obj.updateDynamic("clientWidth")(clientWidth.asInstanceOf[js.Any])
    cloneNode.foreach(p => __obj.updateDynamic("cloneNode")(p.toJsFn))
    if (closest != null) __obj.updateDynamic("closest")(js.Any.fromFunction1((t0: typingsJapgolly.petitDom.petitDomStrings.a) => closest(t0).runNow()))
    if (compareDocumentPosition != null) __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => compareDocumentPosition(t0).runNow()))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* other */ org.scalajs.dom.raw.Node) => contains(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dispatchEvent != null) __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => dispatchEvent(t0).runNow()))
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
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
    if (hasAttribute != null) __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => hasAttribute(t0).runNow()))
    if (hasAttributeNS != null) __obj.updateDynamic("hasAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => hasAttributeNS(t0, t1).runNow()))
    hasAttributes.foreach(p => __obj.updateDynamic("hasAttributes")(p.toJsFn))
    hasChildNodes.foreach(p => __obj.updateDynamic("hasChildNodes")(p.toJsFn))
    if (hasPointerCapture != null) __obj.updateDynamic("hasPointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => hasPointerCapture(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (insertAdjacentElement != null) __obj.updateDynamic("insertAdjacentElement")(js.Any.fromFunction2((t0: /* position */ typingsJapgolly.std.InsertPosition, t1: /* insertedElement */ org.scalajs.dom.raw.Element) => insertAdjacentElement(t0, t1).runNow()))
    if (insertAdjacentHTML != null) __obj.updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2((t0: /* where */ typingsJapgolly.std.InsertPosition, t1: /* html */ java.lang.String) => insertAdjacentHTML(t0, t1).runNow()))
    if (insertAdjacentText != null) __obj.updateDynamic("insertAdjacentText")(js.Any.fromFunction2((t0: /* where */ typingsJapgolly.std.InsertPosition, t1: /* text */ java.lang.String) => insertAdjacentText(t0, t1).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: /* newChild */ org.scalajs.dom.raw.Node, t1: /* refChild */ org.scalajs.dom.raw.Node) => insertBefore(t0, t1).runNow()))
    if (!js.isUndefined(isConnected)) __obj.updateDynamic("isConnected")(isConnected.asInstanceOf[js.Any])
    if (isDefaultNamespace != null) __obj.updateDynamic("isDefaultNamespace")(js.Any.fromFunction1((t0: /* namespace */ java.lang.String) => isDefaultNamespace(t0).runNow()))
    if (isEqualNode != null) __obj.updateDynamic("isEqualNode")(js.Any.fromFunction1((t0: /* otherNode */ org.scalajs.dom.raw.Node) => isEqualNode(t0).runNow()))
    if (isSameNode != null) __obj.updateDynamic("isSameNode")(js.Any.fromFunction1((t0: /* otherNode */ org.scalajs.dom.raw.Node) => isSameNode(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (lookupNamespaceURI != null) __obj.updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1((t0: /* prefix */ java.lang.String) => lookupNamespaceURI(t0).runNow()))
    if (lookupPrefix != null) __obj.updateDynamic("lookupPrefix")(js.Any.fromFunction1((t0: /* namespace */ java.lang.String) => lookupPrefix(t0).runNow()))
    if (matches != null) __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: /* selectors */ java.lang.String) => matches(t0).runNow()))
    msGetRegionContent.foreach(p => __obj.updateDynamic("msGetRegionContent")(p.toJsFn))
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    normalize.foreach(p => __obj.updateDynamic("normalize")(p.toJsFn))
    if (onfullscreenchange != null) __obj.updateDynamic("onfullscreenchange")(onfullscreenchange.asInstanceOf[js.Any])
    if (onfullscreenerror != null) __obj.updateDynamic("onfullscreenerror")(onfullscreenerror.asInstanceOf[js.Any])
    if (outerHTML != null) __obj.updateDynamic("outerHTML")(outerHTML.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => prepend(t0).runNow()))
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (querySelector != null) __obj.updateDynamic("querySelector")(js.Any.fromFunction1((t0: typingsJapgolly.petitDom.petitDomStrings.a) => querySelector(t0).runNow()))
    if (querySelectorAll != null) __obj.updateDynamic("querySelectorAll")(js.Any.fromFunction1((t0: typingsJapgolly.petitDom.petitDomStrings.a) => querySelectorAll(t0).runNow()))
    if (releasePointerCapture != null) __obj.updateDynamic("releasePointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => releasePointerCapture(t0).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    if (removeAttribute != null) __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => removeAttribute(t0).runNow()))
    if (removeAttributeNS != null) __obj.updateDynamic("removeAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ java.lang.String, t1: /* localName */ java.lang.String) => removeAttributeNS(t0, t1).runNow()))
    if (removeAttributeNode != null) __obj.updateDynamic("removeAttributeNode")(js.Any.fromFunction1((t0: /* attr */ org.scalajs.dom.raw.Attr) => removeAttributeNode(t0).runNow()))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: /* oldChild */ org.scalajs.dom.raw.Node) => removeChild(t0).runNow()))
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.petitDom.petitDomStrings.fullscreenchange, t1: /* listener */ js.ThisFunction1[typingsJapgolly.petitDom.PropsElement, /* ev */ typingsJapgolly.std.Event_, js.Any]) => removeEventListener(t0, t1).runNow()))
    if (replaceChild != null) __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: /* newChild */ org.scalajs.dom.raw.Node, t1: /* oldChild */ org.scalajs.dom.raw.Node) => replaceChild(t0, t1).runNow()))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => replaceWith(t0).runNow()))
    requestFullscreen.foreach(p => __obj.updateDynamic("requestFullscreen")(p.toJsFn))
    requestPointerLock.foreach(p => __obj.updateDynamic("requestPointerLock")(p.toJsFn))
    scroll.foreach(p => __obj.updateDynamic("scroll")(p.toJsFn))
    scrollBy.foreach(p => __obj.updateDynamic("scrollBy")(p.toJsFn))
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    scrollIntoView.foreach(p => __obj.updateDynamic("scrollIntoView")(p.toJsFn))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    scrollTo.foreach(p => __obj.updateDynamic("scrollTo")(p.toJsFn))
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollWidth != null) __obj.updateDynamic("scrollWidth")(scrollWidth.asInstanceOf[js.Any])
    if (setAttribute != null) __obj.updateDynamic("setAttribute")(js.Any.fromFunction2((t0: /* qualifiedName */ java.lang.String, t1: /* value */ java.lang.String) => setAttribute(t0, t1).runNow()))
    if (setAttributeNS != null) __obj.updateDynamic("setAttributeNS")(js.Any.fromFunction3((t0: /* namespace */ java.lang.String, t1: /* qualifiedName */ java.lang.String, t2: /* value */ java.lang.String) => setAttributeNS(t0, t1, t2).runNow()))
    if (setAttributeNode != null) __obj.updateDynamic("setAttributeNode")(js.Any.fromFunction1((t0: /* attr */ org.scalajs.dom.raw.Attr) => setAttributeNode(t0).runNow()))
    if (setAttributeNodeNS != null) __obj.updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1((t0: /* attr */ org.scalajs.dom.raw.Attr) => setAttributeNodeNS(t0).runNow()))
    if (setPointerCapture != null) __obj.updateDynamic("setPointerCapture")(js.Any.fromFunction1((t0: /* pointerId */ scala.Double) => setPointerCapture(t0).runNow()))
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    if (toggleAttribute != null) __obj.updateDynamic("toggleAttribute")(js.Any.fromFunction1((t0: /* qualifiedName */ java.lang.String) => toggleAttribute(t0).runNow()))
    if (webkitMatchesSelector != null) __obj.updateDynamic("webkitMatchesSelector")(js.Any.fromFunction1((t0: /* selectors */ java.lang.String) => webkitMatchesSelector(t0).runNow()))
    __obj.asInstanceOf[PropsElement]
  }
}

