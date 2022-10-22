package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemMasterFilterStateChanged event.
  */
trait ASPxClientDashboardItemMasterFilterStateChangedEventArgs
  extends StObject
     with ASPxClientDashboardItemEventArgs {
  
  /**
    * Gets the currently selected values.
    */
  var Values: js.Array[js.Array[js.Object]]
}
object ASPxClientDashboardItemMasterFilterStateChangedEventArgs {
  
  inline def apply(
    IsNullValue: Any => Boolean,
    IsOthersValue: Any => Boolean,
    ItemName: String,
    Values: js.Array[js.Array[js.Object]]
  ): ASPxClientDashboardItemMasterFilterStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemMasterFilterStateChangedEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardItemMasterFilterStateChangedEventArgs](x: Self) {
    
    inline def setValues(value: js.Array[js.Array[js.Object]]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: js.Array[js.Object]*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
