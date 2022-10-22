package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFloatingActionButton.ContextChanging event.
  */
trait ASPxClientFloatingActionButtonContextChangingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the action related to the event.
    */
  var action: ASPxClientFABAction
}
object ASPxClientFloatingActionButtonContextChangingEventArgs {
  
  inline def apply(action: ASPxClientFABAction): ASPxClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonContextChangingEventArgs]
  }
  
  extension [Self <: ASPxClientFloatingActionButtonContextChangingEventArgs](x: Self) {
    
    inline def setAction(value: ASPxClientFABAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
