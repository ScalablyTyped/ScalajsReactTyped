package typingsJapgolly.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationOverrides extends StObject {
  
  /**
    * The override configurations for the application.
    */
  var applicationConfiguration: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The override configurations for monitoring.
    */
  var monitoringConfiguration: js.UndefOr[MonitoringConfiguration] = js.undefined
}
object ConfigurationOverrides {
  
  inline def apply(): ConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOverrides]
  }
  
  extension [Self <: ConfigurationOverrides](x: Self) {
    
    inline def setApplicationConfiguration(value: ConfigurationList): Self = StObject.set(x, "applicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationConfigurationUndefined: Self = StObject.set(x, "applicationConfiguration", js.undefined)
    
    inline def setApplicationConfigurationVarargs(value: Configuration*): Self = StObject.set(x, "applicationConfiguration", js.Array(value*))
    
    inline def setMonitoringConfiguration(value: MonitoringConfiguration): Self = StObject.set(x, "monitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigurationUndefined: Self = StObject.set(x, "monitoringConfiguration", js.undefined)
  }
}
