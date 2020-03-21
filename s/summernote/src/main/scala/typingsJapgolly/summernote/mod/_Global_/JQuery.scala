package typingsJapgolly.summernote.mod._Global_

import typingsJapgolly.jquery.JQuery_.Node
import typingsJapgolly.summernote.mod._Global_.Summernote.CreateLinkOptions
import typingsJapgolly.summernote.mod._Global_.Summernote.EditImageCallback
import typingsJapgolly.summernote.mod._Global_.Summernote.Options
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def summernote(): JQuery = js.native
  def summernote(command: String): JQuery = js.native
  def summernote(command: String, markupString: String): JQuery = js.native
  def summernote(command: String, node: Node): JQuery = js.native
  def summernote(command: String, url: String, filename: String): JQuery = js.native
  def summernote(command: String, url: String, filename: EditImageCallback): JQuery = js.native
  def summernote(command: String, value: Double): JQuery = js.native
  def summernote(options: Options): JQuery = js.native
  @JSName("summernote")
  def summernote_backColor(command: backColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_bold(fontStyle: bold): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code, markupStr: String): JQuery = js.native
  @JSName("summernote")
  def summernote_createLink(command: createLink, options: CreateLinkOptions): JQuery = js.native
  @JSName("summernote")
  def summernote_createRange(command: createRange): JQuery = js.native
  @JSName("summernote")
  def summernote_destroy(command: destroy): JQuery = js.native
  @JSName("summernote")
  def summernote_disable(command: disable): JQuery = js.native
  // Font style API
  @JSName("summernote")
  def summernote_editorbold(fontStyle: editorDotbold): JQuery = js.native
  // Basic API
  @JSName("summernote")
  def summernote_editorcreateRange(command: editorDotcreateRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfocus(command: editorDotfocus): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfontSize(command: editorDotfontSize, fontSize: Double): JQuery = js.native
  @JSName("summernote")
  def summernote_editorindent(command: editorDotindent): JQuery = js.native
  // Insertion API
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String, filename: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String, filename: EditImageCallback): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertNode(command: editorDotinsertNode, node: Node): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertOrderedList(command: editorDotinsertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertText(command: editorDotinsertText, text: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertUnorderedList(command: editorDotinsertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorisEmpty(command: editorDotisEmpty): Boolean = js.native
  @JSName("summernote")
  def summernote_editoritalic(fontStyle: editorDotitalic): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyCenter(command: editorDotjustifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyFull(command: editorDotjustifyFull): JQuery = js.native
  // Paragraph API
  @JSName("summernote")
  def summernote_editorjustifyLeft(command: editorDotjustifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyRight(command: editorDotjustifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_editoroutdent(command: editorDotoutdent): JQuery = js.native
  @JSName("summernote")
  def summernote_editorpasteHTML(command: editorDotpasteHTML, markup: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorredo(command: editorDotredo): JQuery = js.native
  @JSName("summernote")
  def summernote_editorremoveFormat(command: editorDotremoveFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_editorrestoreRange(command: editorDotrestoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsaveRange(command: editorDotsaveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorstrikethrough(fontStyle: editorDotstrikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsubscript(command: editorDotsubscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsuperscript(command: editorDotsuperscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorunderline(fontStyle: editorDotunderline): JQuery = js.native
  @JSName("summernote")
  def summernote_editorundo(command: editorDotundo): JQuery = js.native
  @JSName("summernote")
  def summernote_enable(command: enable): JQuery = js.native
  @JSName("summernote")
  def summernote_focus(command: focus): JQuery = js.native
  @JSName("summernote")
  def summernote_fontName(command: fontName, fontName: String): JQuery = js.native
  @JSName("summernote")
  def summernote_fontSize(command: fontSize, fontSize: Double): JQuery = js.native
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
  def summernote_indent(command: indent): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String, filename: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String, filename: EditImageCallback): JQuery = js.native
  @JSName("summernote")
  def summernote_insertNode(command: insertNode, node: Node): JQuery = js.native
  @JSName("summernote")
  def summernote_insertOrderedList(command: insertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_insertParagraph(command: insertParagraph): JQuery = js.native
  @JSName("summernote")
  def summernote_insertText(command: insertText, text: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertUnorderedList(command: insertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_isEmpty(command: isEmpty): Boolean = js.native
  @JSName("summernote")
  def summernote_italic(fontStyle: italic): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyCenter(command: justifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyFull(command: justifyFull): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyLeft(command: justifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyRight(command: justifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_outdent(command: outdent): JQuery = js.native
  @JSName("summernote")
  def summernote_pasteHTML(command: pasteHTML, markup: String): JQuery = js.native
  @JSName("summernote")
  def summernote_redo(command: redo): JQuery = js.native
  @JSName("summernote")
  def summernote_removeFormat(command: removeFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_reset(command: reset): JQuery = js.native
  @JSName("summernote")
  def summernote_restoreRange(command: restoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_saveRange(command: saveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_strikethrough(fontStyle: strikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_subscript(command: subscript): JQuery = js.native
  @JSName("summernote")
  def summernote_superscript(command: superscript): JQuery = js.native
  @JSName("summernote")
  def summernote_underline(fontStyle: underline): JQuery = js.native
  @JSName("summernote")
  def summernote_undo(command: undo): JQuery = js.native
}

