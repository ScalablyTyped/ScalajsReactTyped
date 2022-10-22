package typingsJapgolly.wordpressDom

import org.scalajs.dom.DOMRect
import org.scalajs.dom.Element
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
import org.scalajs.dom.Node
import org.scalajs.dom.ParentNode
import org.scalajs.dom.Range
import typingsJapgolly.std.HTMLDataElement
import typingsJapgolly.std.HTMLDetailsElement
import typingsJapgolly.std.HTMLDialogElement
import typingsJapgolly.std.HTMLMeterElement
import typingsJapgolly.std.HTMLOutputElement
import typingsJapgolly.std.HTMLPictureElement
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.HTMLTemplateElement
import typingsJapgolly.std.HTMLTimeElement
import typingsJapgolly.wordpressDom.wordpressDomStrings.`object`
import typingsJapgolly.wordpressDom.wordpressDomStrings.`var`
import typingsJapgolly.wordpressDom.wordpressDomStrings.a
import typingsJapgolly.wordpressDom.wordpressDomStrings.abbr
import typingsJapgolly.wordpressDom.wordpressDomStrings.address
import typingsJapgolly.wordpressDom.wordpressDomStrings.area
import typingsJapgolly.wordpressDom.wordpressDomStrings.article
import typingsJapgolly.wordpressDom.wordpressDomStrings.aside
import typingsJapgolly.wordpressDom.wordpressDomStrings.audio
import typingsJapgolly.wordpressDom.wordpressDomStrings.b
import typingsJapgolly.wordpressDom.wordpressDomStrings.base
import typingsJapgolly.wordpressDom.wordpressDomStrings.bdi
import typingsJapgolly.wordpressDom.wordpressDomStrings.bdo
import typingsJapgolly.wordpressDom.wordpressDomStrings.blockquote
import typingsJapgolly.wordpressDom.wordpressDomStrings.body
import typingsJapgolly.wordpressDom.wordpressDomStrings.br
import typingsJapgolly.wordpressDom.wordpressDomStrings.button
import typingsJapgolly.wordpressDom.wordpressDomStrings.canvas
import typingsJapgolly.wordpressDom.wordpressDomStrings.caption
import typingsJapgolly.wordpressDom.wordpressDomStrings.cite
import typingsJapgolly.wordpressDom.wordpressDomStrings.code
import typingsJapgolly.wordpressDom.wordpressDomStrings.col
import typingsJapgolly.wordpressDom.wordpressDomStrings.colgroup
import typingsJapgolly.wordpressDom.wordpressDomStrings.data
import typingsJapgolly.wordpressDom.wordpressDomStrings.datalist
import typingsJapgolly.wordpressDom.wordpressDomStrings.dd
import typingsJapgolly.wordpressDom.wordpressDomStrings.del
import typingsJapgolly.wordpressDom.wordpressDomStrings.details
import typingsJapgolly.wordpressDom.wordpressDomStrings.dfn
import typingsJapgolly.wordpressDom.wordpressDomStrings.dialog
import typingsJapgolly.wordpressDom.wordpressDomStrings.div
import typingsJapgolly.wordpressDom.wordpressDomStrings.dl
import typingsJapgolly.wordpressDom.wordpressDomStrings.dt
import typingsJapgolly.wordpressDom.wordpressDomStrings.em
import typingsJapgolly.wordpressDom.wordpressDomStrings.embed
import typingsJapgolly.wordpressDom.wordpressDomStrings.fieldset
import typingsJapgolly.wordpressDom.wordpressDomStrings.figcaption
import typingsJapgolly.wordpressDom.wordpressDomStrings.figure
import typingsJapgolly.wordpressDom.wordpressDomStrings.footer
import typingsJapgolly.wordpressDom.wordpressDomStrings.form
import typingsJapgolly.wordpressDom.wordpressDomStrings.h1
import typingsJapgolly.wordpressDom.wordpressDomStrings.h2
import typingsJapgolly.wordpressDom.wordpressDomStrings.h3
import typingsJapgolly.wordpressDom.wordpressDomStrings.h4
import typingsJapgolly.wordpressDom.wordpressDomStrings.h5
import typingsJapgolly.wordpressDom.wordpressDomStrings.h6
import typingsJapgolly.wordpressDom.wordpressDomStrings.head
import typingsJapgolly.wordpressDom.wordpressDomStrings.header
import typingsJapgolly.wordpressDom.wordpressDomStrings.hgroup
import typingsJapgolly.wordpressDom.wordpressDomStrings.hr
import typingsJapgolly.wordpressDom.wordpressDomStrings.html
import typingsJapgolly.wordpressDom.wordpressDomStrings.i
import typingsJapgolly.wordpressDom.wordpressDomStrings.iframe
import typingsJapgolly.wordpressDom.wordpressDomStrings.img
import typingsJapgolly.wordpressDom.wordpressDomStrings.input
import typingsJapgolly.wordpressDom.wordpressDomStrings.ins
import typingsJapgolly.wordpressDom.wordpressDomStrings.kbd
import typingsJapgolly.wordpressDom.wordpressDomStrings.label
import typingsJapgolly.wordpressDom.wordpressDomStrings.legend
import typingsJapgolly.wordpressDom.wordpressDomStrings.li
import typingsJapgolly.wordpressDom.wordpressDomStrings.link
import typingsJapgolly.wordpressDom.wordpressDomStrings.main
import typingsJapgolly.wordpressDom.wordpressDomStrings.map
import typingsJapgolly.wordpressDom.wordpressDomStrings.mark
import typingsJapgolly.wordpressDom.wordpressDomStrings.menu
import typingsJapgolly.wordpressDom.wordpressDomStrings.meta
import typingsJapgolly.wordpressDom.wordpressDomStrings.meter
import typingsJapgolly.wordpressDom.wordpressDomStrings.nav
import typingsJapgolly.wordpressDom.wordpressDomStrings.noscript
import typingsJapgolly.wordpressDom.wordpressDomStrings.ol
import typingsJapgolly.wordpressDom.wordpressDomStrings.optgroup
import typingsJapgolly.wordpressDom.wordpressDomStrings.option
import typingsJapgolly.wordpressDom.wordpressDomStrings.output
import typingsJapgolly.wordpressDom.wordpressDomStrings.p
import typingsJapgolly.wordpressDom.wordpressDomStrings.picture
import typingsJapgolly.wordpressDom.wordpressDomStrings.pre
import typingsJapgolly.wordpressDom.wordpressDomStrings.progress
import typingsJapgolly.wordpressDom.wordpressDomStrings.q
import typingsJapgolly.wordpressDom.wordpressDomStrings.rp
import typingsJapgolly.wordpressDom.wordpressDomStrings.rt
import typingsJapgolly.wordpressDom.wordpressDomStrings.ruby
import typingsJapgolly.wordpressDom.wordpressDomStrings.s
import typingsJapgolly.wordpressDom.wordpressDomStrings.samp
import typingsJapgolly.wordpressDom.wordpressDomStrings.script
import typingsJapgolly.wordpressDom.wordpressDomStrings.section
import typingsJapgolly.wordpressDom.wordpressDomStrings.select
import typingsJapgolly.wordpressDom.wordpressDomStrings.slot
import typingsJapgolly.wordpressDom.wordpressDomStrings.small
import typingsJapgolly.wordpressDom.wordpressDomStrings.source
import typingsJapgolly.wordpressDom.wordpressDomStrings.span
import typingsJapgolly.wordpressDom.wordpressDomStrings.strong
import typingsJapgolly.wordpressDom.wordpressDomStrings.style
import typingsJapgolly.wordpressDom.wordpressDomStrings.sub
import typingsJapgolly.wordpressDom.wordpressDomStrings.summary
import typingsJapgolly.wordpressDom.wordpressDomStrings.sup
import typingsJapgolly.wordpressDom.wordpressDomStrings.table
import typingsJapgolly.wordpressDom.wordpressDomStrings.tbody
import typingsJapgolly.wordpressDom.wordpressDomStrings.td
import typingsJapgolly.wordpressDom.wordpressDomStrings.template
import typingsJapgolly.wordpressDom.wordpressDomStrings.textarea
import typingsJapgolly.wordpressDom.wordpressDomStrings.tfoot
import typingsJapgolly.wordpressDom.wordpressDomStrings.th
import typingsJapgolly.wordpressDom.wordpressDomStrings.thead
import typingsJapgolly.wordpressDom.wordpressDomStrings.time
import typingsJapgolly.wordpressDom.wordpressDomStrings.title
import typingsJapgolly.wordpressDom.wordpressDomStrings.tr
import typingsJapgolly.wordpressDom.wordpressDomStrings.track
import typingsJapgolly.wordpressDom.wordpressDomStrings.u
import typingsJapgolly.wordpressDom.wordpressDomStrings.ul
import typingsJapgolly.wordpressDom.wordpressDomStrings.video
import typingsJapgolly.wordpressDom.wordpressDomStrings.wbr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCaretRect(): js.UndefOr[DOMRect] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCaretRect")().asInstanceOf[js.UndefOr[DOMRect]]
  
  inline def documentHasSelection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("documentHasSelection")().asInstanceOf[Boolean]
  
  object focus {
    
    @JSImport("@wordpress/dom", "focus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/dom", "focus.focusable")
    @js.native
    def focusable: Focusable = js.native
    inline def focusable_=(x: Focusable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/dom", "focus.tabbable")
    @js.native
    def tabbable: Tabbable = js.native
    inline def tabbable_=(x: Tabbable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabbable")(x.asInstanceOf[js.Any])
  }
  
  inline def getOffsetParent(node: Node): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(node.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def getRectangleFromRange(range: Range): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getRectangleFromRange")(range.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  
  inline def getScrollContainer(element: Element): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollContainer")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  
  inline def insertAfter(newNode: Node, referenceNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(newNode.asInstanceOf[js.Any], referenceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isEntirelySelected(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelySelected")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHorizontalEdge(container: HTMLElement, isReverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTextField(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextField")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVerticalEdge(container: HTMLElement, isReverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def placeCaretAtHorizontalEdge(container: HTMLElement, isReverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtHorizontalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtHorizontalEdge(container: Unit, isReverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtHorizontalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean, rect: DOMRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], mayUseScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean, rect: Unit, mayUseScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], mayUseScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: Unit, isReverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: Unit, isReverse: Boolean, rect: DOMRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: Unit, isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], mayUseScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: Unit, isReverse: Boolean, rect: Unit, mayUseScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], mayUseScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def replace(processedNode: Node, newNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(processedNode.asInstanceOf[js.Any], newNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceTag_a(node: Node, tagName: a): HTMLAnchorElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLAnchorElement]
  
  inline def replaceTag_abbr(node: Node, tagName: abbr): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_address(node: Node, tagName: address): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_area(node: Node, tagName: area): HTMLAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLAreaElement]
  
  inline def replaceTag_article(node: Node, tagName: article): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_aside(node: Node, tagName: aside): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_audio(node: Node, tagName: audio): HTMLAudioElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLAudioElement]
  
  inline def replaceTag_b(node: Node, tagName: b): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_base(node: Node, tagName: base): HTMLBaseElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLBaseElement]
  
  inline def replaceTag_bdi(node: Node, tagName: bdi): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_bdo(node: Node, tagName: bdo): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_blockquote(node: Node, tagName: blockquote): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  
  inline def replaceTag_body(node: Node, tagName: body): HTMLBodyElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLBodyElement]
  
  inline def replaceTag_br(node: Node, tagName: br): HTMLBRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLBRElement]
  
  inline def replaceTag_button(node: Node, tagName: button): HTMLButtonElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLButtonElement]
  
  inline def replaceTag_canvas(node: Node, tagName: canvas): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def replaceTag_caption(node: Node, tagName: caption): HTMLTableCaptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCaptionElement]
  
  inline def replaceTag_cite(node: Node, tagName: cite): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_code(node: Node, tagName: code): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_col(node: Node, tagName: col): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  
  inline def replaceTag_colgroup(node: Node, tagName: colgroup): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  
  inline def replaceTag_data(node: Node, tagName: data): HTMLDataElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLDataElement]
  
  inline def replaceTag_datalist(node: Node, tagName: datalist): HTMLDataListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLDataListElement]
  
  inline def replaceTag_dd(node: Node, tagName: dd): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_del(node: Node, tagName: del): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  
  inline def replaceTag_details(node: Node, tagName: details): HTMLDetailsElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLDetailsElement]
  
  inline def replaceTag_dfn(node: Node, tagName: dfn): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_dialog(node: Node, tagName: dialog): HTMLDialogElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLDialogElement]
  
  inline def replaceTag_div(node: Node, tagName: div): HTMLDivElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLDivElement]
  
  inline def replaceTag_dl(node: Node, tagName: dl): HTMLDListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLDListElement]
  
  inline def replaceTag_dt(node: Node, tagName: dt): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_em(node: Node, tagName: em): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_embed(node: Node, tagName: embed): HTMLEmbedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLEmbedElement]
  
  inline def replaceTag_fieldset(node: Node, tagName: fieldset): HTMLFieldSetElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLFieldSetElement]
  
  inline def replaceTag_figcaption(node: Node, tagName: figcaption): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_figure(node: Node, tagName: figure): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_footer(node: Node, tagName: footer): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_form(node: Node, tagName: form): HTMLFormElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLFormElement]
  
  inline def replaceTag_h1(node: Node, tagName: h1): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  
  inline def replaceTag_h2(node: Node, tagName: h2): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  
  inline def replaceTag_h3(node: Node, tagName: h3): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  
  inline def replaceTag_h4(node: Node, tagName: h4): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  
  inline def replaceTag_h5(node: Node, tagName: h5): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  
  inline def replaceTag_h6(node: Node, tagName: h6): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  
  inline def replaceTag_head(node: Node, tagName: head): HTMLHeadElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadElement]
  
  inline def replaceTag_header(node: Node, tagName: header): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_hgroup(node: Node, tagName: hgroup): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_hr(node: Node, tagName: hr): HTMLHRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHRElement]
  
  inline def replaceTag_html(node: Node, tagName: html): HTMLHtmlElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLHtmlElement]
  
  inline def replaceTag_i(node: Node, tagName: i): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_iframe(node: Node, tagName: iframe): HTMLIFrameElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLIFrameElement]
  
  inline def replaceTag_img(node: Node, tagName: img): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  
  inline def replaceTag_input(node: Node, tagName: input): HTMLInputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLInputElement]
  
  inline def replaceTag_ins(node: Node, tagName: ins): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  
  inline def replaceTag_kbd(node: Node, tagName: kbd): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_label(node: Node, tagName: label): HTMLLabelElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLLabelElement]
  
  inline def replaceTag_legend(node: Node, tagName: legend): HTMLLegendElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLLegendElement]
  
  inline def replaceTag_li(node: Node, tagName: li): HTMLLIElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLLIElement]
  
  inline def replaceTag_link(node: Node, tagName: link): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  
  inline def replaceTag_main(node: Node, tagName: main): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_map(node: Node, tagName: map): HTMLMapElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLMapElement]
  
  inline def replaceTag_mark(node: Node, tagName: mark): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_menu(node: Node, tagName: menu): HTMLMenuElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLMenuElement]
  
  inline def replaceTag_meta(node: Node, tagName: meta): HTMLMetaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLMetaElement]
  
  inline def replaceTag_meter(node: Node, tagName: meter): HTMLMeterElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLMeterElement]
  
  inline def replaceTag_nav(node: Node, tagName: nav): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_noscript(node: Node, tagName: noscript): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_object(node: Node, tagName: `object`): HTMLObjectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLObjectElement]
  
  inline def replaceTag_ol(node: Node, tagName: ol): HTMLOListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLOListElement]
  
  inline def replaceTag_optgroup(node: Node, tagName: optgroup): HTMLOptGroupElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLOptGroupElement]
  
  inline def replaceTag_option(node: Node, tagName: option): HTMLOptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLOptionElement]
  
  inline def replaceTag_output(node: Node, tagName: output): HTMLOutputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLOutputElement]
  
  inline def replaceTag_p(node: Node, tagName: p): HTMLParagraphElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLParagraphElement]
  
  inline def replaceTag_picture(node: Node, tagName: picture): HTMLPictureElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLPictureElement]
  
  inline def replaceTag_pre(node: Node, tagName: pre): HTMLPreElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLPreElement]
  
  inline def replaceTag_progress(node: Node, tagName: progress): HTMLProgressElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLProgressElement]
  
  inline def replaceTag_q(node: Node, tagName: q): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  
  inline def replaceTag_rp(node: Node, tagName: rp): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_rt(node: Node, tagName: rt): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_ruby(node: Node, tagName: ruby): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_s(node: Node, tagName: s): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_samp(node: Node, tagName: samp): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_script(node: Node, tagName: script): HTMLScriptElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLScriptElement]
  
  inline def replaceTag_section(node: Node, tagName: section): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_select(node: Node, tagName: select): HTMLSelectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLSelectElement]
  
  inline def replaceTag_slot(node: Node, tagName: slot): HTMLSlotElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLSlotElement]
  
  inline def replaceTag_small(node: Node, tagName: small): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_source(node: Node, tagName: source): HTMLSourceElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLSourceElement]
  
  inline def replaceTag_span(node: Node, tagName: span): HTMLSpanElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLSpanElement]
  
  inline def replaceTag_strong(node: Node, tagName: strong): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_style(node: Node, tagName: style): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  
  inline def replaceTag_sub(node: Node, tagName: sub): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_summary(node: Node, tagName: summary): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_sup(node: Node, tagName: sup): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_table(node: Node, tagName: table): HTMLTableElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableElement]
  
  inline def replaceTag_tbody(node: Node, tagName: tbody): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  
  inline def replaceTag_td(node: Node, tagName: td): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  
  inline def replaceTag_template(node: Node, tagName: template): HTMLTemplateElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTemplateElement]
  
  inline def replaceTag_textarea(node: Node, tagName: textarea): HTMLTextAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTextAreaElement]
  
  inline def replaceTag_tfoot(node: Node, tagName: tfoot): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  
  inline def replaceTag_th(node: Node, tagName: th): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  
  inline def replaceTag_thead(node: Node, tagName: thead): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  
  inline def replaceTag_time(node: Node, tagName: time): HTMLTimeElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTimeElement]
  
  inline def replaceTag_title(node: Node, tagName: title): HTMLTitleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTitleElement]
  
  inline def replaceTag_tr(node: Node, tagName: tr): HTMLTableRowElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTableRowElement]
  
  inline def replaceTag_track(node: Node, tagName: track): HTMLTrackElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLTrackElement]
  
  inline def replaceTag_u(node: Node, tagName: u): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_ul(node: Node, tagName: ul): HTMLUListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLUListElement]
  
  inline def replaceTag_var(node: Node, tagName: `var`): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def replaceTag_video(node: Node, tagName: video): HTMLVideoElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLVideoElement]
  
  inline def replaceTag_wbr(node: Node, tagName: wbr): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def unwrap(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wrap(newNode: Node, referenceNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(newNode.asInstanceOf[js.Any], referenceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Focusable extends StObject {
    
    def find(context: ParentNode): js.Array[Element]
  }
  object Focusable {
    
    inline def apply(find: ParentNode => js.Array[Element]): Focusable = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
      __obj.asInstanceOf[Focusable]
    }
    
    extension [Self <: Focusable](x: Self) {
      
      inline def setFind(value: ParentNode => js.Array[Element]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    }
  }
  
  trait Tabbable
    extends StObject
       with Focusable {
    
    /**
      * Returns `true` if the specified element is tabbable, or `false` otherwise.
      *
      * @param element - Element to test.
      */
    def isTabbableIndex(element: Element): Boolean
  }
  object Tabbable {
    
    inline def apply(find: ParentNode => js.Array[Element], isTabbableIndex: Element => Boolean): Tabbable = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), isTabbableIndex = js.Any.fromFunction1(isTabbableIndex))
      __obj.asInstanceOf[Tabbable]
    }
    
    extension [Self <: Tabbable](x: Self) {
      
      inline def setIsTabbableIndex(value: Element => Boolean): Self = StObject.set(x, "isTabbableIndex", js.Any.fromFunction1(value))
    }
  }
}
