package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionConfigWithTags extends StObject {
  
  /**
    * A distribution configuration.
    */
  var DistributionConfig: typingsJapgolly.awsSdk.clientsCloudfrontMod.DistributionConfig
  
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typingsJapgolly.awsSdk.clientsCloudfrontMod.Tags
}
object DistributionConfigWithTags {
  
  inline def apply(DistributionConfig: DistributionConfig, Tags: Tags): DistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfigWithTags]
  }
  
  extension [Self <: DistributionConfigWithTags](x: Self) {
    
    inline def setDistributionConfig(value: DistributionConfig): Self = StObject.set(x, "DistributionConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
