package typingsJapgolly.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudBuildOptions extends StObject {
  
  /**
    * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See
    * https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
    */
  var appYamlPath: js.UndefOr[String] = js.undefined
  
  /** The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes. */
  var cloudBuildTimeout: js.UndefOr[String] = js.undefined
}
object CloudBuildOptions {
  
  inline def apply(): CloudBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudBuildOptions]
  }
  
  extension [Self <: CloudBuildOptions](x: Self) {
    
    inline def setAppYamlPath(value: String): Self = StObject.set(x, "appYamlPath", value.asInstanceOf[js.Any])
    
    inline def setAppYamlPathUndefined: Self = StObject.set(x, "appYamlPath", js.undefined)
    
    inline def setCloudBuildTimeout(value: String): Self = StObject.set(x, "cloudBuildTimeout", value.asInstanceOf[js.Any])
    
    inline def setCloudBuildTimeoutUndefined: Self = StObject.set(x, "cloudBuildTimeout", js.undefined)
  }
}
