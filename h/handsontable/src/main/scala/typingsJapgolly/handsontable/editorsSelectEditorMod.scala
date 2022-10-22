package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsSelectEditorMod {
  
  @JSImport("handsontable/editors/selectEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: select = js.native
  
  @JSImport("handsontable/editors/selectEditor", "SelectEditor")
  @js.native
  open class SelectEditor protected ()
    extends typingsJapgolly.handsontable.editorsSelectEditorSelectEditorMod.SelectEditor {
    def this(instance: default) = this()
  }
}
