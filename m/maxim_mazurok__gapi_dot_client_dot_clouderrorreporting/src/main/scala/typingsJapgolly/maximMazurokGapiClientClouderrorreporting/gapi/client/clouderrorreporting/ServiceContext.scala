package typingsJapgolly.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceContext extends StObject {
  
  /**
    * Type of the MonitoredResource. List of possible values: https://cloud.google.com/monitoring/api/resources Value is set automatically for incoming errors and must not be set when
    * reporting errors.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier of the service, such as the name of the executable, job, or Google App Engine service name. This field is expected to have a low number of values that are relatively
    * stable over time, as opposed to `version`, which can be changed whenever new code is deployed. Contains the service name for error reports extracted from Google App Engine logs or
    * `default` if the App Engine default service is used.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the source code version that the developer provided, which could represent a version label or a Git SHA-1 hash, for example. For App Engine standard environment, the
    * version is set to the version of the app.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ServiceContext {
  
  inline def apply(): ServiceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceContext]
  }
  
  extension [Self <: ServiceContext](x: Self) {
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
