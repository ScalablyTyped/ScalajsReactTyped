package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client collection that maintains client menu objects.
  */
trait ASPxClientMenuCollection
  extends StObject
     with ASPxClientControlCollection {
  
  /**
    * Hides all menus maitained by the collection.
    */
  def HideAll(): Unit
  
  /**
    * Recalculates the position of visible sub menus.
    */
  def RecalculateAll(): Unit
}
object ASPxClientMenuCollection {
  
  inline def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]],
    ForEachControl: ASPxClientControlAction => Callback,
    Get: Any => Any,
    GetByName: String => Any,
    GetControlsByPredicate: ASPxClientControlPredicate => js.Array[Any],
    GetControlsByType: Any => js.Array[Any],
    HideAll: Callback,
    RecalculateAll: Callback,
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientMenuCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], BrowserWindowResized = BrowserWindowResized.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ForEachControl = js.Any.fromFunction1((t0: ASPxClientControlAction) => ForEachControl(t0).runNow()), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetControlsByPredicate = js.Any.fromFunction1(GetControlsByPredicate), GetControlsByType = js.Any.fromFunction1(GetControlsByType), HideAll = HideAll.toJsFn, RecalculateAll = RecalculateAll.toJsFn, ValidationCompleted = ValidationCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuCollection]
  }
  
  extension [Self <: ASPxClientMenuCollection](x: Self) {
    
    inline def setHideAll(value: Callback): Self = StObject.set(x, "HideAll", value.toJsFn)
    
    inline def setRecalculateAll(value: Callback): Self = StObject.set(x, "RecalculateAll", value.toJsFn)
  }
}
