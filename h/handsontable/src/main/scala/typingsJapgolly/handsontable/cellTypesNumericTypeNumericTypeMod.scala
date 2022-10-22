package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.handsontable.cellTypesBaseMod.CellTypeObject
import typingsJapgolly.handsontable.commonMod.CellValue
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsNumericEditorMod.NumericEditor
import typingsJapgolly.handsontable.handsontableStrings.numeric
import typingsJapgolly.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesNumericTypeNumericTypeMod {
  
  @JSImport("handsontable/cellTypes/numericType/numericType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: numeric = js.native
  
  trait NumericCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_NumericCellType: Instantiable1[/* instance */ default, NumericEditor]
    
    @JSName("renderer")
    def renderer_MNumericCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MNumericCellType(
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
    def validator_MNumericCellType(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("validator")
    var validator_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
  }
  object NumericCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, NumericEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Callback,
      validator: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ]
    ): NumericCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7((t0: /* instance */ default, t1: /* TD */ HTMLTableCellElement, t2: /* row */ Double, t3: /* col */ Double, t4: /* prop */ String | Double, t5: /* value */ Any, t6: /* cellProperties */ CellProperties) => (renderer(t0, t1, t2, t3, t4, t5, t6)).runNow()), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericCellType]
    }
    
    extension [Self <: NumericCellType](x: Self) {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, NumericEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
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
