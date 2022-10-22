package typingsJapgolly.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiRootUrl extends StObject {
  
  var apiRootUrl: String
}
object ApiRootUrl {
  
  inline def apply(apiRootUrl: String): ApiRootUrl = {
    val __obj = js.Dynamic.literal(apiRootUrl = apiRootUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiRootUrl]
  }
  
  extension [Self <: ApiRootUrl](x: Self) {
    
    inline def setApiRootUrl(value: String): Self = StObject.set(x, "apiRootUrl", value.asInstanceOf[js.Any])
  }
}
