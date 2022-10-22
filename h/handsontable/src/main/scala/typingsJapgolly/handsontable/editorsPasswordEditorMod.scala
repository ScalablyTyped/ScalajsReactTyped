package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsPasswordEditorMod {
  
  @JSImport("handsontable/editors/passwordEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: password = js.native
  
  @JSImport("handsontable/editors/passwordEditor", "PasswordEditor")
  @js.native
  open class PasswordEditor protected ()
    extends typingsJapgolly.handsontable.editorsPasswordEditorPasswordEditorMod.PasswordEditor {
    def this(instance: default) = this()
  }
}
