package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Admin extends StObject {
  
  var admin: Boolean
  
  var maintain: js.UndefOr[Boolean] = js.undefined
  
  var pull: Boolean
  
  var push: Boolean
  
  var triage: js.UndefOr[Boolean] = js.undefined
}
object Admin {
  
  inline def apply(admin: Boolean, pull: Boolean, push: Boolean): Admin = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[Admin]
  }
  
  extension [Self <: Admin](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setMaintain(value: Boolean): Self = StObject.set(x, "maintain", value.asInstanceOf[js.Any])
    
    inline def setMaintainUndefined: Self = StObject.set(x, "maintain", js.undefined)
    
    inline def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setTriage(value: Boolean): Self = StObject.set(x, "triage", value.asInstanceOf[js.Any])
    
    inline def setTriageUndefined: Self = StObject.set(x, "triage", js.undefined)
  }
}
