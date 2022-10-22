package typingsJapgolly.officeJs.anon

import typingsJapgolly.officeJs.Office.HostType
import typingsJapgolly.officeJs.Office.PlatformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  var host: HostType
  
  var platform: PlatformType
}
object Host {
  
  inline def apply(host: HostType, platform: PlatformType): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  extension [Self <: Host](x: Self) {
    
    inline def setHost(value: HostType): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: PlatformType): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
