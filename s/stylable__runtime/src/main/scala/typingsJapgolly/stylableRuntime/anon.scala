package typingsJapgolly.stylableRuntime

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
import org.scalajs.dom.HTMLParamElement
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
import org.scalajs.dom.HTMLUnknownElement
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.std.ElementCreationOptions
import typingsJapgolly.std.HTMLDataElement
import typingsJapgolly.std.HTMLDetailsElement
import typingsJapgolly.std.HTMLDialogElement
import typingsJapgolly.std.HTMLDirectoryElement
import typingsJapgolly.std.HTMLFontElement
import typingsJapgolly.std.HTMLFrameElement
import typingsJapgolly.std.HTMLFrameSetElement
import typingsJapgolly.std.HTMLMarqueeElement
import typingsJapgolly.std.HTMLMeterElement
import typingsJapgolly.std.HTMLOutputElement
import typingsJapgolly.std.HTMLPictureElement
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.HTMLTemplateElement
import typingsJapgolly.std.HTMLTimeElement
import typingsJapgolly.stylableRuntime.distTypesMod.StateMap
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.`object`
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.`var`
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.a
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.abbr
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.acronym
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.address
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.applet
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.area
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.article
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.aside
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.audio
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.b
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.base
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.basefont
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.bdi
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.bdo
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.bgsound
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.big
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.blink
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.blockquote
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.body
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.br
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.button
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.canvas
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.caption
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.center
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.cite
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.code
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.col
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.colgroup
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.data
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.datalist
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.dd
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.del
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.details
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.dfn
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.dialog
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.dir
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.div
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.dl
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.dt
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.em
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.embed
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.fieldset
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.figcaption
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.figure
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.font
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.footer
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.form
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.frame
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.frameset
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.h1
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.h2
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.h3
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.h4
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.h5
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.h6
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.head
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.header
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.hgroup
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.hr
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.html
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.i
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.iframe
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.img
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.input
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.ins
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.isindex
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.kbd
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.keygen
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.label
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.legend
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.li
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.link
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.listing
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.main
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.map
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.mark
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.marquee
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.menu
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.menuitem
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.meta
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.meter
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.multicol
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.nav
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.nextid
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.nobr
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.noembed
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.noframes
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.noscript
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.ol
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.optgroup
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.option
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.output
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.p
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.param
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.picture
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.plaintext
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.pre
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.progress
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.q
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.rb
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.rp
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.rt
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.rtc
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.ruby
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.s
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.samp
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.script
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.section
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.select
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.slot
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.small
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.source
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.spacer
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.span
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.strike
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.strong
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.style
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.sub
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.summary
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.sup
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.table
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.tbody
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.td
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.template
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.textarea
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.tfoot
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.th
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.thead
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.time
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.title
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.tr
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.track
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.tt
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.u
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.ul
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.video
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.wbr
import typingsJapgolly.stylableRuntime.stylableRuntimeStrings.xmp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Css extends StObject {
    
    @JSName("$css")
    var $css: String
    
    @JSName("$depth")
    var $depth: String | Double
    
    @JSName("$id")
    var $id: String | Double
    
    @JSName("$theme")
    var $theme: Boolean
  }
  object Css {
    
    inline def apply($css: String, $depth: String | Double, $id: String | Double, $theme: Boolean): Css = {
      val __obj = js.Dynamic.literal($css = $css.asInstanceOf[js.Any], $depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    extension [Self <: Css](x: Self) {
      
      inline def set$css(value: String): Self = StObject.set(x, "$css", value.asInstanceOf[js.Any])
      
      inline def set$depth(value: String | Double): Self = StObject.set(x, "$depth", value.asInstanceOf[js.Any])
      
      inline def set$id(value: String | Double): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$theme(value: Boolean): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(tagName: String): HTMLElement = js.native
    def apply(tagName: String, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: `object`): HTMLObjectElement = js.native
    def apply(tagName: `object`, options: ElementCreationOptions): HTMLObjectElement = js.native
    def apply(tagName: `var`): HTMLElement = js.native
    def apply(tagName: `var`, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: a): HTMLAnchorElement = js.native
    def apply(tagName: abbr): HTMLElement = js.native
    def apply(tagName: abbr, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: acronym): HTMLElement = js.native
    def apply(tagName: acronym, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: address): HTMLElement = js.native
    def apply(tagName: address, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: a, options: ElementCreationOptions): HTMLAnchorElement = js.native
    def apply(tagName: applet): HTMLUnknownElement = js.native
    def apply(tagName: applet, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: area): HTMLAreaElement = js.native
    def apply(tagName: area, options: ElementCreationOptions): HTMLAreaElement = js.native
    def apply(tagName: article): HTMLElement = js.native
    def apply(tagName: article, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: aside): HTMLElement = js.native
    def apply(tagName: aside, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: audio): HTMLAudioElement = js.native
    def apply(tagName: audio, options: ElementCreationOptions): HTMLAudioElement = js.native
    def apply(tagName: b): HTMLElement = js.native
    def apply(tagName: base): HTMLBaseElement = js.native
    def apply(tagName: basefont): HTMLElement = js.native
    def apply(tagName: basefont, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: base, options: ElementCreationOptions): HTMLBaseElement = js.native
    def apply(tagName: bdi): HTMLElement = js.native
    def apply(tagName: bdi, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: bdo): HTMLElement = js.native
    def apply(tagName: bdo, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: bgsound): HTMLUnknownElement = js.native
    def apply(tagName: bgsound, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: big): HTMLElement = js.native
    def apply(tagName: big, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: blink): HTMLUnknownElement = js.native
    def apply(tagName: blink, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: blockquote): HTMLQuoteElement = js.native
    def apply(tagName: blockquote, options: ElementCreationOptions): HTMLQuoteElement = js.native
    def apply(tagName: body): HTMLBodyElement = js.native
    def apply(tagName: body, options: ElementCreationOptions): HTMLBodyElement = js.native
    def apply(tagName: b, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: br): HTMLBRElement = js.native
    def apply(tagName: br, options: ElementCreationOptions): HTMLBRElement = js.native
    def apply(tagName: button): HTMLButtonElement = js.native
    def apply(tagName: button, options: ElementCreationOptions): HTMLButtonElement = js.native
    def apply(tagName: canvas): HTMLCanvasElement = js.native
    def apply(tagName: canvas, options: ElementCreationOptions): HTMLCanvasElement = js.native
    def apply(tagName: caption): HTMLTableCaptionElement = js.native
    def apply(tagName: caption, options: ElementCreationOptions): HTMLTableCaptionElement = js.native
    def apply(tagName: center): HTMLElement = js.native
    def apply(tagName: center, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: cite): HTMLElement = js.native
    def apply(tagName: cite, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: code): HTMLElement = js.native
    def apply(tagName: code, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: col): HTMLTableColElement = js.native
    def apply(tagName: colgroup): HTMLTableColElement = js.native
    def apply(tagName: colgroup, options: ElementCreationOptions): HTMLTableColElement = js.native
    def apply(tagName: col, options: ElementCreationOptions): HTMLTableColElement = js.native
    def apply(tagName: data): HTMLDataElement = js.native
    def apply(tagName: datalist): HTMLDataListElement = js.native
    def apply(tagName: datalist, options: ElementCreationOptions): HTMLDataListElement = js.native
    def apply(tagName: data, options: ElementCreationOptions): HTMLDataElement = js.native
    def apply(tagName: dd): HTMLElement = js.native
    def apply(tagName: dd, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: del): HTMLModElement = js.native
    def apply(tagName: del, options: ElementCreationOptions): HTMLModElement = js.native
    def apply(tagName: details): HTMLDetailsElement = js.native
    def apply(tagName: details, options: ElementCreationOptions): HTMLDetailsElement = js.native
    def apply(tagName: dfn): HTMLElement = js.native
    def apply(tagName: dfn, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: dialog): HTMLDialogElement = js.native
    def apply(tagName: dialog, options: ElementCreationOptions): HTMLDialogElement = js.native
    def apply(tagName: dir): HTMLDirectoryElement = js.native
    def apply(tagName: dir, options: ElementCreationOptions): HTMLDirectoryElement = js.native
    def apply(tagName: div): HTMLDivElement = js.native
    def apply(tagName: div, options: ElementCreationOptions): HTMLDivElement = js.native
    def apply(tagName: dl): HTMLDListElement = js.native
    def apply(tagName: dl, options: ElementCreationOptions): HTMLDListElement = js.native
    def apply(tagName: dt): HTMLElement = js.native
    def apply(tagName: dt, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: em): HTMLElement = js.native
    def apply(tagName: embed): HTMLEmbedElement = js.native
    def apply(tagName: embed, options: ElementCreationOptions): HTMLEmbedElement = js.native
    def apply(tagName: em, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: fieldset): HTMLFieldSetElement = js.native
    def apply(tagName: fieldset, options: ElementCreationOptions): HTMLFieldSetElement = js.native
    def apply(tagName: figcaption): HTMLElement = js.native
    def apply(tagName: figcaption, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: figure): HTMLElement = js.native
    def apply(tagName: figure, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: font): HTMLFontElement = js.native
    def apply(tagName: font, options: ElementCreationOptions): HTMLFontElement = js.native
    def apply(tagName: footer): HTMLElement = js.native
    def apply(tagName: footer, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: form): HTMLFormElement = js.native
    def apply(tagName: form, options: ElementCreationOptions): HTMLFormElement = js.native
    def apply(tagName: frame): HTMLFrameElement = js.native
    def apply(tagName: frame, options: ElementCreationOptions): HTMLFrameElement = js.native
    def apply(tagName: frameset): HTMLFrameSetElement = js.native
    def apply(tagName: frameset, options: ElementCreationOptions): HTMLFrameSetElement = js.native
    def apply(tagName: h1): HTMLHeadingElement = js.native
    def apply(tagName: h1, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h2): HTMLHeadingElement = js.native
    def apply(tagName: h2, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h3): HTMLHeadingElement = js.native
    def apply(tagName: h3, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h4): HTMLHeadingElement = js.native
    def apply(tagName: h4, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h5): HTMLHeadingElement = js.native
    def apply(tagName: h5, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h6): HTMLHeadingElement = js.native
    def apply(tagName: h6, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: head): HTMLHeadElement = js.native
    def apply(tagName: header): HTMLElement = js.native
    def apply(tagName: header, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: head, options: ElementCreationOptions): HTMLHeadElement = js.native
    def apply(tagName: hgroup): HTMLElement = js.native
    def apply(tagName: hgroup, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: hr): HTMLHRElement = js.native
    def apply(tagName: hr, options: ElementCreationOptions): HTMLHRElement = js.native
    def apply(tagName: html): HTMLHtmlElement = js.native
    def apply(tagName: html, options: ElementCreationOptions): HTMLHtmlElement = js.native
    def apply(tagName: i): HTMLElement = js.native
    def apply(tagName: iframe): HTMLIFrameElement = js.native
    def apply(tagName: iframe, options: ElementCreationOptions): HTMLIFrameElement = js.native
    def apply(tagName: img): HTMLImageElement = js.native
    def apply(tagName: img, options: ElementCreationOptions): HTMLImageElement = js.native
    def apply(tagName: input): HTMLInputElement = js.native
    def apply(tagName: input, options: ElementCreationOptions): HTMLInputElement = js.native
    def apply(tagName: ins): HTMLModElement = js.native
    def apply(tagName: ins, options: ElementCreationOptions): HTMLModElement = js.native
    def apply(tagName: i, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: isindex): HTMLUnknownElement = js.native
    def apply(tagName: isindex, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: kbd): HTMLElement = js.native
    def apply(tagName: kbd, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: keygen): HTMLUnknownElement = js.native
    def apply(tagName: keygen, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: label): HTMLLabelElement = js.native
    def apply(tagName: label, options: ElementCreationOptions): HTMLLabelElement = js.native
    def apply(tagName: legend): HTMLLegendElement = js.native
    def apply(tagName: legend, options: ElementCreationOptions): HTMLLegendElement = js.native
    def apply(tagName: li): HTMLLIElement = js.native
    def apply(tagName: link): HTMLLinkElement = js.native
    def apply(tagName: link, options: ElementCreationOptions): HTMLLinkElement = js.native
    def apply(tagName: li, options: ElementCreationOptions): HTMLLIElement = js.native
    def apply(tagName: listing): HTMLPreElement = js.native
    def apply(tagName: listing, options: ElementCreationOptions): HTMLPreElement = js.native
    def apply(tagName: main): HTMLElement = js.native
    def apply(tagName: main, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: map): HTMLMapElement = js.native
    def apply(tagName: map, options: ElementCreationOptions): HTMLMapElement = js.native
    def apply(tagName: mark): HTMLElement = js.native
    def apply(tagName: mark, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: marquee): HTMLMarqueeElement = js.native
    def apply(tagName: marquee, options: ElementCreationOptions): HTMLMarqueeElement = js.native
    def apply(tagName: menu): HTMLMenuElement = js.native
    def apply(tagName: menuitem): HTMLElement = js.native
    def apply(tagName: menuitem, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: menu, options: ElementCreationOptions): HTMLMenuElement = js.native
    def apply(tagName: meta): HTMLMetaElement = js.native
    def apply(tagName: meta, options: ElementCreationOptions): HTMLMetaElement = js.native
    def apply(tagName: meter): HTMLMeterElement = js.native
    def apply(tagName: meter, options: ElementCreationOptions): HTMLMeterElement = js.native
    def apply(tagName: multicol): HTMLUnknownElement = js.native
    def apply(tagName: multicol, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: nav): HTMLElement = js.native
    def apply(tagName: nav, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: nextid): HTMLUnknownElement = js.native
    def apply(tagName: nextid, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: nobr): HTMLElement = js.native
    def apply(tagName: nobr, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: noembed): HTMLElement = js.native
    def apply(tagName: noembed, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: noframes): HTMLElement = js.native
    def apply(tagName: noframes, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: noscript): HTMLElement = js.native
    def apply(tagName: noscript, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: ol): HTMLOListElement = js.native
    def apply(tagName: ol, options: ElementCreationOptions): HTMLOListElement = js.native
    def apply(tagName: optgroup): HTMLOptGroupElement = js.native
    def apply(tagName: optgroup, options: ElementCreationOptions): HTMLOptGroupElement = js.native
    def apply(tagName: option): HTMLOptionElement = js.native
    def apply(tagName: option, options: ElementCreationOptions): HTMLOptionElement = js.native
    def apply(tagName: output): HTMLOutputElement = js.native
    def apply(tagName: output, options: ElementCreationOptions): HTMLOutputElement = js.native
    def apply(tagName: p): HTMLParagraphElement = js.native
    def apply(tagName: param): HTMLParamElement = js.native
    def apply(tagName: param, options: ElementCreationOptions): HTMLParamElement = js.native
    def apply(tagName: picture): HTMLPictureElement = js.native
    def apply(tagName: picture, options: ElementCreationOptions): HTMLPictureElement = js.native
    def apply(tagName: plaintext): HTMLElement = js.native
    def apply(tagName: plaintext, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: p, options: ElementCreationOptions): HTMLParagraphElement = js.native
    def apply(tagName: pre): HTMLPreElement = js.native
    def apply(tagName: pre, options: ElementCreationOptions): HTMLPreElement = js.native
    def apply(tagName: progress): HTMLProgressElement = js.native
    def apply(tagName: progress, options: ElementCreationOptions): HTMLProgressElement = js.native
    def apply(tagName: q): HTMLQuoteElement = js.native
    def apply(tagName: q, options: ElementCreationOptions): HTMLQuoteElement = js.native
    def apply(tagName: rb): HTMLElement = js.native
    def apply(tagName: rb, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: rp): HTMLElement = js.native
    def apply(tagName: rp, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: rt): HTMLElement = js.native
    def apply(tagName: rtc): HTMLElement = js.native
    def apply(tagName: rtc, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: rt, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: ruby): HTMLElement = js.native
    def apply(tagName: ruby, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: s): HTMLElement = js.native
    def apply(tagName: samp): HTMLElement = js.native
    def apply(tagName: samp, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: script): HTMLScriptElement = js.native
    def apply(tagName: script, options: ElementCreationOptions): HTMLScriptElement = js.native
    def apply(tagName: section): HTMLElement = js.native
    def apply(tagName: section, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: select): HTMLSelectElement = js.native
    def apply(tagName: select, options: ElementCreationOptions): HTMLSelectElement = js.native
    def apply(tagName: slot): HTMLSlotElement = js.native
    def apply(tagName: slot, options: ElementCreationOptions): HTMLSlotElement = js.native
    def apply(tagName: small): HTMLElement = js.native
    def apply(tagName: small, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: s, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: source): HTMLSourceElement = js.native
    def apply(tagName: source, options: ElementCreationOptions): HTMLSourceElement = js.native
    def apply(tagName: spacer): HTMLUnknownElement = js.native
    def apply(tagName: spacer, options: ElementCreationOptions): HTMLUnknownElement = js.native
    def apply(tagName: span): HTMLSpanElement = js.native
    def apply(tagName: span, options: ElementCreationOptions): HTMLSpanElement = js.native
    def apply(tagName: strike): HTMLElement = js.native
    def apply(tagName: strike, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: strong): HTMLElement = js.native
    def apply(tagName: strong, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: style): HTMLStyleElement = js.native
    def apply(tagName: style, options: ElementCreationOptions): HTMLStyleElement = js.native
    def apply(tagName: sub): HTMLElement = js.native
    def apply(tagName: sub, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: summary): HTMLElement = js.native
    def apply(tagName: summary, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: sup): HTMLElement = js.native
    def apply(tagName: sup, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: table): HTMLTableElement = js.native
    def apply(tagName: table, options: ElementCreationOptions): HTMLTableElement = js.native
    def apply(tagName: tbody): HTMLTableSectionElement = js.native
    def apply(tagName: tbody, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    def apply(tagName: td): HTMLTableCellElement = js.native
    def apply(tagName: td, options: ElementCreationOptions): HTMLTableCellElement = js.native
    def apply(tagName: template): HTMLTemplateElement = js.native
    def apply(tagName: template, options: ElementCreationOptions): HTMLTemplateElement = js.native
    def apply(tagName: textarea): HTMLTextAreaElement = js.native
    def apply(tagName: textarea, options: ElementCreationOptions): HTMLTextAreaElement = js.native
    def apply(tagName: tfoot): HTMLTableSectionElement = js.native
    def apply(tagName: tfoot, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    def apply(tagName: th): HTMLTableCellElement = js.native
    def apply(tagName: thead): HTMLTableSectionElement = js.native
    def apply(tagName: thead, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    def apply(tagName: th, options: ElementCreationOptions): HTMLTableCellElement = js.native
    def apply(tagName: time): HTMLTimeElement = js.native
    def apply(tagName: time, options: ElementCreationOptions): HTMLTimeElement = js.native
    def apply(tagName: title): HTMLTitleElement = js.native
    def apply(tagName: title, options: ElementCreationOptions): HTMLTitleElement = js.native
    def apply(tagName: tr): HTMLTableRowElement = js.native
    def apply(tagName: track): HTMLTrackElement = js.native
    def apply(tagName: track, options: ElementCreationOptions): HTMLTrackElement = js.native
    def apply(tagName: tr, options: ElementCreationOptions): HTMLTableRowElement = js.native
    def apply(tagName: tt): HTMLElement = js.native
    def apply(tagName: tt, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: u): HTMLElement = js.native
    def apply(tagName: ul): HTMLUListElement = js.native
    def apply(tagName: ul, options: ElementCreationOptions): HTMLUListElement = js.native
    def apply(tagName: u, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: video): HTMLVideoElement = js.native
    def apply(tagName: video, options: ElementCreationOptions): HTMLVideoElement = js.native
    def apply(tagName: wbr): HTMLElement = js.native
    def apply(tagName: wbr, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: xmp): HTMLPreElement = js.native
    def apply(tagName: xmp, options: ElementCreationOptions): HTMLPreElement = js.native
  }
  
  /* Inlined std.Required<std.Pick<@stylable/runtime.@stylable/runtime/dist/types.Host, 'stc' | 'sts'>> */
  trait RequiredPickHoststcsts extends StObject {
    
    def stc(namespace: String): String
    def stc(namespace: String, stateMapping: StateMap): String
    @JSName("stc")
    var stc_Original: js.Function2[/* namespace */ String, /* stateMapping */ js.UndefOr[StateMap | Null], String]
    
    def sts(namespace: String, context: String, stateOrClass: String, classes: js.UndefOr[String]*): String
    def sts(namespace: String, context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def sts(namespace: String, context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    def sts(namespace: String, context: Unit, stateOrClass: String, classes: js.UndefOr[String]*): String
    def sts(namespace: String, context: Unit, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def sts(namespace: String, context: Unit, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    @JSName("sts")
    var sts_Original: js.Function4[
        /* namespace */ String, 
        /* context */ js.UndefOr[String], 
        /* stateOrClass */ js.UndefOr[String | StateMap], 
        /* repeated */ js.UndefOr[String], 
        String
      ]
  }
  object RequiredPickHoststcsts {
    
    inline def apply(
      stc: (/* namespace */ String, /* stateMapping */ js.UndefOr[StateMap | Null]) => String,
      sts: (/* namespace */ String, /* context */ js.UndefOr[String], /* stateOrClass */ js.UndefOr[String | StateMap], /* repeated */ js.UndefOr[String]) => String
    ): RequiredPickHoststcsts = {
      val __obj = js.Dynamic.literal(stc = js.Any.fromFunction2(stc), sts = js.Any.fromFunction4(sts))
      __obj.asInstanceOf[RequiredPickHoststcsts]
    }
    
    extension [Self <: RequiredPickHoststcsts](x: Self) {
      
      inline def setStc(value: (/* namespace */ String, /* stateMapping */ js.UndefOr[StateMap | Null]) => String): Self = StObject.set(x, "stc", js.Any.fromFunction2(value))
      
      inline def setSts(
        value: (/* namespace */ String, /* context */ js.UndefOr[String], /* stateOrClass */ js.UndefOr[String | StateMap], /* repeated */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "sts", js.Any.fromFunction4(value))
    }
  }
  
  /* Inlined std.Required<std.Pick<@stylable/runtime.@stylable/runtime/esm/types.Host, 'stc' | 'sts'>> */
  trait RequiredPickHoststcstsStc extends StObject {
    
    def stc(namespace: String): String
    def stc(namespace: String, stateMapping: typingsJapgolly.stylableRuntime.esmTypesMod.StateMap): String
    @JSName("stc")
    var stc_Original: js.Function2[
        /* namespace */ String, 
        /* stateMapping */ js.UndefOr[typingsJapgolly.stylableRuntime.esmTypesMod.StateMap | Null], 
        String
      ]
    
    def sts(namespace: String, context: String, stateOrClass: String, classes: js.UndefOr[String]*): String
    def sts(namespace: String, context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def sts(
      namespace: String,
      context: String,
      stateOrClass: typingsJapgolly.stylableRuntime.esmTypesMod.StateMap,
      classes: js.UndefOr[String]*
    ): String
    def sts(namespace: String, context: Unit, stateOrClass: String, classes: js.UndefOr[String]*): String
    def sts(namespace: String, context: Unit, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def sts(
      namespace: String,
      context: Unit,
      stateOrClass: typingsJapgolly.stylableRuntime.esmTypesMod.StateMap,
      classes: js.UndefOr[String]*
    ): String
    @JSName("sts")
    var sts_Original: js.Function4[
        /* namespace */ String, 
        /* context */ js.UndefOr[String], 
        /* stateOrClass */ js.UndefOr[String | typingsJapgolly.stylableRuntime.esmTypesMod.StateMap], 
        /* repeated */ js.UndefOr[String], 
        String
      ]
  }
  object RequiredPickHoststcstsStc {
    
    inline def apply(
      stc: (/* namespace */ String, /* stateMapping */ js.UndefOr[typingsJapgolly.stylableRuntime.esmTypesMod.StateMap | Null]) => String,
      sts: (/* namespace */ String, /* context */ js.UndefOr[String], /* stateOrClass */ js.UndefOr[String | typingsJapgolly.stylableRuntime.esmTypesMod.StateMap], /* repeated */ js.UndefOr[String]) => String
    ): RequiredPickHoststcstsStc = {
      val __obj = js.Dynamic.literal(stc = js.Any.fromFunction2(stc), sts = js.Any.fromFunction4(sts))
      __obj.asInstanceOf[RequiredPickHoststcstsStc]
    }
    
    extension [Self <: RequiredPickHoststcstsStc](x: Self) {
      
      inline def setStc(
        value: (/* namespace */ String, /* stateMapping */ js.UndefOr[typingsJapgolly.stylableRuntime.esmTypesMod.StateMap | Null]) => String
      ): Self = StObject.set(x, "stc", js.Any.fromFunction2(value))
      
      inline def setSts(
        value: (/* namespace */ String, /* context */ js.UndefOr[String], /* stateOrClass */ js.UndefOr[String | typingsJapgolly.stylableRuntime.esmTypesMod.StateMap], /* repeated */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "sts", js.Any.fromFunction4(value))
    }
  }
}
