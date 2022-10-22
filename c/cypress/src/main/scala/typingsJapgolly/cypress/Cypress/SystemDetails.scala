package typingsJapgolly.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemDetails extends StObject {
  
  var osName: String
  
  var osVersion: String
}
object SystemDetails {
  
  inline def apply(osName: String, osVersion: String): SystemDetails = {
    val __obj = js.Dynamic.literal(osName = osName.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemDetails]
  }
  
  extension [Self <: SystemDetails](x: Self) {
    
    inline def setOsName(value: String): Self = StObject.set(x, "osName", value.asInstanceOf[js.Any])
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
  }
}
