package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor
import typingsJapgolly.handsontable.handsontableStrings.numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsNumericEditorNumericEditorMod {
  
  @JSImport("handsontable/editors/numericEditor/numericEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: numeric = js.native
  
  @JSImport("handsontable/editors/numericEditor/numericEditor", "NumericEditor")
  @js.native
  open class NumericEditor protected () extends TextEditor {
    def this(instance: default) = this()
  }
}
