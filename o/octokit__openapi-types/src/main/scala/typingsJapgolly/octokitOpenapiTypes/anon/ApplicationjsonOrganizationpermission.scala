package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOrganizationpermission extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Organizationpermission
}
object ApplicationjsonOrganizationpermission {
  
  inline def apply(applicationSlashjson: Organizationpermission): ApplicationjsonOrganizationpermission = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOrganizationpermission]
  }
  
  extension [Self <: ApplicationjsonOrganizationpermission](x: Self) {
    
    inline def setApplicationSlashjson(value: Organizationpermission): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
