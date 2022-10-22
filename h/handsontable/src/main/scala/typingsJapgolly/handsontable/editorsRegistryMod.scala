package typingsJapgolly.handsontable

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.handsontable.anon.TypeofAutocompleteEditor
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsAutocompleteEditorMod.AutocompleteEditor
import typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
import typingsJapgolly.handsontable.editorsCheckboxEditorMod.CheckboxEditor
import typingsJapgolly.handsontable.editorsDateEditorMod.DateEditor
import typingsJapgolly.handsontable.editorsDropdownEditorMod.DropdownEditor
import typingsJapgolly.handsontable.editorsHandsontableEditorMod.HandsontableEditor
import typingsJapgolly.handsontable.editorsNumericEditorMod.NumericEditor
import typingsJapgolly.handsontable.editorsPasswordEditorMod.PasswordEditor
import typingsJapgolly.handsontable.editorsSelectEditorMod.SelectEditor
import typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor
import typingsJapgolly.handsontable.editorsTimeEditorMod.TimeEditor
import typingsJapgolly.handsontable.handsontableStrings.autocomplete
import typingsJapgolly.handsontable.handsontableStrings.base
import typingsJapgolly.handsontable.handsontableStrings.checkbox
import typingsJapgolly.handsontable.handsontableStrings.date
import typingsJapgolly.handsontable.handsontableStrings.dropdown
import typingsJapgolly.handsontable.handsontableStrings.numeric
import typingsJapgolly.handsontable.handsontableStrings.password
import typingsJapgolly.handsontable.handsontableStrings.select
import typingsJapgolly.handsontable.handsontableStrings.text
import typingsJapgolly.handsontable.handsontableStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsRegistryMod {
  
  @JSImport("handsontable/editors/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/editors/registry", "RegisteredEditor")
  @js.native
  open class RegisteredEditor protected () extends StObject {
    def this(editorClass: BaseEditor) = this()
    
    def getConstructor(): BaseEditor = js.native
    
    def getInstance(hotInstance: default): Instantiable1[/* instance */ default, BaseEditor] = js.native
  }
  object RegisteredEditor {
    
    @JSImport("handsontable/editors/registry", "RegisteredEditor")
    @js.native
    def apply(editorClass: BaseEditor): Unit = js.native
  }
  
  inline def _getEditorInstance(name: String, hotInstance: default): Instantiable1[/* instance */ default, BaseEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getEditorInstance")(name.asInstanceOf[js.Any], hotInstance.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditor(name: String): Instantiable1[/* instance */ default, BaseEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditorInstance(name: String, hotInstance: default): Instantiable1[/* instance */ default, BaseEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEditorInstance")(name.asInstanceOf[js.Any], hotInstance.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditor_autocomplete(name: autocomplete): (Instantiable1[/* instance */ default, AutocompleteEditor]) & TypeofAutocompleteEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[(Instantiable1[/* instance */ default, AutocompleteEditor]) & TypeofAutocompleteEditor]
  
  inline def getEditor_base(name: base): Instantiable1[/* instance */ default, BaseEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditor_checkbox(name: checkbox): Instantiable1[/* instance */ default, CheckboxEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, CheckboxEditor]]
  
  inline def getEditor_date(name: date): Instantiable1[/* instance */ default, DateEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, DateEditor]]
  
  inline def getEditor_dropdown(name: dropdown): Instantiable1[/* instance */ default, DropdownEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, DropdownEditor]]
  
  inline def getEditor_handsontable(name: typingsJapgolly.handsontable.handsontableStrings.handsontable): Instantiable1[/* instance */ default, HandsontableEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, HandsontableEditor]]
  
  inline def getEditor_numeric(name: numeric): Instantiable1[/* instance */ default, NumericEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, NumericEditor]]
  
  inline def getEditor_password(name: password): Instantiable1[/* instance */ default, PasswordEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, PasswordEditor]]
  
  inline def getEditor_select(name: select): Instantiable1[/* instance */ default, SelectEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, SelectEditor]]
  
  inline def getEditor_text(name: text): Instantiable1[/* instance */ default, TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, TextEditor]]
  
  inline def getEditor_time(name: time): Instantiable1[/* instance */ default, TimeEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, TimeEditor]]
  
  inline def getRegisteredEditorNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredEditorNames")().asInstanceOf[js.Array[String]]
  
  inline def getRegisteredEditors(): js.Array[BaseEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredEditors")().asInstanceOf[js.Array[BaseEditor]]
  
  inline def hasEditor(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerEditor(editorClass: Instantiable1[/* instance */ default, BaseEditor]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerEditor")(editorClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerEditor(name: String, editorClass: Instantiable1[/* instance */ default, BaseEditor]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEditor")(name.asInstanceOf[js.Any], editorClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
