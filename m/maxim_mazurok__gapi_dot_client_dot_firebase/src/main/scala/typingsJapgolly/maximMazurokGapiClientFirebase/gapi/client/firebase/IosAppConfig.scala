package typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosAppConfig extends StObject {
  
  /** The content of the XML configuration file. */
  var configFileContents: js.UndefOr[String] = js.undefined
  
  /** The filename that the configuration artifact for the `IosApp` is typically saved as. For example: `GoogleService-Info.plist` */
  var configFilename: js.UndefOr[String] = js.undefined
}
object IosAppConfig {
  
  inline def apply(): IosAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosAppConfig]
  }
  
  extension [Self <: IosAppConfig](x: Self) {
    
    inline def setConfigFileContents(value: String): Self = StObject.set(x, "configFileContents", value.asInstanceOf[js.Any])
    
    inline def setConfigFileContentsUndefined: Self = StObject.set(x, "configFileContents", js.undefined)
    
    inline def setConfigFilename(value: String): Self = StObject.set(x, "configFilename", value.asInstanceOf[js.Any])
    
    inline def setConfigFilenameUndefined: Self = StObject.set(x, "configFilename", js.undefined)
  }
}
