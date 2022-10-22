package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableStrings.autocomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsAutocompleteEditorMod {
  
  @JSImport("handsontable/editors/autocompleteEditor", "AutocompleteEditor")
  @js.native
  open class AutocompleteEditor protected ()
    extends typingsJapgolly.handsontable.editorsAutocompleteEditorAutocompleteEditorMod.AutocompleteEditor {
    def this(instance: default) = this()
  }
  object AutocompleteEditor {
    
    @JSImport("handsontable/editors/autocompleteEditor", "AutocompleteEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sortByRelevance(value: Any, choices: js.Array[String], caseSensitive: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByRelevance")(value.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  @JSImport("handsontable/editors/autocompleteEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: autocomplete = js.native
}
