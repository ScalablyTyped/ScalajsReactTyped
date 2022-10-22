package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringConfig extends StObject {
  
  /** Monitoring components configuration */
  var componentConfig: js.UndefOr[MonitoringComponentConfig] = js.undefined
  
  /** Enable Google Cloud Managed Service for Prometheus in the cluster. */
  var managedPrometheusConfig: js.UndefOr[ManagedPrometheusConfig] = js.undefined
}
object MonitoringConfig {
  
  inline def apply(): MonitoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfig]
  }
  
  extension [Self <: MonitoringConfig](x: Self) {
    
    inline def setComponentConfig(value: MonitoringComponentConfig): Self = StObject.set(x, "componentConfig", value.asInstanceOf[js.Any])
    
    inline def setComponentConfigUndefined: Self = StObject.set(x, "componentConfig", js.undefined)
    
    inline def setManagedPrometheusConfig(value: ManagedPrometheusConfig): Self = StObject.set(x, "managedPrometheusConfig", value.asInstanceOf[js.Any])
    
    inline def setManagedPrometheusConfigUndefined: Self = StObject.set(x, "managedPrometheusConfig", js.undefined)
  }
}
