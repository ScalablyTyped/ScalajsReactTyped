package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
import typingsJapgolly.handsontable.renderersBaseMod.BaseRenderer
import typingsJapgolly.handsontable.settingsMod.CellProperties
import typingsJapgolly.handsontable.settingsMod.GridSettings
import typingsJapgolly.handsontable.validatorsBaseMod.BaseValidator_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesBaseMod {
  
  trait CellTypeObject
    extends StObject
       with GridSettings
       with /**
    * Custom properties which will be accessible in `cellProperties`
    */
  /* key */ StringDictionary[Any] {
    
    @JSName("editor")
    var editor_CellTypeObject: js.UndefOr[Instantiable1[/* instance */ default, BaseEditor]] = js.undefined
    
    @JSName("renderer")
    var renderer_CellTypeObject: js.UndefOr[BaseRenderer] = js.undefined
    
    @JSName("validator")
    var validator_CellTypeObject: js.UndefOr[BaseValidator_] = js.undefined
  }
  object CellTypeObject {
    
    inline def apply(): CellTypeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellTypeObject]
    }
    
    extension [Self <: CellTypeObject](x: Self) {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, BaseEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setRenderer(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Callback
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7((t0: /* instance */ default, t1: /* TD */ HTMLTableCellElement, t2: /* row */ Double, t3: /* col */ Double, t4: /* prop */ String | Double, t5: /* value */ Any, t6: /* cellProperties */ CellProperties) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setValidator(value: BaseValidator_): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
}
