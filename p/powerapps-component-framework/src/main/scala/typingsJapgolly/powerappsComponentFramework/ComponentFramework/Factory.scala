package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.PopupService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.factory
  */
trait Factory extends StObject {
  
  /**
    * Gets the popup service which help create Popup and manage Popup easily
    */
  def getPopupService(): PopupService
  
  /**
    * Requests re-rendering of the control with updated data.
    */
  def requestRender(): Unit
}
object Factory {
  
  inline def apply(getPopupService: CallbackTo[PopupService], requestRender: Callback): Factory = {
    val __obj = js.Dynamic.literal(getPopupService = getPopupService.toJsFn, requestRender = requestRender.toJsFn)
    __obj.asInstanceOf[Factory]
  }
  
  extension [Self <: Factory](x: Self) {
    
    inline def setGetPopupService(value: CallbackTo[PopupService]): Self = StObject.set(x, "getPopupService", value.toJsFn)
    
    inline def setRequestRender(value: Callback): Self = StObject.set(x, "requestRender", value.toJsFn)
  }
}
