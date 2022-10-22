package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEditor[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends StObject {
  
  /**
    * Additional parameters to pass to the getElement function inside the props argument.
    */
  var customEditorParameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Required. Function to use to create the custom cell editor. Takes two parameters:
    *   `onUpdate`: callback function to call to update the value inside the cell.
    *   `props`:
    */
  def getElement(
    onUpdate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ],
    props: CustomEditorProps[TRow, K]
  ): Element
}
object CustomEditor {
  
  inline def apply[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */](
    getElement: (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ], CustomEditorProps[TRow, K]) => Element
  ): CustomEditor[TRow, K] = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction2(getElement))
    __obj.asInstanceOf[CustomEditor[TRow, K]]
  }
  
  extension [Self <: CustomEditor[?, ?], TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */](x: Self & (CustomEditor[TRow, K])) {
    
    inline def setCustomEditorParameters(value: js.Object): Self = StObject.set(x, "customEditorParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomEditorParametersUndefined: Self = StObject.set(x, "customEditorParameters", js.undefined)
    
    inline def setGetElement(
      value: (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
          Unit
        ], CustomEditorProps[TRow, K]) => Element
    ): Self = StObject.set(x, "getElement", js.Any.fromFunction2(value))
  }
}
