package typingsJapgolly.handsontable

import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.HTMLElement
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
import typingsJapgolly.handsontable.handsontableStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsTextEditorTextEditorMod {
  
  @JSImport("handsontable/editors/textEditor/textEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: text = js.native
  
  @JSImport("handsontable/editors/textEditor/textEditor", "TextEditor")
  @js.native
  open class TextEditor protected () extends BaseEditor {
    def this(instance: default) = this()
    
    var TEXTAREA: HTMLElement = js.native
    
    var TEXTAREA_PARENT: HTMLElement = js.native
    
    def bindEvents(): Unit = js.native
    
    def createElements(): Unit = js.native
    
    def hideEditableElement(): Unit = js.native
    
    def refreshDimensions(): Unit = js.native
    def refreshDimensions(force: Boolean): Unit = js.native
    
    def refreshValue(): Unit = js.native
    
    def showEditableElement(): Unit = js.native
    
    var textareaParentStyle: CSSStyleDeclaration = js.native
    
    var textareaStyle: CSSStyleDeclaration = js.native
  }
}
