package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IListModel extends StObject {
  
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  
  var items: Any
  
  var onFilterStringChangedCallback: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  def onSelectionChanged(
    item: Action,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type any is not an array type */ params: Any
  ): Unit
  
  var selectedItem: js.UndefOr[IAction] = js.undefined
}
object IListModel {
  
  inline def apply(items: Any, onSelectionChanged: (Action, Any) => Callback): IListModel = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onSelectionChanged = js.Any.fromFunction2((t0: Action, t1: Any) => (onSelectionChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[IListModel]
  }
  
  extension [Self <: IListModel](x: Self) {
    
    inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
    
    inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setOnFilterStringChangedCallback(value: /* text */ String => Callback): Self = StObject.set(x, "onFilterStringChangedCallback", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def setOnFilterStringChangedCallbackUndefined: Self = StObject.set(x, "onFilterStringChangedCallback", js.undefined)
    
    inline def setOnSelectionChanged(value: (Action, Any) => Callback): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction2((t0: Action, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSelectedItem(value: IAction): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
