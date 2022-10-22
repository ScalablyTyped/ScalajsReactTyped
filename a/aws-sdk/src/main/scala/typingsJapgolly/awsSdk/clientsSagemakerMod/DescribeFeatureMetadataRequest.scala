package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeatureMetadataRequest extends StObject {
  
  /**
    * The name of the feature group containing the feature.
    */
  var FeatureGroupName: typingsJapgolly.awsSdk.clientsSagemakerMod.FeatureGroupName
  
  /**
    * The name of the feature.
    */
  var FeatureName: typingsJapgolly.awsSdk.clientsSagemakerMod.FeatureName
}
object DescribeFeatureMetadataRequest {
  
  inline def apply(FeatureGroupName: FeatureGroupName, FeatureName: FeatureName): DescribeFeatureMetadataRequest = {
    val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], FeatureName = FeatureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureMetadataRequest]
  }
  
  extension [Self <: DescribeFeatureMetadataRequest](x: Self) {
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setFeatureName(value: FeatureName): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
  }
}
