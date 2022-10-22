package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellListingEvents
  extends StObject
     with IEvents {
  
  var OnContentChanged: js.UndefOr[js.Function1[/* items */ IShellItems, Unit]] = js.undefined
  
  var OnListingActivated: js.UndefOr[js.Function1[/* oldListing */ Null | IShellListing, Unit]] = js.undefined
  
  var OnListingDeactivated: js.UndefOr[js.Function1[/* newListing */ Null | IShellListing, Unit]] = js.undefined
  
  var OnSelectedItemsChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  
  var OnSelectionChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  
  var OnShowContextMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  
  var OnShowMainMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IShellListingEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): IShellListingEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IShellListingEvents]
  }
  
  extension [Self <: IShellListingEvents](x: Self) {
    
    inline def setOnContentChanged(value: /* items */ IShellItems => Callback): Self = StObject.set(x, "OnContentChanged", js.Any.fromFunction1((t0: /* items */ IShellItems) => value(t0).runNow()))
    
    inline def setOnContentChangedUndefined: Self = StObject.set(x, "OnContentChanged", js.undefined)
    
    inline def setOnListingActivated(value: /* oldListing */ Null | IShellListing => Callback): Self = StObject.set(x, "OnListingActivated", js.Any.fromFunction1((t0: /* oldListing */ Null | IShellListing) => value(t0).runNow()))
    
    inline def setOnListingActivatedUndefined: Self = StObject.set(x, "OnListingActivated", js.undefined)
    
    inline def setOnListingDeactivated(value: /* newListing */ Null | IShellListing => Callback): Self = StObject.set(x, "OnListingDeactivated", js.Any.fromFunction1((t0: /* newListing */ Null | IShellListing) => value(t0).runNow()))
    
    inline def setOnListingDeactivatedUndefined: Self = StObject.set(x, "OnListingDeactivated", js.undefined)
    
    inline def setOnSelectedItemsChanged(value: /* selectedItems */ IShellItems => Callback): Self = StObject.set(x, "OnSelectedItemsChanged", js.Any.fromFunction1((t0: /* selectedItems */ IShellItems) => value(t0).runNow()))
    
    inline def setOnSelectedItemsChangedUndefined: Self = StObject.set(x, "OnSelectedItemsChanged", js.undefined)
    
    inline def setOnSelectionChanged(value: /* selectedItems */ IShellItems => Callback): Self = StObject.set(x, "OnSelectionChanged", js.Any.fromFunction1((t0: /* selectedItems */ IShellItems) => value(t0).runNow()))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "OnSelectionChanged", js.undefined)
    
    inline def setOnShowContextMenu(value: /* selectedItems */ IShellItems => Callback): Self = StObject.set(x, "OnShowContextMenu", js.Any.fromFunction1((t0: /* selectedItems */ IShellItems) => value(t0).runNow()))
    
    inline def setOnShowContextMenuUndefined: Self = StObject.set(x, "OnShowContextMenu", js.undefined)
    
    inline def setOnShowMainMenu(value: /* selectedItems */ IShellItems => Callback): Self = StObject.set(x, "OnShowMainMenu", js.Any.fromFunction1((t0: /* selectedItems */ IShellItems) => value(t0).runNow()))
    
    inline def setOnShowMainMenuUndefined: Self = StObject.set(x, "OnShowMainMenu", js.undefined)
    
    inline def setOnStarted(value: Callback): Self = StObject.set(x, "OnStarted", value.toJsFn)
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: Callback): Self = StObject.set(x, "OnStop", value.toJsFn)
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
