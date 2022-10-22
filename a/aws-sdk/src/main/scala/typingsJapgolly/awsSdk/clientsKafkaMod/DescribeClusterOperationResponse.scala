package typingsJapgolly.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterOperationResponse extends StObject {
  
  /**
    * 
    Cluster operation information
    
    */
  var ClusterOperationInfo: js.UndefOr[typingsJapgolly.awsSdk.clientsKafkaMod.ClusterOperationInfo] = js.undefined
}
object DescribeClusterOperationResponse {
  
  inline def apply(): DescribeClusterOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterOperationResponse]
  }
  
  extension [Self <: DescribeClusterOperationResponse](x: Self) {
    
    inline def setClusterOperationInfo(value: ClusterOperationInfo): Self = StObject.set(x, "ClusterOperationInfo", value.asInstanceOf[js.Any])
    
    inline def setClusterOperationInfoUndefined: Self = StObject.set(x, "ClusterOperationInfo", js.undefined)
  }
}
