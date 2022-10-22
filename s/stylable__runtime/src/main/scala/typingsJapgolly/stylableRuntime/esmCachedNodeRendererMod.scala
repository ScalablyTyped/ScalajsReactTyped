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
import typingsJapgolly.stylableRuntime.anon.FnCall
import typingsJapgolly.stylableRuntime.esmTypesMod.NodeRenderer
import typingsJapgolly.stylableRuntime.esmTypesMod.RenderableStylesheet
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

object esmCachedNodeRendererMod {
  
  @JSImport("@stylable/runtime/esm/cached-node-renderer", "CacheStyleNodeRenderer")
  @js.native
  open class CacheStyleNodeRenderer protected ()
    extends StObject
       with NodeRenderer[RenderableStylesheet, HTMLStyleElement] {
    def this(options: CachedNodeRendererOptions) = this()
    
    /* private */ var options: Any = js.native
  }
  
  trait CachedNodeRendererOptions extends StObject {
    
    var attrKey: String
    
    def createElement(tagName: String): HTMLElement
    def createElement(tagName: String, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    var createElement_Original: FnCall
    @JSName("createElement")
    def createElement_a(tagName: a): HTMLAnchorElement
    @JSName("createElement")
    def createElement_a(tagName: a, options: ElementCreationOptions): HTMLAnchorElement
    @JSName("createElement")
    def createElement_abbr(tagName: abbr): HTMLElement
    @JSName("createElement")
    def createElement_abbr(tagName: abbr, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_acronym(tagName: acronym): HTMLElement
    @JSName("createElement")
    def createElement_acronym(tagName: acronym, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_address(tagName: address): HTMLElement
    @JSName("createElement")
    def createElement_address(tagName: address, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_applet(tagName: applet): HTMLUnknownElement
    @JSName("createElement")
    def createElement_applet(tagName: applet, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_area(tagName: area): HTMLAreaElement
    @JSName("createElement")
    def createElement_area(tagName: area, options: ElementCreationOptions): HTMLAreaElement
    @JSName("createElement")
    def createElement_article(tagName: article): HTMLElement
    @JSName("createElement")
    def createElement_article(tagName: article, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_aside(tagName: aside): HTMLElement
    @JSName("createElement")
    def createElement_aside(tagName: aside, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_audio(tagName: audio): HTMLAudioElement
    @JSName("createElement")
    def createElement_audio(tagName: audio, options: ElementCreationOptions): HTMLAudioElement
    @JSName("createElement")
    def createElement_b(tagName: b): HTMLElement
    @JSName("createElement")
    def createElement_b(tagName: b, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_base(tagName: base): HTMLBaseElement
    @JSName("createElement")
    def createElement_base(tagName: base, options: ElementCreationOptions): HTMLBaseElement
    @JSName("createElement")
    def createElement_basefont(tagName: basefont): HTMLElement
    @JSName("createElement")
    def createElement_basefont(tagName: basefont, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_bdi(tagName: bdi): HTMLElement
    @JSName("createElement")
    def createElement_bdi(tagName: bdi, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_bdo(tagName: bdo): HTMLElement
    @JSName("createElement")
    def createElement_bdo(tagName: bdo, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_bgsound(tagName: bgsound): HTMLUnknownElement
    @JSName("createElement")
    def createElement_bgsound(tagName: bgsound, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_big(tagName: big): HTMLElement
    @JSName("createElement")
    def createElement_big(tagName: big, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_blink(tagName: blink): HTMLUnknownElement
    @JSName("createElement")
    def createElement_blink(tagName: blink, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_blockquote(tagName: blockquote): HTMLQuoteElement
    @JSName("createElement")
    def createElement_blockquote(tagName: blockquote, options: ElementCreationOptions): HTMLQuoteElement
    @JSName("createElement")
    def createElement_body(tagName: body): HTMLBodyElement
    @JSName("createElement")
    def createElement_body(tagName: body, options: ElementCreationOptions): HTMLBodyElement
    @JSName("createElement")
    def createElement_br(tagName: br): HTMLBRElement
    @JSName("createElement")
    def createElement_br(tagName: br, options: ElementCreationOptions): HTMLBRElement
    @JSName("createElement")
    def createElement_button(tagName: button): HTMLButtonElement
    @JSName("createElement")
    def createElement_button(tagName: button, options: ElementCreationOptions): HTMLButtonElement
    @JSName("createElement")
    def createElement_canvas(tagName: canvas): HTMLCanvasElement
    @JSName("createElement")
    def createElement_canvas(tagName: canvas, options: ElementCreationOptions): HTMLCanvasElement
    @JSName("createElement")
    def createElement_caption(tagName: caption): HTMLTableCaptionElement
    @JSName("createElement")
    def createElement_caption(tagName: caption, options: ElementCreationOptions): HTMLTableCaptionElement
    @JSName("createElement")
    def createElement_center(tagName: center): HTMLElement
    @JSName("createElement")
    def createElement_center(tagName: center, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_cite(tagName: cite): HTMLElement
    @JSName("createElement")
    def createElement_cite(tagName: cite, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_code(tagName: code): HTMLElement
    @JSName("createElement")
    def createElement_code(tagName: code, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_col(tagName: col): HTMLTableColElement
    @JSName("createElement")
    def createElement_col(tagName: col, options: ElementCreationOptions): HTMLTableColElement
    @JSName("createElement")
    def createElement_colgroup(tagName: colgroup): HTMLTableColElement
    @JSName("createElement")
    def createElement_colgroup(tagName: colgroup, options: ElementCreationOptions): HTMLTableColElement
    @JSName("createElement")
    def createElement_data(tagName: data): HTMLDataElement
    @JSName("createElement")
    def createElement_data(tagName: data, options: ElementCreationOptions): HTMLDataElement
    @JSName("createElement")
    def createElement_datalist(tagName: datalist): HTMLDataListElement
    @JSName("createElement")
    def createElement_datalist(tagName: datalist, options: ElementCreationOptions): HTMLDataListElement
    @JSName("createElement")
    def createElement_dd(tagName: dd): HTMLElement
    @JSName("createElement")
    def createElement_dd(tagName: dd, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_del(tagName: del): HTMLModElement
    @JSName("createElement")
    def createElement_del(tagName: del, options: ElementCreationOptions): HTMLModElement
    @JSName("createElement")
    def createElement_details(tagName: details): HTMLDetailsElement
    @JSName("createElement")
    def createElement_details(tagName: details, options: ElementCreationOptions): HTMLDetailsElement
    @JSName("createElement")
    def createElement_dfn(tagName: dfn): HTMLElement
    @JSName("createElement")
    def createElement_dfn(tagName: dfn, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_dialog(tagName: dialog): HTMLDialogElement
    @JSName("createElement")
    def createElement_dialog(tagName: dialog, options: ElementCreationOptions): HTMLDialogElement
    @JSName("createElement")
    def createElement_dir(tagName: dir): HTMLDirectoryElement
    @JSName("createElement")
    def createElement_dir(tagName: dir, options: ElementCreationOptions): HTMLDirectoryElement
    @JSName("createElement")
    def createElement_div(tagName: div): HTMLDivElement
    @JSName("createElement")
    def createElement_div(tagName: div, options: ElementCreationOptions): HTMLDivElement
    @JSName("createElement")
    def createElement_dl(tagName: dl): HTMLDListElement
    @JSName("createElement")
    def createElement_dl(tagName: dl, options: ElementCreationOptions): HTMLDListElement
    @JSName("createElement")
    def createElement_dt(tagName: dt): HTMLElement
    @JSName("createElement")
    def createElement_dt(tagName: dt, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_em(tagName: em): HTMLElement
    @JSName("createElement")
    def createElement_em(tagName: em, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_embed(tagName: embed): HTMLEmbedElement
    @JSName("createElement")
    def createElement_embed(tagName: embed, options: ElementCreationOptions): HTMLEmbedElement
    @JSName("createElement")
    def createElement_fieldset(tagName: fieldset): HTMLFieldSetElement
    @JSName("createElement")
    def createElement_fieldset(tagName: fieldset, options: ElementCreationOptions): HTMLFieldSetElement
    @JSName("createElement")
    def createElement_figcaption(tagName: figcaption): HTMLElement
    @JSName("createElement")
    def createElement_figcaption(tagName: figcaption, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_figure(tagName: figure): HTMLElement
    @JSName("createElement")
    def createElement_figure(tagName: figure, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_font(tagName: font): HTMLFontElement
    @JSName("createElement")
    def createElement_font(tagName: font, options: ElementCreationOptions): HTMLFontElement
    @JSName("createElement")
    def createElement_footer(tagName: footer): HTMLElement
    @JSName("createElement")
    def createElement_footer(tagName: footer, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_form(tagName: form): HTMLFormElement
    @JSName("createElement")
    def createElement_form(tagName: form, options: ElementCreationOptions): HTMLFormElement
    @JSName("createElement")
    def createElement_frame(tagName: frame): HTMLFrameElement
    @JSName("createElement")
    def createElement_frame(tagName: frame, options: ElementCreationOptions): HTMLFrameElement
    @JSName("createElement")
    def createElement_frameset(tagName: frameset): HTMLFrameSetElement
    @JSName("createElement")
    def createElement_frameset(tagName: frameset, options: ElementCreationOptions): HTMLFrameSetElement
    @JSName("createElement")
    def createElement_h1(tagName: h1): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h1(tagName: h1, options: ElementCreationOptions): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h2(tagName: h2): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h2(tagName: h2, options: ElementCreationOptions): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h3(tagName: h3): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h3(tagName: h3, options: ElementCreationOptions): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h4(tagName: h4): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h4(tagName: h4, options: ElementCreationOptions): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h5(tagName: h5): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h5(tagName: h5, options: ElementCreationOptions): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h6(tagName: h6): HTMLHeadingElement
    @JSName("createElement")
    def createElement_h6(tagName: h6, options: ElementCreationOptions): HTMLHeadingElement
    @JSName("createElement")
    def createElement_head(tagName: head): HTMLHeadElement
    @JSName("createElement")
    def createElement_head(tagName: head, options: ElementCreationOptions): HTMLHeadElement
    @JSName("createElement")
    def createElement_header(tagName: header): HTMLElement
    @JSName("createElement")
    def createElement_header(tagName: header, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_hgroup(tagName: hgroup): HTMLElement
    @JSName("createElement")
    def createElement_hgroup(tagName: hgroup, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_hr(tagName: hr): HTMLHRElement
    @JSName("createElement")
    def createElement_hr(tagName: hr, options: ElementCreationOptions): HTMLHRElement
    @JSName("createElement")
    def createElement_html(tagName: html): HTMLHtmlElement
    @JSName("createElement")
    def createElement_html(tagName: html, options: ElementCreationOptions): HTMLHtmlElement
    @JSName("createElement")
    def createElement_i(tagName: i): HTMLElement
    @JSName("createElement")
    def createElement_i(tagName: i, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_iframe(tagName: iframe): HTMLIFrameElement
    @JSName("createElement")
    def createElement_iframe(tagName: iframe, options: ElementCreationOptions): HTMLIFrameElement
    @JSName("createElement")
    def createElement_img(tagName: img): HTMLImageElement
    @JSName("createElement")
    def createElement_img(tagName: img, options: ElementCreationOptions): HTMLImageElement
    @JSName("createElement")
    def createElement_input(tagName: input): HTMLInputElement
    @JSName("createElement")
    def createElement_input(tagName: input, options: ElementCreationOptions): HTMLInputElement
    @JSName("createElement")
    def createElement_ins(tagName: ins): HTMLModElement
    @JSName("createElement")
    def createElement_ins(tagName: ins, options: ElementCreationOptions): HTMLModElement
    @JSName("createElement")
    def createElement_isindex(tagName: isindex): HTMLUnknownElement
    @JSName("createElement")
    def createElement_isindex(tagName: isindex, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_kbd(tagName: kbd): HTMLElement
    @JSName("createElement")
    def createElement_kbd(tagName: kbd, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_keygen(tagName: keygen): HTMLUnknownElement
    @JSName("createElement")
    def createElement_keygen(tagName: keygen, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_label(tagName: label): HTMLLabelElement
    @JSName("createElement")
    def createElement_label(tagName: label, options: ElementCreationOptions): HTMLLabelElement
    @JSName("createElement")
    def createElement_legend(tagName: legend): HTMLLegendElement
    @JSName("createElement")
    def createElement_legend(tagName: legend, options: ElementCreationOptions): HTMLLegendElement
    @JSName("createElement")
    def createElement_li(tagName: li): HTMLLIElement
    @JSName("createElement")
    def createElement_li(tagName: li, options: ElementCreationOptions): HTMLLIElement
    @JSName("createElement")
    def createElement_link(tagName: link): HTMLLinkElement
    @JSName("createElement")
    def createElement_link(tagName: link, options: ElementCreationOptions): HTMLLinkElement
    @JSName("createElement")
    def createElement_listing(tagName: listing): HTMLPreElement
    @JSName("createElement")
    def createElement_listing(tagName: listing, options: ElementCreationOptions): HTMLPreElement
    @JSName("createElement")
    def createElement_main(tagName: main): HTMLElement
    @JSName("createElement")
    def createElement_main(tagName: main, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_map(tagName: map): HTMLMapElement
    @JSName("createElement")
    def createElement_map(tagName: map, options: ElementCreationOptions): HTMLMapElement
    @JSName("createElement")
    def createElement_mark(tagName: mark): HTMLElement
    @JSName("createElement")
    def createElement_mark(tagName: mark, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_marquee(tagName: marquee): HTMLMarqueeElement
    @JSName("createElement")
    def createElement_marquee(tagName: marquee, options: ElementCreationOptions): HTMLMarqueeElement
    @JSName("createElement")
    def createElement_menu(tagName: menu): HTMLMenuElement
    @JSName("createElement")
    def createElement_menu(tagName: menu, options: ElementCreationOptions): HTMLMenuElement
    @JSName("createElement")
    def createElement_menuitem(tagName: menuitem): HTMLElement
    @JSName("createElement")
    def createElement_menuitem(tagName: menuitem, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_meta(tagName: meta): HTMLMetaElement
    @JSName("createElement")
    def createElement_meta(tagName: meta, options: ElementCreationOptions): HTMLMetaElement
    @JSName("createElement")
    def createElement_meter(tagName: meter): HTMLMeterElement
    @JSName("createElement")
    def createElement_meter(tagName: meter, options: ElementCreationOptions): HTMLMeterElement
    @JSName("createElement")
    def createElement_multicol(tagName: multicol): HTMLUnknownElement
    @JSName("createElement")
    def createElement_multicol(tagName: multicol, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_nav(tagName: nav): HTMLElement
    @JSName("createElement")
    def createElement_nav(tagName: nav, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_nextid(tagName: nextid): HTMLUnknownElement
    @JSName("createElement")
    def createElement_nextid(tagName: nextid, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_nobr(tagName: nobr): HTMLElement
    @JSName("createElement")
    def createElement_nobr(tagName: nobr, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_noembed(tagName: noembed): HTMLElement
    @JSName("createElement")
    def createElement_noembed(tagName: noembed, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_noframes(tagName: noframes): HTMLElement
    @JSName("createElement")
    def createElement_noframes(tagName: noframes, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_noscript(tagName: noscript): HTMLElement
    @JSName("createElement")
    def createElement_noscript(tagName: noscript, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_object(tagName: `object`): HTMLObjectElement
    @JSName("createElement")
    def createElement_object(tagName: `object`, options: ElementCreationOptions): HTMLObjectElement
    @JSName("createElement")
    def createElement_ol(tagName: ol): HTMLOListElement
    @JSName("createElement")
    def createElement_ol(tagName: ol, options: ElementCreationOptions): HTMLOListElement
    @JSName("createElement")
    def createElement_optgroup(tagName: optgroup): HTMLOptGroupElement
    @JSName("createElement")
    def createElement_optgroup(tagName: optgroup, options: ElementCreationOptions): HTMLOptGroupElement
    @JSName("createElement")
    def createElement_option(tagName: option): HTMLOptionElement
    @JSName("createElement")
    def createElement_option(tagName: option, options: ElementCreationOptions): HTMLOptionElement
    @JSName("createElement")
    def createElement_output(tagName: output): HTMLOutputElement
    @JSName("createElement")
    def createElement_output(tagName: output, options: ElementCreationOptions): HTMLOutputElement
    @JSName("createElement")
    def createElement_p(tagName: p): HTMLParagraphElement
    @JSName("createElement")
    def createElement_p(tagName: p, options: ElementCreationOptions): HTMLParagraphElement
    @JSName("createElement")
    def createElement_param(tagName: param): HTMLParamElement
    @JSName("createElement")
    def createElement_param(tagName: param, options: ElementCreationOptions): HTMLParamElement
    @JSName("createElement")
    def createElement_picture(tagName: picture): HTMLPictureElement
    @JSName("createElement")
    def createElement_picture(tagName: picture, options: ElementCreationOptions): HTMLPictureElement
    @JSName("createElement")
    def createElement_plaintext(tagName: plaintext): HTMLElement
    @JSName("createElement")
    def createElement_plaintext(tagName: plaintext, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_pre(tagName: pre): HTMLPreElement
    @JSName("createElement")
    def createElement_pre(tagName: pre, options: ElementCreationOptions): HTMLPreElement
    @JSName("createElement")
    def createElement_progress(tagName: progress): HTMLProgressElement
    @JSName("createElement")
    def createElement_progress(tagName: progress, options: ElementCreationOptions): HTMLProgressElement
    @JSName("createElement")
    def createElement_q(tagName: q): HTMLQuoteElement
    @JSName("createElement")
    def createElement_q(tagName: q, options: ElementCreationOptions): HTMLQuoteElement
    @JSName("createElement")
    def createElement_rb(tagName: rb): HTMLElement
    @JSName("createElement")
    def createElement_rb(tagName: rb, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_rp(tagName: rp): HTMLElement
    @JSName("createElement")
    def createElement_rp(tagName: rp, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_rt(tagName: rt): HTMLElement
    @JSName("createElement")
    def createElement_rt(tagName: rt, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_rtc(tagName: rtc): HTMLElement
    @JSName("createElement")
    def createElement_rtc(tagName: rtc, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_ruby(tagName: ruby): HTMLElement
    @JSName("createElement")
    def createElement_ruby(tagName: ruby, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_s(tagName: s): HTMLElement
    @JSName("createElement")
    def createElement_s(tagName: s, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_samp(tagName: samp): HTMLElement
    @JSName("createElement")
    def createElement_samp(tagName: samp, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_script(tagName: script): HTMLScriptElement
    @JSName("createElement")
    def createElement_script(tagName: script, options: ElementCreationOptions): HTMLScriptElement
    @JSName("createElement")
    def createElement_section(tagName: section): HTMLElement
    @JSName("createElement")
    def createElement_section(tagName: section, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_select(tagName: select): HTMLSelectElement
    @JSName("createElement")
    def createElement_select(tagName: select, options: ElementCreationOptions): HTMLSelectElement
    @JSName("createElement")
    def createElement_slot(tagName: slot): HTMLSlotElement
    @JSName("createElement")
    def createElement_slot(tagName: slot, options: ElementCreationOptions): HTMLSlotElement
    @JSName("createElement")
    def createElement_small(tagName: small): HTMLElement
    @JSName("createElement")
    def createElement_small(tagName: small, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_source(tagName: source): HTMLSourceElement
    @JSName("createElement")
    def createElement_source(tagName: source, options: ElementCreationOptions): HTMLSourceElement
    @JSName("createElement")
    def createElement_spacer(tagName: spacer): HTMLUnknownElement
    @JSName("createElement")
    def createElement_spacer(tagName: spacer, options: ElementCreationOptions): HTMLUnknownElement
    @JSName("createElement")
    def createElement_span(tagName: span): HTMLSpanElement
    @JSName("createElement")
    def createElement_span(tagName: span, options: ElementCreationOptions): HTMLSpanElement
    @JSName("createElement")
    def createElement_strike(tagName: strike): HTMLElement
    @JSName("createElement")
    def createElement_strike(tagName: strike, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_strong(tagName: strong): HTMLElement
    @JSName("createElement")
    def createElement_strong(tagName: strong, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_style(tagName: style): HTMLStyleElement
    @JSName("createElement")
    def createElement_style(tagName: style, options: ElementCreationOptions): HTMLStyleElement
    @JSName("createElement")
    def createElement_sub(tagName: sub): HTMLElement
    @JSName("createElement")
    def createElement_sub(tagName: sub, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_summary(tagName: summary): HTMLElement
    @JSName("createElement")
    def createElement_summary(tagName: summary, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_sup(tagName: sup): HTMLElement
    @JSName("createElement")
    def createElement_sup(tagName: sup, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_table(tagName: table): HTMLTableElement
    @JSName("createElement")
    def createElement_table(tagName: table, options: ElementCreationOptions): HTMLTableElement
    @JSName("createElement")
    def createElement_tbody(tagName: tbody): HTMLTableSectionElement
    @JSName("createElement")
    def createElement_tbody(tagName: tbody, options: ElementCreationOptions): HTMLTableSectionElement
    @JSName("createElement")
    def createElement_td(tagName: td): HTMLTableCellElement
    @JSName("createElement")
    def createElement_td(tagName: td, options: ElementCreationOptions): HTMLTableCellElement
    @JSName("createElement")
    def createElement_template(tagName: template): HTMLTemplateElement
    @JSName("createElement")
    def createElement_template(tagName: template, options: ElementCreationOptions): HTMLTemplateElement
    @JSName("createElement")
    def createElement_textarea(tagName: textarea): HTMLTextAreaElement
    @JSName("createElement")
    def createElement_textarea(tagName: textarea, options: ElementCreationOptions): HTMLTextAreaElement
    @JSName("createElement")
    def createElement_tfoot(tagName: tfoot): HTMLTableSectionElement
    @JSName("createElement")
    def createElement_tfoot(tagName: tfoot, options: ElementCreationOptions): HTMLTableSectionElement
    @JSName("createElement")
    def createElement_th(tagName: th): HTMLTableCellElement
    @JSName("createElement")
    def createElement_th(tagName: th, options: ElementCreationOptions): HTMLTableCellElement
    @JSName("createElement")
    def createElement_thead(tagName: thead): HTMLTableSectionElement
    @JSName("createElement")
    def createElement_thead(tagName: thead, options: ElementCreationOptions): HTMLTableSectionElement
    @JSName("createElement")
    def createElement_time(tagName: time): HTMLTimeElement
    @JSName("createElement")
    def createElement_time(tagName: time, options: ElementCreationOptions): HTMLTimeElement
    @JSName("createElement")
    def createElement_title(tagName: title): HTMLTitleElement
    @JSName("createElement")
    def createElement_title(tagName: title, options: ElementCreationOptions): HTMLTitleElement
    @JSName("createElement")
    def createElement_tr(tagName: tr): HTMLTableRowElement
    @JSName("createElement")
    def createElement_tr(tagName: tr, options: ElementCreationOptions): HTMLTableRowElement
    @JSName("createElement")
    def createElement_track(tagName: track): HTMLTrackElement
    @JSName("createElement")
    def createElement_track(tagName: track, options: ElementCreationOptions): HTMLTrackElement
    @JSName("createElement")
    def createElement_tt(tagName: tt): HTMLElement
    @JSName("createElement")
    def createElement_tt(tagName: tt, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_u(tagName: u): HTMLElement
    @JSName("createElement")
    def createElement_u(tagName: u, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_ul(tagName: ul): HTMLUListElement
    @JSName("createElement")
    def createElement_ul(tagName: ul, options: ElementCreationOptions): HTMLUListElement
    @JSName("createElement")
    def createElement_var(tagName: `var`): HTMLElement
    @JSName("createElement")
    def createElement_var(tagName: `var`, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_video(tagName: video): HTMLVideoElement
    @JSName("createElement")
    def createElement_video(tagName: video, options: ElementCreationOptions): HTMLVideoElement
    @JSName("createElement")
    def createElement_wbr(tagName: wbr): HTMLElement
    @JSName("createElement")
    def createElement_wbr(tagName: wbr, options: ElementCreationOptions): HTMLElement
    @JSName("createElement")
    def createElement_xmp(tagName: xmp): HTMLPreElement
    @JSName("createElement")
    def createElement_xmp(tagName: xmp, options: ElementCreationOptions): HTMLPreElement
  }
  object CachedNodeRendererOptions {
    
    inline def apply(attrKey: String, createElement: FnCall): CachedNodeRendererOptions = {
      val __obj = js.Dynamic.literal(attrKey = attrKey.asInstanceOf[js.Any], createElement = createElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedNodeRendererOptions]
    }
    
    extension [Self <: CachedNodeRendererOptions](x: Self) {
      
      inline def setAttrKey(value: String): Self = StObject.set(x, "attrKey", value.asInstanceOf[js.Any])
      
      inline def setCreateElement(value: FnCall): Self = StObject.set(x, "createElement", value.asInstanceOf[js.Any])
    }
  }
}
