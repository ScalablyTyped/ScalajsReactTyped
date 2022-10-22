package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownButton.ItemClickEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDropDownButtonItem
  extends StObject
     with dxListItem {
  
  /**
    * A handler for the click event raised for a certain item in the drop-down field.
    */
  var onClick: js.UndefOr[(js.Function1[/* e */ ItemClickEvent, Unit]) | String] = js.undefined
}
object dxDropDownButtonItem {
  
  inline def apply(): dxDropDownButtonItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownButtonItem]
  }
  
  extension [Self <: dxDropDownButtonItem](x: Self) {
    
    inline def setOnClick(value: (js.Function1[/* e */ ItemClickEvent, Unit]) | String): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickFunction1(value: /* e */ ItemClickEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ItemClickEvent) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
