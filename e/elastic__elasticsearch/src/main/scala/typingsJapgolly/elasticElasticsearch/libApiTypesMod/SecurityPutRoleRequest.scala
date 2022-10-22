package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutRoleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var applications: js.UndefOr[js.Array[SecurityApplicationPrivileges]] = js.undefined
  
  var cluster: js.UndefOr[js.Array[SecurityClusterPrivilege]] = js.undefined
  
  var global: js.UndefOr[Record[String, Any]] = js.undefined
  
  var indices: js.UndefOr[js.Array[SecurityIndicesPrivileges]] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var name: Name
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var run_as: js.UndefOr[js.Array[String]] = js.undefined
  
  var transient_metadata: js.UndefOr[SecurityTransientMetadataConfig] = js.undefined
}
object SecurityPutRoleRequest {
  
  inline def apply(name: Name): SecurityPutRoleRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutRoleRequest]
  }
  
  extension [Self <: SecurityPutRoleRequest](x: Self) {
    
    inline def setApplications(value: js.Array[SecurityApplicationPrivileges]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setApplicationsVarargs(value: SecurityApplicationPrivileges*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setCluster(value: js.Array[SecurityClusterPrivilege]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setClusterVarargs(value: SecurityClusterPrivilege*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setGlobal(value: Record[String, Any]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setIndices(value: js.Array[SecurityIndicesPrivileges]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: SecurityIndicesPrivileges*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRun_as(value: js.Array[String]): Self = StObject.set(x, "run_as", value.asInstanceOf[js.Any])
    
    inline def setRun_asUndefined: Self = StObject.set(x, "run_as", js.undefined)
    
    inline def setRun_asVarargs(value: String*): Self = StObject.set(x, "run_as", js.Array(value*))
    
    inline def setTransient_metadata(value: SecurityTransientMetadataConfig): Self = StObject.set(x, "transient_metadata", value.asInstanceOf[js.Any])
    
    inline def setTransient_metadataUndefined: Self = StObject.set(x, "transient_metadata", js.undefined)
  }
}
