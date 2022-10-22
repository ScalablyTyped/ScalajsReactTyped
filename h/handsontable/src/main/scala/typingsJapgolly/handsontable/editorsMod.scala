package typingsJapgolly.handsontable

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.handsontable.anon.TypeofAutocompleteEditor
import typingsJapgolly.handsontable.coreMod.default
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

object editorsMod {
  
  @JSImport("handsontable/editors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/editors", "AUTOCOMPLETE_EDITOR")
  @js.native
  val AUTOCOMPLETE_EDITOR: autocomplete = js.native
  
  @JSImport("handsontable/editors", "AutocompleteEditor")
  @js.native
  open class AutocompleteEditor protected ()
    extends typingsJapgolly.handsontable.editorsAutocompleteEditorMod.AutocompleteEditor {
    def this(instance: default) = this()
  }
  object AutocompleteEditor {
    
    @JSImport("handsontable/editors", "AutocompleteEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sortByRelevance(value: Any, choices: js.Array[String], caseSensitive: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByRelevance")(value.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  @JSImport("handsontable/editors", "BASE_EDITOR")
  @js.native
  val BASE_EDITOR: base = js.native
  
  /* note: abstract class */ @JSImport("handsontable/editors", "BaseEditor")
  @js.native
  open class BaseEditor protected ()
    extends typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "CHECKBOX_EDITOR")
  @js.native
  val CHECKBOX_EDITOR: checkbox = js.native
  
  @JSImport("handsontable/editors", "CheckboxEditor")
  @js.native
  open class CheckboxEditor protected ()
    extends typingsJapgolly.handsontable.editorsCheckboxEditorMod.CheckboxEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "DATE_EDITOR")
  @js.native
  val DATE_EDITOR: date = js.native
  
  @JSImport("handsontable/editors", "DROPDOWN_EDITOR")
  @js.native
  val DROPDOWN_EDITOR: dropdown = js.native
  
