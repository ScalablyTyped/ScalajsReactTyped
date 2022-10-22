package typingsJapgolly.webextensionPolyfill.namespacesRuntimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing information about the current browser.
  */
trait BrowserInfo extends StObject {
  
  /**
    * The browser's build ID/date, for example '20160101'.
    */
  var buildID: String
  
  /**
    * The name of the browser, for example 'Firefox'.
    */
  var name: String
  
  /**
    * The name of the browser vendor, for example 'Mozilla'.
    */
  var vendor: String
  
  /**
    * The browser's version, for example '42.0.0' or '0.8.1pre'.
    */
  var version: String
}
object BrowserInfo {
  
  inline def apply(buildID: String, name: String, vendor: String, version: String): BrowserInfo = {
    val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserInfo]
  }
  
  extension [Self <: BrowserInfo](x: Self) {
    
    inline def setBuildID(value: String): Self = StObject.set(x, "buildID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
