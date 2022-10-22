package typingsJapgolly.summernote.mod.global

import typingsJapgolly.jquery.JQuery.Node
import typingsJapgolly.summernote.mod.global.Summernote.CreateLinkOptions
import typingsJapgolly.summernote.mod.global.Summernote.EditImageCallback
import typingsJapgolly.summernote.mod.global.Summernote.Options
import typingsJapgolly.summernote.summernoteStrings.backColor
import typingsJapgolly.summernote.summernoteStrings.bold
import typingsJapgolly.summernote.summernoteStrings.code
import typingsJapgolly.summernote.summernoteStrings.createLink
import typingsJapgolly.summernote.summernoteStrings.createRange
import typingsJapgolly.summernote.summernoteStrings.destroy
import typingsJapgolly.summernote.summernoteStrings.disable
import typingsJapgolly.summernote.summernoteStrings.editorDotbold
import typingsJapgolly.summernote.summernoteStrings.editorDotcreateRange
import typingsJapgolly.summernote.summernoteStrings.editorDotfocus
import typingsJapgolly.summernote.summernoteStrings.editorDotfontSize
import typingsJapgolly.summernote.summernoteStrings.editorDotindent
import typingsJapgolly.summernote.summernoteStrings.editorDotinsertImage
import typingsJapgolly.summernote.summernoteStrings.editorDotinsertNode
import typingsJapgolly.summernote.summernoteStrings.editorDotinsertOrderedList
import typingsJapgolly.summernote.summernoteStrings.editorDotinsertText
import typingsJapgolly.summernote.summernoteStrings.editorDotinsertUnorderedList
import typingsJapgolly.summernote.summernoteStrings.editorDotisEmpty
import typingsJapgolly.summernote.summernoteStrings.editorDotitalic
import typingsJapgolly.summernote.summernoteStrings.editorDotjustifyCenter
import typingsJapgolly.summernote.summernoteStrings.editorDotjustifyFull
import typingsJapgolly.summernote.summernoteStrings.editorDotjustifyLeft
import typingsJapgolly.summernote.summernoteStrings.editorDotjustifyRight
import typingsJapgolly.summernote.summernoteStrings.editorDotoutdent
import typingsJapgolly.summernote.summernoteStrings.editorDotpasteHTML
import typingsJapgolly.summernote.summernoteStrings.editorDotredo
import typingsJapgolly.summernote.summernoteStrings.editorDotremoveFormat
import typingsJapgolly.summernote.summernoteStrings.editorDotrestoreRange
import typingsJapgolly.summernote.summernoteStrings.editorDotsaveRange
import typingsJapgolly.summernote.summernoteStrings.editorDotstrikethrough
import typingsJapgolly.summernote.summernoteStrings.editorDotsubscript
import typingsJapgolly.summernote.summernoteStrings.editorDotsuperscript
import typingsJapgolly.summernote.summernoteStrings.editorDotunderline
import typingsJapgolly.summernote.summernoteStrings.editorDotundo
import typingsJapgolly.summernote.summernoteStrings.enable
import typingsJapgolly.summernote.summernoteStrings.focus
import typingsJapgolly.summernote.summernoteStrings.fontName
import typingsJapgolly.summernote.summernoteStrings.fontSize
import typingsJapgolly.summernote.summernoteStrings.foreColor
import typingsJapgolly.summernote.summernoteStrings.formatH1
import typingsJapgolly.summernote.summernoteStrings.formatH2
import typingsJapgolly.summernote.summernoteStrings.formatH3
import typingsJapgolly.summernote.summernoteStrings.formatH4
import typingsJapgolly.summernote.summernoteStrings.formatH5
import typingsJapgolly.summernote.summernoteStrings.formatH6
import typingsJapgolly.summernote.summernoteStrings.formatPara
import typingsJapgolly.summernote.summernoteStrings.indent
import typingsJapgolly.summernote.summernoteStrings.insertImage
import typingsJapgolly.summernote.summernoteStrings.insertNode
import typingsJapgolly.summernote.summernoteStrings.insertOrderedList
import typingsJapgolly.summernote.summernoteStrings.insertParagraph
import typingsJapgolly.summernote.summernoteStrings.insertText
import typingsJapgolly.summernote.summernoteStrings.insertUnorderedList
import typingsJapgolly.summernote.summernoteStrings.isEmpty
import typingsJapgolly.summernote.summernoteStrings.italic
import typingsJapgolly.summernote.summernoteStrings.justifyCenter
import typingsJapgolly.summernote.summernoteStrings.justifyFull
import typingsJapgolly.summernote.summernoteStrings.justifyLeft
import typingsJapgolly.summernote.summernoteStrings.justifyRight
import typingsJapgolly.summernote.summernoteStrings.outdent
import typingsJapgolly.summernote.summernoteStrings.pasteHTML
import typingsJapgolly.summernote.summernoteStrings.redo
import typingsJapgolly.summernote.summernoteStrings.removeFormat
import typingsJapgolly.summernote.summernoteStrings.reset
import typingsJapgolly.summernote.summernoteStrings.restoreRange
import typingsJapgolly.summernote.summernoteStrings.saveRange
import typingsJapgolly.summernote.summernoteStrings.strikethrough
import typingsJapgolly.summernote.summernoteStrings.subscript
import typingsJapgolly.summernote.summernoteStrings.superscript
import typingsJapgolly.summernote.summernoteStrings.underline
import typingsJapgolly.summernote.summernoteStrings.undo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def summernote(): JQuery = js.native
  def summernote(command: editorDotisEmpty | isEmpty): Boolean = js.native
  def summernote(command: editorDotfontSize | fontSize, fontSize: Double): JQuery = js.native
  // Insertion API
  def summernote(
    command: editorDotinsertImage | editorDotinsertText | editorDotpasteHTML | insertImage | insertText | pasteHTML,
    markup: String
  ): JQuery = js.native
  def summernote(command: editorDotinsertNode | insertNode, node: Node): JQuery = js.native
  def summernote(command: editorDotinsertImage | insertImage, url: String, filename: String): JQuery = js.native
  def summernote(command: editorDotinsertImage | insertImage, url: String, filename: EditImageCallback): JQuery = js.native
  def summernote(command: String): JQuery = js.native
  def summernote(command: String, markupString: String): JQuery = js.native
  def summernote(command: String, node: Node): JQuery = js.native
  def summernote(command: String, url: String, filename: String): JQuery = js.native
  def summernote(command: String, url: String, filename: EditImageCallback): JQuery = js.native
  def summernote(command: String, value: Double): JQuery = js.native
  def summernote(options: Options): JQuery = js.native
  // Basic API
  // Font style API
  // Paragraph API
  @JSName("summernote")
  def summernote_JQuery(
    command: bold | createRange | editorDotbold | editorDotcreateRange | editorDotfocus | editorDotindent | editorDotinsertOrderedList | editorDotinsertUnorderedList | editorDotitalic | editorDotjustifyCenter | editorDotjustifyFull | editorDotjustifyLeft | editorDotjustifyRight | editorDotoutdent | editorDotredo | editorDotremoveFormat | editorDotrestoreRange | editorDotsaveRange | editorDotstrikethrough | editorDotsubscript | editorDotsuperscript | editorDotunderline | editorDotundo | focus | indent | insertOrderedList | insertUnorderedList | italic | justifyCenter | justifyFull | justifyLeft | justifyRight | outdent | redo | removeFormat | restoreRange | saveRange | strikethrough | subscript | superscript | underline | undo
  ): JQuery = js.native
  @JSName("summernote")
  def summernote_backColor(command: backColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code): String = js.native
  @JSName("summernote")
  def summernote_code(command: code, markupStr: String): Unit = js.native
  @JSName("summernote")
  def summernote_createLink(command: createLink, options: CreateLinkOptions): JQuery = js.native
  @JSName("summernote")
  def summernote_destroy(command: destroy): JQuery = js.native
  @JSName("summernote")
  def summernote_disable(command: disable): JQuery = js.native
  @JSName("summernote")
  def summernote_enable(command: enable): JQuery = js.native
  @JSName("summernote")
  def summernote_fontName(command: fontName, fontName: String): JQuery = js.native
  @JSName("summernote")
  def summernote_foreColor(command: foreColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH1(command: formatH1): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH2(command: formatH2): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH3(command: formatH3): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH4(command: formatH4): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH5(command: formatH5): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH6(command: formatH6): JQuery = js.native
  @JSName("summernote")
  def summernote_formatPara(command: formatPara): JQuery = js.native
  @JSName("summernote")
  def summernote_insertParagraph(command: insertParagraph): JQuery = js.native
  @JSName("summernote")
  def summernote_reset(command: reset): JQuery = js.native
}
