package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor
import typingsJapgolly.handsontable.handsontableStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsTimeEditorTimeEditorMod {
  
  @JSImport("handsontable/editors/timeEditor/timeEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: time = js.native
  
  @JSImport("handsontable/editors/timeEditor/timeEditor", "TimeEditor")
  @js.native
  open class TimeEditor protected () extends TextEditor {
    def this(instance: default) = this()
  }
}
