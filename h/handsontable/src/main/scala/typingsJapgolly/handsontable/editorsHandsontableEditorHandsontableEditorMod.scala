package typingsJapgolly.handsontable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsHandsontableEditorHandsontableEditorMod {
  
  @JSImport("handsontable/editors/handsontableEditor/handsontableEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: typingsJapgolly.handsontable.handsontableStrings.handsontable = js.native
  
  @JSImport("handsontable/editors/handsontableEditor/handsontableEditor", "HandsontableEditor")
  @js.native
  open class HandsontableEditor protected () extends TextEditor {
    def this(instance: default) = this()
    
    var htContainer: HTMLElement = js.native
    
    var htEditor: default = js.native
  }
}
