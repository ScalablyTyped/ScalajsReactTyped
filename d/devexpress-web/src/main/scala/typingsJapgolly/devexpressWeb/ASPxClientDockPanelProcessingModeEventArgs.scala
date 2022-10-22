package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockPanel.AfterFloat event.
  */
trait ASPxClientDockPanelProcessingModeEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone
}
object ASPxClientDockPanelProcessingModeEventArgs {
  
  inline def apply(processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeEventArgs]
  }
  
  extension [Self <: ASPxClientDockPanelProcessingModeEventArgs](x: Self) {
    
    inline def setZone(value: ASPxClientDockZone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
