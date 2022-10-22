package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the application for which to retrieve tags.
    */
  var ResourceARN: KinesisAnalyticsARN
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceARN: KinesisAnalyticsARN): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceARN(value: KinesisAnalyticsARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
