package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgToolbarButton
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Event fired after the toolbar button is activated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var activated: js.UndefOr[ActivatedEvent] = js.undefined
  
  /**
    * Event fired before the toolbar button is activated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var activating: js.UndefOr[ActivatingEvent] = js.undefined
  
  /**
    * Enable/Disable the "Toggling" of a button.
    *
    */
  var allowToggling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after the toolbar button is deactivated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var deactivated: js.UndefOr[DeactivatedEvent] = js.undefined
  
  /**
    * Event fired before the toolbar button is deactivated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var deactivating: js.UndefOr[DeactivatingEvent] = js.undefined
  
  /**
    * Get/Set whether the toolbar button is selected.
    *
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
}
object IgToolbarButton {
  
  inline def apply(): IgToolbarButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarButton]
  }
  
  extension [Self <: IgToolbarButton](x: Self) {
    
    inline def setActivated(value: (/* event */ Event, /* ui */ ActivatedEventUIParam) => Callback): Self = StObject.set(x, "activated", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ActivatedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    inline def setActivating(value: (/* event */ Event, /* ui */ ActivatingEventUIParam) => Callback): Self = StObject.set(x, "activating", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ActivatingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setActivatingUndefined: Self = StObject.set(x, "activating", js.undefined)
    
    inline def setAllowToggling(value: Boolean): Self = StObject.set(x, "allowToggling", value.asInstanceOf[js.Any])
    
    inline def setAllowTogglingUndefined: Self = StObject.set(x, "allowToggling", js.undefined)
    
    inline def setDeactivated(value: (/* event */ Event, /* ui */ DeactivatedEventUIParam) => Callback): Self = StObject.set(x, "deactivated", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DeactivatedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    inline def setDeactivating(value: (/* event */ Event, /* ui */ DeactivatingEventUIParam) => Callback): Self = StObject.set(x, "deactivating", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DeactivatingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDeactivatingUndefined: Self = StObject.set(x, "deactivating", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
  }
}
