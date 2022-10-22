package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.handsontable.cellTypesBaseMod.CellTypeObject
import typingsJapgolly.handsontable.commonMod.CellValue
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsDateEditorMod.DateEditor
import typingsJapgolly.handsontable.handsontableStrings.date
import typingsJapgolly.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesDateTypeDateTypeMod {
  
  @JSImport("handsontable/cellTypes/dateType/dateType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: date = js.native
  
  trait DateCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_DateCellType: Instantiable1[/* instance */ default, DateEditor]
    
    @JSName("renderer")
    def renderer_MDateCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MDateCellType(
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
    
    @JSName("validator")
    def validator_MDateCellType(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("validator")
    var validator_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
  }
  object DateCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, DateEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Callback,
      validator: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ]
    ): DateCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7((t0: /* instance */ default, t1: /* TD */ HTMLTableCellElement, t2: /* row */ Double, t3: /* col */ Double, t4: /* prop */ String | Double, t5: /* value */ Any, t6: /* cellProperties */ CellProperties) => (renderer(t0, t1, t2, t3, t4, t5, t6)).runNow()), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateCellType]
    }
    
    extension [Self <: DateCellType](x: Self) {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, DateEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setRenderer(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Callback
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7((t0: /* instance */ default, t1: /* TD */ HTMLTableCellElement, t2: /* row */ Double, t3: /* col */ Double, t4: /* prop */ String | Double, t5: /* value */ Any, t6: /* cellProperties */ CellProperties) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setValidator(
        value: js.ThisFunction2[
              /* this */ CellProperties, 
              /* value */ CellValue, 
              /* callback */ js.Function1[/* valid */ Boolean, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
