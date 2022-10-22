package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsTextEditorMod {
  
  @JSImport("handsontable/editors/textEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: text = js.native
  
  @JSImport("handsontable/editors/textEditor", "TextEditor")
  @js.native
  open class TextEditor protected ()
    extends typingsJapgolly.handsontable.editorsTextEditorTextEditorMod.TextEditor {
    def this(instance: default) = this()
  }
}