  @JSImport("handsontable/editors", "DateEditor")
  @js.native
  open class DateEditor protected ()
    extends typingsJapgolly.handsontable.editorsDateEditorMod.DateEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "DropdownEditor")
  @js.native
  open class DropdownEditor protected ()
    extends typingsJapgolly.handsontable.editorsDropdownEditorMod.DropdownEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "HANDSONTABLE_EDITOR")
  @js.native
  val HANDSONTABLE_EDITOR: typingsJapgolly.handsontable.handsontableStrings.handsontable = js.native
  
  @JSImport("handsontable/editors", "HandsontableEditor")
  @js.native
  open class HandsontableEditor protected ()
    extends typingsJapgolly.handsontable.editorsHandsontableEditorMod.HandsontableEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "NUMERIC_EDITOR")
  @js.native
  val NUMERIC_EDITOR: numeric = js.native
  
  @JSImport("handsontable/editors", "NumericEditor")
  @js.native
  open class NumericEditor protected ()
    extends typingsJapgolly.handsontable.editorsNumericEditorMod.NumericEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "PASSWORD_EDITOR")
  @js.native
  val PASSWORD_EDITOR: password = js.native
  
  @JSImport("handsontable/editors", "PasswordEditor")
  @js.native
  open class PasswordEditor protected ()
    extends typingsJapgolly.handsontable.editorsPasswordEditorMod.PasswordEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "RegisteredEditor")
  @js.native
  open class RegisteredEditor protected ()
    extends typingsJapgolly.handsontable.editorsRegistryMod.RegisteredEditor {
    def this(editorClass: typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor) = this()
  }
  object RegisteredEditor {
    
    @JSImport("handsontable/editors", "RegisteredEditor")
    @js.native
    def apply(editorClass: typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor): Unit = js.native
  }
  
  @JSImport("handsontable/editors", "SELECT_EDITOR")
  @js.native
  val SELECT_EDITOR: select = js.native
  
  @JSImport("handsontable/editors", "SelectEditor")
  @js.native
  open class SelectEditor protected ()
    extends typingsJapgolly.handsontable.editorsSelectEditorMod.SelectEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "TEXT_EDITOR")
  @js.native
  val TEXT_EDITOR: text = js.native
  
  @JSImport("handsontable/editors", "TIME_EDITOR")
  @js.native
  val TIME_EDITOR: time = js.native
  
  @JSImport("handsontable/editors", "TextEditor")
  @js.native
  open class TextEditor protected ()
    extends typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "TimeEditor")
  @js.native
  open class TimeEditor protected ()
    extends typingsJapgolly.handsontable.editorsTimeEditorMod.TimeEditor {
    def this(instance: default) = this()
  }
  
  inline def getEditorInstance(name: String, hotInstance: default): Instantiable1[
    /* instance */ default, 
    typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getEditorInstance")(name.asInstanceOf[js.Any], hotInstance.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[
    /* instance */ default, 
    typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
  ]]
  
  inline def registerAllEditors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllEditors")().asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.handsontable.handsontableStrings.autocomplete
    - typingsJapgolly.handsontable.handsontableStrings.base
    - typingsJapgolly.handsontable.handsontableStrings.checkbox
    - typingsJapgolly.handsontable.handsontableStrings.date
    - typingsJapgolly.handsontable.handsontableStrings.dropdown
    - typingsJapgolly.handsontable.handsontableStrings.handsontable
    - typingsJapgolly.handsontable.handsontableStrings.numeric
    - typingsJapgolly.handsontable.handsontableStrings.password
    - typingsJapgolly.handsontable.handsontableStrings.select
    - typingsJapgolly.handsontable.handsontableStrings.text
    - typingsJapgolly.handsontable.handsontableStrings.time
  */
  trait EditorType extends StObject
  
  trait Editors extends StObject {
    
    var autocomplete: (Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsAutocompleteEditorMod.AutocompleteEditor
      ]) & TypeofAutocompleteEditor
    
    var base: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
      ]
    
    var checkbox: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsCheckboxEditorMod.CheckboxEditor
      ]
    
    var date: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsDateEditorMod.DateEditor
      ]
    
    var dropdown: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsDropdownEditorMod.DropdownEditor
      ]
    
    var handsontable: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsHandsontableEditorMod.HandsontableEditor
      ]
    
    var numeric: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsNumericEditorMod.NumericEditor
      ]
    
    var password: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsPasswordEditorMod.PasswordEditor
      ]
    
    var select: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsSelectEditorMod.SelectEditor
      ]
    
    var text: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor
      ]
    
    var time: Instantiable1[
        /* instance */ default, 
        typingsJapgolly.handsontable.editorsTimeEditorMod.TimeEditor
      ]
  }
  object Editors {
    
    inline def apply(
      autocomplete: (Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsAutocompleteEditorMod.AutocompleteEditor
        ]) & TypeofAutocompleteEditor,
      base: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
        ],
      checkbox: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsCheckboxEditorMod.CheckboxEditor
        ],
      date: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsDateEditorMod.DateEditor
        ],
      dropdown: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsDropdownEditorMod.DropdownEditor
        ],
      handsontable: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsHandsontableEditorMod.HandsontableEditor
        ],
      numeric: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsNumericEditorMod.NumericEditor
        ],
      password: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsPasswordEditorMod.PasswordEditor
        ],
      select: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsSelectEditorMod.SelectEditor
        ],
      text: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor
        ],
      time: Instantiable1[
          /* instance */ default, 
          typingsJapgolly.handsontable.editorsTimeEditorMod.TimeEditor
        ]
    ): Editors = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], handsontable = handsontable.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Editors]
    }
    
    extension [Self <: Editors](x: Self) {
      
      inline def setAutocomplete(
        value: (Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsAutocompleteEditorMod.AutocompleteEditor
            ]) & TypeofAutocompleteEditor
      ): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setBase(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
            ]
      ): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsCheckboxEditorMod.CheckboxEditor
            ]
      ): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setDate(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsDateEditorMod.DateEditor
            ]
      ): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDropdown(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsDropdownEditorMod.DropdownEditor
            ]
      ): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setHandsontable(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsHandsontableEditorMod.HandsontableEditor
            ]
      ): Self = StObject.set(x, "handsontable", value.asInstanceOf[js.Any])
      
      inline def setNumeric(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsNumericEditorMod.NumericEditor
            ]
      ): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setPassword(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsPasswordEditorMod.PasswordEditor
            ]
      ): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSelect(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsSelectEditorMod.SelectEditor
            ]
      ): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setText(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsTextEditorMod.TextEditor
            ]
      ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTime(
        value: Instantiable1[
              /* instance */ default, 
              typingsJapgolly.handsontable.editorsTimeEditorMod.TimeEditor
            ]
      ): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
