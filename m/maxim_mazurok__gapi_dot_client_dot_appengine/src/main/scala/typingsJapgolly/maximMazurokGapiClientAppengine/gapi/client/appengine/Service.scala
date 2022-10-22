package typingsJapgolly.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /** Relative name of the service within the application. Example: default.@OutputOnly */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A set of labels to apply to this service. Labels are key/value pairs that describe the service and all resources that belong to it (e.g., versions). The labels can be used to search
    * and group resources, and are propagated to the usage and billing reports, enabling fine-grain analysis of costs. An example of using labels is to tag resources belonging to
    * different environments (e.g., "env=prod", "env=qa"). Label keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters,
    * underscores, dashes, and international characters. Label keys must start with a lowercase letter or an international character. Each service can have at most 32 labels.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
  
  /** Ingress settings for this service. Will apply to all versions. */
  var networkSettings: js.UndefOr[NetworkSettings] = js.undefined
  
  /** Mapping that defines fractional HTTP traffic diversion to different versions within the service. */
  var split: js.UndefOr[TrafficSplit] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkSettings(value: NetworkSettings): Self = StObject.set(x, "networkSettings", value.asInstanceOf[js.Any])
    
    inline def setNetworkSettingsUndefined: Self = StObject.set(x, "networkSettings", js.undefined)
    
    inline def setSplit(value: TrafficSplit): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
