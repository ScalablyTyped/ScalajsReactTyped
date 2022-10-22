package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationResponseDetails extends StObject {
  
  var url: String
}
object AuthenticationResponseDetails {
  
  inline def apply(url: String): AuthenticationResponseDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResponseDetails]
  }
  
  extension [Self <: AuthenticationResponseDetails](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
