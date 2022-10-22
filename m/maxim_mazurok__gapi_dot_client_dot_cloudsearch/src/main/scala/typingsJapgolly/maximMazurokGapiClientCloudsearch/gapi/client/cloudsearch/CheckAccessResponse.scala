package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckAccessResponse extends StObject {
  
  /** Returns true if principal has access. Returns false otherwise. */
  var hasAccess: js.UndefOr[Boolean] = js.undefined
}
object CheckAccessResponse {
  
  inline def apply(): CheckAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckAccessResponse]
  }
  
  extension [Self <: CheckAccessResponse](x: Self) {
    
    inline def setHasAccess(value: Boolean): Self = StObject.set(x, "hasAccess", value.asInstanceOf[js.Any])
    
    inline def setHasAccessUndefined: Self = StObject.set(x, "hasAccess", js.undefined)
  }
}
