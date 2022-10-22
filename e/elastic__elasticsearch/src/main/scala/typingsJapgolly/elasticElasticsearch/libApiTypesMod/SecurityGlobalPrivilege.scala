package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGlobalPrivilege extends StObject {
  
  var application: SecurityApplicationGlobalUserPrivileges
}
object SecurityGlobalPrivilege {
  
  inline def apply(application: SecurityApplicationGlobalUserPrivileges): SecurityGlobalPrivilege = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGlobalPrivilege]
  }
  
  extension [Self <: SecurityGlobalPrivilege](x: Self) {
    
    inline def setApplication(value: SecurityApplicationGlobalUserPrivileges): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
