package typingsJapgolly.pkgcloud.mod

import typingsJapgolly.pkgcloud.pkgcloudStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleProviderOptions extends StObject {
  
  var keyFilename: String
  
  var projectId: String
  
  var provider: google
}
object GoogleProviderOptions {
  
  inline def apply(keyFilename: String, projectId: String): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(keyFilename = keyFilename.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provider = "google")
    __obj.asInstanceOf[GoogleProviderOptions]
  }
  
  extension [Self <: GoogleProviderOptions](x: Self) {
    
    inline def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: google): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
