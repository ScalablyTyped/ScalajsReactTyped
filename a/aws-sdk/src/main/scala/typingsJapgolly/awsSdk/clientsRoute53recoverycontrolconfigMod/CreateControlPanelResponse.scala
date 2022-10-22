package typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateControlPanelResponse extends StObject {
  
  /**
    * Information about a control panel.
    */
  var ControlPanel: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.ControlPanel] = js.undefined
}
object CreateControlPanelResponse {
  
  inline def apply(): CreateControlPanelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateControlPanelResponse]
  }
  
  extension [Self <: CreateControlPanelResponse](x: Self) {
    
    inline def setControlPanel(value: ControlPanel): Self = StObject.set(x, "ControlPanel", value.asInstanceOf[js.Any])
    
    inline def setControlPanelUndefined: Self = StObject.set(x, "ControlPanel", js.undefined)
  }
}
