package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveMimeTypeRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DriveMimeTypeRestrict {
  
  inline def apply(): DriveMimeTypeRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveMimeTypeRestrict]
  }
  
  extension [Self <: DriveMimeTypeRestrict](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
