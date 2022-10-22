package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsOutputDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream.
    */
  var ResourceARN: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN
  
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.RoleARN] = js.undefined
}
object KinesisStreamsOutputDescription {
  
  inline def apply(ResourceARN: ResourceARN): KinesisStreamsOutputDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutputDescription]
  }
  
  extension [Self <: KinesisStreamsOutputDescription](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
