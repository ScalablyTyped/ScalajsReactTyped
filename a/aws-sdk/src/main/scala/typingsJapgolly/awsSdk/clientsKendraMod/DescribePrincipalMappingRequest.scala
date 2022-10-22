package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePrincipalMappingRequest extends StObject {
  
  /**
    * The identifier of the data source to check the processing of PUT and DELETE actions for mapping users to their groups.
    */
  var DataSourceId: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.DataSourceId] = js.undefined
  
  /**
    * The identifier of the group required to check the processing of PUT and DELETE actions for mapping users to their groups.
    */
  var GroupId: typingsJapgolly.awsSdk.clientsKendraMod.GroupId
  
  /**
    * The identifier of the index required to check the processing of PUT and DELETE actions for mapping users to their groups.
    */
  var IndexId: typingsJapgolly.awsSdk.clientsKendraMod.IndexId
}
object DescribePrincipalMappingRequest {
  
  inline def apply(GroupId: GroupId, IndexId: IndexId): DescribePrincipalMappingRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePrincipalMappingRequest]
  }
  
  extension [Self <: DescribePrincipalMappingRequest](x: Self) {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setGroupId(value: GroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
