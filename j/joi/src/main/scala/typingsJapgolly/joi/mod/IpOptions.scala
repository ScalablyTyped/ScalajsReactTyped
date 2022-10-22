package typingsJapgolly.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpOptions extends StObject {
  
  /**
    * Used to determine if a CIDR is allowed or not. Valid values: optional, required, forbidden
    */
  var cidr: js.UndefOr[PresenceMode] = js.undefined
  
  /**
    * One or more IP address versions to validate against. Valid values: ipv4, ipv6, ipvfuture
    */
  var version: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IpOptions {
  
  inline def apply(): IpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpOptions]
  }
  
  extension [Self <: IpOptions](x: Self) {
    
    inline def setCidr(value: PresenceMode): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    inline def setVersion(value: String | js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
