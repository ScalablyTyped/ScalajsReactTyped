package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharepoint.anon.AnyChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Internal {
  
  trait DiffTracker extends StObject {
    
    def Clear(): Unit
    
    var ExternalAPI: AnyChanges
    
    def NotifyRollbackChange(changeKey: IChangeKey): Unit
    
    def NotifySynchronizeToChange(changeKey: IChangeKey): Unit
    
    def NotifyVacateChange(changeKey: IChangeKey): Unit
  }
  object DiffTracker {
    
    inline def apply(
      Clear: Callback,
      ExternalAPI: AnyChanges,
      NotifyRollbackChange: IChangeKey => Callback,
      NotifySynchronizeToChange: IChangeKey => Callback,
      NotifyVacateChange: IChangeKey => Callback
    ): DiffTracker = {
      val __obj = js.Dynamic.literal(Clear = Clear.toJsFn, ExternalAPI = ExternalAPI.asInstanceOf[js.Any], NotifyRollbackChange = js.Any.fromFunction1((t0: IChangeKey) => NotifyRollbackChange(t0).runNow()), NotifySynchronizeToChange = js.Any.fromFunction1((t0: IChangeKey) => NotifySynchronizeToChange(t0).runNow()), NotifyVacateChange = js.Any.fromFunction1((t0: IChangeKey) => NotifyVacateChange(t0).runNow()))
      __obj.asInstanceOf[DiffTracker]
    }
    
    extension [Self <: DiffTracker](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
      
      inline def setExternalAPI(value: AnyChanges): Self = StObject.set(x, "ExternalAPI", value.asInstanceOf[js.Any])
      
      inline def setNotifyRollbackChange(value: IChangeKey => Callback): Self = StObject.set(x, "NotifyRollbackChange", js.Any.fromFunction1((t0: IChangeKey) => value(t0).runNow()))
      
      inline def setNotifySynchronizeToChange(value: IChangeKey => Callback): Self = StObject.set(x, "NotifySynchronizeToChange", js.Any.fromFunction1((t0: IChangeKey) => value(t0).runNow()))
      
      inline def setNotifyVacateChange(value: IChangeKey => Callback): Self = StObject.set(x, "NotifyVacateChange", js.Any.fromFunction1((t0: IChangeKey) => value(t0).runNow()))
    }
  }
  
  trait PropertyUpdate
    extends StObject
       with IValue {
    
    @JSName("localized")
    var localized_PropertyUpdate: String
  }
  object PropertyUpdate {
    
    inline def apply(localized: String): PropertyUpdate = {
      val __obj = js.Dynamic.literal(localized = localized.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyUpdate]
    }
    
    extension [Self <: PropertyUpdate](x: Self) {
      
      inline def setLocalized(value: String): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    }
  }
}
