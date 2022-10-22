package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityManageUserPrivileges extends StObject {
  
  var applications: js.Array[String]
}
object SecurityManageUserPrivileges {
  
  inline def apply(applications: js.Array[String]): SecurityManageUserPrivileges = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityManageUserPrivileges]
  }
  
  extension [Self <: SecurityManageUserPrivileges](x: Self) {
    
    inline def setApplications(value: js.Array[String]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsVarargs(value: String*): Self = StObject.set(x, "applications", js.Array(value*))
  }
}
