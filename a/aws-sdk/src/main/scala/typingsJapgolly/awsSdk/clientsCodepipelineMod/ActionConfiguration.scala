package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionConfiguration extends StObject {
  
  /**
    * The configuration data for the action.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
}
object ActionConfiguration {
  
  inline def apply(): ActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionConfiguration]
  }
  
  extension [Self <: ActionConfiguration](x: Self) {
    
    inline def setConfiguration(value: ActionConfigurationMap): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
