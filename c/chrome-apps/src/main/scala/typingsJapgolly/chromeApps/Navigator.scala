package typingsJapgolly.chromeApps

import org.scalajs.dom.Geolocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /**
    * If you provide the 'geolocation' in your Chrome app it will allow the app to
    * use the proposed HTML5 geolocation API without prompting the user for permission.
    * @see Permissions: 'geolocation'
    */
  val geolocation: Geolocation
}
object Navigator {
  
  inline def apply(geolocation: Geolocation): Navigator = {
    val __obj = js.Dynamic.literal(geolocation = geolocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setGeolocation(value: Geolocation): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
  }
}
