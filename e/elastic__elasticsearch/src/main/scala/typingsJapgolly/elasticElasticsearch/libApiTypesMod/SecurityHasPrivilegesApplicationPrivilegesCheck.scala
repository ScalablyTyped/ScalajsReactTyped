package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesApplicationPrivilegesCheck extends StObject {
  
  var application: String
  
  var privileges: js.Array[String]
  
  var resources: js.Array[String]
}
object SecurityHasPrivilegesApplicationPrivilegesCheck {
  
  inline def apply(application: String, privileges: js.Array[String], resources: js.Array[String]): SecurityHasPrivilegesApplicationPrivilegesCheck = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], privileges = privileges.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivilegesApplicationPrivilegesCheck]
  }
  
  extension [Self <: SecurityHasPrivilegesApplicationPrivilegesCheck](x: Self) {
    
    inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setPrivileges(value: js.Array[String]): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesVarargs(value: String*): Self = StObject.set(x, "privileges", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
