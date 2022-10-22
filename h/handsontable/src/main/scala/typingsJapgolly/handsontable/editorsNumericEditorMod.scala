package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableStrings.numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsNumericEditorMod {
  
  @JSImport("handsontable/editors/numericEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: numeric = js.native
  
  @JSImport("handsontable/editors/numericEditor", "NumericEditor")
  @js.native
  open class NumericEditor protected ()
    extends typingsJapgolly.handsontable.editorsNumericEditorNumericEditorMod.NumericEditor {
    def this(instance: default) = this()
  }
}
