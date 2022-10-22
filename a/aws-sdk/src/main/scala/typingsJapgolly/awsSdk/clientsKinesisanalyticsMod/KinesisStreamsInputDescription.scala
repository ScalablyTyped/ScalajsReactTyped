package typingsJapgolly.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsInputDescription extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the Amazon Kinesis stream.
    */
  var ResourceARN: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ResourceARN] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
    */
  var RoleARN: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.RoleARN] = js.undefined
}
object KinesisStreamsInputDescription {
  
  inline def apply(): KinesisStreamsInputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamsInputDescription]
  }
  
  extension [Self <: KinesisStreamsInputDescription](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
