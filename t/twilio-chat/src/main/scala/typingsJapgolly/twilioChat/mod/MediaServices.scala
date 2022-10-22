package typingsJapgolly.twilioChat.mod

import typingsJapgolly.twilioMcsClient.mod.McsClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaServices extends StObject {
  
  var mcsClient: McsClient
}
object MediaServices {
  
  inline def apply(mcsClient: McsClient): MediaServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaServices]
  }
  
  extension [Self <: MediaServices](x: Self) {
    
    inline def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
  }
}
