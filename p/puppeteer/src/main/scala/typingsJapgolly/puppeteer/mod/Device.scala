package typingsJapgolly.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var userAgent: String
  
  var viewport: Viewport
}
object Device {
  
  inline def apply(userAgent: String, viewport: Viewport): Device = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
