package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSourcePermissionsRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the data source. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var DataSourceId: ResourceId
}
object DescribeDataSourcePermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId): DescribeDataSourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataSourcePermissionsRequest]
  }
  
  extension [Self <: DescribeDataSourcePermissionsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceId(value: ResourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
  }
}
