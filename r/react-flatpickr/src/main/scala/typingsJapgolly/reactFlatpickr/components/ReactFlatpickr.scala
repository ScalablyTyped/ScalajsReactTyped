package typingsJapgolly.reactFlatpickr.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.Attr
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.DOMRect
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Document
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.FileList
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.ParentNode
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.ValidityState
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.flatpickr.distTypesGlobalsMod.global.Date
import typingsJapgolly.flatpickr.distTypesInstanceMod.Instance
import typingsJapgolly.flatpickr.mod.flatpickr.Options.Options
import typingsJapgolly.reactFlatpickr.anon.OmitDateTimePickerPropsop
import typingsJapgolly.reactFlatpickr.mod.DateTimePickerProps
import typingsJapgolly.reactFlatpickr.mod.default
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.a
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.backward
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.forward
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.fullscreenchange
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsJapgolly.reactFlatpickr.reactFlatpickrStrings.none
import typingsJapgolly.std.Animation
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.DOMStringMap
import typingsJapgolly.std.ElementInternals
import typingsJapgolly.std.FileSystemEntry
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlatpickr {
  
  @JSImport("react-flatpickr", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def ATTRIBUTE_NODE(value: Double): this.type = set("ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    inline def CDATA_SECTION_NODE(value: Double): this.type = set("CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    
    inline def COMMENT_NODE(value: Double): this.type = set("COMMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_FRAGMENT_NODE(value: Double): this.type = set("DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_NODE(value: Double): this.type = set("DOCUMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_POSITION_CONTAINED_BY(value: Double): this.type = set("DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_POSITION_CONTAINS(value: Double): this.type = set("DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_POSITION_DISCONNECTED(value: Double): this.type = set("DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_POSITION_FOLLOWING(value: Double): this.type = set("DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): this.type = set("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_POSITION_PRECEDING(value: Double): this.type = set("DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    
    inline def DOCUMENT_TYPE_NODE(value: Double): this.type = set("DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    
    inline def ELEMENT_NODE(value: Double): this.type = set("ELEMENT_NODE", value.asInstanceOf[js.Any])
    
    inline def ENTITY_NODE(value: Double): this.type = set("ENTITY_NODE", value.asInstanceOf[js.Any])
    
    inline def ENTITY_REFERENCE_NODE(value: Double): this.type = set("ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    
    inline def NOTATION_NODE(value: Double): this.type = set("NOTATION_NODE", value.asInstanceOf[js.Any])
    
    inline def PROCESSING_INSTRUCTION_NODE(value: Double): this.type = set("PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    
    inline def TEXT_NODE(value: Double): this.type = set("TEXT_NODE", value.asInstanceOf[js.Any])
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def accessKeyLabel(value: String): this.type = set("accessKeyLabel", value.asInstanceOf[js.Any])
    
    inline def addEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]) => Callback
    ): this.type = set("addEventListener", js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]) => (value(t0, t1)).runNow()))
    
    inline def after(value: /* repeated */ Node | String => Callback): this.type = set("after", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def animate(value: CallbackTo[Animation]): this.type = set("animate", value.toJsFn)
    
    inline def append(value: /* repeated */ Node | String => Callback): this.type = set("append", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def appendChild(value: /* node */ Node => Node): this.type = set("appendChild", js.Any.fromFunction1(value))
    
    inline def ariaAtomic(value: String): this.type = set("ariaAtomic", value.asInstanceOf[js.Any])
    
    inline def ariaAtomicNull: this.type = set("ariaAtomic", null)
    
    inline def ariaAutoComplete(value: String): this.type = set("ariaAutoComplete", value.asInstanceOf[js.Any])
    
    inline def ariaAutoCompleteNull: this.type = set("ariaAutoComplete", null)
    
    inline def ariaBusy(value: String): this.type = set("ariaBusy", value.asInstanceOf[js.Any])
    
    inline def ariaBusyNull: this.type = set("ariaBusy", null)
    
    inline def ariaChecked(value: String): this.type = set("ariaChecked", value.asInstanceOf[js.Any])
    
    inline def ariaCheckedNull: this.type = set("ariaChecked", null)
    
    inline def ariaColCount(value: String): this.type = set("ariaColCount", value.asInstanceOf[js.Any])
    
    inline def ariaColCountNull: this.type = set("ariaColCount", null)
    
    inline def ariaColIndex(value: String): this.type = set("ariaColIndex", value.asInstanceOf[js.Any])
    
    inline def ariaColIndexNull: this.type = set("ariaColIndex", null)
    
    inline def ariaColSpan(value: String): this.type = set("ariaColSpan", value.asInstanceOf[js.Any])
    
    inline def ariaColSpanNull: this.type = set("ariaColSpan", null)
    
    inline def ariaCurrent(value: String): this.type = set("ariaCurrent", value.asInstanceOf[js.Any])
    
    inline def ariaCurrentNull: this.type = set("ariaCurrent", null)
    
    inline def ariaDisabled(value: String): this.type = set("ariaDisabled", value.asInstanceOf[js.Any])
    
    inline def ariaDisabledNull: this.type = set("ariaDisabled", null)
    
    inline def ariaExpanded(value: String): this.type = set("ariaExpanded", value.asInstanceOf[js.Any])
    
    inline def ariaExpandedNull: this.type = set("ariaExpanded", null)
    
    inline def ariaHasPopup(value: String): this.type = set("ariaHasPopup", value.asInstanceOf[js.Any])
    
    inline def ariaHasPopupNull: this.type = set("ariaHasPopup", null)
    
    inline def ariaHidden(value: String): this.type = set("ariaHidden", value.asInstanceOf[js.Any])
    
    inline def ariaHiddenNull: this.type = set("ariaHidden", null)
    
    inline def ariaKeyShortcuts(value: String): this.type = set("ariaKeyShortcuts", value.asInstanceOf[js.Any])
    
    inline def ariaKeyShortcutsNull: this.type = set("ariaKeyShortcuts", null)
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelNull: this.type = set("ariaLabel", null)
    
    inline def ariaLevel(value: String): this.type = set("ariaLevel", value.asInstanceOf[js.Any])
    
    inline def ariaLevelNull: this.type = set("ariaLevel", null)
    
    inline def ariaLive(value: String): this.type = set("ariaLive", value.asInstanceOf[js.Any])
    
    inline def ariaLiveNull: this.type = set("ariaLive", null)
    
    inline def ariaModal(value: String): this.type = set("ariaModal", value.asInstanceOf[js.Any])
    
    inline def ariaModalNull: this.type = set("ariaModal", null)
    
    inline def ariaMultiLine(value: String): this.type = set("ariaMultiLine", value.asInstanceOf[js.Any])
    
    inline def ariaMultiLineNull: this.type = set("ariaMultiLine", null)
    
    inline def ariaMultiSelectable(value: String): this.type = set("ariaMultiSelectable", value.asInstanceOf[js.Any])
    
    inline def ariaMultiSelectableNull: this.type = set("ariaMultiSelectable", null)
    
    inline def ariaOrientation(value: String): this.type = set("ariaOrientation", value.asInstanceOf[js.Any])
    
    inline def ariaOrientationNull: this.type = set("ariaOrientation", null)
    
    inline def ariaPlaceholder(value: String): this.type = set("ariaPlaceholder", value.asInstanceOf[js.Any])
    
    inline def ariaPlaceholderNull: this.type = set("ariaPlaceholder", null)
    
    inline def ariaPosInSet(value: String): this.type = set("ariaPosInSet", value.asInstanceOf[js.Any])
    
    inline def ariaPosInSetNull: this.type = set("ariaPosInSet", null)
    
    inline def ariaPressed(value: String): this.type = set("ariaPressed", value.asInstanceOf[js.Any])
    
    inline def ariaPressedNull: this.type = set("ariaPressed", null)
    
    inline def ariaReadOnly(value: String): this.type = set("ariaReadOnly", value.asInstanceOf[js.Any])
    
    inline def ariaReadOnlyNull: this.type = set("ariaReadOnly", null)
    
    inline def ariaRequired(value: String): this.type = set("ariaRequired", value.asInstanceOf[js.Any])
    
    inline def ariaRequiredNull: this.type = set("ariaRequired", null)
    
    inline def ariaRoleDescription(value: String): this.type = set("ariaRoleDescription", value.asInstanceOf[js.Any])
    
    inline def ariaRoleDescriptionNull: this.type = set("ariaRoleDescription", null)
    
    inline def ariaRowCount(value: String): this.type = set("ariaRowCount", value.asInstanceOf[js.Any])
    
    inline def ariaRowCountNull: this.type = set("ariaRowCount", null)
    
    inline def ariaRowIndex(value: String): this.type = set("ariaRowIndex", value.asInstanceOf[js.Any])
    
    inline def ariaRowIndexNull: this.type = set("ariaRowIndex", null)
    
    inline def ariaRowSpan(value: String): this.type = set("ariaRowSpan", value.asInstanceOf[js.Any])
    
    inline def ariaRowSpanNull: this.type = set("ariaRowSpan", null)
    
    inline def ariaSelected(value: String): this.type = set("ariaSelected", value.asInstanceOf[js.Any])
    
    inline def ariaSelectedNull: this.type = set("ariaSelected", null)
    
    inline def ariaSetSize(value: String): this.type = set("ariaSetSize", value.asInstanceOf[js.Any])
    
    inline def ariaSetSizeNull: this.type = set("ariaSetSize", null)
    
    inline def ariaSort(value: String): this.type = set("ariaSort", value.asInstanceOf[js.Any])
    
    inline def ariaSortNull: this.type = set("ariaSort", null)
    
    inline def ariaValueMax(value: String): this.type = set("ariaValueMax", value.asInstanceOf[js.Any])
    
    inline def ariaValueMaxNull: this.type = set("ariaValueMax", null)
    
    inline def ariaValueMin(value: String): this.type = set("ariaValueMin", value.asInstanceOf[js.Any])
    
    inline def ariaValueMinNull: this.type = set("ariaValueMin", null)
    
    inline def ariaValueNow(value: String): this.type = set("ariaValueNow", value.asInstanceOf[js.Any])
    
    inline def ariaValueNowNull: this.type = set("ariaValueNow", null)
    
    inline def ariaValueText(value: String): this.type = set("ariaValueText", value.asInstanceOf[js.Any])
    
    inline def ariaValueTextNull: this.type = set("ariaValueText", null)
    
    inline def assignedSlot(value: HTMLSlotElement): this.type = set("assignedSlot", value.asInstanceOf[js.Any])
    
    inline def assignedSlotNull: this.type = set("assignedSlot", null)
    
    inline def attachInternals(value: CallbackTo[ElementInternals]): this.type = set("attachInternals", value.toJsFn)
    
    inline def attachShadow(value: /* init */ ShadowRootInit => ShadowRoot): this.type = set("attachShadow", js.Any.fromFunction1(value))
    
    inline def attributes(value: NamedNodeMap): this.type = set("attributes", value.asInstanceOf[js.Any])
    
    inline def autocapitalize(value: String): this.type = set("autocapitalize", value.asInstanceOf[js.Any])
    
    inline def autocomplete(value: String): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    inline def autofocus(value: Boolean): this.type = set("autofocus", value.asInstanceOf[js.Any])
    
    inline def baseURI(value: String): this.type = set("baseURI", value.asInstanceOf[js.Any])
    
    inline def before(value: /* repeated */ Node | String => Callback): this.type = set("before", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def blur(value: Callback): this.type = set("blur", value.toJsFn)
    
    inline def capture(value: String): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def checkValidity(value: CallbackTo[Boolean]): this.type = set("checkValidity", value.toJsFn)
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def childElementCount(value: Double): this.type = set("childElementCount", value.asInstanceOf[js.Any])
    
    inline def childNodes(value: NodeList[ChildNode & Node]): this.type = set("childNodes", value.asInstanceOf[js.Any])
    
    inline def classList(value: DOMTokenList): this.type = set("classList", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def click(value: Callback): this.type = set("click", value.toJsFn)
    
    inline def clientHeight(value: Double): this.type = set("clientHeight", value.asInstanceOf[js.Any])
    
    inline def clientLeft(value: Double): this.type = set("clientLeft", value.asInstanceOf[js.Any])
    
    inline def clientTop(value: Double): this.type = set("clientTop", value.asInstanceOf[js.Any])
    
    inline def clientWidth(value: Double): this.type = set("clientWidth", value.asInstanceOf[js.Any])
    
    inline def cloneNode(value: CallbackTo[Node]): this.type = set("cloneNode", value.toJsFn)
    
    inline def closest(value: a => HTMLAnchorElement | Null): this.type = set("closest", js.Any.fromFunction1(value))
    
    inline def compareDocumentPosition(value: /* other */ Node => Double): this.type = set("compareDocumentPosition", js.Any.fromFunction1(value))
    
    inline def contains(value: CallbackTo[Boolean]): this.type = set("contains", value.toJsFn)
    
    inline def contentEditable(value: String): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def dataset(value: DOMStringMap): this.type = set("dataset", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def dirName(value: String): this.type = set("dirName", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dispatchEvent(value: /* event */ Event => Boolean): this.type = set("dispatchEvent", js.Any.fromFunction1(value))
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def enterKeyHint(value: String): this.type = set("enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def files(value: FileList): this.type = set("files", value.asInstanceOf[js.Any])
    
    inline def filesNull: this.type = set("files", null)
    
    inline def firstChild(value: ChildNode): this.type = set("firstChild", value.asInstanceOf[js.Any])
    
    inline def firstChildNull: this.type = set("firstChild", null)
    
    inline def firstElementChild(value: Element): this.type = set("firstElementChild", value.asInstanceOf[js.Any])
    
    inline def firstElementChildNull: this.type = set("firstElementChild", null)
    
    inline def focus(value: Callback): this.type = set("focus", value.toJsFn)
    
    inline def form(value: HTMLFormElement): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    inline def formEnctype(value: String): this.type = set("formEnctype", value.asInstanceOf[js.Any])
    
    inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    inline def formNull: this.type = set("form", null)
    
    inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    inline def getAnimations(value: CallbackTo[js.Array[Animation]]): this.type = set("getAnimations", value.toJsFn)
    
    inline def getAttribute(value: /* qualifiedName */ String => String | Null): this.type = set("getAttribute", js.Any.fromFunction1(value))
    
    inline def getAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): this.type = set("getAttributeNS", js.Any.fromFunction2(value))
    
    inline def getAttributeNames(value: CallbackTo[js.Array[String]]): this.type = set("getAttributeNames", value.toJsFn)
    
    inline def getAttributeNode(value: /* qualifiedName */ String => Attr | Null): this.type = set("getAttributeNode", js.Any.fromFunction1(value))
    
    inline def getAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): this.type = set("getAttributeNodeNS", js.Any.fromFunction2(value))
    
    inline def getBoundingClientRect(value: CallbackTo[DOMRect]): this.type = set("getBoundingClientRect", value.toJsFn)
    
    inline def getClientRects(value: CallbackTo[DOMRectList]): this.type = set("getClientRects", value.toJsFn)
    
    inline def getElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): this.type = set("getElementsByClassName", js.Any.fromFunction1(value))
    
    inline def getElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): this.type = set("getElementsByTagName", js.Any.fromFunction1(value))
    
    inline def getElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): this.type = set("getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    inline def getRootNode(value: CallbackTo[Node]): this.type = set("getRootNode", value.toJsFn)
    
    inline def hasAttribute(value: /* qualifiedName */ String => Boolean): this.type = set("hasAttribute", js.Any.fromFunction1(value))
    
    inline def hasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): this.type = set("hasAttributeNS", js.Any.fromFunction2(value))
    
    inline def hasAttributes(value: CallbackTo[Boolean]): this.type = set("hasAttributes", value.toJsFn)
    
    inline def hasChildNodes(value: CallbackTo[Boolean]): this.type = set("hasChildNodes", value.toJsFn)
    
    inline def hasPointerCapture(value: /* pointerId */ Double => Boolean): this.type = set("hasPointerCapture", js.Any.fromFunction1(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    inline def inert(value: Boolean): this.type = set("inert", value.asInstanceOf[js.Any])
    
    inline def innerHTML(value: String): this.type = set("innerHTML", value.asInstanceOf[js.Any])
    
    inline def innerText(value: String): this.type = set("innerText", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def insertAdjacentElement(value: (/* where */ InsertPosition, /* element */ Element) => Element | Null): this.type = set("insertAdjacentElement", js.Any.fromFunction2(value))
    
    inline def insertAdjacentHTML(value: (/* position */ InsertPosition, /* text */ String) => Callback): this.type = set("insertAdjacentHTML", js.Any.fromFunction2((t0: /* position */ InsertPosition, t1: /* text */ String) => (value(t0, t1)).runNow()))
    
    inline def insertAdjacentText(value: (/* where */ InsertPosition, /* data */ String) => Callback): this.type = set("insertAdjacentText", js.Any.fromFunction2((t0: /* where */ InsertPosition, t1: /* data */ String) => (value(t0, t1)).runNow()))
    
    inline def insertBefore(value: /* node */ Node => Node): this.type = set("insertBefore", js.Any.fromFunction1(value))
    
    inline def isConnected(value: Boolean): this.type = set("isConnected", value.asInstanceOf[js.Any])
    
    inline def isContentEditable(value: Boolean): this.type = set("isContentEditable", value.asInstanceOf[js.Any])
    
    inline def isDefaultNamespace(value: CallbackTo[Boolean]): this.type = set("isDefaultNamespace", value.toJsFn)
    
    inline def isEqualNode(value: CallbackTo[Boolean]): this.type = set("isEqualNode", value.toJsFn)
    
    inline def isSameNode(value: CallbackTo[Boolean]): this.type = set("isSameNode", value.toJsFn)
    
    inline def labels(value: NodeList[HTMLLabelElement & Node]): this.type = set("labels", value.asInstanceOf[js.Any])
    
    inline def labelsNull: this.type = set("labels", null)
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def lastChild(value: ChildNode): this.type = set("lastChild", value.asInstanceOf[js.Any])
    
    inline def lastChildNull: this.type = set("lastChild", null)
    
    inline def lastElementChild(value: Element): this.type = set("lastElementChild", value.asInstanceOf[js.Any])
    
    inline def lastElementChildNull: this.type = set("lastElementChild", null)
    
    inline def list(value: HTMLElement): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def listNull: this.type = set("list", null)
    
    inline def localName(value: String): this.type = set("localName", value.asInstanceOf[js.Any])
    
    inline def lookupNamespaceURI(value: CallbackTo[String | Null]): this.type = set("lookupNamespaceURI", value.toJsFn)
    
    inline def lookupPrefix(value: CallbackTo[String | Null]): this.type = set("lookupPrefix", value.toJsFn)
    
    inline def matches(value: /* selectors */ String => Boolean): this.type = set("matches", js.Any.fromFunction1(value))
    
    inline def max(value: String): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def min(value: String): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def namespaceURI(value: String): this.type = set("namespaceURI", value.asInstanceOf[js.Any])
    
    inline def namespaceURINull: this.type = set("namespaceURI", null)
    
    inline def nextElementSibling(value: Element): this.type = set("nextElementSibling", value.asInstanceOf[js.Any])
    
    inline def nextElementSiblingNull: this.type = set("nextElementSibling", null)
    
    inline def nextSibling(value: ChildNode): this.type = set("nextSibling", value.asInstanceOf[js.Any])
    
    inline def nextSiblingNull: this.type = set("nextSibling", null)
    
    inline def nodeName(value: String): this.type = set("nodeName", value.asInstanceOf[js.Any])
    
    inline def nodeType(value: Double): this.type = set("nodeType", value.asInstanceOf[js.Any])
    
    inline def nodeValue(value: String): this.type = set("nodeValue", value.asInstanceOf[js.Any])
    
    inline def nodeValueNull: this.type = set("nodeValue", null)
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def normalize(value: Callback): this.type = set("normalize", value.toJsFn)
    
    inline def offsetHeight(value: Double): this.type = set("offsetHeight", value.asInstanceOf[js.Any])
    
    inline def offsetLeft(value: Double): this.type = set("offsetLeft", value.asInstanceOf[js.Any])
    
    inline def offsetParent(value: Element): this.type = set("offsetParent", value.asInstanceOf[js.Any])
    
    inline def offsetParentNull: this.type = set("offsetParent", null)
    
    inline def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    inline def offsetWidth(value: Double): this.type = set("offsetWidth", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onClose(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onClose", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onDayCreate(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onDayCreate", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onMonthChange(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onMonthChange", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onOpen(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onOpen", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onReady(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onReady", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onValueUpdate(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onValueUpdate", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onYearChange(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Callback
    ): this.type = set("onYearChange", js.Any.fromFunction4((t0: /* dates */ js.Array[Date], t1: /* currentDateString */ String, t2: /* self */ Instance, t3: /* data */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onabort(value: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, Any]): this.type = set("onabort", value.asInstanceOf[js.Any])
    
    inline def onabortNull: this.type = set("onabort", null)
    
    inline def onanimationcancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, Any]): this.type = set("onanimationcancel", value.asInstanceOf[js.Any])
    
    inline def onanimationcancelNull: this.type = set("onanimationcancel", null)
    
    inline def onanimationend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, Any]): this.type = set("onanimationend", value.asInstanceOf[js.Any])
    
    inline def onanimationendNull: this.type = set("onanimationend", null)
    
    inline def onanimationiteration(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, Any]): this.type = set("onanimationiteration", value.asInstanceOf[js.Any])
    
    inline def onanimationiterationNull: this.type = set("onanimationiteration", null)
    
    inline def onanimationstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ AnimationEvent, Any]): this.type = set("onanimationstart", value.asInstanceOf[js.Any])
    
    inline def onanimationstartNull: this.type = set("onanimationstart", null)
    
    inline def onauxclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onauxclick", value.asInstanceOf[js.Any])
    
    inline def onauxclickNull: this.type = set("onauxclick", null)
    
    inline def onblur(value: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, Any]): this.type = set("onblur", value.asInstanceOf[js.Any])
    
    inline def onblurNull: this.type = set("onblur", null)
    
    inline def oncanplay(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("oncanplay", value.asInstanceOf[js.Any])
    
    inline def oncanplayNull: this.type = set("oncanplay", null)
    
    inline def oncanplaythrough(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("oncanplaythrough", value.asInstanceOf[js.Any])
    
    inline def oncanplaythroughNull: this.type = set("oncanplaythrough", null)
    
    inline def onchangeNull: this.type = set("onchange", null)
    
    inline def onclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onclick", value.asInstanceOf[js.Any])
    
    inline def onclickNull: this.type = set("onclick", null)
    
    inline def oncloseNull: this.type = set("onclose", null)
    
    inline def oncontextmenu(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("oncontextmenu", value.asInstanceOf[js.Any])
    
    inline def oncontextmenuNull: this.type = set("oncontextmenu", null)
    
    inline def oncopy(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, Any]): this.type = set("oncopy", value.asInstanceOf[js.Any])
    
    inline def oncopyNull: this.type = set("oncopy", null)
    
    inline def oncuechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("oncuechange", value.asInstanceOf[js.Any])
    
    inline def oncuechangeNull: this.type = set("oncuechange", null)
    
    inline def oncut(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, Any]): this.type = set("oncut", value.asInstanceOf[js.Any])
    
    inline def oncutNull: this.type = set("oncut", null)
    
    inline def ondblclick(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("ondblclick", value.asInstanceOf[js.Any])
    
    inline def ondblclickNull: this.type = set("ondblclick", null)
    
    inline def ondrag(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, Any]): this.type = set("ondrag", value.asInstanceOf[js.Any])
    
    inline def ondragNull: this.type = set("ondrag", null)
    
    inline def ondragend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, Any]): this.type = set("ondragend", value.asInstanceOf[js.Any])
    
    inline def ondragendNull: this.type = set("ondragend", null)
    
    inline def ondragenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, Any]): this.type = set("ondragenter", value.asInstanceOf[js.Any])
    
    inline def ondragenterNull: this.type = set("ondragenter", null)
    
    inline def ondragleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, Any]): this.type = set("ondragleave", value.asInstanceOf[js.Any])
    
    inline def ondragleaveNull: this.type = set("ondragleave", null)
    
    inline def ondragover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, Any]): this.type = set("ondragover", value.asInstanceOf[js.Any])
    
    inline def ondragoverNull: this.type = set("ondragover", null)
    
    inline def ondragstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, Any]): this.type = set("ondragstart", value.asInstanceOf[js.Any])
    
    inline def ondragstartNull: this.type = set("ondragstart", null)
    
    inline def ondrop(value: js.ThisFunction1[DateTimePickerProps, /* ev */ DragEvent, Any]): this.type = set("ondrop", value.asInstanceOf[js.Any])
    
    inline def ondropNull: this.type = set("ondrop", null)
    
    inline def ondurationchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("ondurationchange", value.asInstanceOf[js.Any])
    
    inline def ondurationchangeNull: this.type = set("ondurationchange", null)
    
    inline def onemptied(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onemptied", value.asInstanceOf[js.Any])
    
    inline def onemptiedNull: this.type = set("onemptied", null)
    
    inline def onended(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onended", value.asInstanceOf[js.Any])
    
    inline def onendedNull: this.type = set("onended", null)
    
    inline def onerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => Any
    ): this.type = set("onerror", js.Any.fromFunction5(value))
    
    inline def onerrorNull: this.type = set("onerror", null)
    
    inline def onfocus(value: js.ThisFunction1[DateTimePickerProps, /* ev */ FocusEvent, Any]): this.type = set("onfocus", value.asInstanceOf[js.Any])
    
    inline def onfocusNull: this.type = set("onfocus", null)
    
    inline def onformdata(value: js.ThisFunction1[DateTimePickerProps, /* ev */ FormDataEvent, Any]): this.type = set("onformdata", value.asInstanceOf[js.Any])
    
    inline def onformdataNull: this.type = set("onformdata", null)
    
    inline def onfullscreenchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onfullscreenchange", value.asInstanceOf[js.Any])
    
    inline def onfullscreenchangeNull: this.type = set("onfullscreenchange", null)
    
    inline def onfullscreenerror(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onfullscreenerror", value.asInstanceOf[js.Any])
    
    inline def onfullscreenerrorNull: this.type = set("onfullscreenerror", null)
    
    inline def ongotpointercapture(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("ongotpointercapture", value.asInstanceOf[js.Any])
    
    inline def ongotpointercaptureNull: this.type = set("ongotpointercapture", null)
    
    inline def oninput(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("oninput", value.asInstanceOf[js.Any])
    
    inline def oninputNull: this.type = set("oninput", null)
    
    inline def oninvalid(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("oninvalid", value.asInstanceOf[js.Any])
    
    inline def oninvalidNull: this.type = set("oninvalid", null)
    
    inline def onkeydown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, Any]): this.type = set("onkeydown", value.asInstanceOf[js.Any])
    
    inline def onkeydownNull: this.type = set("onkeydown", null)
    
    inline def onkeypress(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, Any]): this.type = set("onkeypress", value.asInstanceOf[js.Any])
    
    inline def onkeypressNull: this.type = set("onkeypress", null)
    
    inline def onkeyup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ KeyboardEvent, Any]): this.type = set("onkeyup", value.asInstanceOf[js.Any])
    
    inline def onkeyupNull: this.type = set("onkeyup", null)
    
    inline def onload(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onload", value.asInstanceOf[js.Any])
    
    inline def onloadNull: this.type = set("onload", null)
    
    inline def onloadeddata(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onloadeddata", value.asInstanceOf[js.Any])
    
    inline def onloadeddataNull: this.type = set("onloadeddata", null)
    
    inline def onloadedmetadata(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onloadedmetadata", value.asInstanceOf[js.Any])
    
    inline def onloadedmetadataNull: this.type = set("onloadedmetadata", null)
    
    inline def onloadstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onloadstart", value.asInstanceOf[js.Any])
    
    inline def onloadstartNull: this.type = set("onloadstart", null)
    
    inline def onlostpointercapture(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onlostpointercapture", value.asInstanceOf[js.Any])
    
    inline def onlostpointercaptureNull: this.type = set("onlostpointercapture", null)
    
    inline def onmousedown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onmousedown", value.asInstanceOf[js.Any])
    
    inline def onmousedownNull: this.type = set("onmousedown", null)
    
    inline def onmouseenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onmouseenter", value.asInstanceOf[js.Any])
    
    inline def onmouseenterNull: this.type = set("onmouseenter", null)
    
    inline def onmouseleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onmouseleave", value.asInstanceOf[js.Any])
    
    inline def onmouseleaveNull: this.type = set("onmouseleave", null)
    
    inline def onmousemove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onmousemove", value.asInstanceOf[js.Any])
    
    inline def onmousemoveNull: this.type = set("onmousemove", null)
    
    inline def onmouseout(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onmouseout", value.asInstanceOf[js.Any])
    
    inline def onmouseoutNull: this.type = set("onmouseout", null)
    
    inline def onmouseover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onmouseover", value.asInstanceOf[js.Any])
    
    inline def onmouseoverNull: this.type = set("onmouseover", null)
    
    inline def onmouseup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ MouseEvent, Any]): this.type = set("onmouseup", value.asInstanceOf[js.Any])
    
    inline def onmouseupNull: this.type = set("onmouseup", null)
    
    inline def onpaste(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ClipboardEvent, Any]): this.type = set("onpaste", value.asInstanceOf[js.Any])
    
    inline def onpasteNull: this.type = set("onpaste", null)
    
    inline def onpause(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onpause", value.asInstanceOf[js.Any])
    
    inline def onpauseNull: this.type = set("onpause", null)
    
    inline def onplay(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onplay", value.asInstanceOf[js.Any])
    
    inline def onplayNull: this.type = set("onplay", null)
    
    inline def onplaying(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onplaying", value.asInstanceOf[js.Any])
    
    inline def onplayingNull: this.type = set("onplaying", null)
    
    inline def onpointercancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointercancel", value.asInstanceOf[js.Any])
    
    inline def onpointercancelNull: this.type = set("onpointercancel", null)
    
    inline def onpointerdown(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointerdown", value.asInstanceOf[js.Any])
    
    inline def onpointerdownNull: this.type = set("onpointerdown", null)
    
    inline def onpointerenter(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointerenter", value.asInstanceOf[js.Any])
    
    inline def onpointerenterNull: this.type = set("onpointerenter", null)
    
    inline def onpointerleave(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointerleave", value.asInstanceOf[js.Any])
    
    inline def onpointerleaveNull: this.type = set("onpointerleave", null)
    
    inline def onpointermove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointermove", value.asInstanceOf[js.Any])
    
    inline def onpointermoveNull: this.type = set("onpointermove", null)
    
    inline def onpointerout(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointerout", value.asInstanceOf[js.Any])
    
    inline def onpointeroutNull: this.type = set("onpointerout", null)
    
    inline def onpointerover(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointerover", value.asInstanceOf[js.Any])
    
    inline def onpointeroverNull: this.type = set("onpointerover", null)
    
    inline def onpointerup(value: js.ThisFunction1[DateTimePickerProps, /* ev */ PointerEvent, Any]): this.type = set("onpointerup", value.asInstanceOf[js.Any])
    
    inline def onpointerupNull: this.type = set("onpointerup", null)
    
    inline def onprogress(value: js.ThisFunction1[DateTimePickerProps, /* ev */ ProgressEvent, Any]): this.type = set("onprogress", value.asInstanceOf[js.Any])
    
    inline def onprogressNull: this.type = set("onprogress", null)
    
    inline def onratechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onratechange", value.asInstanceOf[js.Any])
    
    inline def onratechangeNull: this.type = set("onratechange", null)
    
    inline def onreset(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onreset", value.asInstanceOf[js.Any])
    
    inline def onresetNull: this.type = set("onreset", null)
    
    inline def onresize(value: js.ThisFunction1[DateTimePickerProps, /* ev */ UIEvent, Any]): this.type = set("onresize", value.asInstanceOf[js.Any])
    
    inline def onresizeNull: this.type = set("onresize", null)
    
    inline def onscroll(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onscroll", value.asInstanceOf[js.Any])
    
    inline def onscrollNull: this.type = set("onscroll", null)
    
    inline def onsecuritypolicyviolation(value: js.ThisFunction1[DateTimePickerProps, /* ev */ SecurityPolicyViolationEvent, Any]): this.type = set("onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    
    inline def onsecuritypolicyviolationNull: this.type = set("onsecuritypolicyviolation", null)
    
    inline def onseeked(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onseeked", value.asInstanceOf[js.Any])
    
    inline def onseekedNull: this.type = set("onseeked", null)
    
    inline def onseeking(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onseeking", value.asInstanceOf[js.Any])
    
    inline def onseekingNull: this.type = set("onseeking", null)
    
    inline def onselect(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onselect", value.asInstanceOf[js.Any])
    
    inline def onselectNull: this.type = set("onselect", null)
    
    inline def onselectionchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onselectionchange", value.asInstanceOf[js.Any])
    
    inline def onselectionchangeNull: this.type = set("onselectionchange", null)
    
    inline def onselectstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onselectstart", value.asInstanceOf[js.Any])
    
    inline def onselectstartNull: this.type = set("onselectstart", null)
    
    inline def onslotchange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onslotchange", value.asInstanceOf[js.Any])
    
    inline def onslotchangeNull: this.type = set("onslotchange", null)
    
    inline def onstalled(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onstalled", value.asInstanceOf[js.Any])
    
    inline def onstalledNull: this.type = set("onstalled", null)
    
    inline def onsubmit(value: js.ThisFunction1[DateTimePickerProps, /* ev */ SubmitEvent, Any]): this.type = set("onsubmit", value.asInstanceOf[js.Any])
    
    inline def onsubmitNull: this.type = set("onsubmit", null)
    
    inline def onsuspend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onsuspend", value.asInstanceOf[js.Any])
    
    inline def onsuspendNull: this.type = set("onsuspend", null)
    
    inline def ontimeupdate(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("ontimeupdate", value.asInstanceOf[js.Any])
    
    inline def ontimeupdateNull: this.type = set("ontimeupdate", null)
    
    inline def ontoggle(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("ontoggle", value.asInstanceOf[js.Any])
    
    inline def ontoggleNull: this.type = set("ontoggle", null)
    
    inline def ontouchcancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, Any]): this.type = set("ontouchcancel", value.asInstanceOf[js.Any])
    
    inline def ontouchcancelNull: this.type = set("ontouchcancel", null)
    
    inline def ontouchend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, Any]): this.type = set("ontouchend", value.asInstanceOf[js.Any])
    
    inline def ontouchendNull: this.type = set("ontouchend", null)
    
    inline def ontouchmove(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, Any]): this.type = set("ontouchmove", value.asInstanceOf[js.Any])
    
    inline def ontouchmoveNull: this.type = set("ontouchmove", null)
    
    inline def ontouchstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TouchEvent, Any]): this.type = set("ontouchstart", value.asInstanceOf[js.Any])
    
    inline def ontouchstartNull: this.type = set("ontouchstart", null)
    
    inline def ontransitioncancel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, Any]): this.type = set("ontransitioncancel", value.asInstanceOf[js.Any])
    
    inline def ontransitioncancelNull: this.type = set("ontransitioncancel", null)
    
    inline def ontransitionend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, Any]): this.type = set("ontransitionend", value.asInstanceOf[js.Any])
    
    inline def ontransitionendNull: this.type = set("ontransitionend", null)
    
    inline def ontransitionrun(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, Any]): this.type = set("ontransitionrun", value.asInstanceOf[js.Any])
    
    inline def ontransitionrunNull: this.type = set("ontransitionrun", null)
    
    inline def ontransitionstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ TransitionEvent, Any]): this.type = set("ontransitionstart", value.asInstanceOf[js.Any])
    
    inline def ontransitionstartNull: this.type = set("ontransitionstart", null)
    
    inline def onvolumechange(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onvolumechange", value.asInstanceOf[js.Any])
    
    inline def onvolumechangeNull: this.type = set("onvolumechange", null)
    
    inline def onwaiting(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onwaiting", value.asInstanceOf[js.Any])
    
    inline def onwaitingNull: this.type = set("onwaiting", null)
    
    inline def onwebkitanimationend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onwebkitanimationend", value.asInstanceOf[js.Any])
    
    inline def onwebkitanimationendNull: this.type = set("onwebkitanimationend", null)
    
    inline def onwebkitanimationiteration(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onwebkitanimationiteration", value.asInstanceOf[js.Any])
    
    inline def onwebkitanimationiterationNull: this.type = set("onwebkitanimationiteration", null)
    
    inline def onwebkitanimationstart(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onwebkitanimationstart", value.asInstanceOf[js.Any])
    
    inline def onwebkitanimationstartNull: this.type = set("onwebkitanimationstart", null)
    
    inline def onwebkittransitionend(value: js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]): this.type = set("onwebkittransitionend", value.asInstanceOf[js.Any])
    
    inline def onwebkittransitionendNull: this.type = set("onwebkittransitionend", null)
    
    inline def onwheel(value: js.ThisFunction1[DateTimePickerProps, /* ev */ WheelEvent, Any]): this.type = set("onwheel", value.asInstanceOf[js.Any])
    
    inline def onwheelNull: this.type = set("onwheel", null)
    
    inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def outerHTML(value: String): this.type = set("outerHTML", value.asInstanceOf[js.Any])
    
    inline def outerText(value: String): this.type = set("outerText", value.asInstanceOf[js.Any])
    
    inline def ownerDocument(value: Document): this.type = set("ownerDocument", value.asInstanceOf[js.Any])
    
    inline def parentElement(value: HTMLElement): this.type = set("parentElement", value.asInstanceOf[js.Any])
    
    inline def parentElementNull: this.type = set("parentElement", null)
    
    inline def parentNode(value: ParentNode): this.type = set("parentNode", value.asInstanceOf[js.Any])
    
    inline def parentNodeNull: this.type = set("parentNode", null)
    
    inline def part(value: DOMTokenList): this.type = set("part", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def prefixNull: this.type = set("prefix", null)
    
    inline def prepend(value: /* repeated */ Node | String => Callback): this.type = set("prepend", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def previousElementSibling(value: Element): this.type = set("previousElementSibling", value.asInstanceOf[js.Any])
    
    inline def previousElementSiblingNull: this.type = set("previousElementSibling", null)
    
    inline def previousSibling(value: ChildNode): this.type = set("previousSibling", value.asInstanceOf[js.Any])
    
    inline def previousSiblingNull: this.type = set("previousSibling", null)
    
    inline def querySelector(value: a => HTMLAnchorElement | Null): this.type = set("querySelector", js.Any.fromFunction1(value))
    
    inline def querySelectorAll(value: a => NodeList[HTMLAnchorElement & Node]): this.type = set("querySelectorAll", js.Any.fromFunction1(value))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def releasePointerCapture(value: /* pointerId */ Double => Callback): this.type = set("releasePointerCapture", js.Any.fromFunction1((t0: /* pointerId */ Double) => value(t0).runNow()))
    
    inline def remove(value: Callback): this.type = set("remove", value.toJsFn)
    
    inline def removeAttribute(value: /* qualifiedName */ String => Callback): this.type = set("removeAttribute", js.Any.fromFunction1((t0: /* qualifiedName */ String) => value(t0).runNow()))
    
    inline def removeAttributeNS(value: (/* namespace */ String, /* localName */ String) => Callback): this.type = set("removeAttributeNS", js.Any.fromFunction2((t0: /* namespace */ String, t1: /* localName */ String) => (value(t0, t1)).runNow()))
    
    inline def removeAttributeNode(value: /* attr */ Attr => Attr): this.type = set("removeAttributeNode", js.Any.fromFunction1(value))
    
    inline def removeChild(value: /* child */ Node => Node): this.type = set("removeChild", js.Any.fromFunction1(value))
    
    inline def removeEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]) => Callback
    ): this.type = set("removeEventListener", js.Any.fromFunction2((t0: fullscreenchange, t1: /* listener */ js.ThisFunction1[DateTimePickerProps, /* ev */ Event, Any]) => (value(t0, t1)).runNow()))
    
    inline def render(
      value: (/* props */ OmitDateTimePickerPropsop, /* ref */ js.Function1[/* node */ HTMLInputElement | Null, Unit]) => japgolly.scalajs.react.facade.React.Element
    ): this.type = set("render", js.Any.fromFunction2(value))
    
    inline def replaceChild(value: (/* node */ Node, /* child */ Node) => Node): this.type = set("replaceChild", js.Any.fromFunction2(value))
    
    inline def replaceChildren(value: /* repeated */ Node | String => Callback): this.type = set("replaceChildren", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def replaceWith(value: /* repeated */ Node | String => Callback): this.type = set("replaceWith", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def reportValidity(value: CallbackTo[Boolean]): this.type = set("reportValidity", value.toJsFn)
    
    inline def requestFullscreen(value: CallbackTo[js.Promise[Unit]]): this.type = set("requestFullscreen", value.toJsFn)
    
    inline def requestPointerLock(value: Callback): this.type = set("requestPointerLock", value.toJsFn)
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def scroll(value: Callback): this.type = set("scroll", value.toJsFn)
    
    inline def scrollBy(value: Callback): this.type = set("scrollBy", value.toJsFn)
    
    inline def scrollHeight(value: Double): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    
    inline def scrollIntoView(value: Callback): this.type = set("scrollIntoView", value.toJsFn)
    
    inline def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    
    inline def scrollTo(value: Callback): this.type = set("scrollTo", value.toJsFn)
    
    inline def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    
    inline def scrollWidth(value: Double): this.type = set("scrollWidth", value.asInstanceOf[js.Any])
    
    inline def select(value: Callback): this.type = set("select", value.toJsFn)
    
    inline def selectionDirection(value: forward | backward | none): this.type = set("selectionDirection", value.asInstanceOf[js.Any])
    
    inline def selectionDirectionNull: this.type = set("selectionDirection", null)
    
    inline def selectionEnd(value: Double): this.type = set("selectionEnd", value.asInstanceOf[js.Any])
    
    inline def selectionEndNull: this.type = set("selectionEnd", null)
    
    inline def selectionStart(value: Double): this.type = set("selectionStart", value.asInstanceOf[js.Any])
    
    inline def selectionStartNull: this.type = set("selectionStart", null)
    
    inline def setAttribute(value: (/* qualifiedName */ String, /* value */ String) => Callback): this.type = set("setAttribute", js.Any.fromFunction2((t0: /* qualifiedName */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
    
    inline def setAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Callback): this.type = set("setAttributeNS", js.Any.fromFunction3((t0: /* namespace */ String, t1: /* qualifiedName */ String, t2: /* value */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def setAttributeNode(value: /* attr */ Attr => Attr | Null): this.type = set("setAttributeNode", js.Any.fromFunction1(value))
    
    inline def setAttributeNodeNS(value: /* attr */ Attr => Attr | Null): this.type = set("setAttributeNodeNS", js.Any.fromFunction1(value))
    
    inline def setCustomValidity(value: /* error */ String => Callback): this.type = set("setCustomValidity", js.Any.fromFunction1((t0: /* error */ String) => value(t0).runNow()))
    
    inline def setPointerCapture(value: /* pointerId */ Double => Callback): this.type = set("setPointerCapture", js.Any.fromFunction1((t0: /* pointerId */ Double) => value(t0).runNow()))
    
    inline def setRangeText(value: /* replacement */ String => Callback): this.type = set("setRangeText", js.Any.fromFunction1((t0: /* replacement */ String) => value(t0).runNow()))
    
    inline def setSelectionRange(value: Callback): this.type = set("setSelectionRange", value.toJsFn)
    
    inline def shadowRoot(value: ShadowRoot): this.type = set("shadowRoot", value.asInstanceOf[js.Any])
    
    inline def shadowRootNull: this.type = set("shadowRoot", null)
    
    inline def showPicker(value: Callback): this.type = set("showPicker", value.toJsFn)
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellcheck(value: Boolean): this.type = set("spellcheck", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def step(value: String): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def stepDown(value: Callback): this.type = set("stepDown", value.toJsFn)
    
    inline def stepUp(value: Callback): this.type = set("stepUp", value.toJsFn)
    
    inline def style(value: CSSStyleDeclaration): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
    
    inline def textContent(value: String): this.type = set("textContent", value.asInstanceOf[js.Any])
    
    inline def textContentNull: this.type = set("textContent", null)
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def toggleAttribute(value: /* qualifiedName */ String => Boolean): this.type = set("toggleAttribute", js.Any.fromFunction1(value))
    
    inline def translate(value: Boolean): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def useMap(value: String): this.type = set("useMap", value.asInstanceOf[js.Any])
    
    inline def validationMessage(value: String): this.type = set("validationMessage", value.asInstanceOf[js.Any])
    
    inline def validity(value: ValidityState): this.type = set("validity", value.asInstanceOf[js.Any])
    
    inline def value(value: String | js.Date | Double | (js.Array[String | js.Date | Double])): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueAsDate(value: js.Date): this.type = set("valueAsDate", value.asInstanceOf[js.Any])
    
    inline def valueAsDateNull: this.type = set("valueAsDate", null)
    
    inline def valueAsNumber(value: Double): this.type = set("valueAsNumber", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: (String | js.Date | Double)*): this.type = set("value", js.Array(value*))
    
    inline def webkitEntries(value: js.Array[FileSystemEntry]): this.type = set("webkitEntries", value.asInstanceOf[js.Any])
    
    inline def webkitEntriesVarargs(value: FileSystemEntry*): this.type = set("webkitEntries", js.Array(value*))
    
    inline def webkitMatchesSelector(value: /* selectors */ String => Boolean): this.type = set("webkitMatchesSelector", js.Any.fromFunction1(value))
    
    inline def webkitdirectory(value: Boolean): this.type = set("webkitdirectory", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def willValidate(value: Boolean): this.type = set("willValidate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactFlatpickr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DateTimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
