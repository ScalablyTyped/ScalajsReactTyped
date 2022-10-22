package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationInformationEventCallback extends StObject {
  
  /**
    * Called when an application is installed.
    *
    * @param info The information of the updated application.
    */
  def oninstalled(info: ApplicationInformation): Unit
  
  /**
    * Called when an application is uninstalled.
    *
    * @param id The ID of the uninstalled application.
    */
  def onuninstalled(id: ApplicationId): Unit
  
  /**
    * Called when an application is updated.
    *
    * @param info The information of the updated application.
    */
  def onupdated(info: ApplicationInformation): Unit
}
object ApplicationInformationEventCallback {
  
  inline def apply(
    oninstalled: ApplicationInformation => Callback,
    onuninstalled: ApplicationId => Callback,
    onupdated: ApplicationInformation => Callback
  ): ApplicationInformationEventCallback = {
    val __obj = js.Dynamic.literal(oninstalled = js.Any.fromFunction1((t0: ApplicationInformation) => oninstalled(t0).runNow()), onuninstalled = js.Any.fromFunction1((t0: ApplicationId) => onuninstalled(t0).runNow()), onupdated = js.Any.fromFunction1((t0: ApplicationInformation) => onupdated(t0).runNow()))
    __obj.asInstanceOf[ApplicationInformationEventCallback]
  }
  
  extension [Self <: ApplicationInformationEventCallback](x: Self) {
    
    inline def setOninstalled(value: ApplicationInformation => Callback): Self = StObject.set(x, "oninstalled", js.Any.fromFunction1((t0: ApplicationInformation) => value(t0).runNow()))
    
    inline def setOnuninstalled(value: ApplicationId => Callback): Self = StObject.set(x, "onuninstalled", js.Any.fromFunction1((t0: ApplicationId) => value(t0).runNow()))
    
    inline def setOnupdated(value: ApplicationInformation => Callback): Self = StObject.set(x, "onupdated", js.Any.fromFunction1((t0: ApplicationInformation) => value(t0).runNow()))
  }
}
