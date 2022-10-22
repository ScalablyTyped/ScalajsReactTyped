package typingsJapgolly.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberLocation extends StObject {
  
  var latitude: Double
  
  var logitude: Double
}
object MemberLocation {
  
  inline def apply(latitude: Double, logitude: Double): MemberLocation = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], logitude = logitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberLocation]
  }
  
  extension [Self <: MemberLocation](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLogitude(value: Double): Self = StObject.set(x, "logitude", value.asInstanceOf[js.Any])
  }
}
