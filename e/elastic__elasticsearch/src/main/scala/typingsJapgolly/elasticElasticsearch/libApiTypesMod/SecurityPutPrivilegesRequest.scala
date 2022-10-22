package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutPrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var privileges: js.UndefOr[Record[String, Record[String, SecurityPutPrivilegesActions]]] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
}
object SecurityPutPrivilegesRequest {
  
  inline def apply(): SecurityPutPrivilegesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPutPrivilegesRequest]
  }
  
  extension [Self <: SecurityPutPrivilegesRequest](x: Self) {
    
    inline def setPrivileges(value: Record[String, Record[String, SecurityPutPrivilegesActions]]): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesUndefined: Self = StObject.set(x, "privileges", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
