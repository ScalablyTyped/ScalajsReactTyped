package typingsJapgolly.waitForLocalhost

import typingsJapgolly.waitForLocalhost.waitForLocalhostInts.`4`
import typingsJapgolly.waitForLocalhost.waitForLocalhostInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IpVersion extends StObject {
    
    var ipVersion: `4` | `6`
  }
  object IpVersion {
    
    inline def apply(ipVersion: `4` | `6`): IpVersion = {
      val __obj = js.Dynamic.literal(ipVersion = ipVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpVersion]
    }
    
    extension [Self <: IpVersion](x: Self) {
      
      inline def setIpVersion(value: `4` | `6`): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
    }
  }
}
