package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditor
  extends StObject
     with Editor[dxHtmlEditorOptions] {
  
  /**
    * Removes focus from the content field of the editor.
    */
  def blur(): Unit = js.native
  
  /**
    * Clears the history of changes.
    */
  def clearHistory(): Unit = js.native
  
  /**
    * Deletes content from the given range.
    */
  def delete(index: Double, length: Double): Unit = js.native
  
  def format(formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies a format to the selected content. Cannot be used with embedded formats.
    */
  def format(formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  
  def formatLine(index: Double, length: Double, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies a single block format to all lines in the given range.
    */
  def formatLine(index: Double, length: Double, formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  /**
    * Applies several block formats to all lines in the given range.
    */
  def formatLine(index: Double, length: Double, formats: Any): Unit = js.native
  
  def formatText(index: Double, length: Double, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies a single text format to all characters in the given range.
    */
  def formatText(index: Double, length: Double, formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  /**
    * Applies several text formats to all characters in the given range.
    */
  def formatText(index: Double, length: Double, formats: Any): Unit = js.native
  
  /**
    * Gets a format, module, or Parchment.
    */
  def get(componentPath: String): Any = js.native
  
  /**
    * Retrieves the pixel position and size of a selection at a specified location.
    */
  def getBounds(index: Double, length: Double): Any = js.native
  
  /**
    * Retrieves formatting of the text within the current selection range.
    */
  def getFormat(): Any = js.native
  /**
    * Gets formats applied to the content in the specified range.
    */
  def getFormat(index: Double, length: Double): Any = js.native
  
  /**
    * Gets the entire content&apos;s length.
    */
  def getLength(): Double = js.native
  
  /**
    * Gets the instance of a module.
    */
  def getModule(moduleName: String): Any = js.native
  
  /**
    * Gets the DevExtreme Quill&apos;s instance.
    */
  def getQuillInstance(): Any = js.native
  
  /**
    * Gets the selected content&apos;s position and length.
    */
  def getSelection(): Any = js.native
  def getSelection(focus: Boolean): Any = js.native
  
  /**
    * Retrieves text content from the HtmlEditor.
    */
  def getText(index: Double, length: Double): String = js.native
  
  /**
    * Inserts an embedded content at the specified position.
    */
  def insertEmbed(index: Double, `type`: String, config: Any): Unit = js.native
  
  def insertText(index: Double, text: String, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Inserts text into the HtmlEditor.
    */
  def insertText(index: Double, text: String, formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  /**
    * Inserts formatted text at the specified position. Used with all formats except embedded.
    */
  def insertText(index: Double, text: String, formats: Any): Unit = js.native
  
  /**
    * Reapplies the most recent undone change. Repeated calls reapply preceding undone changes.
    */
  def redo(): Unit = js.native
  
  /**
    * Registers custom formats and modules.
    */
  def register(modules: Any): Unit = js.native
  
  /**
    * Removes all formatting and embedded content from the specified range.
    */
  def removeFormat(index: Double, length: Double): Unit = js.native
  
  /**
    * Selects and highlights content in the specified range.
    */
  def setSelection(index: Double, length: Double): Unit = js.native
  
  /**
    * Reverses the most recent change. Repeated calls reverse preceding changes.
    */
  def undo(): Unit = js.native
}
object dxHtmlEditor {
  
  type ContentReadyEvent = EventInfo[dxHtmlEditor]
  
  type ContextMenuItem = dxHtmlEditorTableContextMenuItem
  
  type DisposingEvent = EventInfo[dxHtmlEditor]
  
  type FocusInEvent = NativeEventInfo[dxHtmlEditor, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxHtmlEditor, FocusEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.background
    - typingsJapgolly.devextreme.devextremeStrings.bold
    - typingsJapgolly.devextreme.devextremeStrings.color
    - typingsJapgolly.devextreme.devextremeStrings.font
    - typingsJapgolly.devextreme.devextremeStrings.italic
    - typingsJapgolly.devextreme.devextremeStrings.link
    - typingsJapgolly.devextreme.devextremeStrings.size
    - typingsJapgolly.devextreme.devextremeStrings.strike
    - typingsJapgolly.devextreme.devextremeStrings.script
    - typingsJapgolly.devextreme.devextremeStrings.underline
    - typingsJapgolly.devextreme.devextremeStrings.blockquote
    - typingsJapgolly.devextreme.devextremeStrings.header
    - typingsJapgolly.devextreme.devextremeStrings.indent
    - typingsJapgolly.devextreme.devextremeStrings.list
    - typingsJapgolly.devextreme.devextremeStrings.align
    - typingsJapgolly.devextreme.devextremeStrings.`code-block`
  */
  trait HtmlEditorFormat extends StObject
  object HtmlEditorFormat {
    
    inline def align: typingsJapgolly.devextreme.devextremeStrings.align = "align".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.align]
    
    inline def background: typingsJapgolly.devextreme.devextremeStrings.background = "background".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.background]
    
    inline def blockquote: typingsJapgolly.devextreme.devextremeStrings.blockquote = "blockquote".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.blockquote]
    
    inline def bold: typingsJapgolly.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bold]
    
    inline def `code-block`: typingsJapgolly.devextreme.devextremeStrings.`code-block` = "code-block".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.`code-block`]
    
    inline def color: typingsJapgolly.devextreme.devextremeStrings.color = "color".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.color]
    
    inline def font: typingsJapgolly.devextreme.devextremeStrings.font = "font".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.font]
    
    inline def header: typingsJapgolly.devextreme.devextremeStrings.header = "header".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.header]
    
    inline def indent: typingsJapgolly.devextreme.devextremeStrings.indent = "indent".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.indent]
    
    inline def italic: typingsJapgolly.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.italic]
    
    inline def link: typingsJapgolly.devextreme.devextremeStrings.link = "link".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.link]
    
    inline def list: typingsJapgolly.devextreme.devextremeStrings.list = "list".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.list]
    
    inline def script: typingsJapgolly.devextreme.devextremeStrings.script = "script".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.script]
    
    inline def size: typingsJapgolly.devextreme.devextremeStrings.size = "size".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.size]
    
    inline def strike: typingsJapgolly.devextreme.devextremeStrings.strike = "strike".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.strike]
    
    inline def underline: typingsJapgolly.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.underline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.base64
    - typingsJapgolly.devextreme.devextremeStrings.server
    - typingsJapgolly.devextreme.devextremeStrings.both
  */
  trait HtmlEditorImageUploadMode extends StObject
  object HtmlEditorImageUploadMode {
    
    inline def base64: typingsJapgolly.devextreme.devextremeStrings.base64 = "base64".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.base64]
    
    inline def both: typingsJapgolly.devextreme.devextremeStrings.both = "both".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.both]
    
    inline def server: typingsJapgolly.devextreme.devextremeStrings.server = "server".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.server]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.url
    - typingsJapgolly.devextreme.devextremeStrings.file
  */
  trait HtmlEditorImageUploadTab extends StObject
  object HtmlEditorImageUploadTab {
    
    inline def file: typingsJapgolly.devextreme.devextremeStrings.file = "file".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.file]
    
    inline def url: typingsJapgolly.devextreme.devextremeStrings.url = "url".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.url]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.background
    - typingsJapgolly.devextreme.devextremeStrings.bold
    - typingsJapgolly.devextreme.devextremeStrings.color
    - typingsJapgolly.devextreme.devextremeStrings.font
    - typingsJapgolly.devextreme.devextremeStrings.italic
    - typingsJapgolly.devextreme.devextremeStrings.link
    - typingsJapgolly.devextreme.devextremeStrings.image
    - typingsJapgolly.devextreme.devextremeStrings.strike
    - typingsJapgolly.devextreme.devextremeStrings.subscript
    - typingsJapgolly.devextreme.devextremeStrings.superscript
    - typingsJapgolly.devextreme.devextremeStrings.underline
    - typingsJapgolly.devextreme.devextremeStrings.blockquote
    - typingsJapgolly.devextreme.devextremeStrings.increaseIndent
    - typingsJapgolly.devextreme.devextremeStrings.decreaseIndent
    - typingsJapgolly.devextreme.devextremeStrings.orderedList
    - typingsJapgolly.devextreme.devextremeStrings.bulletList
    - typingsJapgolly.devextreme.devextremeStrings.alignLeft
    - typingsJapgolly.devextreme.devextremeStrings.alignCenter
    - typingsJapgolly.devextreme.devextremeStrings.alignRight
    - typingsJapgolly.devextreme.devextremeStrings.alignJustify
    - typingsJapgolly.devextreme.devextremeStrings.codeBlock
    - typingsJapgolly.devextreme.devextremeStrings.variable
    - typingsJapgolly.devextreme.devextremeStrings.undo
    - typingsJapgolly.devextreme.devextremeStrings.redo
    - typingsJapgolly.devextreme.devextremeStrings.clear
    - typingsJapgolly.devextreme.devextremeStrings.insertTable
    - typingsJapgolly.devextreme.devextremeStrings.insertHeaderRow
    - typingsJapgolly.devextreme.devextremeStrings.insertRowAbove
    - typingsJapgolly.devextreme.devextremeStrings.insertRowBelow
    - typingsJapgolly.devextreme.devextremeStrings.insertColumnLeft
    - typingsJapgolly.devextreme.devextremeStrings.insertColumnRight
    - typingsJapgolly.devextreme.devextremeStrings.deleteColumn
    - typingsJapgolly.devextreme.devextremeStrings.deleteRow
    - typingsJapgolly.devextreme.devextremeStrings.deleteTable
    - typingsJapgolly.devextreme.devextremeStrings.cellProperties
    - typingsJapgolly.devextreme.devextremeStrings.tableProperties
  */
  trait HtmlEditorPredefinedContextMenuItem extends StObject
  object HtmlEditorPredefinedContextMenuItem {
    
    inline def alignCenter: typingsJapgolly.devextreme.devextremeStrings.alignCenter = "alignCenter".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignCenter]
    
    inline def alignJustify: typingsJapgolly.devextreme.devextremeStrings.alignJustify = "alignJustify".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignJustify]
    
    inline def alignLeft: typingsJapgolly.devextreme.devextremeStrings.alignLeft = "alignLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignLeft]
    
    inline def alignRight: typingsJapgolly.devextreme.devextremeStrings.alignRight = "alignRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignRight]
    
    inline def background: typingsJapgolly.devextreme.devextremeStrings.background = "background".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.background]
    
    inline def blockquote: typingsJapgolly.devextreme.devextremeStrings.blockquote = "blockquote".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.blockquote]
    
    inline def bold: typingsJapgolly.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bold]
    
    inline def bulletList: typingsJapgolly.devextreme.devextremeStrings.bulletList = "bulletList".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bulletList]
    
    inline def cellProperties: typingsJapgolly.devextreme.devextremeStrings.cellProperties = "cellProperties".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cellProperties]
    
    inline def clear: typingsJapgolly.devextreme.devextremeStrings.clear = "clear".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.clear]
    
    inline def codeBlock: typingsJapgolly.devextreme.devextremeStrings.codeBlock = "codeBlock".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.codeBlock]
    
    inline def color: typingsJapgolly.devextreme.devextremeStrings.color = "color".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.color]
    
    inline def decreaseIndent: typingsJapgolly.devextreme.devextremeStrings.decreaseIndent = "decreaseIndent".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.decreaseIndent]
    
    inline def deleteColumn: typingsJapgolly.devextreme.devextremeStrings.deleteColumn = "deleteColumn".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.deleteColumn]
    
    inline def deleteRow: typingsJapgolly.devextreme.devextremeStrings.deleteRow = "deleteRow".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.deleteRow]
    
    inline def deleteTable: typingsJapgolly.devextreme.devextremeStrings.deleteTable = "deleteTable".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.deleteTable]
    
    inline def font: typingsJapgolly.devextreme.devextremeStrings.font = "font".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.font]
    
    inline def image: typingsJapgolly.devextreme.devextremeStrings.image = "image".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.image]
    
    inline def increaseIndent: typingsJapgolly.devextreme.devextremeStrings.increaseIndent = "increaseIndent".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.increaseIndent]
    
    inline def insertColumnLeft: typingsJapgolly.devextreme.devextremeStrings.insertColumnLeft = "insertColumnLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertColumnLeft]
    
    inline def insertColumnRight: typingsJapgolly.devextreme.devextremeStrings.insertColumnRight = "insertColumnRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertColumnRight]
    
    inline def insertHeaderRow: typingsJapgolly.devextreme.devextremeStrings.insertHeaderRow = "insertHeaderRow".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertHeaderRow]
    
    inline def insertRowAbove: typingsJapgolly.devextreme.devextremeStrings.insertRowAbove = "insertRowAbove".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertRowAbove]
    
    inline def insertRowBelow: typingsJapgolly.devextreme.devextremeStrings.insertRowBelow = "insertRowBelow".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertRowBelow]
    
    inline def insertTable: typingsJapgolly.devextreme.devextremeStrings.insertTable = "insertTable".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertTable]
    
    inline def italic: typingsJapgolly.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.italic]
    
    inline def link: typingsJapgolly.devextreme.devextremeStrings.link = "link".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.link]
    
    inline def orderedList: typingsJapgolly.devextreme.devextremeStrings.orderedList = "orderedList".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.orderedList]
    
    inline def redo: typingsJapgolly.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.redo]
    
    inline def strike: typingsJapgolly.devextreme.devextremeStrings.strike = "strike".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.strike]
    
    inline def subscript: typingsJapgolly.devextreme.devextremeStrings.subscript = "subscript".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.subscript]
    
    inline def superscript: typingsJapgolly.devextreme.devextremeStrings.superscript = "superscript".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.superscript]
    
    inline def tableProperties: typingsJapgolly.devextreme.devextremeStrings.tableProperties = "tableProperties".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.tableProperties]
    
    inline def underline: typingsJapgolly.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.underline]
    
    inline def undo: typingsJapgolly.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.undo]
    
    inline def variable: typingsJapgolly.devextreme.devextremeStrings.variable = "variable".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.variable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.background
    - typingsJapgolly.devextreme.devextremeStrings.bold
    - typingsJapgolly.devextreme.devextremeStrings.color
    - typingsJapgolly.devextreme.devextremeStrings.font
    - typingsJapgolly.devextreme.devextremeStrings.italic
    - typingsJapgolly.devextreme.devextremeStrings.link
    - typingsJapgolly.devextreme.devextremeStrings.image
    - typingsJapgolly.devextreme.devextremeStrings.size
    - typingsJapgolly.devextreme.devextremeStrings.strike
    - typingsJapgolly.devextreme.devextremeStrings.subscript
    - typingsJapgolly.devextreme.devextremeStrings.superscript
    - typingsJapgolly.devextreme.devextremeStrings.underline
    - typingsJapgolly.devextreme.devextremeStrings.blockquote
    - typingsJapgolly.devextreme.devextremeStrings.header
    - typingsJapgolly.devextreme.devextremeStrings.increaseIndent
    - typingsJapgolly.devextreme.devextremeStrings.decreaseIndent
    - typingsJapgolly.devextreme.devextremeStrings.orderedList
    - typingsJapgolly.devextreme.devextremeStrings.bulletList
    - typingsJapgolly.devextreme.devextremeStrings.alignLeft
    - typingsJapgolly.devextreme.devextremeStrings.alignCenter
    - typingsJapgolly.devextreme.devextremeStrings.alignRight
    - typingsJapgolly.devextreme.devextremeStrings.alignJustify
    - typingsJapgolly.devextreme.devextremeStrings.codeBlock
    - typingsJapgolly.devextreme.devextremeStrings.variable
    - typingsJapgolly.devextreme.devextremeStrings.separator
    - typingsJapgolly.devextreme.devextremeStrings.undo
    - typingsJapgolly.devextreme.devextremeStrings.redo
    - typingsJapgolly.devextreme.devextremeStrings.clear
    - typingsJapgolly.devextreme.devextremeStrings.cellProperties
    - typingsJapgolly.devextreme.devextremeStrings.tableProperties
    - typingsJapgolly.devextreme.devextremeStrings.insertTable
    - typingsJapgolly.devextreme.devextremeStrings.insertHeaderRow
    - typingsJapgolly.devextreme.devextremeStrings.insertRowAbove
    - typingsJapgolly.devextreme.devextremeStrings.insertRowBelow
    - typingsJapgolly.devextreme.devextremeStrings.insertColumnLeft
    - typingsJapgolly.devextreme.devextremeStrings.insertColumnRight
    - typingsJapgolly.devextreme.devextremeStrings.deleteColumn
    - typingsJapgolly.devextreme.devextremeStrings.deleteRow
    - typingsJapgolly.devextreme.devextremeStrings.deleteTable
  */
  trait HtmlEditorPredefinedToolbarItem extends StObject
  object HtmlEditorPredefinedToolbarItem {
    
    inline def alignCenter: typingsJapgolly.devextreme.devextremeStrings.alignCenter = "alignCenter".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignCenter]
    
    inline def alignJustify: typingsJapgolly.devextreme.devextremeStrings.alignJustify = "alignJustify".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignJustify]
    
    inline def alignLeft: typingsJapgolly.devextreme.devextremeStrings.alignLeft = "alignLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignLeft]
    
    inline def alignRight: typingsJapgolly.devextreme.devextremeStrings.alignRight = "alignRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alignRight]
    
    inline def background: typingsJapgolly.devextreme.devextremeStrings.background = "background".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.background]
    
    inline def blockquote: typingsJapgolly.devextreme.devextremeStrings.blockquote = "blockquote".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.blockquote]
    
    inline def bold: typingsJapgolly.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bold]
    
    inline def bulletList: typingsJapgolly.devextreme.devextremeStrings.bulletList = "bulletList".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bulletList]
    
    inline def cellProperties: typingsJapgolly.devextreme.devextremeStrings.cellProperties = "cellProperties".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cellProperties]
    
    inline def clear: typingsJapgolly.devextreme.devextremeStrings.clear = "clear".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.clear]
    
    inline def codeBlock: typingsJapgolly.devextreme.devextremeStrings.codeBlock = "codeBlock".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.codeBlock]
    
    inline def color: typingsJapgolly.devextreme.devextremeStrings.color = "color".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.color]
    
    inline def decreaseIndent: typingsJapgolly.devextreme.devextremeStrings.decreaseIndent = "decreaseIndent".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.decreaseIndent]
    
    inline def deleteColumn: typingsJapgolly.devextreme.devextremeStrings.deleteColumn = "deleteColumn".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.deleteColumn]
    
    inline def deleteRow: typingsJapgolly.devextreme.devextremeStrings.deleteRow = "deleteRow".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.deleteRow]
    
    inline def deleteTable: typingsJapgolly.devextreme.devextremeStrings.deleteTable = "deleteTable".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.deleteTable]
    
    inline def font: typingsJapgolly.devextreme.devextremeStrings.font = "font".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.font]
    
    inline def header: typingsJapgolly.devextreme.devextremeStrings.header = "header".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.header]
    
    inline def image: typingsJapgolly.devextreme.devextremeStrings.image = "image".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.image]
    
    inline def increaseIndent: typingsJapgolly.devextreme.devextremeStrings.increaseIndent = "increaseIndent".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.increaseIndent]
    
    inline def insertColumnLeft: typingsJapgolly.devextreme.devextremeStrings.insertColumnLeft = "insertColumnLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertColumnLeft]
    
    inline def insertColumnRight: typingsJapgolly.devextreme.devextremeStrings.insertColumnRight = "insertColumnRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertColumnRight]
    
    inline def insertHeaderRow: typingsJapgolly.devextreme.devextremeStrings.insertHeaderRow = "insertHeaderRow".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertHeaderRow]
    
    inline def insertRowAbove: typingsJapgolly.devextreme.devextremeStrings.insertRowAbove = "insertRowAbove".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertRowAbove]
    
    inline def insertRowBelow: typingsJapgolly.devextreme.devextremeStrings.insertRowBelow = "insertRowBelow".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertRowBelow]
    
    inline def insertTable: typingsJapgolly.devextreme.devextremeStrings.insertTable = "insertTable".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertTable]
    
    inline def italic: typingsJapgolly.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.italic]
    
    inline def link: typingsJapgolly.devextreme.devextremeStrings.link = "link".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.link]
    
    inline def orderedList: typingsJapgolly.devextreme.devextremeStrings.orderedList = "orderedList".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.orderedList]
    
    inline def redo: typingsJapgolly.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.redo]
    
    inline def separator: typingsJapgolly.devextreme.devextremeStrings.separator = "separator".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.separator]
    
    inline def size: typingsJapgolly.devextreme.devextremeStrings.size = "size".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.size]
    
    inline def strike: typingsJapgolly.devextreme.devextremeStrings.strike = "strike".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.strike]
    
    inline def subscript: typingsJapgolly.devextreme.devextremeStrings.subscript = "subscript".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.subscript]
    
    inline def superscript: typingsJapgolly.devextreme.devextremeStrings.superscript = "superscript".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.superscript]
    
    inline def tableProperties: typingsJapgolly.devextreme.devextremeStrings.tableProperties = "tableProperties".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.tableProperties]
    
    inline def underline: typingsJapgolly.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.underline]
    
    inline def undo: typingsJapgolly.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.undo]
    
    inline def variable: typingsJapgolly.devextreme.devextremeStrings.variable = "variable".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.variable]
  }
  
  type ImageUploadTab = dxHtmlEditorImageUploadTabItem
  
  type InitializedEvent = InitializedEventInfo[dxHtmlEditor]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.html
    - typingsJapgolly.devextreme.devextremeStrings.markdown
  */
  trait MarkupType extends StObject
  object MarkupType {
    
    inline def html: typingsJapgolly.devextreme.devextremeStrings.html = "html".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.html]
    
    inline def markdown: typingsJapgolly.devextreme.devextremeStrings.markdown = "markdown".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.markdown]
  }
  
  trait MentionTemplateData extends StObject {
    
    val id: js.UndefOr[String | Double] = js.undefined
    
    val marker: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object MentionTemplateData {
    
    inline def apply(marker: String): MentionTemplateData = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionTemplateData]
    }
    
    extension [Self <: MentionTemplateData](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxHtmlEditor]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxHtmlEditor, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxHtmlEditorOptions
  
  type ToolbarItem = dxHtmlEditorToolbarItem
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxHtmlEditor, KeyboardEvent | ClipboardEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxHtmlEditor, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
