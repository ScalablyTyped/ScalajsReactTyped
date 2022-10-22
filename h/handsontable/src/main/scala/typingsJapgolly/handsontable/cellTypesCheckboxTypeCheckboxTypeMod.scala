package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.handsontable.cellTypesBaseMod.CellTypeObject
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsCheckboxEditorMod.CheckboxEditor
import typingsJapgolly.handsontable.handsontableStrings.checkbox
import typingsJapgolly.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesCheckboxTypeCheckboxTypeMod {
  
  @JSImport("handsontable/cellTypes/checkboxType/checkboxType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: checkbox = js.native
  
  trait CheckboxCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_CheckboxCellType: Instantiable1[/* instance */ default, CheckboxEditor]
    
    @JSName("renderer")
    def renderer_MCheckboxCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MCheckboxCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    var renderer_Original: js.Function7[
        /* instance */ default, 
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ Any, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
  }
  object CheckboxCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, CheckboxEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Callback
    ): CheckboxCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7((t0: /* instance */ default, t1: /* TD */ HTMLTableCellElement, t2: /* row */ Double, t3: /* col */ Double, t4: /* prop */ String | Double, t5: /* value */ Any, t6: /* cellProperties */ CellProperties) => (renderer(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      __obj.asInstanceOf[CheckboxCellType]
    }
    
    extension [Self <: CheckboxCellType](x: Self) {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, CheckboxEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setRenderer(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Callback
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7((t0: /* instance */ default, t1: /* TD */ HTMLTableCellElement, t2: /* row */ Double, t3: /* col */ Double, t4: /* prop */ String | Double, t5: /* value */ Any, t6: /* cellProperties */ CellProperties) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    }
  }
}
