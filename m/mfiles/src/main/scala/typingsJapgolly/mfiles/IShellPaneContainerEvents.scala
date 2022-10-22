package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellPaneContainerEvents
  extends StObject
     with IEvents {
  
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnMinimizedStateChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnNewTab: js.UndefOr[js.Function1[/* tab */ IShellPaneTab, Unit]] = js.undefined
  
  var OnPaneResized: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IShellPaneContainerEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): IShellPaneContainerEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IShellPaneContainerEvents]
  }
  
  extension [Self <: IShellPaneContainerEvents](x: Self) {
    
    inline def setOnHidePane(value: Callback): Self = StObject.set(x, "OnHidePane", value.toJsFn)
    
    inline def setOnHidePaneUndefined: Self = StObject.set(x, "OnHidePane", js.undefined)
    
    inline def setOnMinimizedStateChanged(value: Callback): Self = StObject.set(x, "OnMinimizedStateChanged", value.toJsFn)
    
    inline def setOnMinimizedStateChangedUndefined: Self = StObject.set(x, "OnMinimizedStateChanged", js.undefined)
    
    inline def setOnNewTab(value: /* tab */ IShellPaneTab => Callback): Self = StObject.set(x, "OnNewTab", js.Any.fromFunction1((t0: /* tab */ IShellPaneTab) => value(t0).runNow()))
    
    inline def setOnNewTabUndefined: Self = StObject.set(x, "OnNewTab", js.undefined)
    
    inline def setOnPaneResized(value: Callback): Self = StObject.set(x, "OnPaneResized", value.toJsFn)
    
    inline def setOnPaneResizedUndefined: Self = StObject.set(x, "OnPaneResized", js.undefined)
    
    inline def setOnShowPane(value: Callback): Self = StObject.set(x, "OnShowPane", value.toJsFn)
    
    inline def setOnShowPaneUndefined: Self = StObject.set(x, "OnShowPane", js.undefined)
    
    inline def setOnStarted(value: Callback): Self = StObject.set(x, "OnStarted", value.toJsFn)
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: Callback): Self = StObject.set(x, "OnStop", value.toJsFn)
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
    
    inline def setOnTabSelected(value: Callback): Self = StObject.set(x, "OnTabSelected", value.toJsFn)
    
    inline def setOnTabSelectedUndefined: Self = StObject.set(x, "OnTabSelected", js.undefined)
    
    inline def setOnTabUnselected(value: Callback): Self = StObject.set(x, "OnTabUnselected", value.toJsFn)
    
    inline def setOnTabUnselectedUndefined: Self = StObject.set(x, "OnTabUnselected", js.undefined)
  }
}
