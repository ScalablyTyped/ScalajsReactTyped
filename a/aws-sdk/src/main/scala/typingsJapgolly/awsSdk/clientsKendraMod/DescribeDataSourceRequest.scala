package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSourceRequest extends StObject {
  
  /**
    * The identifier of the data source connector.
    */
  var Id: DataSourceId
  
  /**
    * The identifier of the index used with the data source connector.
    */
  var IndexId: typingsJapgolly.awsSdk.clientsKendraMod.IndexId
}
object DescribeDataSourceRequest {
  
  inline def apply(Id: DataSourceId, IndexId: IndexId): DescribeDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataSourceRequest]
  }
  
  extension [Self <: DescribeDataSourceRequest](x: Self) {
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
