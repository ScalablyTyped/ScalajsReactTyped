package typingsJapgolly.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionBasicAuthResponseParameters extends StObject {
  
  /**
    * The user name to use for Basic authorization.
    */
  var Username: js.UndefOr[AuthHeaderParameters] = js.undefined
}
object ConnectionBasicAuthResponseParameters {
  
  inline def apply(): ConnectionBasicAuthResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionBasicAuthResponseParameters]
  }
  
  extension [Self <: ConnectionBasicAuthResponseParameters](x: Self) {
    
    inline def setUsername(value: AuthHeaderParameters): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
