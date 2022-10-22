package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellPaneTabEvents
  extends StObject
     with IEvents {
  
  var OnHideTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnShowTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IShellPaneTabEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): IShellPaneTabEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IShellPaneTabEvents]
  }
  
  extension [Self <: IShellPaneTabEvents](x: Self) {
    
    inline def setOnHideTab(value: Callback): Self = StObject.set(x, "OnHideTab", value.toJsFn)
    
    inline def setOnHideTabUndefined: Self = StObject.set(x, "OnHideTab", js.undefined)
    
    inline def setOnShowTab(value: Callback): Self = StObject.set(x, "OnShowTab", value.toJsFn)
    
    inline def setOnShowTabUndefined: Self = StObject.set(x, "OnShowTab", js.undefined)
    
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
